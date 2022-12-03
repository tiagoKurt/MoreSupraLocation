package com.MoreSupra.persistencia;

import com.MoreSupra.GeradorID.GeradorIdentificador;
import com.MoreSupra.modelos.Motorista;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;


public class MotoristaMore implements IMotoristaMore{
    
    
    private String nomeArquivoNoDisco;

    public MotoristaMore() {
        nomeArquivoNoDisco = "./src/com/MoreSupra/arquivoDisco/Motorista.txt";
    }

    public Motorista buscar(int id) throws Exception{
       
        FileReader fr = new FileReader(nomeArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while((linha = br.readLine()) !=null ){
                Motorista objetoMotorista = new Motorista();
                String vetorString[] = linha.split(";");
                objetoMotorista.setId(Integer.parseInt(vetorString[0]));
                objetoMotorista.setNome(vetorString[1]);
                objetoMotorista.setNumeroCNH(Integer.parseInt(vetorString[2]));
                objetoMotorista.setDataValidade(vetorString[3]);
                objetoMotorista.setEndereco(vetorString[4]);
                objetoMotorista.setTelefone(vetorString[5]);
                if(objetoMotorista.getId() == id){
                br.close();
                return new Motorista(Integer.parseInt(vetorString[0]), vetorString[1], Integer.parseInt(vetorString[2]), vetorString[3]
                , vetorString[4], vetorString[5]);
                }               
            }
            return null;           
    }
    @Override
    public void incluir(Motorista objeto) throws Exception {
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
    public void alterar(Motorista objeto) throws Exception {
        try {
            ArrayList<Motorista> listaString = listagemDeMotorista();
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

    public ArrayList<Motorista> listagemDeMotorista() throws Exception {
        try {
            ArrayList<Motorista> listaMotoristas = new ArrayList<Motorista>();
            FileReader fr = new FileReader(nomeArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Motorista objetoMotorista = new Motorista();
                String vetorString[] = linha.split(";");
                objetoMotorista.setId(Integer.parseInt(vetorString[0]));
                objetoMotorista.setNome(vetorString[1]);
                objetoMotorista.setNumeroCNH(Integer.parseInt(vetorString[2]));
                objetoMotorista.setDataValidade(vetorString[3]);
                objetoMotorista.setEndereco(vetorString[4]);
                objetoMotorista.setTelefone(vetorString[5]);
                listaMotoristas.add(objetoMotorista);
            }
            br.close();
            return listaMotoristas;
        } catch (Exception erro) {
            throw erro;
        }
    } 
}
