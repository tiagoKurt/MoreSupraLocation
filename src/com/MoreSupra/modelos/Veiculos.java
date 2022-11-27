package com.MoreSupra.modelos;

import java.util.Date;
import com.MoreSupra.enumeration.*;
import java.text.SimpleDateFormat;

public class Veiculos {
    private int id = 0;
    private String placa = "";
    private int renavem = 0;
    private float precoDeVenda = 0;
    private float precoDeCompra = 0;
    private Date anoFabricacao;
    private Date anoModelo;
    private tipoDeCombustivel tipoDeCombustivel;
    private int quilometragem = 0;
    private tipoDoVeiculo tipoDoVeiculo;
    private situacao situacao;
    SimpleDateFormat formato = new SimpleDateFormat("y");
    
    public Veiculos(){}
    
    public Veiculos(int id, String placa, int renavem, float precoDeVenda, float precoDeCompra, Date anoFabricacao,
            Date anoModelo, tipoDeCombustivel tipoDeCombustivel, int quilometragem, tipoDoVeiculo tipoDoVeiculo, situacao 
                    situacao){
        this.id = id;
        this.renavem = renavem;
        this.placa = placa;
        this.precoDeCompra = precoDeCompra;
        this.precoDeVenda = precoDeVenda;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.quilometragem = quilometragem;
        this.tipoDoVeiculo = tipoDoVeiculo;
        this.situacao = situacao;
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
        return tipoDeCombustivel;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public tipoDeCombustivel getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(tipoDeCombustivel tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public tipoDoVeiculo getTipoDoVeiculo() {
        return tipoDoVeiculo;
    }

    public void setTipoDoVeiculo(tipoDoVeiculo tipoDoVeiculo) {
        this.tipoDoVeiculo = tipoDoVeiculo;
    }

    public situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(situacao situacao) {
        this.situacao = situacao;
    }
    


    @Override
    public String toString() {
        return id + ";" + placa + ";" + renavem + ";" + precoDeVenda + ";" + precoDeCompra + ";" + anoFabricacao + 
                ";" + anoModelo + ";" + tipoDeCombustivel + ";" + quilometragem + ";" + tipoDoVeiculo + ";" + 
                situacao + ";";
    }    
}