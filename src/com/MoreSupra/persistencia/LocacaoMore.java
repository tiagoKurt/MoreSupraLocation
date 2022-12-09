/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MoreSupra.persistencia;

import com.MoreSupra.GeradorID.GeradorIdentificador;
import com.MoreSupra.modelos.Locacao;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;

/**
 *
 * @author Pichau
 */
public class LocacaoMore implements ILocacaoMore{
    
    private String nomeArquivoNoDisco;

    public LocacaoMore() {
        
        nomeArquivoNoDisco = "./src/com/MoreSupra/arquivoDisco/Locacao.txt";
    }
    
    @Override
    public void locar(Locacao objeto) throws Exception {
        try {
            FileWriter fw = new FileWriter(nomeArquivoNoDisco, true);
            BufferedWriter bw  = new BufferedWriter(fw);
            objeto.setId(GeradorIdentificador.getID());
            bw.write(objeto.toString() + "\n");
            bw.close();
        } catch (Exception erro) {
            throw erro;
        }
    }

    
    @Override
    public void devolver(Locacao objeto) throws Exception {
        try {
            ArrayList<Locacao> lista = listagemDeLocacao();
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
            
        }
    }

    @Override
    public ArrayList<Locacao> listagemDeLocacao() throws Exception {
        try {
            ArrayList<Locacao> listaDeLocacao = new ArrayList<Locacao>();
            FileReader fr = new FileReader(nomeArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);

            String linha = "";
            while((linha = br.readLine()) != null){
                Locacao objetoLocation = new Locacao();
                String vetorString[] = linha.split(";");
                objetoLocation.setId(Integer.parseInt(vetorString[0]));
                objetoLocation.setNomeMot(vetorString[1]);
                objetoLocation.setCnh(vetorString[2]);
                objetoLocation.setNomeVei(vetorString[3]);
                objetoLocation.setCategoria(vetorString[4]);
                objetoLocation.setAcessorio(vetorString[5]);
                objetoLocation.setDataLocacao(vetorString[6]);
                objetoLocation.setDataDevolucao(vetorString[7]);
                objetoLocation.setValorDiaria(Float.parseFloat(vetorString[8]));
                objetoLocation.setValorCalcao(Float.parseFloat(vetorString[9]));
                objetoLocation.setTotal(Float.parseFloat(vetorString[10]));
                objetoLocation.setSituacaoLocacao(vetorString[11]);
                listaDeLocacao.add(objetoLocation);
            }
            br.close();
            return listaDeLocacao;     
        } catch (Exception erro) {
            throw erro;
        }
    }
    
}
