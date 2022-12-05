package com.MoreSupra.Controle;

import com.MoreSupra.GeradorID.GeradorIdentificador;
import com.MoreSupra.modelos.Veiculos;
import com .MoreSupra.persistencia.IVeiculosMore;
import com.MoreSupra.persistencia.VeiculosMore;
import java.util.ArrayList;
import java.util.Iterator;

public class VeiculosControle implements IVeiculosControle{
    
    IVeiculosMore veiculosPersistencia = null;
    
    public VeiculosControle(){
        this.veiculosPersistencia = new VeiculosMore();
    }
    
    private boolean buscarVeiculo(String placa, long renavam) throws Exception {
        try {
            ArrayList<Veiculos> listagem = veiculosPersistencia.listagemVeiculos();
            Iterator<Veiculos> lista = listagem.iterator();
            while (lista.hasNext()) {
                Veiculos aux = lista.next();
                if (aux.getPlaca().equalsIgnoreCase(placa) || aux.getRenavem() == 0) {
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }
    
     private boolean alterarVeiculo (String placa, long renavam) throws Exception{
        try {
            ArrayList<Veiculos> listagem = veiculosPersistencia.listagemVeiculos();
            Iterator<Veiculos> lista = listagem.iterator();
            while (lista.hasNext()){
                Veiculos  aux = lista.next();
                if(aux.getPlaca().equalsIgnoreCase(placa)){
                    return true;
            }
        }return false;
        } catch (Exception erro) {
            throw erro;
        }
    }
     private String verificarPlaca(String placa){
        String str;
        while(placa.endsWith(" ")){
            placa = placa.replaceFirst(".$", "");
        }
        while(placa.startsWith(" ")){
            placa = placa.substring(1);
        }
        return placa;
    }
     
     private boolean verificarVazio(Veiculos objeto){
        if(objeto.getPlaca().equalsIgnoreCase("") || objeto.getRenavem() == 0 || objeto.getPrecoDeCompra() == 0 || objeto.getPrecoDeVenda() ==0
                || objeto.getQuilometragem() == 0) return true;
        return false;
    }

    @Override
    public void incluir(Veiculos objeto) throws Exception {  
        if(verificarVazio(objeto)) throw new Exception("Alguns campos não foram preenchidos!");
        if(buscarVeiculo(objeto.getPlaca(), objeto.getRenavem())){
            throw new Exception("Veiculo já cadastrado");
        }
        objeto.setId(GeradorIdentificador.getID());
        veiculosPersistencia.incluir(objeto);
    }

    @Override
    public void alterar(Veiculos objeto) throws Exception {
        if (alterarVeiculo(objeto.getPlaca(), objeto.getRenavem())) {
            throw new Exception("Veículo já foi cadastrada");
        }
        veiculosPersistencia.alterar(objeto);
    }

    @Override
    public ArrayList<Veiculos> listagemVeiculos() throws Exception {
        return veiculosPersistencia.listagemVeiculos();
    }

    @Override
    public Veiculos buscarVeiculo(int id) throws Exception {
        return veiculosPersistencia.buscarVeiculo(id);
    }
}