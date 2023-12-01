package br.sp.eml.projects.padariabythecode.utils;

import br.sp.eml.projects.padariabythecode.dao.ProdutoDAO;
import br.sp.eml.projects.padariabythecode.model.Produto;
import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.awt.Container;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emlel
 */
public class Utils {

    /**
     * Recebe um objeto do tipo Container, neste caso, um painel, por parâmetro,
     * e reseta os valores de cada campo do painel.
     */
    public void limparCampos(Container painel) {

        //Instâncio um vetor de objetos do tipo Component, e atribuo a ele todos os componentes do painel passado por parâmetro.
        Component componentes[] = painel.getComponents();

        //Percorro o vetor componentes, e para cada campo, verifico a que tipo de instância ele pertence.
        for (Component campo : componentes) {

            if (campo instanceof JFormattedTextField) {
                //Se o campo for uma instância do tipo JFormattedTextField, seto o seu valor como nulo.
                JFormattedTextField txtFormatado = (JFormattedTextField) campo;
                txtFormatado.setValue(null);

            } else if (campo instanceof JTextField) {
                //Ou se o campo for uma instância do tipo JTextField, seto a String do mesmo com um valor vazio.
                JTextField txt = (JTextField) campo;
                txt.setText("");
            }
        }
    }

    //Recebe um objeto do tipo JTable, e limpa todas as linhas da tabela passada por parâmetro.
    public void limparTabela(JTable tabela) {

        DefaultTableModel tblModelo = (DefaultTableModel) tabela.getModel();
        tblModelo.setRowCount(0);
    }
    
    public void limparJDateChooser(JDateChooser seletorData) {
        seletorData.setDate(null);
    }

    //Recebe um objeto do tipo JButton por parâmetro e o habilita para ser pressionado.
    public void habilitarBotoes(JButton botao) {
        botao.setEnabled(true);
    }

    //Recebe um objeto do tipo JButton por parâmetro e o desabilita para ser pressionado.
    public void desabilitarBotoes(JButton botao) {
        botao.setEnabled(false);
    }
}
