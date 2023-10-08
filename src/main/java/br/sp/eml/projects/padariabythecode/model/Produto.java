package br.sp.eml.projects.padariabythecode.model;

import java.util.Date;

public class Produto {
    
    private int idProduto;
    private String nomeProduto;
    private double precoProduto;
    private int qtdEstoqueProduto;
    private Date dataValidadeProduto;

    //Construtor vazio
    public Produto() {}

    //Construtor com parâmetros
    public Produto(int idProduto, String nomeProduto, double precoProduto, int qtdEstoqueProduto, Date dataValidadeProduto) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.qtdEstoqueProduto = qtdEstoqueProduto;
        this.dataValidadeProduto = dataValidadeProduto;
    }
    
    //Getters e Setters
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getQtdEstoqueProduto() {
        return qtdEstoqueProduto;
    }

    public void setQtdEstoqueProduto(int qtdEstoqueProduto) {
        this.qtdEstoqueProduto = qtdEstoqueProduto;
    }

    public Date getDataValidadeProduto() {
        return dataValidadeProduto;
    }

    public void setDataValidadeProduto(Date dataValidadeProduto) {
        this.dataValidadeProduto = dataValidadeProduto;
    }
    
}
