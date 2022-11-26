package com.MoreSupra.Controle;

import com.MoreSupra.modelos.Categoria;
import java.util.ArrayList;

public interface ICategoriasControle {
    void incluir(Categoria objeto)throws Exception;
     void alterar(Categoria objeto)throws Exception;
     ArrayList<Categoria> listagemDeCategorias()throws Exception;
     Categoria buscar(int id)throws Exception;
}