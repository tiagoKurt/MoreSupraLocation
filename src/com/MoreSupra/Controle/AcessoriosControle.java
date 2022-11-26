package com.MoreSupra.Controle;
import com.MoreSupra.modelos.Acessorios;
import com.MoreSupra.persistencia.AcessoriosMore;
import com.MoreSupra.persistencia.IAcessoriosMore;
import java.util.ArrayList;
import java.util.Iterator;

public class AcessoriosControle implements IAcessoriosControle {
    
    IAcessoriosMore acessoriosPersistencia = null;
    
    public AcessoriosControle(){
        this.acessoriosPersistencia = new AcessoriosMore();
    }
    
    private boolean buscarAcessorio(String descricao) throws Exception {
        try {
            ArrayList<Acessorios> listagem = acessoriosPersistencia.listagemDeAcessorios();
            Iterator<Acessorios> lista = listagem.iterator();
            while (lista.hasNext()) {
                Acessorios aux = lista.next();
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
            ArrayList<Acessorios> listagem = acessoriosPersistencia.listagemDeAcessorios();
            Iterator<Acessorios> lista = listagem.iterator();
            while (lista.hasNext()) {
                Acessorios aux = lista.next();
                if (aux.getValorDaLocacao()+"" == aux.getValorDaLocacao()+"") {
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }  

    @Override
    public void incluir(Acessorios objeto) throws Exception {
        objeto.setDescricao(verificarDescricao(objeto.getDescricao()));
        if(verificarVazio(objeto)) throw new Exception("Alguns campos não foram preenchidos!");
        if(verificarValorNulo(objeto)) throw new Exception("Valor não pode ser < || = 0");
        if(buscarAcessorio(objeto.getDescricao())){
            throw new Exception("Acessório já cadastrado");
        }
        
        acessoriosPersistencia.incluir(objeto);
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
    
    private boolean verificarVazio(Acessorios objeto){
        if(objeto.getDescricao().equals("")) return true;
        return false;
    }
    
    private boolean verificarValorNulo(Acessorios obj){
        if(obj.getValorDaLocacao() == 0)return true;
        return false;
    }

    @Override
    public void alterar(Acessorios objeto) throws Exception {
        if (buscarAcessorio(objeto.getDescricao()) && verificarPreco(objeto.getValorDaLocacao())) {
            throw new Exception("Acessório já foi cadastrada");
        }
        acessoriosPersistencia.alterar(objeto);
    }

    @Override
    public ArrayList<Acessorios> listagemDeAcessorios() throws Exception {
        return acessoriosPersistencia.listagemDeAcessorios();
    }

    @Override
    public Acessorios buscar(int id) throws Exception {
        return acessoriosPersistencia.buscar(id);
    }
}