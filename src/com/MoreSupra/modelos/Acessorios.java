package com.MoreSupra.modelos;

public class Acessorios {
    private int id = 0;
    private String descricao = "";
    private String url = "";
    private float valorDaLocacao;
        
    public Acessorios(){}
    public Acessorios(int id, String descricao, float valorDaLocacao, String url){
        this.id = id;
        this.descricao = descricao;
        this.valorDaLocacao = valorDaLocacao;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorDaLocacao() {
        return valorDaLocacao;
    }

    public void setValorDaLocacao(float valorDaLocacao) {
        this.valorDaLocacao = valorDaLocacao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return id + ";" + descricao + ";" + valorDaLocacao + ";" + url + ";";
    }
         
}