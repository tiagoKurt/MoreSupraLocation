package com.MoreSupra.modelos;

public class Categoria {
    private int id = 0;
    private String descricao = "";
    private float valorLocacao = 0;
    private String url = "";
    
    public Categoria(){}
    public Categoria(int id, String descricao, float valorLocacao, String url){
        this.id = id;
        this.descricao = descricao;
        this.valorLocacao = valorLocacao;
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

    public float getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    @Override
    public String toString() {
        return id + ";" + descricao + ";" + valorLocacao + ";" + url + ";";
    }    
}