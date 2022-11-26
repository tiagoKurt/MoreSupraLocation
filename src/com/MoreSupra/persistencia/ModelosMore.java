package com.MoreSupra.persistencia;

import com.MoreSupra.modelos.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModelosMore implements IModelosMore {
    
    private String nomeArquivoNoDisco;

    public ModelosMore() {
        nomeArquivoNoDisco = "./src/com/MoreSupra/arquivoDisco/Modelos.txt";
    }

    @Override
    public void incluir(Modelos objeto) throws Exception {
        try {
            FileWriter fw = new FileWriter(nomeArquivoNoDisco, true);
            BufferedWriter bw  = new BufferedWriter(fw);
            bw.write(objeto.toString() + "\n");
            bw.close();
        } catch (Exception erro) {
            throw erro;
        }
    }

    
    @Override
    public void alterar(Modelos objeto) throws Exception {
        try {
            ArrayList<Modelos> lista = listagemModelos();
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
    public ArrayList<Modelos> listagemModelos() throws Exception {
        try {
            ArrayList<Modelos> listaDeModelos = new ArrayList<Modelos>();
            FileReader fr = new FileReader(nomeArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);

            String linha = "";

            while((linha = br.readLine()) != null){
                Modelos objetoModelo = new Modelos();
                MarcaMore objetoMarca = new MarcaMore();
                String vetorString[] = linha.split(";");
                objetoModelo.setId(Integer.parseInt(vetorString[0]));
                objetoModelo.setDescricao(vetorString[1]);
                objetoModelo.setUrl(vetorString[2]);
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