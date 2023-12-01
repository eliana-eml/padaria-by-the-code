package br.sp.eml.projects.padariabythecode.utils;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Validador {

    //Instâncio uma lista ArrayList de Strings para listagem de mensagens de erros.
    public ArrayList<String> mensagensErro = new ArrayList<>();

    /**
     * Valida somente campos inteiros.
     *
     * Recebe um objeto do tipo JTextField, verifica se o campo está vazio e
     * tenta converter o valor recebido para inteiro. Caso não consiga, emite
     * uma mensagem de erro informando a falha ao converter o valor para int.
     *
     * Ou, se o campo estiver vazio, emite uma mensagem de erro solicitando a
     * entrada de um valor para o campo.
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

    /**
     * Recebe um objeto do tipo JTextField, verifica se o campo está vazio, e se
     * houver algum ponto ou hífen e os substitui com um String vazio no lugar deles.
     *
     * Se o campo estiver vazio, ele muda o background do JTextField para
     * vermelho e emite uma mensagem de erro, solicitando o preenchimento do
     * campo.
     */
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
    
    public void validarPreenchimentoJDateChooser(JDateChooser seletorData) {
        
        if (seletorData.getDate() == null) {
            this.mensagensErro.add("Selecione uma data para o seletor: " + seletorData.getName());
        }
    }

    /**
     * Limita a quantidade de caracteres que podem ser digitados dentro de um
     * JTextField, passando por parâmetro um evento, instância da Classe
     * KeyEvent, o objeto do tipo JTextField em questão e a quantidade de
     * caracteres limite para o campo.
     *
     * Verifico se a quantidade de caracteres dentro do campo é maior ou igual a
     * quantidade limite informada, e caso seja, utilizo o método consume() da
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
     * Limita a entrada de valores apenas à caracteres numéricos de 0 a 9 e à
     * tecla de BACKSPACE, utilizando o método consume() da classe KeyEvent para
     * impedir a entrada de quaisquer caracteres diferentes dos mesmos.
     *
     * Caso haja a entrada de caracteres de texto, de caracteres especiais no JTextField
     * passado por parâmetro, emito uma mensagem de erro, informando a limitação
     * de tipo de entrada no campo.
     */
    public void limitarEntradaNumerica(java.awt.event.KeyEvent evt, JTextField txt) {

        char c = evt.getKeyChar();

        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(txt, "Somente números no campo: " + txt.getName() + "!");
        }
    }

    /**
     * Limita a entrada de valores apenas à caracteres numéricos de 0 a 9, à
     * tecla de BACKSPACE e à tecla COMMA (VÍRGULA), utilizando o método
     * consume() da classe KeyEvent para impedir a entrada de quaisquer
     * caracteres diferentes dos mesmos.
     *
     * Caso haja a entrada de caracteres além dos permitidos pelo método, emito
     * uma mensagem de erro, informando a limitação de tipo de entrada no campo.
     */
    public void limitarEntradaNumericaDecimal(java.awt.event.KeyEvent evt, JTextField txt) {

        char c = evt.getKeyChar();

        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_COMMA)) {
            evt.consume();
            JOptionPane.showMessageDialog(txt, "Somente números no campo: " + txt.getName() + "!");
        }
    }

    /**
     * Limita a entrada de valores apenas à texto/string, utilizando o método consume() da
     * classe KeyEvent para impedir a entrada de quaisquer caracteres númericos,
     * 
     * Caso haja a entrada de caracteres além dos permitidos pelo método, emito
     * uma mensagem de erro, informando a limitação de tipo de entrada no campo.
     */
    public void limitarEntradaTexto(java.awt.event.KeyEvent evt, JTextField txt) {

        char c = evt.getKeyChar();

        /**
         * Tento realizar a conversão do caractere c digitado para inteiro, caso
         * consigar realizar a conversão, significa que o caractere é um número,
         * então utilizo o método consume() da classe KeyEvent para impedir a
         * sua entrada no campo.
         */
        try {
            Integer.parseInt(Character.toString(c));
            evt.consume();
            JOptionPane.showMessageDialog(txt, "Somente texto no campo: " + txt.getName() + "!");
        } 
        /**
         * Caso não consiga realizar essa conversão, significa que o caractere é
         * do tipo texto, então ele permite a entrada do valor digitado.
         */
        catch (Exception e) {
            //Somente texto está sendo aceito!
        }

    }

    /**
     * Valida somente campos float.
     *
     * Recebe um objeto do tipo JTextField, verifica se o campo está vazio e
     * tenta converter o valor recebido para float.
     *
     * Caso não consiga, emite uma mensagem de erro informando a falha ao
     * converter o valor para float. Ou, se o campo estiver vazio, emite uma
     * mensagem de erro solicitando a entrada de um valor para o campo.
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

    /**
     * Limpa todos os elementos do ArrayList mensagensErro, removendo todas as
     * mensagens de erro no mesmo usando o método clear().
     */
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

    /**
     * Verifica se existe alguma mensagem de erro dentro do ArrayList
     * mensagensErro ao validar se o tamanho da minha lista é maior do que 0,
     * utilizando o método size().
     *
     * Se for maior, retorna true. Se for menor, retorna false.
     */
    public boolean hasErro() {

        if (this.mensagensErro.size() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
