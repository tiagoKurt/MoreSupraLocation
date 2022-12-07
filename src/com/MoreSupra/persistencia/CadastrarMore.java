/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MoreSupra.persistencia;

import com.MoreSupra.modelos.Cadastro;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Pichau
 */
public class CadastrarMore implements ICadastroMore{
    
    private String nomeArquivoNoDisco;
    
    public CadastrarMore(){
        nomeArquivoNoDisco = "./src/com/MoreSupra/arquivoDisco/Cadastro.txt";
    }
    
    
    
    public void Cadastrar(Cadastro objeto) throws Exception {
        try {
            FileWriter fw = new FileWriter(nomeArquivoNoDisco, true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(objeto.toString() + "\n");
            bw.close();

        } catch (Exception erro) {
            throw erro;
        }
    }
    
    
    public ArrayList<Cadastro> listagemDeCadastro() throws Exception {
        try {
            ArrayList<Cadastro> listaDeCadastro = new ArrayList<Cadastro>();
            FileReader fr = new FileReader(nomeArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Cadastro objetoMarca = new Cadastro();
                String vetorString[] = linha.split(";");
                objetoMarca.setLogin(vetorString[0]);
                objetoMarca.setSenha(vetorString[1]);
                listaDeCadastro.add(objetoMarca);
            }
            br.close();
            return listaDeCadastro;
        } catch (Exception erro) {
            throw erro;
        }
    }
}
