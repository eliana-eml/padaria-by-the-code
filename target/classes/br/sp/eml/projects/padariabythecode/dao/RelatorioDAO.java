package br.sp.eml.projects.padariabythecode.dao;

import br.sp.eml.projects.padariabythecode.model.Relatorio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RelatorioDAO {

    static String url = "jdbc:mysql://localhost:3306/padaria_by_the_code";
    static String login = "root"; //Alterar conforme o usuário!!
    static String senha = "carlsagan10"; //Alterar conforme o usuário!!

   
    public static ArrayList<Relatorio> listaRelatorios() throws SQLException {
        ArrayList<Relatorio> listaDeRelatorios = new ArrayList<>();

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url, login, senha);
            //Passo 2 - Abrir Conexão com MYSQL

            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("SELECT vendas.id_venda,  vendas.data_venda, clientes.id_cliente, clientes.nome_cliente, clientes.cpf_cliente, vendas.valor_total_venda FROM vendas\n"
                    + "	left join clientes\n"
                    + "on vendas.id_cliente = clientes.id_cliente\n");

            //Passo 4 - Executar comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {

                //PERCORRE TODAS AS LINHAS DO RESULT
                while (rs.next()) {
                    Relatorio item = new Relatorio();
                    item.setIdVenda(rs.getInt("id_venda"));
                    item.setDataVenda(rs.getDate("data_venda"));
                    item.setIdCliente(rs.getInt("id_cliente"));
                    item.setNomeCliente(rs.getString("nome_cliente"));
                    item.setCpfCliente(rs.getString("cpf_cliente"));
                    item.setValorTotalVenda(rs.getDouble("valor_total_venda"));

                    listaDeRelatorios.add(item);
                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RelatorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaDeRelatorios;
    }

    /**
    *  REALIZA A BUSCA COM  AS DATAS QUE ESTÃO
    *  ENTRE AS DATAS DO PERÍODO MENCIONADO 
    */
    public static ArrayList<Relatorio> listaRelatorioPorData(String dataInicio, String dataFim) throws SQLException {

        ArrayList<Relatorio> listaDeRelatorios = new ArrayList<>();
        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            //Carregar Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Conecta no banco
            conexao = DriverManager.getConnection(url, login, senha);

            comandoSQL = conexao.prepareStatement("SELECT vendas.id_venda, vendas.data_venda, clientes.id_cliente, clientes.nome_cliente, clientes.cpf_cliente, vendas.valor_total_venda,  (select sum(vendas.valor_total_venda) from vendas WHERE vendas.data_venda between ?  AND ? ) as precoTotal \n"
                    + "	FROM clientes INNER JOIN vendas \n"
                    + "ON clientes.id_cliente = vendas.id_cliente\n"
                    + "WHERE vendas.data_venda between ?  AND ?");

            comandoSQL.setString(1, dataInicio);
            comandoSQL.setString(2, dataFim);
            comandoSQL.setString(3, dataInicio);
            comandoSQL.setString(4, dataFim);

            //Passo 4 - Executar comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {

                //PERCORRE TODAS AS LINHAS DO RESULT
                while (rs.next()) {
                    Relatorio item = new Relatorio();
                    item.setIdVenda(rs.getInt("id_venda"));
                    item.setDataVenda(rs.getDate("data_venda"));
                    item.setIdCliente(rs.getInt("id_cliente"));
                    item.setNomeCliente(rs.getString("nome_cliente"));
                    item.setCpfCliente(rs.getString("cpf_cliente"));
                    item.setValorTotalVenda(rs.getDouble("valor_total_venda"));
                    item.setValorTotalVendasPeriodo(rs.getDouble("precoTotal"));

                    listaDeRelatorios.add(item);
                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RelatorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaDeRelatorios;
    }

    
    /**
    *   EXECUTA UMA LISTAGEM DE ITENS PELO ID INSERIDO
    *   **A LISTAGEM É SINTÉTICA**
    */
    public static ArrayList<Relatorio> listaRelatorioPorId(int idVenda) throws SQLException {

        ArrayList<Relatorio> listaDeRelatorios = new ArrayList<>();

       
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            //Carregar Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Conecta no banco
            conexao = DriverManager.getConnection(url, login, senha);

            comandoSQL = conexao.prepareStatement("SELECT vendas.id_venda, vendas.data_venda, clientes.id_cliente, clientes.nome_cliente, clientes.cpf_cliente, vendas.valor_total_venda\n"
                    + "	FROM clientes INNER JOIN vendas \n"
                    + "ON clientes.id_cliente = vendas.id_cliente\n"
                    + "where vendas.id_venda = ?");

            comandoSQL.setInt(1, idVenda);

            //Passo 4 - Executar comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {

                //PERCORRE TODAS AS LINHAS DO RESULT
                while (rs.next()) {
                    Relatorio item = new Relatorio();
                    item.setIdVenda(rs.getInt("id_venda"));
                    item.setDataVenda(rs.getDate("data_venda"));
                    item.setIdCliente(rs.getInt("id_cliente"));
                    item.setNomeCliente(rs.getString("nome_cliente"));
                    item.setCpfCliente(rs.getString("cpf_cliente"));
                    item.setValorTotalVenda(rs.getDouble("valor_total_venda"));
                    //item.setValorTotalVendasPeriodo(rs.getDouble("precoTotal"));

                    listaDeRelatorios.add(item);
                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RelatorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaDeRelatorios;
    }

    /**
     *  REALIZA UMA LISTAGEM ANALÍTICA DE TODOS OS ITENS
     *  COM  O ID IGUAL AO INFORMADO
    */
    public static ArrayList<Relatorio> listaItemPorId(int idVenda) throws SQLException {

        ArrayList<Relatorio> listaDeRelatorios = new ArrayList<>();

        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            //Carregar Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Conecta no banco
            conexao = DriverManager.getConnection(url, login, senha);

            comandoSQL = conexao.prepareStatement("SELECT clt.cpf_cliente, clt.nome_cliente, v.data_venda ,itv.id_venda, itv.id_item_venda, itv.id_produto, pd.nome_produto, itv.qtd_produto, itv.valor_unitario_item, (itv.qtd_produto * itv.valor_unitario_item) AS valor_total_item\n"
                    + "	FROM vendas AS v INNER JOIN item_venda AS itv\n"
                    + "		ON itv.id_venda = v.id_venda\n"
                    + "    INNER JOIN produtos AS pd\n"
                    + "		ON itv.id_produto = pd.id_produto\n"
                    + "	INNER JOIN clientes as clt\n"
                    + "		ON v.id_cliente = clt.id_cliente\n"
                    + "WHERE v.id_venda = ?");

            comandoSQL.setInt(1, idVenda);


            //Passo 4 - Executar comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {

                //PERCORRE TODAS AS LINHAS DO RESULT
                while (rs.next()) {
                    Relatorio item = new Relatorio();
                    item.setIdVenda(rs.getInt("id_venda"));
                    item.setIdItemVenda(rs.getInt("id_item_venda"));
                    item.setIdProduto(rs.getInt("id_produto"));
                    item.setNomeProduto(rs.getString("nome_produto"));
                    item.setQtdItemProduto(rs.getInt("qtd_produto"));
                    item.setValorUnitarioItem(rs.getDouble("valor_unitario_item"));
                    item.setValorTotalItemVenda(rs.getDouble("valor_total_item"));
                    
                    
                    //ITENS SEPARADOS POIS NÃO FAZEM PARTE DO DETALHAMENTO PRINCIPAL
                    item.setCpfCliente(rs.getString("cpf_cliente"));
                    item.setNomeCliente(rs.getString("nome_cliente"));
                    item.setDataVenda(rs.getDate("data_venda"));

                    listaDeRelatorios.add(item);
                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RelatorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaDeRelatorios;
    }

}
