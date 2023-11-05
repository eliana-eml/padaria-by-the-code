package br.sp.eml.projects.padariabythecode.secondscreens;

import br.sp.eml.projects.padariabythecode.dao.ProdutoDAO;
import br.sp.eml.projects.padariabythecode.model.Produto;
import br.sp.eml.projects.padariabythecode.utils.Utils;
import br.sp.eml.projects.padariabythecode.utils.Validador;
import br.sp.eml.projects.padariabythecode.view.TelaPrincipalVendas;
import br.sp.eml.projects.padariabythecode.view.TelaProdutos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emlel
 */
public class TelaListagemProdutos extends javax.swing.JFrame {

    /**
     * Construtor da classe TelaListagemProdutos. Inicializa os componentes
     * gráficos gerados automaticamente. Em seguida, define a posição da janela
     * ao centro da tela.
     */
    public TelaListagemProdutos() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnNavBarVendas = new javax.swing.JButton();
        btnNavBarProdutos1 = new javax.swing.JButton();
        pnlBuscaListagemProdutos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIDProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        btnBuscarNomeProduto = new javax.swing.JButton();
        btnBuscarIDProduto = new javax.swing.JButton();
        btnLimparBusca = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListagemProdutos = new javax.swing.JTable();
        btnAdicionarProduto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("LISTA DE PRODUTOS");

        btnNavBarVendas.setText("Vendas");
        btnNavBarVendas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnNavBarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavBarVendasActionPerformed(evt);
            }
        });

        btnNavBarProdutos1.setText("Produtos");
        btnNavBarProdutos1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnNavBarProdutos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavBarProdutos1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNavBarVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNavBarProdutos1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNavBarProdutos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNavBarVendas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlBuscaListagemProdutos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("ID Produto:");

        txtIDProduto.setName("ID Produto"); // NOI18N
        txtIDProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDProdutoKeyTyped(evt);
            }
        });

        jLabel3.setText("Nome Produto:");

        txtNomeProduto.setName("Nome Produto"); // NOI18N
        txtNomeProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeProdutoKeyTyped(evt);
            }
        });

        btnBuscarNomeProduto.setText("Buscar");
        btnBuscarNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarNomeProdutoActionPerformed(evt);
            }
        });

        btnBuscarIDProduto.setText("Buscar");
        btnBuscarIDProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIDProdutoActionPerformed(evt);
            }
        });

        btnLimparBusca.setText("Limpar Busca");
        btnLimparBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparBuscaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBuscaListagemProdutosLayout = new javax.swing.GroupLayout(pnlBuscaListagemProdutos);
        pnlBuscaListagemProdutos.setLayout(pnlBuscaListagemProdutosLayout);
        pnlBuscaListagemProdutosLayout.setHorizontalGroup(
            pnlBuscaListagemProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscaListagemProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBuscaListagemProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBuscaListagemProdutosLayout.createSequentialGroup()
                        .addComponent(txtIDProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarIDProduto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBuscaListagemProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBuscaListagemProdutosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlBuscaListagemProdutosLayout.createSequentialGroup()
                        .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarNomeProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimparBusca)))
                .addContainerGap())
        );
        pnlBuscaListagemProdutosLayout.setVerticalGroup(
            pnlBuscaListagemProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscaListagemProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBuscaListagemProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBuscaListagemProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarNomeProduto)
                    .addComponent(btnBuscarIDProduto)
                    .addComponent(btnLimparBusca))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        tblListagemProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Preço Unitário", "Qtd Estoque"
            }
        ));
        jScrollPane1.setViewportView(tblListagemProdutos);

        btnAdicionarProduto.setText("Adicionar Produto");
        btnAdicionarProduto.setPreferredSize(new java.awt.Dimension(125, 27));
        btnAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBuscaListagemProdutos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBuscaListagemProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNavBarVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavBarVendasActionPerformed
        /**
         * Instancia um novo objeto da classe TelaPrincipalVendas e o torna
         * visível. Em seguida, oculta a janela atual.
         */
        new TelaPrincipalVendas().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNavBarVendasActionPerformed

    private static void recarregarTabelaProdutos() {
        ///TODO: Chamar a DAO   
        ArrayList<Produto> lista = ProdutoDAO.listarProdutos();

        DefaultTableModel modelo = (DefaultTableModel) tblListagemProdutos.getModel();
        modelo.setRowCount(0);

        //Para cada item na lista retornada do banco, adiciono a essa tabela
        for (Produto item : lista) {
            modelo.addRow(new String[]{
                String.valueOf(item.getIdProduto()),
                String.valueOf(item.getNomeProduto()),
                String.valueOf(item.getPrecoProduto()),
                String.valueOf(item.getQtdEstoqueProduto())
            });
        }
    }
    
    private void btnBuscarNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarNomeProdutoActionPerformed

        /**
         * Intâncio um objeto da classe Validador para validar os campos de
         * texto. Em seguida, verifica se ocorreram erros durante a validação.
         */
        Validador validacao = new Validador();
        validacao.validarTexto(txtNomeProduto);

        /**
         * Se houver erros, obtém as mensagens de erro e o exibe na tela. Caso
         * contrário, realiza a busca no banco de dados.
         */
        if (validacao.hasErro()) {
            String mensagensDeErro = validacao.getMensagensErro();
            JOptionPane.showMessageDialog(rootPane, mensagensDeErro);

        } else {

            String nomeProdutoBuscar = txtNomeProduto.getText();
            Produto produto = ProdutoDAO.buscarPorNomeProduto(nomeProdutoBuscar);

            DefaultTableModel modelo = (DefaultTableModel) tblListagemProdutos.getModel();
            modelo.setRowCount(0);

            //Atualizar a tabela
            modelo.addRow(new String[]{
                //Pegar dados do objeto e passar para a tabela...
                String.valueOf(produto.getIdProduto()),
                String.valueOf(produto.getNomeProduto()),
                String.valueOf(produto.getPrecoProduto()),
                String.valueOf(produto.getQtdEstoqueProduto())
            });
        }
    }//GEN-LAST:event_btnBuscarNomeProdutoActionPerformed

    private void btnNavBarProdutos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavBarProdutos1ActionPerformed
        /**
         * Instancia um novo objeto da classe TelaProdutos e o torna visível. Em
         * seguida, oculta a janela atual.
         */
        new TelaProdutos().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNavBarProdutos1ActionPerformed

    private void btnAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoActionPerformed

        //Declaro uma variável auxiliar para resgatar uma linha selecionada da tabela tblListagemProdutos
        int linhaSelecionada = tblListagemProdutos.getSelectedRow();
        //Instâncio um objeto da classe DefaultTableModel para resgatar o modelo da tabela tblListagemProdutos
        DefaultTableModel modelo = (DefaultTableModel) tblListagemProdutos.getModel();

        //Verifico se o índice da linha selecionada é maior ou igual a 0
        if (linhaSelecionada >= 0) {
            /**
             * Busca pelo ID no banco de dados ao ter a linha de um registo de
             * produto selecionada e renderiza o nome do produto e o valor do
             * mesmo na tela principal de vendas.
             */

            this.dispose();

        } else {
            //Solicito a seleção de uma linha, caso seja menor que 0.
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha!");
        }
    }//GEN-LAST:event_btnAdicionarProdutoActionPerformed

    private void txtIDProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDProdutoKeyTyped
        /**
         * Cria uma instância da classe Validador para realizar validações. Por
         * fim, chama o método limitarEntradaNumerica para restringir a entrada
         * de números no campo txtNomeProduto.
         */
        Validador validacao = new Validador();
        validacao.limitarEntradaNumerica(evt, txtNomeProduto);
    }//GEN-LAST:event_txtIDProdutoKeyTyped

    private void txtNomeProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeProdutoKeyTyped
        /**
         * Cria uma instância da classe Validador para realizar validações. Em
         * seguida, chama o método limitarQuantidadeCaracteres para limitar o
         * número de caracteres inseridos no campo txtNomeProduto. Por fim,
         * chama o método limitarEntradaTexto para restringir a entrada de texto
         * no campo txtNomeProduto.
         */
        Validador validacao = new Validador();
        validacao.limitarQuantidadeCaracteres(evt, txtNomeProduto, 50);
        validacao.limitarEntradaTexto(evt, txtNomeProduto);
    }//GEN-LAST:event_txtNomeProdutoKeyTyped

    private void btnBuscarIDProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIDProdutoActionPerformed

        Validador validacao = new Validador();
        validacao.validarTexto(txtIDProduto);

        if (validacao.hasErro()) {
            String mensagensDeErro = validacao.getMensagensErro();
            JOptionPane.showMessageDialog(rootPane, mensagensDeErro);

        } else {

            int idProduto = Integer.parseInt(txtIDProduto.getText());
            Produto produto = ProdutoDAO.buscarPorIdProduto(idProduto);

            DefaultTableModel modelo = (DefaultTableModel) tblListagemProdutos.getModel();
            modelo.setRowCount(0);

            //Atualizar a tabela
            modelo.addRow(new String[] {
                //Pegar dados do objeto e passar para a tabela...
                String.valueOf(produto.getIdProduto()),
                String.valueOf(produto.getNomeProduto()),
                String.valueOf(produto.getPrecoProduto()),
                String.valueOf(produto.getQtdEstoqueProduto())
            });
        }
    }//GEN-LAST:event_btnBuscarIDProdutoActionPerformed

    private void btnLimparBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaActionPerformed

        Utils utilitario = new Utils();
        utilitario.limparCampos(pnlBuscaListagemProdutos);
        recarregarTabelaProdutos();
    }//GEN-LAST:event_btnLimparBuscaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaListagemProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListagemProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListagemProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListagemProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListagemProdutos().setVisible(true);
                recarregarTabelaProdutos();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnBuscarIDProduto;
    private javax.swing.JButton btnBuscarNomeProduto;
    private javax.swing.JButton btnLimparBusca;
    private javax.swing.JButton btnNavBarProdutos1;
    private javax.swing.JButton btnNavBarVendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlBuscaListagemProdutos;
    private static javax.swing.JTable tblListagemProdutos;
    private javax.swing.JTextField txtIDProduto;
    private javax.swing.JTextField txtNomeProduto;
    // End of variables declaration//GEN-END:variables
}
