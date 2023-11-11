package br.sp.eml.projects.padariabythecode.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Venda {

    private int idVenda;
    private LocalDate dataVenda;
    private double valorTotalVenda;
    private int idClienteVenda;
    private ArrayList<Produto> listaProdutos;

    //Construtor vazio
    public Venda() {
    }

    public Venda(LocalDate dataVenda, double valorTotalVenda, int idClienteVenda) {
        this.dataVenda = dataVenda;
        this.valorTotalVenda = valorTotalVenda;
        this.idClienteVenda = idClienteVenda;
    }

    public Venda(int idVenda, LocalDate dataVenda, double valorTotalVenda, int idClienteVenda) {
        this.idVenda = idVenda;
        this.dataVenda = dataVenda;
        this.valorTotalVenda = valorTotalVenda;
        this.idClienteVenda = idClienteVenda;
    }

    //Construtores com parâmetros + ArrayLista listaProdutos
    /*public Venda(LocalDate dataVenda, double valorTotalVenda, int idClienteVenda, ArrayList<Produto> listaProdutos) {
        this.dataVenda = dataVenda;
        this.valorTotalVenda = valorTotalVenda;
        this.idClienteVenda = idClienteVenda;
        this.listaProdutos = listaProdutos;
    }
    
    public Venda(int idVenda, LocalDate dataVenda, double valorTotalVenda, int idClienteVenda, ArrayList<Produto> listaProdutos) {
        this.idVenda = idVenda;
        this.dataVenda = dataVenda;
        this.valorTotalVenda = valorTotalVenda;
        this.idClienteVenda = idClienteVenda;
        this.listaProdutos = listaProdutos;
    }*/
    //Getters e Setters
    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
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

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

}
