/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MoreSupra.persistencia;

import com.MoreSupra.modelos.Veiculos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pichau
 */
public class VeiculosMore implements IVeiculosMore{
    
    private String nomeArquivoNoDisco = "";
    
    public VeiculosMore(){
        nomeArquivoNoDisco = "./src/com/MoreSupra/arquivoDisco/Veiculos.txt";
    }

    public void incluir(Veiculos objeto) throws Exception {
        try {
            FileWriter fw = new FileWriter(nomeArquivoNoDisco, true);
            BufferedWriter bw  = new BufferedWriter(fw);
            bw.write(objeto.toString() + "\n");
            bw.close();
        } catch (Exception erro) {
            throw erro;
        }
    }

    public void alterar(Veiculos objeto) throws Exception {
        try {
            ArrayList<Veiculos> lista = listagemVeiculos();
            FileWriter fw =new FileWriter(nomeArquivoNoDisco);
            BufferedWriter bw =new BufferedWriter(fw);
            for(int i = 0; i < lista.size();i++){
                if(objeto.getId()== lista.get(i).getId()){
                    bw.write(objeto.toString() + "\n");
                }
                else{
                    bw.write(lista.get(i).toString() + "\n");
                }
                
            }
            bw.close();
        } catch (Exception ex) {
            Logger.getLogger(ModelosMore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Veiculos> listagemVeiculos() throws Exception {
        try {
            ArrayList<Veiculos> listaDeModelos = new ArrayList<Veiculos>();
            FileReader fr = new FileReader(nomeArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);

            String linha = "";

            while((linha = br.readLine()) != null){
                Veiculos objetoVeiculo = new Veiculos();
                MarcaMore objetoMarca = new MarcaMore();
                String vetorString[] = linha.split(";");
                objetoVeiculo.setId(Integer.parseInt(vetorString[0]));
                objetoVeiculo.setPlaca(vetorString[1]);
                objetoVeiculo.setRenavem(Integer.parseInt(vetorString[2]));
                objetoVeiculo.setPrecoDeCompra(Integer.parseInt(vetorString[3]));
                int id = Integer.parseInt(vetorString[3]);
                objetoModelo.setMarca(objetoMarca.buscar(id));
                listaDeModelos.add(objetoModelo);
            }
            br.close();
            return listaDeModelos;     
        } catch (Exception erro) {
            throw erro;
        }
    }
    
    
}
