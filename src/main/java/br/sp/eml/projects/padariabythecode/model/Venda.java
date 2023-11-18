package br.sp.eml.projects.padariabythecode.model;

import java.util.ArrayList;
import java.util.Date;

public class Venda {

    private int idVenda;
    private Date dataVenda;
    private double valorTotalVenda;
    private int idClienteVenda;
    private ArrayList<ItemVenda> listaProdutos;

    //Construtor vazio
    public Venda() {
    }

    public Venda(Date dataVenda, double valorTotalVenda, int idClienteVenda, ArrayList<ItemVenda> listaProdutos) {
        this.dataVenda = dataVenda;
        this.valorTotalVenda = valorTotalVenda;
        this.idClienteVenda = idClienteVenda;
        this.listaProdutos = listaProdutos;
    }

    public Venda(int idVenda, Date dataVenda, double valorTotalVenda, int idClienteVenda, ArrayList<ItemVenda> listaProdutos) {
        this.idVenda = idVenda;
        this.dataVenda = dataVenda;
        this.valorTotalVenda = valorTotalVenda;
        this.idClienteVenda = idClienteVenda;
        this.listaProdutos = listaProdutos;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValorTotalVenda() {
        return valorTotalVenda;
    }

    public void setValorTotalVenda(double valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }

    public int getIdClienteVenda() {
        return idClienteVenda;
    }

    public void setIdClienteVenda(int idClienteVenda) {
        this.idClienteVenda = idClienteVenda;
    }

    public ArrayList<ItemVenda> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<ItemVenda> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    
}
