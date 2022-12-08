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
    
    public Cadastro buscar(String login, String senha) throws Exception{
       
        FileReader fr = new FileReader(nomeArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
           // ArrayList<Marca> lista = listagem();
            String linha = "";
            while((linha = br.readLine()) !=null ){
                Cadastro objetoCadastro = new Cadastro();
                String vetorString[] = linha.split(";");
                objetoCadastro.setLogin(vetorString[0]);
                objetoCadastro.setSenha(vetorString[1]);
                if(objetoCadastro.getSenha() == login){
                br.close();
                return new Cadastro( vetorString[0],vetorString[1]);
                }               
            }
            return null;           
    }
    
    public void verificarLogin(Cadastro objeto) throws Exception {
        try {
            ArrayList<Cadastro> lista = listagemDeCadastro();
            FileWriter fw =new FileWriter(nomeArquivoNoDisco);
            BufferedWriter bw =new BufferedWriter(fw);
            for(int i = 0; i < lista.size();i++){
                if(objeto.getLogin()== lista.get(i).getSenha()){
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
                Cadastro objetoCadastro = new Cadastro();
                String vetorString[] = linha.split(";");
                objetoCadastro.setLogin(vetorString[0]);
                objetoCadastro.setSenha(vetorString[1]);
                listaDeCadastro.add(objetoCadastro);
            }
            br.close();
            return listaDeCadastro;
        } catch (Exception erro) {
            throw erro;
        }
    }
    
    public boolean autenticarUsuario(Cadastro cad) throws Exception {
            ArrayList<Cadastro> lista = listagemDeCadastro();
            FileReader fr =new FileReader(nomeArquivoNoDisco);
            BufferedReader br =new BufferedReader(fr);
            for(int i = 0; i < lista.size();i++){
                return true;
        }
       return false;
    }
}    
