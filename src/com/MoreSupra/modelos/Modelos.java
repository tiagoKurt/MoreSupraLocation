/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MoreSupra.modelos;

/**
 *
 * @author Aluno
 */
public class Modelos {
    
    private int id;
    private String descricao;
    private String url;
    private Marca marca;
    
    // Métodos
    
    public Modelos(){
        
    }
    
    public Modelos(int id, String descricao, String url, Marca marca){
        this.id = id;
        this.descricao = descricao;
        this.url = url;
        this.marca = marca;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    @Override
    public String toString() {
        return id + ";" + descricao + ";" + url + ";" + marca.getId();
    }
}
