package com.MoreSupra.modelos;

import java.util.Date;
import com.MoreSupra.enumeration.*;
import java.text.SimpleDateFormat;

public class Veiculos {
    private int id = 0;
    private String placa = "";
    private long renavem = 0;
    private float precoDeVenda = 0;
    private float precoDeCompra = 0;
    private String anoFabricacao;
    private String anoModelo;
    private long quilometragem = 0;
    private tipoDeCombustivel tipoCombustivel;
    private tipoDoVeiculo tipoVeiculo;
    private situacao situ;
    private Modelos modelo;
    private String aj = "";
    SimpleDateFormat formato = new SimpleDateFormat("y");
    
    public Veiculos(){}
    
    public Veiculos(int id, String placa, long renavem, float precoDeVenda, float precoDeCompra, String anoFabricacao,
            String anoModelo, long quilometragem, tipoDeCombustivel tipoCombustivel, tipoDoVeiculo tipoVeiculo, situacao 
                    situ, Modelos modelo){
        this.id = id;
        this.renavem = renavem;
        this.placa = placa;
        this.precoDeCompra = precoDeCompra;
        this.precoDeVenda = precoDeVenda;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.quilometragem = quilometragem;
        this.tipoCombustivel = tipoCombustivel;
        this.tipoVeiculo = tipoVeiculo;
        this.modelo = modelo;
        this.situ = situ;
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

    public long getRenavem() {
        return renavem;
    }

    public void setRenavem(long renavem) {
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

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(String anoModelo) {
        this.anoModelo = anoModelo;
    }
    
    public long getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(long quilometragem) {
        this.quilometragem = quilometragem;
    }
    public tipoDeCombustivel getTipoDeCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoDeCombustivel(tipoDeCombustivel tipoDeCombustivel) {
        this.tipoCombustivel = tipoDeCombustivel;
    }

    public tipoDoVeiculo getTipoDoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoDoVeiculo(tipoDoVeiculo tipoDoVeiculo) {
        this.tipoVeiculo = tipoDoVeiculo;
    }

    public situacao getSituacao() {
        return situ;
    }

    public void setSituacao(situacao situacao) {
        this.situ = situacao;
    }

    public Modelos getModelo() {
        return modelo;
    }

    public void setModelo(Modelos modelo) {
        this.modelo = modelo;
    }

    public String getAj() {
        return aj;
    }

    public void setAj(String aj) {
        this.aj = aj;
    }


    @Override
    public String toString() {
        return id + ";" + placa + ";" + renavem + ";" + precoDeVenda + ";" + precoDeCompra + ";" + anoFabricacao + 
                ";" + anoModelo + ";" + quilometragem + ";" + tipoCombustivel + ";" + tipoVeiculo + ";" + 
                situ + ";" +getModelo();
    }    
}