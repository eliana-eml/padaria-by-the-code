package br.sp.eml.projects.padariabythecode.secondscreens;

import br.sp.eml.projects.padariabythecode.dao.ClienteDAO;
import br.sp.eml.projects.padariabythecode.model.Cliente;
import br.sp.eml.projects.padariabythecode.utils.Utils;
import br.sp.eml.projects.padariabythecode.utils.Validador;
import br.sp.eml.projects.padariabythecode.view.TelaCadastroCliente;
import br.sp.eml.projects.padariabythecode.view.TelaPrincipalVendas;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emlel
 */
public class TelaListagemClientes extends javax.swing.JFrame {

    public TelaPrincipalVendas telaPrincipal;

    public TelaListagemClientes() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public TelaListagemClientes(TelaPrincipalVendas objTelaPrincipal) {
        initComponents();
        setLocationRelativeTo(null);
        this.telaPrincipal = objTelaPrincipal;
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
        btnNavBarClientes = new javax.swing.JButton();
        pnlBuscaListagemClientes = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        btnBuscarClienteNome = new javax.swing.JButton();
        txtCPF = new javax.swing.JFormattedTextField();
        btnBuscarClienteCPF = new javax.swing.JButton();
        btnRecarregarTabela = new javax.swing.JButton();
        btnAdicionarCliente = new javax.swing.JButton();
        tblCadastoCliente = new javax.swing.JScrollPane();
        tblListagemClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Listagem de Clientes");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(183, 68, 30));
        jLabel1.setText("LISTA DE CLIENTES");

        btnNavBarVendas.setBackground(new java.awt.Color(57, 56, 56));
        btnNavBarVendas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNavBarVendas.setForeground(new java.awt.Color(255, 255, 255));
        btnNavBarVendas.setText("Vendas");
        btnNavBarVendas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnNavBarVendas.setBorderPainted(false);
        btnNavBarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavBarVendasActionPerformed(evt);
            }
        });

        btnNavBarClientes.setBackground(new java.awt.Color(57, 56, 56));
        btnNavBarClientes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNavBarClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnNavBarClientes.setText("Clientes");
        btnNavBarClientes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnNavBarClientes.setBorderPainted(false);
        btnNavBarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavBarClientesActionPerformed(evt);
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
                .addComponent(btnNavBarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNavBarVendas, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(btnNavBarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnlBuscaListagemClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("CPF Cliente:");

        jLabel3.setText("Nome Cliente:");

        txtNomeCliente.setName("Nome Cliente"); // NOI18N
        txtNomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeClienteKeyTyped(evt);
            }
        });

        btnBuscarClienteNome.setBackground(new java.awt.Color(217, 111, 64));
        btnBuscarClienteNome.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarClienteNome.setText("Buscar");
        btnBuscarClienteNome.setBorderPainted(false);
        btnBuscarClienteNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteNomeActionPerformed(evt);
            }
        });

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setName("CPF Cliente"); // NOI18N
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        btnBuscarClienteCPF.setBackground(new java.awt.Color(217, 111, 64));
        btnBuscarClienteCPF.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarClienteCPF.setText("Buscar");
        btnBuscarClienteCPF.setBorderPainted(false);
        btnBuscarClienteCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteCPFActionPerformed(evt);
            }
        });

        btnRecarregarTabela.setBackground(new java.awt.Color(183, 68, 30));
        btnRecarregarTabela.setForeground(new java.awt.Color(255, 255, 255));
        btnRecarregarTabela.setText("Recarregar Tabela");
        btnRecarregarTabela.setBorderPainted(false);
        btnRecarregarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecarregarTabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBuscaListagemClientesLayout = new javax.swing.GroupLayout(pnlBuscaListagemClientes);
        pnlBuscaListagemClientes.setLayout(pnlBuscaListagemClientesLayout);
        pnlBuscaListagemClientesLayout.setHorizontalGroup(
            pnlBuscaListagemClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscaListagemClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBuscaListagemClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarClienteCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBuscaListagemClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBuscaListagemClientesLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlBuscaListagemClientesLayout.createSequentialGroup()
                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarClienteNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(btnRecarregarTabela)))
                .addContainerGap())
        );
        pnlBuscaListagemClientesLayout.setVerticalGroup(
            pnlBuscaListagemClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscaListagemClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBuscaListagemClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBuscaListagemClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarClienteNome)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarClienteCPF)
                    .addComponent(btnRecarregarTabela))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        btnAdicionarCliente.setBackground(new java.awt.Color(183, 68, 30));
        btnAdicionarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarCliente.setText("Adicionar Cliente");
        btnAdicionarCliente.setBorderPainted(false);
        btnAdicionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarClienteActionPerformed(evt);
            }
        });

        tblListagemClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Cliente", "Nome", "CPF", "Data Nascimento", "Gênero", "Estado Civil", "Telefone", "E-mail", "CEP", "Logradouro", "Nº", "Complemento", "Bairro", "Cidade", "UF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListagemClientes.setToolTipText("");
        tblListagemClientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblListagemClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblCadastoCliente.setViewportView(tblListagemClientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBuscaListagemClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdicionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tblCadastoCliente))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBuscaListagemClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tblCadastoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdicionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btnNavBarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavBarClientesActionPerformed
        /**
         * Instancia um novo objeto da classe TelaCadastroCliente e o torna
         * visível. Em seguida, oculta a janela atual.
         */
        new TelaCadastroCliente().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNavBarClientesActionPerformed

    private void btnBuscarClienteNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteNomeActionPerformed

        /**
         * Intâncio um objeto da classe Validador para validar os campos de
         * texto. Em seguida, verifica se ocorreram erros durante a validação.
         */
        Validador validacao = new Validador();
        validacao.validarTexto(txtNomeCliente);

        /**
         * Se houver erros, obtém as mensagens de erro e o exibe na tela. Caso
         * contrário, realiza a busca no banco de dados.
         */
        if (validacao.hasErro()) {
            String mensagensDeErro = validacao.getMensagensErro();
            JOptionPane.showMessageDialog(rootPane, mensagensDeErro);
        } else {

            String nomeClienteBuscar = txtNomeCliente.getText();
            ArrayList<Cliente> listaClientesPorNome = ClienteDAO.buscarPorNomeCliente(nomeClienteBuscar);

            DefaultTableModel modelo = (DefaultTableModel) tblListagemClientes.getModel();
            modelo.setRowCount(0);

            for (Cliente cliente : listaClientesPorNome) {

                modelo.addRow(new String[]{
                    String.valueOf(cliente.getIdCliente()),
                    String.valueOf(cliente.getNomeCliente()),
                    String.valueOf(cliente.getCpfCliente()),
                    String.valueOf(cliente.getDataNascimentoCliente()),
                    String.valueOf(cliente.getGeneroCliente()),
                    String.valueOf(cliente.getEstadoCivilCliente()),
                    String.valueOf(cliente.getTelefoneCliente()),
                    String.valueOf(cliente.getEmailCliente()),
                    String.valueOf(cliente.getCepCliente()),
                    String.valueOf(cliente.getLogradouroCliente()),
                    String.valueOf(cliente.getNumeroCliente()),
                    String.valueOf(cliente.getComplementoCliente()),
                    String.valueOf(cliente.getBairroCliente()),
                    String.valueOf(cliente.getCidadeCliente()),
                    String.valueOf(cliente.getUfCliente())
                });
            }
        }
    }//GEN-LAST:event_btnBuscarClienteNomeActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void btnAdicionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarClienteActionPerformed

        //Declaro uma variável auxiliar para resgatar uma linha selecionada da tabela tblListagemClientes
        int linhaSelecionada = tblListagemClientes.getSelectedRow();
        //Instâncio um objeto da classe DefaultTableModel para resgatar o modelo da tabela tblListagemClientes
        DefaultTableModel modelo = (DefaultTableModel) tblListagemClientes.getModel();

        //Verifico se o índice da linha selecionada é maior ou igual a 0
        if (linhaSelecionada >= 0) {
            /**
             * Busca pelo ID no banco de dados ao ter a linha de um registo de
             * cliente selecionada e renderiza o nome e CPF do cadastro na tela
             * principal de vendas.
             */
            
            Cliente clienteSelecionado = new Cliente();
            int idCliente = Integer.parseInt(modelo.getValueAt(linhaSelecionada, 0).toString());
            String nomeCliente = modelo.getValueAt(linhaSelecionada, 1).toString();
            String cpfCliente = modelo.getValueAt(linhaSelecionada, 2).toString();
            String telefoneSelecionado = modelo.getValueAt(linhaSelecionada, 6).toString();
            
            clienteSelecionado.setIdCliente(idCliente);
            clienteSelecionado.setNomeCliente(nomeCliente);
            clienteSelecionado.setCpfCliente(cpfCliente);
            clienteSelecionado.setTelefoneCliente(telefoneSelecionado);
            
            telaPrincipal.clienteVenda = clienteSelecionado;
            telaPrincipal.preencherDadosCliente();
            
            this.dispose();

        } else {
            //Solicito a seleção de uma linha, caso seja menor que 0.
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha!");
        }
    }//GEN-LAST:event_btnAdicionarClienteActionPerformed

    private void txtNomeClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeClienteKeyTyped
        /**
         * Cria uma instância da classe Validador para realizar validações. Em
         * seguida, chama o método limitarQuantidadeCaracteres para limitar o
         * número de caracteres inseridos no campo txtNomeCliente.
         *
         * Por fim, chama o método limitarEntradaTexto para restringir a entrada
         * de texto no campo txtNomeCliente.
         */
        Validador validacao = new Validador();
        validacao.limitarQuantidadeCaracteres(evt, txtNomeCliente, 50);
        validacao.limitarEntradaTexto(evt, txtNomeCliente);
    }//GEN-LAST:event_txtNomeClienteKeyTyped

    private void btnBuscarClienteCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteCPFActionPerformed

        Validador validacao = new Validador();
        validacao.validarTexto(txtCPF);

        /**
         * Se houver erros, obtém as mensagens de erro e o exibe na tela. Caso
         * contrário, exibe os valores válidos nos rótulos correspondentes
         * (lblBuscaNome & lblBuscaCPF).
         */
        if (validacao.hasErro()) {
            String mensagensDeErro = validacao.getMensagensErro();
            JOptionPane.showMessageDialog(rootPane, mensagensDeErro);
        } else {

            String cpfClienteBuscar = txtCPF.getText();
            Cliente cliente = ClienteDAO.buscarPorCPFCliente(cpfClienteBuscar);

            DefaultTableModel modelo = (DefaultTableModel) tblListagemClientes.getModel();
            modelo.setRowCount(0);

            modelo.addRow(new String[]{
                String.valueOf(cliente.getIdCliente()),
                String.valueOf(cliente.getNomeCliente()),
                String.valueOf(cliente.getCpfCliente()),
                String.valueOf(cliente.getDataNascimentoCliente()),
                String.valueOf(cliente.getGeneroCliente()),
                String.valueOf(cliente.getEstadoCivilCliente()),
                String.valueOf(cliente.getTelefoneCliente()),
                String.valueOf(cliente.getEmailCliente()),
                String.valueOf(cliente.getCepCliente()),
                String.valueOf(cliente.getLogradouroCliente()),
                String.valueOf(cliente.getNumeroCliente()),
                String.valueOf(cliente.getComplementoCliente()),
                String.valueOf(cliente.getBairroCliente()),
                String.valueOf(cliente.getCidadeCliente()),
                String.valueOf(cliente.getUfCliente())
            });

        }


    }//GEN-LAST:event_btnBuscarClienteCPFActionPerformed

    private void btnRecarregarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecarregarTabelaActionPerformed

        Utils utilitario = new Utils();
        utilitario.limparCampos(pnlBuscaListagemClientes);
        recarregarTabelaClientes();
    }//GEN-LAST:event_btnRecarregarTabelaActionPerformed

    private static void recarregarTabelaClientes() {
        ///TODO: Chamar a DAO   
        ArrayList<Cliente> lista = ClienteDAO.listarClientes();

        DefaultTableModel modelo = (DefaultTableModel) tblListagemClientes.getModel();
        modelo.setRowCount(0);

        for (Cliente cliente : lista) {

            modelo.addRow(new String[]{
                String.valueOf(cliente.getIdCliente()),
                String.valueOf(cliente.getNomeCliente()),
                String.valueOf(cliente.getCpfCliente()),
                String.valueOf(cliente.getDataNascimentoCliente()),
                String.valueOf(cliente.getGeneroCliente()),
                String.valueOf(cliente.getEstadoCivilCliente()),
                String.valueOf(cliente.getTelefoneCliente()),
                String.valueOf(cliente.getEmailCliente()),
                String.valueOf(cliente.getCepCliente()),
                String.valueOf(cliente.getLogradouroCliente()),
                String.valueOf(cliente.getNumeroCliente()),
                String.valueOf(cliente.getComplementoCliente()),
                String.valueOf(cliente.getBairroCliente()),
                String.valueOf(cliente.getCidadeCliente()),
                String.valueOf(cliente.getUfCliente())
            });
        }
    }

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
            java.util.logging.Logger.getLogger(TelaListagemClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListagemClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListagemClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListagemClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListagemClientes().setVisible(true);
                recarregarTabelaClientes();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarCliente;
    private javax.swing.JButton btnBuscarClienteCPF;
    private javax.swing.JButton btnBuscarClienteNome;
    private javax.swing.JButton btnNavBarClientes;
    private javax.swing.JButton btnNavBarVendas;
    private javax.swing.JButton btnRecarregarTabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnlBuscaListagemClientes;
    private javax.swing.JScrollPane tblCadastoCliente;
    private static javax.swing.JTable tblListagemClientes;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtNomeCliente;
    // End of variables declaration//GEN-END:variables
}
