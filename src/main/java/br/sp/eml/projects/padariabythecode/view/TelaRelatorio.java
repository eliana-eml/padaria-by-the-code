/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.sp.eml.projects.padariabythecode.view;

import br.sp.eml.projects.padariabythecode.utils.Validador;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eduar
 */
public class TelaRelatorio extends javax.swing.JFrame {

    /**
     * Creates new form TelaProdutos
     */
    public TelaRelatorio() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        scrollbar1 = new java.awt.Scrollbar();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        pnlDetalhes = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblCodigoVenda = new javax.swing.JLabel();
        lblNomeCliente = new javax.swing.JLabel();
        lblValorTotalVenda = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblDataVenda = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblCPFCliente = new javax.swing.JLabel();
        btnVisualizarRelatorioAnalitico = new javax.swing.JButton();
        pnlBuscarPorData = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnBuscarPorData = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDataInicio = new javax.swing.JFormattedTextField();
        txtDataFim = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIDVendaBuscar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnBuscarVendaID = new javax.swing.JButton();
        pnlDadosVendas = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnVisualizarDetalhes = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblVendas = new javax.swing.JTable();
        pnlCabecalho = new javax.swing.JPanel();
        btnNavBarVendas = new javax.swing.JButton();
        btnNavBarClientes = new javax.swing.JButton();
        btnNavBarProdutos = new javax.swing.JButton();
        lbNomePadaria = new javax.swing.JLabel();
        lbLogotipo = new javax.swing.JLabel();
        pnlRodape1 = new javax.swing.JPanel();
        lbDataAtual1 = new javax.swing.JLabel();
        pnlProdutos = new javax.swing.JPanel();
        lbTituloVendas2 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        pnlDetalhes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("DETALHES");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("ID Venda:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Cliente:");

        lblCodigoVenda.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblCodigoVenda.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigoVenda.setText("1234");

        lblNomeCliente.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblNomeCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomeCliente.setText("João da Silva");

        lblValorTotalVenda.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblValorTotalVenda.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblValorTotalVenda.setText("R$ 100,00");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Data do Pedido:");

        lblDataVenda.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblDataVenda.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDataVenda.setText("30/04/2001");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Valor Total:");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("CPF Cliente:");

        lblCPFCliente.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblCPFCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCPFCliente.setText("888.888.888-88");

        btnVisualizarRelatorioAnalitico.setText("Visualizar Relatório Analítico");

        javax.swing.GroupLayout pnlDetalhesLayout = new javax.swing.GroupLayout(pnlDetalhes);
        pnlDetalhes.setLayout(pnlDetalhesLayout);
        pnlDetalhesLayout.setHorizontalGroup(
            pnlDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetalhesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVisualizarRelatorioAnalitico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(pnlDetalhesLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValorTotalVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDetalhesLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDataVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDetalhesLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCodigoVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDetalhesLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCPFCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDetalhesLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlDetalhesLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlDetalhesLayout.setVerticalGroup(
            pnlDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetalhesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblCodigoVenda))
                .addGap(18, 18, 18)
                .addGroup(pnlDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblNomeCliente))
                .addGap(18, 18, 18)
                .addGroup(pnlDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(lblCPFCliente))
                .addGap(18, 18, 18)
                .addGroup(pnlDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lblDataVenda))
                .addGap(18, 18, 18)
                .addGroup(pnlDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblValorTotalVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVisualizarRelatorioAnalitico, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pnlBuscarPorData.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setText("Data Início:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setText("BUSCA POR DATA");

        btnBuscarPorData.setText("Buscar");
        btnBuscarPorData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPorDataActionPerformed(evt);
            }
        });

        jLabel1.setText("Data Final:");

        try {
            txtDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataInicio.setName("Data Início"); // NOI18N

        try {
            txtDataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataFim.setName("Data Fim"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("BUSCA POR ID");

        txtIDVendaBuscar.setName("ID Venda"); // NOI18N
        txtIDVendaBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDVendaBuscarKeyTyped(evt);
            }
        });

        jLabel10.setText("ID Venda:");

        btnBuscarVendaID.setText("Buscar");
        btnBuscarVendaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVendaIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBuscarPorDataLayout = new javax.swing.GroupLayout(pnlBuscarPorData);
        pnlBuscarPorData.setLayout(pnlBuscarPorDataLayout);
        pnlBuscarPorDataLayout.setHorizontalGroup(
            pnlBuscarPorDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscarPorDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBuscarPorDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(pnlBuscarPorDataLayout.createSequentialGroup()
                        .addGroup(pnlBuscarPorDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBuscarPorDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBuscarPorDataLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(pnlBuscarPorDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnlBuscarPorDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(pnlBuscarPorDataLayout.createSequentialGroup()
                                    .addComponent(txtDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnBuscarPorData, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBuscarPorDataLayout.createSequentialGroup()
                            .addComponent(txtIDVendaBuscar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnBuscarVendaID, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlBuscarPorDataLayout.setVerticalGroup(
            pnlBuscarPorDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscarPorDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBuscarPorDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBuscarPorDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPorData))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBuscarPorDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDVendaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarVendaID))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDadosVendas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("Lista de Vendas");

        btnVisualizarDetalhes.setText("Visualizar Detalhes");
        btnVisualizarDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarDetalhesActionPerformed(evt);
            }
        });

        tblVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Compra", "Cliente", "CPF Cliente", "Data da Compra", "Valor Total"
            }
        ));
        jScrollPane3.setViewportView(tblVendas);

        javax.swing.GroupLayout pnlDadosVendasLayout = new javax.swing.GroupLayout(pnlDadosVendas);
        pnlDadosVendas.setLayout(pnlDadosVendasLayout);
        pnlDadosVendasLayout.setHorizontalGroup(
            pnlDadosVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(pnlDadosVendasLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVisualizarDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDadosVendasLayout.setVerticalGroup(
            pnlDadosVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVisualizarDetalhes)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pnlCabecalho.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNavBarVendas.setText("Vendas");
        btnNavBarVendas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnNavBarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavBarVendasActionPerformed(evt);
            }
        });

        btnNavBarClientes.setText("Clientes");
        btnNavBarClientes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnNavBarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavBarClientesActionPerformed(evt);
            }
        });

        btnNavBarProdutos.setText("Produtos");
        btnNavBarProdutos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnNavBarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavBarProdutosActionPerformed(evt);
            }
        });

        lbNomePadaria.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbNomePadaria.setText("By The Code Bakery");

        lbLogotipo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbLogotipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogotipo.setText("LOGO");
        lbLogotipo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbLogotipo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlCabecalhoLayout = new javax.swing.GroupLayout(pnlCabecalho);
        pnlCabecalho.setLayout(pnlCabecalhoLayout);
        pnlCabecalhoLayout.setHorizontalGroup(
            pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLogotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNomePadaria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNavBarVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNavBarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNavBarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlCabecalhoLayout.setVerticalGroup(
            pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNavBarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNavBarProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlCabecalhoLayout.createSequentialGroup()
                        .addGroup(pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbLogotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNomePadaria))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnNavBarVendas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlRodape1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbDataAtual1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbDataAtual1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDataAtual1.setText("23/09/2023");
        lbDataAtual1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlRodape1Layout = new javax.swing.GroupLayout(pnlRodape1);
        pnlRodape1.setLayout(pnlRodape1Layout);
        pnlRodape1Layout.setHorizontalGroup(
            pnlRodape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRodape1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbDataAtual1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlRodape1Layout.setVerticalGroup(
            pnlRodape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbDataAtual1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        pnlProdutos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbTituloVendas2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTituloVendas2.setText("RELATÓRIO");

        javax.swing.GroupLayout pnlProdutosLayout = new javax.swing.GroupLayout(pnlProdutos);
        pnlProdutos.setLayout(pnlProdutosLayout);
        pnlProdutosLayout.setHorizontalGroup(
            pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTituloVendas2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlProdutosLayout.setVerticalGroup(
            pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTituloVendas2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlRodape1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnlDadosVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlBuscarPorData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlDetalhes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlBuscarPorData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlDadosVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRodape1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNavBarVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavBarVendasActionPerformed
        // TODO add your handling code here:
          new TelaPrincipalVendas().setVisible(true);
          this.setVisible(false);
    }//GEN-LAST:event_btnNavBarVendasActionPerformed

    private void btnNavBarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavBarClientesActionPerformed
        // TODO add your handling code here:
           new TelaCadastroCliente().setVisible(true);
           this.setVisible(false);
    }//GEN-LAST:event_btnNavBarClientesActionPerformed

    private void btnNavBarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavBarProdutosActionPerformed
        // TODO add your handling code here:
           new TelaProdutos().setVisible(true);
           this.setVisible(false);
    }//GEN-LAST:event_btnNavBarProdutosActionPerformed

    private void btnBuscarPorDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPorDataActionPerformed

        Validador validacao = new Validador();
        validacao.validarTexto(txtDataInicio);
        validacao.validarTexto(txtDataFim);

        if (validacao.hasErro()) {
            String mensagensDeErro = validacao.getMensagensErro();
            JOptionPane.showMessageDialog(rootPane, mensagensDeErro);
        } else {
            
            //Buscar no banco de dados o período informado.
        }
    }//GEN-LAST:event_btnBuscarPorDataActionPerformed

    private void btnVisualizarDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarDetalhesActionPerformed

        int linhaSelecionada = tblVendas.getSelectedRow();

        DefaultTableModel modelo = (DefaultTableModel) tblVendas.getModel();

        if (linhaSelecionada >= 0) {
            
            //Linha selecionada = registo de venda do banco de dados que será renderizado em detalhes.
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha!");
        }
    }//GEN-LAST:event_btnVisualizarDetalhesActionPerformed

    private void btnBuscarVendaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVendaIDActionPerformed

        Validador validacao = new Validador();
        validacao.validarTexto(txtIDVendaBuscar);

        if (validacao.hasErro()) {
            String mensagensDeErro = validacao.getMensagensErro();
            JOptionPane.showMessageDialog(rootPane, mensagensDeErro);
        } else {
            
            //Buscar no banco de dados o ID informado.
        }
    }//GEN-LAST:event_btnBuscarVendaIDActionPerformed

    private void txtIDVendaBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDVendaBuscarKeyTyped

        Validador validacao = new Validador();
        validacao.limitarEntradaNumerica(evt, txtIDVendaBuscar);
        validacao.limitarQuantidadeCaracteres(evt, txtIDVendaBuscar, 5);
    }//GEN-LAST:event_txtIDVendaBuscarKeyTyped

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
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPorData;
    private javax.swing.JButton btnBuscarVendaID;
    private javax.swing.JButton btnNavBarClientes;
    private javax.swing.JButton btnNavBarProdutos;
    private javax.swing.JButton btnNavBarVendas;
    private javax.swing.JButton btnVisualizarDetalhes;
    private javax.swing.JButton btnVisualizarRelatorioAnalitico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbDataAtual1;
    private javax.swing.JLabel lbLogotipo;
    private javax.swing.JLabel lbNomePadaria;
    private javax.swing.JLabel lbTituloVendas2;
    private javax.swing.JLabel lblCPFCliente;
    private javax.swing.JLabel lblCodigoVenda;
    private javax.swing.JLabel lblDataVenda;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblValorTotalVenda;
    private javax.swing.JPanel pnlBuscarPorData;
    private javax.swing.JPanel pnlCabecalho;
    private javax.swing.JPanel pnlDadosVendas;
    private javax.swing.JPanel pnlDetalhes;
    private javax.swing.JPanel pnlProdutos;
    private javax.swing.JPanel pnlRodape1;
    private java.awt.Scrollbar scrollbar1;
    private javax.swing.JTable tblVendas;
    private javax.swing.JFormattedTextField txtDataFim;
    private javax.swing.JFormattedTextField txtDataInicio;
    private javax.swing.JTextField txtIDVendaBuscar;
    // End of variables declaration//GEN-END:variables
}
