package com.MoreSupra.persistencia;
import com.MoreSupra.modelos.Acessorios;
import java.util.ArrayList;

public interface IAcessoriosMore {
    void incluir(Acessorios objeto) throws Exception;
    void alterar(Acessorios objeto) throws Exception;
    Acessorios buscar(int id)throws Exception;
    ArrayList<Acessorios> listagemDeAcessorios() throws Exception;
}