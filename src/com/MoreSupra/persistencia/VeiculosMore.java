package com.MoreSupra.persistencia;

import com.MoreSupra.enumeration.situacao;
import com.MoreSupra.enumeration.tipoDeCombustivel;
import com.MoreSupra.enumeration.tipoDoVeiculo;
import com.MoreSupra.modelos.Modelos;
import com.MoreSupra.modelos.Veiculos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VeiculosMore implements IVeiculosMore{
    
    private String nomeArquivoNoDisco;
    
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
            ArrayList<Veiculos> listaDeVeiculos = new ArrayList<>();
            FileReader fr = new FileReader(nomeArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);

            String linha = "";

            while((linha = br.readLine()) != null){
                Veiculos objetoVeiculo = new Veiculos();
                ModelosMore objetoModelo = new ModelosMore();
                String vetorString[] = linha.split(";");
                objetoVeiculo.setId(Integer.parseInt(vetorString[0]));
                objetoVeiculo.setPlaca(vetorString[1]);
                objetoVeiculo.setRenavem(Long.parseLong(vetorString[2]));
                objetoVeiculo.setPrecoDeCompra(Float.parseFloat(vetorString[3]));
                objetoVeiculo.setPrecoDeVenda(Float.parseFloat(vetorString[4]));
                objetoVeiculo.setAnoFabricacao(vetorString[5]);
                objetoVeiculo.setAnoModelo(vetorString[6]);
                objetoVeiculo.setQuilometragem(Long.parseLong(vetorString[7]));
                String tipoComb = vetorString[8];
                objetoVeiculo.setTipoDeCombustivel(tipoDeCombustivel.valueOf(tipoComb));
                String tipoVeicu = vetorString[9];
                objetoVeiculo.setTipoDoVeiculo(tipoDoVeiculo.valueOf(tipoVeicu));    
                String situ = vetorString[10];
                objetoVeiculo.setSituacao(situacao.valueOf(situ));
                int id = Integer.parseInt(vetorString[11]);
                objetoVeiculo.setModelo(objetoModelo.buscar(id));
                listaDeVeiculos.add(objetoVeiculo);
            }
            br.close();
            return listaDeVeiculos;     
        } catch (Exception erro) {
            throw erro;
        }
    }    

    @Override
    public Veiculos buscarVeiculo(int id) throws Exception {
        FileReader fr = new FileReader(nomeArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
           // ArrayList<Marca> lista = listagem();
            String linha = "";
            while((linha = br.readLine()) !=null ){
                Veiculos objetoVeiculo = new Veiculos();
                ModelosMore objetoModelo = new ModelosMore();
                String vetorString[] = linha.split(";");
                objetoVeiculo.setId(Integer.parseInt(vetorString[0]));
                objetoVeiculo.setPlaca(vetorString[1]);
                objetoVeiculo.setRenavem(Long.parseLong(vetorString[2]));
                objetoVeiculo.setPrecoDeCompra(Float.parseFloat(vetorString[3]));
                objetoVeiculo.setPrecoDeVenda(Float.parseFloat(vetorString[4]));
                objetoVeiculo.setAnoFabricacao(vetorString[5]);
                objetoVeiculo.setAnoModelo(vetorString[6]);
                objetoVeiculo.setQuilometragem(Long.parseLong(vetorString[7]));
                String tipoComb = vetorString[8];
                objetoVeiculo.setTipoDeCombustivel(tipoDeCombustivel.valueOf(tipoComb));
                String tipoVeicu = vetorString[9];
                objetoVeiculo.setTipoDoVeiculo(tipoDoVeiculo.valueOf(tipoVeicu));    
                String situ = vetorString[10];
                objetoVeiculo.setSituacao(situacao.valueOf(situ));
                int idi = Integer.parseInt(vetorString[11]);
                objetoVeiculo.setModelo(objetoModelo.buscar(idi));
                if(objetoVeiculo.getId() == id){
                br.close();
                return new Veiculos(Integer.parseInt(vetorString[0]),vetorString[1], Long.parseLong(vetorString[2]),
                        Float.parseFloat(vetorString[3]), Float.parseFloat(vetorString[4]), 
                        vetorString[5], vetorString[6], Long.parseLong(vetorString[7]),objetoVeiculo.getTipoDeCombustivel(),
                        objetoVeiculo.getTipoDoVeiculo(), objetoVeiculo.getSituacao(), objetoVeiculo.getModelo());
                }               
            }
            return null; 

    }
}