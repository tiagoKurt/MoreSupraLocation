
package com.MoreSupra.modelos;
import com.MoreSupra.enumeration.situacao;
import com.MoreSupra.enumeration.tipoDeCombustivel;
import com.MoreSupra.enumeration.tipoDoVeiculo;

public class suportVeiculos {
    private tipoDeCombustivel tipoDeCombustivel;
    private tipoDoVeiculo tipoDoVeiculo;
    private situacao situacao;
    
    public suportVeiculos(){}

    public suportVeiculos(tipoDeCombustivel tipoCombustivel, tipoDoVeiculo tipDoVeiculo, situacao situacao){
        this.situacao = situacao;
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.tipoDoVeiculo = tipoDoVeiculo;
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
    

}
