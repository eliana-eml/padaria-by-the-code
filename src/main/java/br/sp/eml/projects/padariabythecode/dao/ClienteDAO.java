package br.sp.eml.projects.padariabythecode.dao;

import br.sp.eml.projects.padariabythecode.model.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO {

    static String url = "jdbc:mysql://localhost:3306/padaria_by_the_code";
    static String login = "root"; //Alterar conforme o usuário!!
    static String senha = "carlsagan10"; //Alterar conforme o usuário!!

    public static boolean cadastrarCliente(Cliente cliente) {

        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo2 - Abrir a conexão com o banco
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL a ser executado
            comandoSQL = conexao.prepareStatement("INSERT INTO clientes (nome_cliente, cpf_cliente, data_nascimento_cliente, genero_cliente, estado_civil_cliente, telefone_cliente, email_cliente, cep_cliente, logradouro_cliente, numero_cliente, complemento_cliente, bairro_cliente, cidade_cliente, uf_cliente) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            comandoSQL.setString(1, cliente.getNomeCliente());
            comandoSQL.setString(2, cliente.getCpfCliente());
            comandoSQL.setDate(3, new java.sql.Date(cliente.getDataNascimentoCliente().getTime()));
            comandoSQL.setString(4, cliente.getGeneroCliente());
            comandoSQL.setString(5, cliente.getEstadoCivilCliente());
            comandoSQL.setString(6, cliente.getTelefoneCliente());
            comandoSQL.setString(7, cliente.getEmailCliente());
            comandoSQL.setString(8, cliente.getCepCliente());
            comandoSQL.setString(9, cliente.getLogradouroCliente());
            comandoSQL.setString(10, cliente.getNumeroCliente());
            comandoSQL.setString(11, cliente.getComplementoCliente());
            comandoSQL.setString(12, cliente.getBairroCliente());
            comandoSQL.setString(13, cliente.getCidadeCliente());
            comandoSQL.setString(14, cliente.getUfCliente());

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
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return retorno;
    }

    public static ArrayList<Cliente> listarClientes() {

        ArrayList<Cliente> listaClientes = new ArrayList<>();

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir Conexão com MYSQL
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("SELECT id_cliente, nome_cliente, cpf_cliente, data_nascimento_cliente, genero_cliente, estado_civil_cliente, telefone_cliente, email_cliente, cep_cliente, logradouro_cliente, numero_cliente, complemento_cliente, bairro_cliente, cidade_cliente, uf_cliente FROM clientes");

            //Passo 4 - Executar comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {

                //PERCORRE TODAS AS LINHAS DO RESULT
                while (rs.next()) {
                    Cliente cliente = new Cliente();
                    cliente.setIdCliente(rs.getInt("id_cliente"));
                    cliente.setNomeCliente(rs.getString("nome_cliente"));
                    cliente.setCpfCliente(rs.getString("cpf_cliente"));
                    cliente.setEmailCliente(rs.getString("email_cliente"));
                    cliente.setTelefoneCliente(rs.getString("telefone_cliente"));
                    cliente.setDataNascimentoCliente(rs.getDate("data_nascimento_cliente"));
                    cliente.setGeneroCliente(rs.getString("genero_cliente"));
                    cliente.setEstadoCivilCliente(rs.getString("estado_civil_cliente"));
                    cliente.setTelefoneCliente(rs.getString("telefone_cliente"));
                    cliente.setEmailCliente(rs.getString("email_cliente"));
                    cliente.setCepCliente(rs.getString("cep_cliente"));
                    cliente.setLogradouroCliente(rs.getString("logradouro_cliente"));
                    cliente.setNumeroCliente(rs.getString("numero_cliente"));
                    cliente.setComplementoCliente(rs.getString("complemento_cliente"));
                    cliente.setBairroCliente(rs.getString("bairro_cliente"));
                    cliente.setCidadeCliente(rs.getString("cidade_cliente"));
                    cliente.setUfCliente(rs.getString("uf_cliente"));

                    listaClientes.add(cliente);

                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        return listaClientes;
    }

    public static Cliente buscarPorCPFCliente(String cpfCliente) {

        Cliente cliente = new Cliente();
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("SELECT id_cliente, nome_cliente, cpf_cliente, data_nascimento_cliente, genero_cliente, estado_civil_cliente, telefone_cliente, email_cliente, cep_cliente, logradouro_cliente, numero_cliente, complemento_cliente, bairro_cliente, cidade_cliente, uf_cliente FROM clientes WHERE cpf_cliente = ?");
            comandoSQL.setString(1, cpfCliente);

            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {

                //Percorrer as linhas do result set
                while (rs.next()) {

                    cliente.setIdCliente(rs.getInt("id_cliente"));
                    cliente.setNomeCliente(rs.getString("nome_cliente"));
                    cliente.setCpfCliente(rs.getString("cpf_cliente"));
                    cliente.setEmailCliente(rs.getString("email_cliente"));
                    cliente.setTelefoneCliente(rs.getString("telefone_cliente"));
                    cliente.setDataNascimentoCliente(rs.getDate("data_nascimento_cliente"));
                    cliente.setGeneroCliente(rs.getString("genero_cliente"));
                    cliente.setEstadoCivilCliente(rs.getString("estado_civil_cliente"));
                    cliente.setTelefoneCliente(rs.getString("telefone_cliente"));
                    cliente.setEmailCliente(rs.getString("email_cliente"));
                    cliente.setCepCliente(rs.getString("cep_cliente"));
                    cliente.setLogradouroCliente(rs.getString("logradouro_cliente"));
                    cliente.setNumeroCliente(rs.getString("numero_cliente"));
                    cliente.setComplementoCliente(rs.getString("complemento_cliente"));
                    cliente.setBairroCliente(rs.getString("bairro_cliente"));
                    cliente.setCidadeCliente(rs.getString("cidade_cliente"));
                    cliente.setUfCliente(rs.getString("uf_cliente"));

                }

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return cliente;
    }

    public static ArrayList<Cliente> buscarPorNomeCliente(String nomeClienteBuscar) {

        ArrayList<Cliente> listaClientes = new ArrayList<>();
        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("SELECT id_cliente, nome_cliente, cpf_cliente, data_nascimento_cliente, genero_cliente, estado_civil_cliente, telefone_cliente, email_cliente, cep_cliente, logradouro_cliente, numero_cliente, complemento_cliente, bairro_cliente, cidade_cliente, uf_cliente FROM clientes WHERE nome_cliente = ?");
            comandoSQL.setString(1, nomeClienteBuscar);

            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {

                //Percorrer as linhas do result set
                while (rs.next()) {

                    Cliente cliente = new Cliente();
                    cliente.setIdCliente(rs.getInt("id_cliente"));
                    cliente.setNomeCliente(rs.getString("nome_cliente"));
                    cliente.setCpfCliente(rs.getString("cpf_cliente"));
                    cliente.setEmailCliente(rs.getString("email_cliente"));
                    cliente.setTelefoneCliente(rs.getString("telefone_cliente"));
                    cliente.setDataNascimentoCliente(rs.getDate("data_nascimento_cliente"));
                    cliente.setGeneroCliente(rs.getString("genero_cliente"));
                    cliente.setEstadoCivilCliente(rs.getString("estado_civil_cliente"));
                    cliente.setTelefoneCliente(rs.getString("telefone_cliente"));
                    cliente.setEmailCliente(rs.getString("email_cliente"));
                    cliente.setCepCliente(rs.getString("cep_cliente"));
                    cliente.setLogradouroCliente(rs.getString("logradouro_cliente"));
                    cliente.setNumeroCliente(rs.getString("numero_cliente"));
                    cliente.setComplementoCliente(rs.getString("complemento_cliente"));
                    cliente.setBairroCliente(rs.getString("bairro_cliente"));
                    cliente.setCidadeCliente(rs.getString("cidade_cliente"));
                    cliente.setUfCliente(rs.getString("uf_cliente"));

                    listaClientes.add(cliente);

                }

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return listaClientes;
    }

    public static boolean excluirCliente(int idCliente) {

        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;

        try {
            //Passo 1 - carregar os drivers
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);

            comandoSQL = conexao.prepareStatement("DELETE FROM clientes WHERE id_cliente = ?");
            comandoSQL.setInt(1, idCliente);

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
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return retorno;
    }

    public static boolean verificarExistenciaCadastroCPF(String cpfCliente) {

        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("SELECT * FROM clientes WHERE cpf_cliente = ?");
            comandoSQL.setString(1, cpfCliente);

            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {

                while (rs.next()) {
                    retorno = true;
                }

            } else {
                retorno = false;
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return retorno;
    }
}
