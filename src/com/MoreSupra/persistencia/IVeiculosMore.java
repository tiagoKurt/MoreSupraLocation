package com.MoreSupra.persistencia;

import com.MoreSupra.modelos.Veiculos;
import java.util.ArrayList;

public interface IVeiculosMore {
    void incluir(Veiculos objeto) throws Exception;
    void alterar(Veiculos objeto) throws Exception;
    ArrayList<Veiculos> listagemVeiculos() throws Exception;
}