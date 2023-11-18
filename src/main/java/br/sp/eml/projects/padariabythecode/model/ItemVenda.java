package br.sp.eml.projects.padariabythecode.model;

/**
 *
 * @author emlel
 */
public class ItemVenda {

    private int idItemVenda;
    private int qtdProduto;
    private double valorUnitarioItem;
    private int idVenda;
    private int idProduto;

    public ItemVenda() {
    }

    public ItemVenda(int qtdProduto, double valorUnitarioItem, int idVenda, int idProduto) {
        this.qtdProduto = qtdProduto;
        this.valorUnitarioItem = valorUnitarioItem;
        this.idVenda = idVenda;
        this.idProduto = idProduto;
    }

    public ItemVenda(int idItemVenda, int qtdProduto, double valorUnitarioItem, int idVenda, int idProduto) {
        this.idItemVenda = idItemVenda;
        this.qtdProduto = qtdProduto;
        this.valorUnitarioItem = valorUnitarioItem;
        this.idVenda = idVenda;
        this.idProduto = idProduto;
    }

    public int getIdItemVenda() {
        return idItemVenda;
    }

    public void setIdItemVenda(int idItemVenda) {
        this.idItemVenda = idItemVenda;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public double getValorUnitarioItem() {
        return valorUnitarioItem;
    }

    public void setValorUnitarioItem(double valorUnitarioItem) {
        this.valorUnitarioItem = valorUnitarioItem;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

}
