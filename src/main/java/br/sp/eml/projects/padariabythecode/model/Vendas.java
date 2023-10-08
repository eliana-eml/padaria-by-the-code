package br.sp.eml.projects.padariabythecode.model;

import java.util.ArrayList;
import java.util.Date;

public class Vendas {
    
    private int idVenda;
    private Cliente clienteVenda;
    private int qtdProduto;
    private ArrayList<Produto> listaProdutos;
    private Date dataVenda;

    //Construtor vazio
    public Vendas() {}

    //Construtor com parâmetros
    public Vendas(int idVenda, Cliente clienteVenda, int qtdProduto, ArrayList<Produto> listaProdutos, Date dataVenda) {
        this.idVenda = idVenda;
        this.clienteVenda = clienteVenda;
        this.qtdProduto = qtdProduto;
        this.listaProdutos = listaProdutos;
        this.dataVenda = dataVenda;
    }

    //Getters e Setters
    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Cliente getClienteVenda() {
        return clienteVenda;
    }

    public void setClienteVenda(Cliente clienteVenda) {
        this.clienteVenda = clienteVenda;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

}
