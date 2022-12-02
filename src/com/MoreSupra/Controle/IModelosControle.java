package com.MoreSupra.Controle;

import com.MoreSupra.modelos.Modelos;
import java.util.ArrayList;

public interface IModelosControle {
    void incluir(Modelos objeto) throws Exception;
    void alterar(Modelos objeto) throws Exception;
    ArrayList<Modelos> listagemModelos() throws Exception;  
    Modelos buscar(int id)throws Exception;
}