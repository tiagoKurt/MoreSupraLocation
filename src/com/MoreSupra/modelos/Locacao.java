/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MoreSupra.modelos;
import com.MoreSupra.enumeration.SituacaoLocacao;
/**
 *
 * @author Aluno
 */
public class Locacao {
    private int id;
    private String nomeMot;
    private String cnh;
    private String nomeVei;
    private String categoria;
    private String acessorio;
    private String dataLocacao;
    private String dataDevolucao;
    private float ValorDiaria;
    private float valorCalcao;
    private float total;
    private String situacaoLocacao;
    private Modelos modelos;
    
    public Locacao(){}
    
    public Locacao(int id, String nomeMot, String cnh, String nomeVei, String categoria, String acessorio, String dataLocacao,
            String dataDevolucao, float ValorDiaria, float valorCalcao, float total, String situacaoLocacao){
        
        this.id = id;
        this.nomeMot = nomeMot;
        this.cnh = cnh;
        this.nomeVei = nomeVei;
        this.categoria = categoria;
        this.acessorio = acessorio;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.ValorDiaria = ValorDiaria;
        this.valorCalcao = valorCalcao;
        this.total = total;
        this.situacaoLocacao = situacaoLocacao;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeMot() {
        return nomeMot;
    }

    public void setNomeMot(String nomeMot) {
        this.nomeMot = nomeMot;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getNomeVei() {
        return nomeVei;
    }

    public void setNomeVei(String nomeVei) {
        this.nomeVei = nomeVei;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(String acessorio) {
        this.acessorio = acessorio;
    }

    public String getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(String dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public double getValorDiaria() {
        return ValorDiaria;
    }

    public void setValorDiaria(float valorDiaria) {
        this.ValorDiaria = valorDiaria;
    }

    public float getValorCalcao() {
        return valorCalcao;
    }

    public void setValorCalcao(float valorCalcao) {
        this.valorCalcao = valorCalcao;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getSituacaoLocacao() {
        return situacaoLocacao;
    }

    public void setSituacaoLocacao(String situacaoLocacao) {
        this.situacaoLocacao = situacaoLocacao;
    }

    public Modelos getModelos() {
        return modelos;
    }

    public void setModelos(Modelos modelos) {
        this.modelos = modelos;
    }

    @Override
    public String toString() {
        return id + ";" + nomeMot + ";" + cnh + ";" + nomeVei + ";" + categoria + ";" + acessorio + ";" + dataLocacao + ";" + dataDevolucao + ";" 
                + ValorDiaria + ";" + valorCalcao + ";" + total + ";" + situacaoLocacao + ";";
    }

    
}
