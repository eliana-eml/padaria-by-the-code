package br.sp.eml.projects.padariabythecode.utils;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Validador {

    public ArrayList<String> mensagensErro = new ArrayList<>();

    /**
     * Valida somente campos inteiros
     *
     * @param txt Recebe um objeto do tipo JTextField
     */
    public void validarNumero(JTextField txt) {

        try {

            //Verifico se o campo está vazio
            if (txt.getText().trim().equals("")) {
                throw new IllegalArgumentException();
            }

            int valorConvertido = Integer.parseInt(txt.getText());
            txt.setBackground(Color.WHITE);

        } catch (NumberFormatException e) {

            this.mensagensErro.add("Falha ao converter o valor do campo " + txt.getName() + " em inteiro");
            txt.setBackground(Color.red);
        } catch (IllegalArgumentException e) {
            this.mensagensErro.add("Preencha o campo: " + txt.getName());
            txt.setBackground(Color.red);
        }

    }

    public void validarTexto(JTextField txt) {

        try {

            //Verifico se o campo está vazio
            if (txt.getText().replace(".", "").replace("-", "").trim().equals("")) {
                throw new IllegalArgumentException();
            }

            txt.setBackground(Color.white);

        } catch (IllegalArgumentException e) {
            this.mensagensErro.add("Preencha o campo: " + txt.getName());
            txt.setBackground(Color.red);
        }

    }

    /**
     * Valida o preenchimento de uma tabela passada por parâmetro, verificando 
     * se a quantidade de linhas que a compõem é menor ou igual a 0.
     * 
     * Caso essa condição seja verdadeira, emite uma mensagem de erro, indicando
     * que a tabela está vazia.
     */
    public void validarPreenchimentoTabela(JTable table) {

        if (table.getRowCount() <= 0) {
            this.mensagensErro.add("A tabela de itens vazia!");
        }
    }
    
    /**
     * Valida a seleção de um item de um comboBox passado por parâmetro, 
     * verificando se o índice selecionado é igual a 0.
     * 
     * Caso essa condição seja verdadeira, emite uma mensagem de erro, indicando
     * que o comboBox não teve um item da sua lista selecionado.
     */
    public void validarSelecaoComboBox(JComboBox comboBox) {

        if (comboBox.getSelectedIndex() == 0) {
            this.mensagensErro.add("Selecione uma opção para o seletor: " + comboBox.getName());
        }
    }

    /**
     * Limita a quantidade de caracteres que podem ser digitados dentro de um
     * JTextField, passando por parâmetro um evento, instância da Classe KeyEvent,
     * o JTextField em questão e a quantidade de caracteres limite para o campo.
     * 
     * Verifico se a quantidade de caracteres dentro do campo é maior ou igual
     * a quantidade limite informada, e caso seja, utilizo o método consume() da 
     * Classe KeyEvent para impedir a entrada de novos caracteres.
     * 
     * Por fim, emito uma mensagem de erro, informando o máximo de caracteres
     * atingido e a quantidade limite estabelecida para o campo.
     */
    
    public void limitarQuantidadeCaracteres(java.awt.event.KeyEvent evt, JTextField txt, int qtdCaracteres) {

        if (txt.getText().length() >= qtdCaracteres) {
            evt.consume();
            JOptionPane.showMessageDialog(txt, "Máximo de " + qtdCaracteres + " caracteres atingido!");
        }

    }
    
    /**
     * Limita a entrada de caracteres apenas a caracteres númericos no JTextField passado
     * por parâmetro, utilizando o método consume() da Classe KeyEvent para impedir
     * a entrada de quaisquer caracteres diferentes de números de 0 a 9, ou da tecla
     * de BACKSPACE (Apagar).
     * 
     * Caso haja a digitação de caracteres alfanuméricos no JTextField em questão,
     * emito uma mensagem de erro, informando a limitação de entrada a apenas
     * números.
     */

    public void limitarEntradaNumerica(java.awt.event.KeyEvent evt, JTextField txt) {

        char c = evt.getKeyChar();

        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(txt, "Somente números no campo: " + txt.getName() + "!");
        }
    }

    public void limitarEntradaNumericaDecimal(java.awt.event.KeyEvent evt, JTextField txt) {

        char c = evt.getKeyChar();

        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_COMMA)) {
            evt.consume();
            JOptionPane.showMessageDialog(txt, "Somente números no campo: " + txt.getName() + "!");
        }
    }

    public void limitarEntradaTexto(java.awt.event.KeyEvent evt, JTextField txt) {

        char c = evt.getKeyChar();

        try {
            Integer.parseInt(Character.toString(c));
            evt.consume();
            JOptionPane.showMessageDialog(txt, "Somente texto no campo: " + txt.getName() + "!");
        } catch (Exception e) {
            //Somente texto está sendo aceito!
        }

    }

    /**
     * Valida somente campos float
     *
     * @param txt Recebe um objeto do tipo JTextField
     */
    public void validarFloat(JTextField txt) {

        try {

            //Verifico se o campo está vazio
            if (txt.getText().trim().equals("")) {
                throw new IllegalArgumentException();
            }

            float valorConvertido = Float.parseFloat(txt.getText());
            txt.setBackground(Color.WHITE);

        } catch (NumberFormatException e) {

            this.mensagensErro.add("Falha ao converter o valor do campo: " + txt.getName() + " em float");
            txt.setBackground(Color.red);
        } catch (IllegalArgumentException e) {
            this.mensagensErro.add("Preencha o campo: " + txt.getName());
            txt.setBackground(Color.red);
        }

    }

    public void limparMensagens() {

        this.mensagensErro.clear();
    }

    /**
     * @deprecated substituida por {@link #getMensagensErro()} Método para
     * exibir mensagens de erro na tela com JOptionPane
     */
    public void exibirMensagensErro() {

        String errosFormulario = "";
        for (String msg : this.mensagensErro) {
            errosFormulario += msg + "\n";
        }

        if (!errosFormulario.equals("")) {
            JOptionPane.showMessageDialog(null, errosFormulario);
            this.limparMensagens();
        }

    }

    /**
     * Resgata todos os erros gerados em uma única String
     *
     * @return
     */
    public String getMensagensErro() {

        String errosFormulario = "";

        //Percorro o arrayList e concateno na variável errosFormulario
        for (String msg : this.mensagensErro) {
            errosFormulario += msg + "\n";
        }

        if (!errosFormulario.equals("")) {
            this.limparMensagens();
        }

        return errosFormulario;

    }

    public boolean hasErro() {

        if (this.mensagensErro.size() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
