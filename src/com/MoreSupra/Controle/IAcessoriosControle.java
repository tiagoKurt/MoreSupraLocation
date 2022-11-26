package com.MoreSupra.Controle;
import com.MoreSupra.modelos.Acessorios;
import java.util.ArrayList;

public interface IAcessoriosControle {
     void incluir(Acessorios objeto)throws Exception;
     void alterar(Acessorios objeto)throws Exception;
     ArrayList<Acessorios> listagemDeAcessorios()throws Exception;
     Acessorios buscar(int id)throws Exception;
}