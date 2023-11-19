package br.sp.eml.projects.padariabythecode.dao;

import br.sp.eml.projects.padariabythecode.model.Cliente;
import br.sp.eml.projects.padariabythecode.model.ItemVenda;
import br.sp.eml.projects.padariabythecode.model.Venda;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VendaDAO {

    static String url = "jdbc:mysql://localhost:3306/padaria_by_the_code";
    static String login = "root"; //Alterar conforme o usuário!!
    static String senha = "root"; //Alterar conforme o usuário!!

    public static boolean cadastrarVenda(Venda venda) {

        boolean retorno = false;
//         conexao = null;
//         comandoSQL = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo2 - Abrir a conexão com o banco
            Connection conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL a ser executado
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO vendas (data_venda, valor_total_venda, id_cliente) VALUES (?,?,?)", Statement.RETURN_GENERATED_KEYS);
            comandoSQL.setDate(1, new java.sql.Date(venda.getDataVenda().getTime()));
            comandoSQL.setDouble(2, venda.getValorTotalVenda());
            comandoSQL.setInt(3, venda.getIdClienteVenda());

            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {

                ResultSet rs = comandoSQL.getGeneratedKeys();

                if (rs.next()) {

                    int idVenda = rs.getInt(1);

                    for (ItemVenda item : venda.getListaProdutos()) {
                        PreparedStatement comandoSQLItem = conexao.prepareStatement("INSERT INTO item_venda (id_venda, id_produto, qtd_produto, valor_unitario_item) VALUES (?, ?, ?, ?)");
                        comandoSQLItem.setInt(1, idVenda);
                        comandoSQLItem.setInt(2, item.getIdProduto());
                        comandoSQLItem.setInt(3, item.getQtdProduto());
                        comandoSQLItem.setDouble(4, item.getValorUnitarioItem());

                        int linhasAfetadasItem = comandoSQLItem.executeUpdate();

                        if (linhasAfetadasItem > 0) {
                            retorno = true;
                        }

                    }

                }

            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }

        return retorno;
    }

//    public static ArrayList<Venda> listarVendas() {
//
//        ArrayList<Venda> listaVendas = new ArrayList<>();
//
//        Connection conexao = null;
//        PreparedStatement comandoSQL = null;
//        ResultSet rs = null;
//
//        try {
//            //Passo 1 - Carregar o Driver
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            //Passo 2 - Abrir Conexão com MYSQL
//            conexao = DriverManager.getConnection(url, login, senha);
//
//            //Passo 3 - Preparar o comando SQL
//            comandoSQL = conexao.prepareStatement("SELECT * FROM vendas");
//
//            //Passo 4 - Executar comando SQL
//            rs = comandoSQL.executeQuery();
//
//            if (rs != null) {
//
//                //PERCORRE TODAS AS LINHAS DO RESULT
//                while (rs.next()) {
//                    Venda item = new Venda();
//
//                    item.setIdVenda(rs.getInt("id_venda"));
//                    item.setDataVenda(rs.getDate("data_venda"));
//                    item.setIdClienteVenda(rs.getInt("id_cliente"));
//                    item.setValorTotalVenda(rs.getDouble("valor_total_venda"));
//
//                    listaVendas.add(item);
//
//                }
//            }
//
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            if (conexao != null) {
//                try {
//                    conexao.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//
//        }
//
//        return listaVendas;
//    }

    public static Venda buscarPorIdVenda(int idVenda) {

        Venda venda = new Venda();
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("SELECT * FROM vendas WHERE id_venda = ?");
            comandoSQL.setInt(1, idVenda);

            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {

                //Percorrer as linhas do result set
                while (rs.next()) {

                    venda.setIdVenda(rs.getInt("id_venda"));
                    venda.setDataVenda(rs.getDate("data_venda"));
                    venda.setValorTotalVenda(rs.getDouble("valor_total_venda"));
                    venda.setIdClienteVenda(rs.getInt("id_cliente"));

                }

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return venda;
    }
}
