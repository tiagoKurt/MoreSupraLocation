package com.MoreSupra.modelos;

import java.util.Date;
import com.MoreSupra.enumeration.*;

public class Veiculos {
    private int id = 0;
    private String placa = "";
    private int renavem = 0;
    private float precoDeVenda = 0;
    private float precoDeCompra = 0;
    private Date anoFabricacao;
    private Date anoModelo;
    private tipoDeCombustivel combustivel;
    private int quilometragem = 0;
    private tipoDoVeiculo tipoVeiculo;
    private situacao situacaoVeiculo;
    
    public Veiculos(){}
    
    public Veiculos(int id, String placa, int renavem, float precoDeVenda, float precoDeCompra, Date anoFabricacao,
            Date anoModelo, tipoDeCombustivel combustivel, int quilometragem, tipoDoVeiculo tipoVeiculo, situacao 
                    situacaoVeiculo){
        this.id = id;
        this.renavem = renavem;
        this.placa = placa;
        this.precoDeCompra = precoDeCompra;
        this.precoDeVenda = precoDeVenda;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.combustivel = combustivel;
        this.quilometragem = quilometragem;
        this.tipoVeiculo = tipoVeiculo;
        this.situacaoVeiculo = situacaoVeiculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getRenavem() {
        return renavem;
    }

    public void setRenavem(int renavem) {
        this.renavem = renavem;
    }

    public float getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(float precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public float getPrecoDeCompra() {
        return precoDeCompra;
    }

    public void setPrecoDeCompra(float precoDeCompra) {
        this.precoDeCompra = precoDeCompra;
    }

    public Date getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Date anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Date getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Date anoModelo) {
        this.anoModelo = anoModelo;
    }

    public tipoDeCombustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(tipoDeCombustivel combustivel) {
        this.combustivel = combustivel;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public tipoDoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(tipoDoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public situacao getSituacaoVeiculo() {
        return situacaoVeiculo;
    }

    public void setSituacaoVeiculo(situacao situacaoVeiculo) {
        this.situacaoVeiculo = situacaoVeiculo;
    }

    @Override
    public String toString() {
        return id + ";" + placa + ";" + renavem + ";" + precoDeVenda + ";" + precoDeCompra + ";" + anoFabricacao + 
                ";" + anoModelo + ";" + combustivel + ";" + quilometragem + ";" + tipoVeiculo + ";" + 
                situacaoVeiculo + ";";
    }    
}