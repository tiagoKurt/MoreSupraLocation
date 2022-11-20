/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MoreSupra.persistencia;

import com.MoreSupra.GeradorID.GeradorIdentificador;
import com.MoreSupra.modelos.Categoria;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Pichau
 */
public class CategoriaMore implements ICategoriaMore{
    
    private String nomeArquivoNoDisco;
    
    public CategoriaMore(){
        nomeArquivoNoDisco = "./src/com/MoreSupra/arquivoDisco/Categoria.txt";
    }
    public Categoria buscar(int id) throws Exception{
       
        FileReader fr = new FileReader(nomeArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while((linha = br.readLine()) !=null ){
                Categoria objetoCategoria = new Categoria();
                String vetorString[] = linha.split(";");
                objetoCategoria.setId(Integer.parseInt(vetorString[0]));
                objetoCategoria.setDescricao(vetorString[1]);
                objetoCategoria.setValorLocacao(Float.parseFloat(vetorString[2]));
                if(objetoCategoria.getId() == id){
                br.close();
                return new Categoria(Integer.parseInt(vetorString[0]),vetorString[1], Float.parseFloat(vetorString[2]));
                }
               
            }
            return null;
           
    }
    @Override
    public void incluir(Categoria objeto) throws Exception {
        try {
            FileWriter fw = new FileWriter(nomeArquivoNoDisco, true);
            BufferedWriter bw = new BufferedWriter(fw);
            objeto.setId(GeradorIdentificador.getID());
            
            bw.write(objeto.toString() + "\n");
            bw.close();

        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void alterar(Categoria objeto) throws Exception {
        try {
            ArrayList<Categoria> listaString = listagemDeCategorias();
            FileWriter fw = new FileWriter(nomeArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.println(listaString.size() + "");
            for(int pos =0; pos<listaString.size(); pos++){
                if(objeto.getId() == listaString.get(pos).getId()){
                    bw.write(objeto.toString()+ "\n");
                }else{
                    bw.write(listaString.get(pos).toString() + "\n");
                    System.out.println(listaString.get(pos).toString() + "\n");
                }
            }
            bw.close();
            

        } catch (Exception erro) {
            throw erro;
        }
    }

    public ArrayList<Categoria> listagemDeCategorias() throws Exception {
        try {
            ArrayList<Categoria> listaDeCategorias = new ArrayList<Categoria>();
            FileReader fr = new FileReader(nomeArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Categoria objetoCategoria = new Categoria();
                String vetorString[] = linha.split(";");
                objetoCategoria.setId(Integer.parseInt(vetorString[0]));
                objetoCategoria.setDescricao(vetorString[1]);
                objetoCategoria.setValorLocacao(Float.parseFloat(vetorString[2]));
                listaDeCategorias.add(objetoCategoria);
            }
            br.close();
            return listaDeCategorias;
        } catch (Exception erro) {
            throw erro;
        }
    }
}
