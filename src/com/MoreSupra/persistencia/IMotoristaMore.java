package com.MoreSupra.persistencia;

import com.MoreSupra.modelos.Motorista;
import java.util.ArrayList;


public interface IMotoristaMore {
    void incluir(Motorista objeto) throws Exception;
    void alterar(Motorista objeto) throws Exception;
    Motorista buscar(int id)throws Exception;
    ArrayList<Motorista> listagemDeMotorista() throws Exception;
}
