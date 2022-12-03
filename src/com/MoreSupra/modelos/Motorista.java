/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MoreSupra.modelos;

/**
 *
 * @author Pichau
 */
public class Motorista {
    private int id;
    private String nome;
    private int numeroCNH;
    private String dataValidade;
    private String endereco;
    private String telefone;
    private String tipoMot;
    
    public Motorista(){}
    
    public Motorista(int id, String nome, int numeroCNH, String dataValidade, String endereco, String telefone, String tipoMot){
        this.id = id;
        this.nome = nome;
        this.numeroCNH = numeroCNH;
        this.dataValidade = dataValidade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.tipoMot = tipoMot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(int numeroCNH) {
        this.numeroCNH = numeroCNH;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipoMot() {
        return tipoMot;
    }

    public void setTipoMot(String tipoMot) {
        this.tipoMot = tipoMot;
    }

    @Override
    public String toString() {
        return id + ";" + nome + ";" + numeroCNH + ";"+ dataValidade + ";" + endereco + ";" + telefone + ";" + tipoMot + ";";
    } 
}
