package br.sp.eml.projects.padariabythecode.model;

import java.util.Date;

public class Cliente {

    private int idCliente;
    private String nomeCliente;
    private String cpfCliente;
    private Date dataNascimentoCliente;
    private String generoCliente;
    private String estadoCivilCliente;
    private String telefoneCliente;
    private String emailCliente;
    private String cepCliente;
    private String logradouroCliente;
    private String numeroCliente;
    private String complementoCliente;
    private String bairroCliente;
    private String cidadeCliente;
    private String ufCliente;

    //Construtor vazio
    public Cliente() {}

    //Construtor com parâmetros
    public Cliente(int idCliente, String nomeCliente, String cpfCliente, Date dataNascimentoCliente, String generoCliente, String estadoCivilCliente, String telefoneCliente, String emailCliente, String cepCliente, String logradouroCliente, String numeroCliente, String complementoCliente, String bairroCliente, String cidadeCliente, String ufCliente) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.dataNascimentoCliente = dataNascimentoCliente;
        this.generoCliente = generoCliente;
        this.estadoCivilCliente = estadoCivilCliente;
        this.telefoneCliente = telefoneCliente;
        this.emailCliente = emailCliente;
        this.cepCliente = cepCliente;
        this.logradouroCliente = logradouroCliente;
        this.numeroCliente = numeroCliente;
        this.complementoCliente = complementoCliente;
        this.bairroCliente = bairroCliente;
        this.cidadeCliente = cidadeCliente;
        this.ufCliente = ufCliente;
    }

    //Getters e Setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public Date getDataNascimentoCliente() {
        return dataNascimentoCliente;
    }

    public void setDataNascimentoCliente(Date dataNascimentoCliente) {
        this.dataNascimentoCliente = dataNascimentoCliente;
    }

    public String getGeneroCliente() {
        return generoCliente;
    }

    public void setGeneroCliente(String generoCliente) {
        this.generoCliente = generoCliente;
    }

    public String getEstadoCivilCliente() {
        return estadoCivilCliente;
    }

    public void setEstadoCivilCliente(String estadoCivilCliente) {
        this.estadoCivilCliente = estadoCivilCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getCepCliente() {
        return cepCliente;
    }

    public void setCepCliente(String cepCliente) {
        this.cepCliente = cepCliente;
    }

    public String getLogradouroCliente() {
        return logradouroCliente;
    }

    public void setLogradouroCliente(String logradouroCliente) {
        this.logradouroCliente = logradouroCliente;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getComplementoCliente() {
        return complementoCliente;
    }

    public void setComplementoCliente(String complementoCliente) {
        this.complementoCliente = complementoCliente;
    }

    public String getBairroCliente() {
        return bairroCliente;
    }

    public void setBairroCliente(String bairroCliente) {
        this.bairroCliente = bairroCliente;
    }

    public String getCidadeCliente() {
        return cidadeCliente;
    }

    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }

    public String getUfCliente() {
        return ufCliente;
    }

    public void setUfCliente(String ufCliente) {
        this.ufCliente = ufCliente;
    }
    
}
