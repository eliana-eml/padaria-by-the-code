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

public class ProdutoDAO {

    //LOGIN PADRÃO DE ACESSO NO BANCO DE DADOS, VOCÊ VAI UTILIZAR ESSE MESMO LINK, DE ACORDO COM O NOME DA DATABASE 
    static String url = "jdbc:mysql://localhost:3306/padaria_by_the_code";
    static String login = "root"; //Alterar conforme o usuário!!
    static String senha = "root"; //Alterar conforme o usuário!!

    /**
     * Método de cadastro para acesso e inserção de registros de produtos no banco de dados.
     * @param produto objeto do tipo Produto
     * @return boolean - true: sucesso, false: falha.
     */
    public static boolean cadastrarProduto(Produto produto) {

        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo2 - Abrir a conexão com o banco
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL a ser executado
            comandoSQL = conexao.prepareStatement("INSERT INTO produtos (nome_produto, preco_unitario_produto, qtd_estoque_produto) VALUES (?, ?, ?)");
            comandoSQL.setString(1, produto.getNomeProduto());
            comandoSQL.setDouble(2, produto.getPrecoProduto());
            comandoSQL.setInt(3, produto.getQtdEstoqueProduto());

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
    
    /**
     * Método de alteração para acesso e atualização de registros de produtos no banco de dados.
     * @param produtoAlterar objeto do tipo Produto
     * @return boolean - true: sucesso, false: falha
     */
    public static boolean alterarProduto(Produto produtoAlterar) {

        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {

            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexão com o banco
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL a ser executado
            comandoSQL = conexao.prepareStatement("UPDATE produtos SET nome_produto = ?, preco_unitario_produto = ?, qtd_estoque_produto = ? WHERE id_produto = ?");
            comandoSQL.setString(1, produtoAlterar.getNomeProduto());
            comandoSQL.setDouble(2, produtoAlterar.getPrecoProduto());
            comandoSQL.setInt(3, produtoAlterar.getQtdEstoqueProduto());
            comandoSQL.setInt(4, produtoAlterar.getIdProduto());

            //Finalmente... vamos executar o comando!
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

    /**
     * Método de exclusão para acesso e exclusão de registros de produtos no banco de dados.
     * @param idProduto do tipo inteiro
     * @return boolean - true: sucesso, false: falha
     */
    public static boolean excluirProduto(int idProduto) {

        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;

        try {
            //Passo 1 - carregar os drivers
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);

            comandoSQL = conexao.prepareStatement("DELETE FROM produtos WHERE id_produto = ?");
            comandoSQL.setInt(1, idProduto);

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

    /**
     * Método de listagem de produtos para acesso e consulta de todos os registros de produtos no banco de dados.
     * @return ArrayList do tipo Produto
     */
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
                    item.setIdProduto(rs.getInt("id_produto"));
                    item.setNomeProduto(rs.getString("nome_produto"));
                    item.setPrecoProduto(rs.getDouble("preco_unitario_produto"));
                    item.setQtdEstoqueProduto(rs.getInt("qtd_estoque_produto"));

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
    
    /**
     * Método de busca por um registro de produto no banco de dados com nome correspondente ao passado por parâmetro.
     * @param nomeProdutoBuscar do tipo String
     * @return objeto do tipo Produto
     */
    public static Produto buscarPorNomeProduto(String nomeProdutoBuscar) {

        Produto produto = new Produto();
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("SELECT * FROM produtos WHERE nome_produto = ?");
            comandoSQL.setString(1, nomeProdutoBuscar);

            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {

                //Percorrer as linhas do result set
                while (rs.next()) {
                    
                    produto.setIdProduto(rs.getInt("id_produto"));
                    produto.setNomeProduto(rs.getString("nome_produto"));
                    produto.setPrecoProduto(rs.getDouble("preco_unitario_produto"));
                    produto.setQtdEstoqueProduto(rs.getInt("qtd_estoque_produto"));
        
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

        return produto;
    }
    
    /**
     * Método de busca por um registro de produto no banco de dados com id correspondente ao passado por parâmetro.
     * @param idProduto do tipo inteiro
     * @return objeto do tipo Produto
     */
    public static Produto buscarPorIdProduto(int idProduto) {

        Produto produto = new Produto();
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("SELECT * FROM produtos WHERE id_produto = ?");
            comandoSQL.setInt(1, idProduto);

            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {

                //Percorrer as linhas do result set
                while (rs.next()) {
                    
                    produto.setIdProduto(rs.getInt("id_produto"));
                    produto.setNomeProduto(rs.getString("nome_produto"));
                    produto.setPrecoProduto(rs.getDouble("preco_unitario_produto"));
                    produto.setQtdEstoqueProduto(rs.getInt("qtd_estoque_produto"));
        
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

        return produto;
    }
    
    /**
     * Metódo de atualização de valor de estoque para o objeto do tipo Produto passado por parâmetro.
     * @param produtoEstoqueAlterar objeto do tipo Produto
     * @return boolean - true: sucesso, false: falha
     */
    public static boolean atualizarEstoqueProduto(Produto produtoEstoqueAlterar) {
        
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {

            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexão com o banco
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL a ser executado
            comandoSQL = conexao.prepareStatement("UPDATE produtos SET qtd_estoque_produto = ? WHERE id_produto = ?");
            comandoSQL.setInt(1, produtoEstoqueAlterar.getQtdEstoqueProduto());
            comandoSQL.setInt(2, produtoEstoqueAlterar.getIdProduto());

            //Finalmente... vamos executar o comando!
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

}
