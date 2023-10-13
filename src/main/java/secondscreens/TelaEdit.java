package secondscreens;

import br.sp.eml.projects.padariabythecode.utils.Validador;
import javax.swing.JOptionPane;

public class TelaEdit extends javax.swing.JFrame {

    /**
     * Creates new form TelaEdit
     */
    public TelaEdit() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        lblAttProdutos = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblNomeProduto = new javax.swing.JLabel();
        lblValorUniProduto = new javax.swing.JLabel();
        lblQntdeProduto = new javax.swing.JLabel();
        txtEditNomeProduto = new javax.swing.JTextField();
        txtEditValorUni = new javax.swing.JTextField();
        txtEditQntdeProduto = new javax.swing.JTextField();
        btnAtualizar = new javax.swing.JButton();
        lblCliente_ID = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblAttProdutos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAttProdutos.setText("ATUALIZAÇÃO DE PRODUTOS");

        lblNomeProduto.setText("Nome do Produto:");

        lblValorUniProduto.setText("Valor Unitário:");

        lblQntdeProduto.setText("Quantidade:");

        txtEditNomeProduto.setName("Nome do Produto"); // NOI18N
        txtEditNomeProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEditNomeProdutoKeyTyped(evt);
            }
        });

        txtEditValorUni.setName("Valor Unitário"); // NOI18N
        txtEditValorUni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditValorUniActionPerformed(evt);
            }
        });
        txtEditValorUni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEditValorUniKeyTyped(evt);
            }
        });

        txtEditQntdeProduto.setName("Quantidade"); // NOI18N
        txtEditQntdeProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEditQntdeProdutoKeyTyped(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        lblCliente_ID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCliente_ID.setText("ID: 001");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEditNomeProduto, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEditValorUni, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblValorUniProduto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQntdeProduto)
                                    .addComponent(txtEditQntdeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblNomeProduto, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblAttProdutos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(lblCliente_ID)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAttProdutos)
                    .addComponent(lblCliente_ID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNomeProduto)
                .addGap(3, 3, 3)
                .addComponent(txtEditNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorUniProduto)
                    .addComponent(lblQntdeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEditValorUni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEditQntdeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizar)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEditValorUniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditValorUniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditValorUniActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        
        Validador validacao = new Validador();
        validacao.validarTexto(txtEditNomeProduto);
        validacao.validarTexto(txtEditValorUni);
        validacao.validarTexto(txtEditQntdeProduto);

        if (validacao.hasErro()) {
            String mensagensDeErro = validacao.getMensagensErro();
            JOptionPane.showMessageDialog(rootPane, mensagensDeErro);
        }
        
        else {
            JOptionPane.showMessageDialog(rootPane, "Cadastro atualizado com sucesso!");
            dispose();
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void txtEditNomeProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditNomeProdutoKeyTyped

        Validador validacao = new Validador();
        validacao.limitarQuantidadeCaracteres(evt, txtEditNomeProduto, 30);
        validacao.limitarEntradaTexto(evt, txtEditNomeProduto);
    }//GEN-LAST:event_txtEditNomeProdutoKeyTyped

    private void txtEditValorUniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditValorUniKeyTyped

        Validador validacao = new Validador();
        validacao.limitarEntradaNumericaDecimal(evt, txtEditValorUni);
        validacao.limitarQuantidadeCaracteres(evt, txtEditValorUni, 6);
    }//GEN-LAST:event_txtEditValorUniKeyTyped

    private void txtEditQntdeProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditQntdeProdutoKeyTyped

        Validador validacao = new Validador();
        validacao.limitarEntradaNumerica(evt, txtEditQntdeProduto);
        validacao.limitarQuantidadeCaracteres(evt, txtEditQntdeProduto, 5);
    }//GEN-LAST:event_txtEditQntdeProdutoKeyTyped

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
            java.util.logging.Logger.getLogger(TelaEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAttProdutos;
    private javax.swing.JLabel lblCliente_ID;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblQntdeProduto;
    private javax.swing.JLabel lblValorUniProduto;
    private javax.swing.JTextField txtEditNomeProduto;
    private javax.swing.JTextField txtEditQntdeProduto;
    private javax.swing.JTextField txtEditValorUni;
    // End of variables declaration//GEN-END:variables
}
