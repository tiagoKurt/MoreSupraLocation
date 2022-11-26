package com.MoreSupra.Controle;

import com.MoreSupra.modelos.Categoria;
import com.MoreSupra.persistencia.CategoriaMore;
import com.MoreSupra.persistencia.ICategoriaMore;
import java.util.ArrayList;
import java.util.Iterator;

public class CategoriasControle implements ICategoriasControle{
    
    ICategoriaMore categoriaPersistencia = null;
    
    public CategoriasControle(){
        this.categoriaPersistencia = new CategoriaMore();
    }
    
    private boolean buscarCategoria(String descricao) throws Exception {
        try {
            ArrayList<Categoria> listagem = categoriaPersistencia.listagemDeCategorias();
            Iterator<Categoria> lista = listagem.iterator();
            while (lista.hasNext()) {
                Categoria aux = lista.next();
                if (aux.getDescricao().equalsIgnoreCase(descricao)) {
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }
    
    private boolean verificarPreco(float valor) throws Exception {
        try {
            ArrayList<Categoria> listagem = categoriaPersistencia.listagemDeCategorias();
            Iterator<Categoria> lista = listagem.iterator();
            while (lista.hasNext()) {
                Categoria aux = lista.next();
                if (aux.getValorLocacao()+"" == aux.getValorLocacao()+"") {
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void incluir(Categoria objeto) throws Exception {
        objeto.setDescricao(verificarDescricao(objeto.getDescricao()));
        if(verificarVazio(objeto)) throw new Exception("Alguns campos não foram preenchidos!");
        if(buscarCategoria(objeto.getDescricao())){
            throw new Exception("Categoria já cadastrada");
        }
        
        categoriaPersistencia.incluir(objeto);
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
    
    private boolean verificarVazio(Categoria objeto){
        if(objeto.getDescricao().equals("")) return true;
        return false;      
    }
    
    private boolean verificarValorNulo(Categoria obj){
        if(obj.getValorLocacao() == 0)return true;
        return false;
    }

    @Override
    public void alterar(Categoria objeto) throws Exception {
        if (buscarCategoria(objeto.getDescricao())) {
            throw new Exception("Categoria já foi cadastrada");
        }
        categoriaPersistencia.alterar(objeto);
    }

    @Override
    public ArrayList<Categoria> listagemDeCategorias() throws Exception {
       return categoriaPersistencia.listagemDeCategorias();
    }

    @Override
    public Categoria buscar(int id) throws Exception {
        return categoriaPersistencia.buscar(id);
    }
}