package com.MoreSupra.Controle;
import com.MoreSupra.modelos.Marca;
import com.MoreSupra.persistencia.IMarcaMore;
import com.MoreSupra.persistencia.MarcaMore;
import java.util.ArrayList;
import java.util.Iterator;
import com.MoreSupra.Controle.IMarcasControle;
import com.MoreSupra.GeradorID.GeradorIdentificador;

/**
 *
 * @author 
 */
public class MarcasControle implements IMarcasControle {

    IMarcaMore marcaPersistencia = null;

    public MarcasControle() {
        this.marcaPersistencia = new MarcaMore();
    }

    private boolean buscarMarca(String descricao) throws Exception {
        try {
            ArrayList<Marca> listagem = marcaPersistencia.listagemDeMarcas();
            Iterator<Marca> lista = listagem.iterator();
            while (lista.hasNext()) {
                Marca aux = lista.next();
                if (aux.getDescricao().equalsIgnoreCase(descricao)) {
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void incluir(Marca objeto) throws Exception {
        objeto.setDescricao(verificarDescricao(objeto.getDescricao()));
        if(verificarVazio(objeto)) throw new Exception("Alguns campos não foram preenchidos!");
        if(buscarMarca(objeto.getDescricao())){
            throw new Exception("Modelo já cadastrado");
        }
        
        marcaPersistencia.incluir(objeto);
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
    
    private boolean verificarVazio(Marca objeto){
        if(objeto.getDescricao().equals("") || objeto.getUrl().equals("")) return true;
        return false;
    }

    @Override
    public void alterar(Marca objeto) throws Exception {
        if (buscarMarca(objeto.getDescricao())) {
            throw new Exception("Marca já foi cadastrada");
        }
        marcaPersistencia.alterar(objeto);
    }

    @Override
    public ArrayList<Marca> listagemDeMarcas() throws Exception {
        return marcaPersistencia.listagemDeMarcas(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Marca buscar(int id) throws Exception {
        return marcaPersistencia.buscar(id);
    }

}
