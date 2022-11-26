package com.MoreSupra.persistencia;

import com.MoreSupra.modelos.Veiculos;
import com.MoreSupra.modelos.suportVeiculos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            ArrayList<Veiculos> listaDeVeiculos = new ArrayList<Veiculos>();
            FileReader fr = new FileReader(nomeArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);

            String linha = "";

            while((linha = br.readLine()) != null){
                Veiculos objetoVeiculo = new Veiculos();
                suportVeiculos objetoVei = new suportVeiculos();
                String vetorString[] = linha.split(";");
                objetoVeiculo.setId(Integer.parseInt(vetorString[0]));
                objetoVeiculo.setPlaca(vetorString[1]);
                objetoVeiculo.setRenavem(Integer.parseInt(vetorString[2]));
                objetoVeiculo.setPrecoDeCompra(Integer.parseInt(vetorString[3]));
                objetoVeiculo.setPrecoDeVenda(Integer.parseInt(vetorString[4]));
                objetoVeiculo.setAnoFabricacao(objetoVeiculo.getAnoFabricacao());
                objetoVeiculo.setAnoModelo(objetoVeiculo.getAnoModelo());                                
                objetoVeiculo.setCombustivel(objetoVei.getTipoDeCombustivel());
                objetoVeiculo.setTipoVeiculo(objetoVei.getTipoDoVeiculo());
                objetoVeiculo.setQuilometragem(Integer.parseInt(vetorString[5]));
                objetoVeiculo.setSituacaoVeiculo(objetoVei.getSituacao());
                
                
                
                listaDeVeiculos.add(objetoVeiculo);
            }
            br.close();
            return listaDeVeiculos;     
        } catch (Exception erro) {
            throw erro;
        }
    }    
}