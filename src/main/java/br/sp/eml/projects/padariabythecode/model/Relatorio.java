package br.sp.eml.projects.padariabythecode.model;

import java.util.Date;

/**
 *
 * @author emlel
 */
public class Relatorio {
        
    private int idVenda;
    private int idItemVenda;
    private int idCliente;
    private int idProduto;
    private Date dataVenda;
    private String nomeCliente;
    private String cpfCliente;
    private String nomeProduto;
    private double valorUnitarioItem;
    private double valorTotalItemVenda;
    private double valorTotalVenda;
    private double valorTotalVendasPeriodo;
    private int qtdItemProduto;

    public Relatorio() {
    }

    public Relatorio(int idVenda, int idItemVenda, int idCliente, int idProduto, Date dataVenda, String nomeCliente, String cpfCliente, String nomeProduto, double valorUnitarioItem, double valorTotalItemVenda, double valorTotalVenda, double valorTotalVendasPeriodo, int qtdItemProduto) {
        this.idVenda = idVenda;
        this.idItemVenda = idItemVenda;
        this.idCliente = idCliente;
        this.idProduto = idProduto;
        this.dataVenda = dataVenda;
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.nomeProduto = nomeProduto;
        this.valorUnitarioItem = valorUnitarioItem;
        this.valorTotalItemVenda = valorTotalItemVenda;
        this.valorTotalVenda = valorTotalVenda;
        this.valorTotalVendasPeriodo = valorTotalVendasPeriodo;
        this.qtdItemProduto = qtdItemProduto;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdItemVenda() {
        return idItemVenda;
    }

    public void setIdItemVenda(int idItemVenda) {
        this.idItemVenda = idItemVenda;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorUnitarioItem() {
        return valorUnitarioItem;
    }

    public void setValorUnitarioItem(double valorUnitarioItem) {
        this.valorUnitarioItem = valorUnitarioItem;
    }

    public double getValorTotalItemVenda() {
        return valorTotalItemVenda;
    }

    public void setValorTotalItemVenda(double valorTotalItemVenda) {
        this.valorTotalItemVenda = valorTotalItemVenda;
    }

    public double getValorTotalVenda() {
        return valorTotalVenda;
    }

    public void setValorTotalVenda(double valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }

    public double getValorTotalVendasPeriodo() {
        return valorTotalVendasPeriodo;
    }

    public void setValorTotalVendasPeriodo(double valorTotalVendasPeriodo) {
        this.valorTotalVendasPeriodo = valorTotalVendasPeriodo;
    }

    public int getQtdItemProduto() {
        return qtdItemProduto;
    }

    public void setQtdItemProduto(int qtdItemProduto) {
        this.qtdItemProduto = qtdItemProduto;
    }
    
}
