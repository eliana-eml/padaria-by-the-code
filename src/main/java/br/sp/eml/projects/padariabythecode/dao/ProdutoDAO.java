/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.sp.eml.projects.padariabythecode.dao;

import br.sp.eml.projects.padariabythecode.model.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduar
 */
public class ProdutoDAO {

    //LOGIN PADRÃO DE ACESSO NO BANCO DE DADOS, VOCÊ VAI UTILIZAR ESSE MESMO LINK, DE ACORDO COM O NOME DA DATABASE 
    static String url = "jdbc:mysql://localhost:3306/padariacode";
    static String login = "root";
    static String senha = "";

    //Função de salvar produto
    public static boolean salvarProduto(Produto produto) {

        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo2 - Abrir a conexão com o banco
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL a ser executado
            comandoSQL = conexao.prepareStatement("INSERT INTO produtos (nome, preco, quantidade) VALUES (?, ?, ?)");
            comandoSQL.setString(1, produto.getNomeProduto());
            comandoSQL.setInt(2, produto.getQtdEstoqueProduto());
            comandoSQL.setDouble(3, produto.getPrecoProduto());

            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException ex) {
            retorno = false;
        } catch (SQLException ex) {
            retorno = false;
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return retorno;
    }

    public static boolean excluirProduto(int productId) throws SQLException {

        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;

        try {
            //Passo 1 - carregar os drivers
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);

            comandoSQL = conexao.prepareStatement("DELETE FROM  produtos where id = ?");
            comandoSQL.setInt(1, productId);

            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException ex) {
            retorno = false;
        } catch (SQLException ex) {
            retorno = false;
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return retorno;
    }

    public static ArrayList<Produto> listarProdutos() {

        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir Conexão com MYSQL
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("SELECT * FROM produtos");

            //Passo 4 - Executar comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {

                //PERCORRE TODAS AS LINHAS DO RESULT
                while (rs.next()) {
                    Produto item = new Produto();
                    item.setIdProduto(rs.getInt("id"));
                    item.setNomeProduto(rs.getString("nome"));
                    item.setPrecoProduto(rs.getDouble("preco"));
                    item.setQtdEstoqueProduto(rs.getInt("quantidade"));

                    listaProdutos.add(item);

                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        return listaProdutos;
    }

}
