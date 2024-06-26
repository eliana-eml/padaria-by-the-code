package br.sp.eml.projects.padariabythecode.model;

public class Produto {
    
    private int idProduto;
    private String nomeProduto;
    private double precoProduto;
    private int qtdEstoqueProduto;

    //Construtor vazio
    public Produto() {}

    //Construtor com parâmetros
    public Produto(int idProduto, String nomeProduto, double precoProduto, int qtdEstoqueProduto) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.qtdEstoqueProduto = qtdEstoqueProduto;
    }
    
    //Construtor para salvar no banco de dados
    public Produto(String nomeProduto, double precoProduto, int qtdEstoqueProduto){
            this.nomeProduto = nomeProduto;
            this.precoProduto = precoProduto;
            this.qtdEstoqueProduto = qtdEstoqueProduto;
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

}
