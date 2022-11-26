package com.MoreSupra.persistencia;
import com.MoreSupra.modelos.Modelos;
import java.util.ArrayList;

public interface IModelosMore {
    void incluir(Modelos objeto) throws Exception;
    void alterar(Modelos objeto) throws Exception;
    ArrayList<Modelos> listagemModelos() throws Exception;
}