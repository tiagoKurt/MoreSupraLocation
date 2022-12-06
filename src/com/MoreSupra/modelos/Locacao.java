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
    private String dataLocacao;
    private String dataDevolucao;
    private float valorCalcao;
    private SituacaoLocacao situacaoLocacao;
    
    public Locacao(){}
    
    public Locacao(int id, String dataLocacao, String dataDevolucao, float valorCalcao, SituacaoLocacao situacaoLocacao){
        
        this.id = id;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.valorCalcao = valorCalcao;
        this.situacaoLocacao = situacaoLocacao;    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public float getValorCalcao() {
        return valorCalcao;
    }

    public void setValorCalcao(float valorCalcao) {
        this.valorCalcao = valorCalcao;
    }

    public SituacaoLocacao getSituacaoLocacao() {
        return situacaoLocacao;
    }

    public void setSituacaoLocacao(SituacaoLocacao situacaoLocacao) {
        this.situacaoLocacao = situacaoLocacao;
    }

    @Override
    public String toString() {
        return id + ";" + dataLocacao + ";" + dataDevolucao + ";" + valorCalcao + ";" + situacaoLocacao + ";";
    } 
}
