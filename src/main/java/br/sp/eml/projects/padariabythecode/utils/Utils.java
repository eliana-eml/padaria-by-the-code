/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.sp.eml.projects.padariabythecode.utils;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emlel
 */
public class Utils {

    public void limparCampos(Container painel) {

        Component componentes[] = painel.getComponents();

        for (Component campo : componentes) {

            if (campo instanceof JFormattedTextField) {
                JFormattedTextField txtFormatado = (JFormattedTextField) campo;
                txtFormatado.setValue(null);

            } else if (campo instanceof JTextField) {
                JTextField txt = (JTextField) campo;
                txt.setText("");
            }
        }
    }
    
    public void limparTabela(JTable tabela) {
        
        DefaultTableModel tblModelo = (DefaultTableModel) tabela.getModel();
        tblModelo.setRowCount(0);
    }
}
