package com.MoreSupra.persistencia;

import com.MoreSupra.GeradorID.GeradorIdentificador;
import com.MoreSupra.modelos.Acessorios;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class AcessoriosMore implements IAcessoriosMore{
    
    private String nomeArquivoNoDisco;
    
    public AcessoriosMore(){
        nomeArquivoNoDisco = "./src/com/MoreSupra/arquivoDisco/Acessorios.txt";
    }
    
    public Acessorios buscar(int id) throws Exception{
       
        FileReader fr = new FileReader(nomeArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while((linha = br.readLine()) !=null ){
                Acessorios objetoAcessorios = new Acessorios();
                String vetorString[] = linha.split(";");
                objetoAcessorios.setId(Integer.parseInt(vetorString[0]));
                objetoAcessorios.setDescricao(vetorString[1]);
                objetoAcessorios.setValorDaLocacao(Float.parseFloat(vetorString[2]));
                objetoAcessorios.setUrl(vetorString[3]);
                if(objetoAcessorios.getId() == id){
                br.close();
                return new Acessorios(Integer.parseInt(vetorString[0]),vetorString[1], Float.parseFloat(vetorString[2]), vetorString[3]);
                }
               
            }
            return null;
           
    }
    @Override
    public void incluir(Acessorios objeto) throws Exception {
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
    public void alterar(Acessorios objeto) throws Exception {
        try {
            ArrayList<Acessorios> listaString = listagemDeAcessorios();
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

    @Override
    public ArrayList<Acessorios> listagemDeAcessorios() throws Exception {
        try {
            ArrayList<Acessorios> listaAcessorios = new ArrayList<Acessorios>();
            FileReader fr = new FileReader(nomeArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Acessorios objetoAcessorios = new Acessorios();
                String vetorString[] = linha.split(";");
                objetoAcessorios.setId(Integer.parseInt(vetorString[0]));
                objetoAcessorios.setDescricao(vetorString[1]);
                objetoAcessorios.setValorDaLocacao(Float.parseFloat(vetorString[2]));
                listaAcessorios.add(objetoAcessorios);
            }
            br.close();
            return listaAcessorios;
        } catch (Exception erro) {
            throw erro;
        }
    }
}