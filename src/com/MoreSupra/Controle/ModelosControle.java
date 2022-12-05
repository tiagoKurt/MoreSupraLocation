package com.MoreSupra.Controle;

import com.MoreSupra.GeradorID.GeradorIdentificador;
import com.MoreSupra.modelos.Modelos;
import com.MoreSupra.persistencia.IModelosMore;
import com.MoreSupra.persistencia.ModelosMore;
import java.util.ArrayList;
import java.util.Iterator;


public class ModelosControle implements IModelosControle{
    
    IModelosMore modelosPersistencia = null;

    public ModelosControle() {
        this.modelosPersistencia = new ModelosMore();
    }

    private boolean buscarMarca(String descricao) throws Exception {
        try {
            ArrayList<Modelos> listagem = modelosPersistencia.listagemModelos();
            Iterator<Modelos> lista = listagem.iterator();
            while (lista.hasNext()) {
                Modelos aux = lista.next();
                if (aux.getDescricao().equalsIgnoreCase(descricao)) {
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }
    
    
    private boolean buscarModelo(String descricao) throws Exception {
        try {
            ArrayList<Modelos> listagem = modelosPersistencia.listagemModelos();
            Iterator<Modelos> lista = listagem.iterator();
            while (lista.hasNext()) {
                Modelos aux = lista.next();
                if (aux.getDescricao().equalsIgnoreCase(descricao)) {
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }
    
    private boolean alterarModelo (String descricao) throws Exception{
        try {
            ArrayList<Modelos> listagem = modelosPersistencia.listagemModelos();
            Iterator<Modelos> lista = listagem.iterator();
            while (lista.hasNext()){
                Modelos aux = lista.next();
                if(aux.getDescricao().equalsIgnoreCase(descricao) && aux.getMarca().equals(aux)){
                    return true;
            }
        }return false;
        } catch (Exception erro) {
            throw erro;
        }
    }
    
    private String verificarDescricao(String descricao){
        String str;
        while(descricao.endsWith(" ")){
            descricao = descricao.replaceFirst(".$", "");
        }
        while(descricao.startsWith(" ")){
            descricao = descricao.substring(1);
        }
        return descricao;
    }
    
    private boolean verificarVazio(Modelos objeto){
        if(objeto.getDescricao().equals("") || objeto.getUrl().equals("")) return true;
        return false;
    }

    @Override
    public void incluir(Modelos objeto) throws Exception {
        objeto.setDescricao(verificarDescricao(objeto.getDescricao()));
        if(verificarVazio(objeto)) throw new Exception("Alguns campos não foram preenchidos!");
        if(buscarModelo(objeto.getDescricao())){
            throw new Exception("Modelo já cadastrado");
        }
        objeto.setId(GeradorIdentificador.getID());
        modelosPersistencia.incluir(objeto);
    }

    @Override
    public void alterar(Modelos objeto) throws Exception {
        if (alterarModelo(objeto.getDescricao())) {
            throw new Exception("Modelo já foi cadastrada");
        }
        modelosPersistencia.alterar(objeto);
    }

    @Override
    public ArrayList<Modelos> listagemModelos() throws Exception {
        return modelosPersistencia.listagemModelos();
    }    

    @Override
    public Modelos buscar(int id) throws Exception {
        return modelosPersistencia.buscar(id);
    }
}