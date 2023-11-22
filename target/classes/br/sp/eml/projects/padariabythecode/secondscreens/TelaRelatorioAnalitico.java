package br.sp.eml.projects.padariabythecode.secondscreens;

import br.sp.eml.projects.padariabythecode.dao.RelatorioDAO;
import br.sp.eml.projects.padariabythecode.model.Relatorio;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author narum
 */
public class TelaRelatorioAnalitico extends javax.swing.JFrame {

    int idVenda = 0;
    double precoTotal = 0;

    /**
     * Construtor da classe TelaRelatorioAnalitico. Inicializa os componentes
     * gráficos gerados automaticamente. Em seguida, define a posição da janela
     * ao centro da tela.
     */
    public TelaRelatorioAnalitico() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public TelaRelatorioAnalitico(int idVendaParam, double valorTotal) {
        initComponents();
        
        /**
         * RECEBE COMO PARÂMETROS O VALOR TOTAL DA COMPRA E O ID PARA
         * REALIZAR A BUSCA DAS DEVIDAS INFORMAÇÕES
         */
        
        this.idVenda = idVendaParam;
        this.precoTotal = valorTotal;
       

        try {
            ArrayList<Relatorio> lista = RelatorioDAO.listaItemPorId(this.idVenda);
            DefaultTableModel modelo = (DefaultTableModel) tblRelatorioAnalitico.getModel();
            modelo.setRowCount(0);

            for (Relatorio item : lista) {
                modelo.addRow(new String[]{
                    String.valueOf(item.getIdVenda()),
                    String.valueOf(item.getIdItemVenda()),
                    String.valueOf(item.getIdProduto()),
                    String.valueOf(item.getNomeProduto()),
                    String.valueOf(item.getQtdItemProduto()),
                    String.valueOf(item.getValorUnitarioItem()),
                    String.valueOf(item.getValorTotalItemVenda())
                     
                });
                
                String dateFormated = DateFormat.getDateInstance().format(item.getDataVenda());
                
                lblNomeCliente.setText(item.getNomeCliente());
                lblDatas.setText(dateFormated);
                lblCPFCliente.setText(item.getCpfCliente());
                lblValorTotalVenda.setText(Double.toString(precoTotal));
                lblIDVenda.setText(Integer.toString(item.getIdVenda()));
            }

        } catch (SQLException ex) {
            Logger.getLogger(TelaRelatorioAnalitico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRelatorioAnalitico = new javax.swing.JPanel();
        tblRelAnalitco = new javax.swing.JScrollPane();
        tblRelatorioAnalitico = new javax.swing.JTable();
        pnlCabecalho = new javax.swing.JPanel();
        lblRelatorioAnalitico = new javax.swing.JLabel();
        pnlDadosVenda = new javax.swing.JPanel();
        lblPeriodo = new javax.swing.JLabel();
        lblDatas = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblNomeCliente = new javax.swing.JLabel();
        lblCPFCliente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblIDVenda = new javax.swing.JLabel();
        pnlValorTotal = new javax.swing.JPanel();
        btnFechar = new javax.swing.JButton();
        lblValorTotal = new javax.swing.JLabel();
        lblValorTotalVenda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        pnlRelatorioAnalitico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tblRelatorioAnalitico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Venda", "ID Item Venda", "ID Produto", "Produto", "Quantidade", "Valor Unitário", "Valor Total"
            }
        ));
        tblRelAnalitco.setViewportView(tblRelatorioAnalitico);

        pnlCabecalho.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblRelatorioAnalitico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblRelatorioAnalitico.setText("RELATÓRIO ANALÍTICO");

        javax.swing.GroupLayout pnlCabecalhoLayout = new javax.swing.GroupLayout(pnlCabecalho);
        pnlCabecalho.setLayout(pnlCabecalhoLayout);
        pnlCabecalhoLayout.setHorizontalGroup(
            pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRelatorioAnalitico)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCabecalhoLayout.setVerticalGroup(
            pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRelatorioAnalitico, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlDadosVenda.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblPeriodo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblPeriodo.setText("Data da Venda:");

        lblDatas.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblDatas.setText("--/--/---- --:--");

        lblCliente.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblCliente.setText("Cliente:");

        lblNomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblNomeCliente.setText("-");

        lblCPFCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblCPFCliente.setText("---.---.---.--");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("CPF:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("ID Venda:");

        lblIDVenda.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblIDVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIDVenda.setText("----");

        javax.swing.GroupLayout pnlDadosVendaLayout = new javax.swing.GroupLayout(pnlDadosVenda);
        pnlDadosVenda.setLayout(pnlDadosVendaLayout);
        pnlDadosVendaLayout.setHorizontalGroup(
            pnlDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosVendaLayout.createSequentialGroup()
                        .addComponent(lblCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomeCliente)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCPFCliente))
                    .addGroup(pnlDadosVendaLayout.createSequentialGroup()
                        .addComponent(lblPeriodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDatas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 406, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIDVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlDadosVendaLayout.setVerticalGroup(
            pnlDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosVendaLayout.createSequentialGroup()
                        .addGroup(pnlDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPeriodo)
                            .addComponent(lblDatas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(pnlDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCliente)
                            .addComponent(lblNomeCliente)
                            .addComponent(jLabel2)
                            .addComponent(lblCPFCliente))
                        .addGap(18, 18, 18))
                    .addGroup(pnlDadosVendaLayout.createSequentialGroup()
                        .addGroup(pnlDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblIDVenda))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pnlValorTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        lblValorTotal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblValorTotal.setText("VALOR TOTAL:");

        lblValorTotalVenda.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblValorTotalVenda.setText("R$ ---,--");

        javax.swing.GroupLayout pnlValorTotalLayout = new javax.swing.GroupLayout(pnlValorTotal);
        pnlValorTotal.setLayout(pnlValorTotalLayout);
        pnlValorTotalLayout.setHorizontalGroup(
            pnlValorTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlValorTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblValorTotalVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlValorTotalLayout.setVerticalGroup(
            pnlValorTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlValorTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlValorTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlValorTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblValorTotalVenda))
                    .addComponent(btnFechar))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlRelatorioAnaliticoLayout = new javax.swing.GroupLayout(pnlRelatorioAnalitico);
        pnlRelatorioAnalitico.setLayout(pnlRelatorioAnaliticoLayout);
        pnlRelatorioAnaliticoLayout.setHorizontalGroup(
            pnlRelatorioAnaliticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRelatorioAnaliticoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRelatorioAnaliticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDadosVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tblRelAnalitco, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pnlRelatorioAnaliticoLayout.setVerticalGroup(
            pnlRelatorioAnaliticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRelatorioAnaliticoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDadosVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblRelAnalitco, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRelatorioAnalitico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlRelatorioAnalitico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed

        //Fecha a tela ao clicar no botão "Fechar"
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioAnalitico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioAnalitico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioAnalitico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioAnalitico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorioAnalitico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblCPFCliente;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblDatas;
    private javax.swing.JLabel lblIDVenda;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblPeriodo;
    private javax.swing.JLabel lblRelatorioAnalitico;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JLabel lblValorTotalVenda;
    private javax.swing.JPanel pnlCabecalho;
    private javax.swing.JPanel pnlDadosVenda;
    private javax.swing.JPanel pnlRelatorioAnalitico;
    private javax.swing.JPanel pnlValorTotal;
    private javax.swing.JScrollPane tblRelAnalitco;
    private javax.swing.JTable tblRelatorioAnalitico;
    // End of variables declaration//GEN-END:variables
}