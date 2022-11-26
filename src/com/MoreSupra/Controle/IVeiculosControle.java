package com.MoreSupra.Controle;

import com.MoreSupra.modelos.Veiculos;
import java.util.ArrayList;

public interface IVeiculosControle {
    void incluir(Veiculos objeto) throws Exception;
    void alterar(Veiculos objeto) throws Exception;
    ArrayList<Veiculos> listagemVeiculos() throws Exception;
}