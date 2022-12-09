package com.MoreSupra.persistencia;

import com.MoreSupra.GeradorID.GeradorIdentificador;
import com.MoreSupra.modelos.Marca;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class MarcaMore implements IMarcaMore {

    private String nomeArquivoNoDisco;

    public MarcaMore() {
        nomeArquivoNoDisco = "./src/com/MoreSupra/arquivoDisco/Marca.txt";
    }

    public Marca buscar(int id) throws Exception{
       
        FileReader fr = new FileReader(nomeArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
           // ArrayList<Marca> lista = listagem();
            String linha = "";
            while((linha = br.readLine()) !=null ){
                Marca objetoMarca = new Marca();
                String vetorString[] = linha.split(";");
                objetoMarca.setId(Integer.parseInt(vetorString[0]));
                objetoMarca.setDescricao(vetorString[1]);
                objetoMarca.setUrl(vetorString[2]);
                if(objetoMarca.getId() == id){
                br.close();
                return new Marca(Integer.parseInt(vetorString[0]),vetorString[1], vetorString[2]);
                }               
            }
            return null;           
    }
    @Override
    public void incluir(Marca objeto) throws Exception {
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
    public void alterar(Marca objeto) throws Exception {
        try {
            ArrayList<Marca> listaString = listagemDeMarcas();
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
    public ArrayList<Marca> listagemDeMarcas() throws Exception {
        try {
            ArrayList<Marca> listaDeMarcas = new ArrayList<Marca>();
            FileReader fr = new FileReader(nomeArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Marca objetoMarca = new Marca();
                String vetorString[] = linha.split(";");
                objetoMarca.setId(Integer.parseInt(vetorString[0]));
                objetoMarca.setDescricao(vetorString[1]);
                objetoMarca.setUrl(vetorString[2]);
                listaDeMarcas.add(objetoMarca);
            }
            br.close();
            return listaDeMarcas;
        } catch (Exception erro) {
            throw erro;
        }
    }    
}