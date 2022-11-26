package com.MoreSupra.persistencia;

import com.MoreSupra.modelos.Categoria;
import java.util.ArrayList;

public interface ICategoriaMore {
    void incluir(Categoria objeto) throws Exception;
    void alterar(Categoria objeto) throws Exception;
    Categoria buscar(int id)throws Exception;
    ArrayList<Categoria> listagemDeCategorias() throws Exception;
    
}
