package com.MoreSupra.enumeration;

public enum tipoDeCombustivel {
    GASOLINA,
    DIESEL,
    ELETRICO,
    GNV;    

    public static void main(String[] args){
        String teste =  tipoDeCombustivel.GASOLINA.toString();
        System.out.println(teste);
    }
}
