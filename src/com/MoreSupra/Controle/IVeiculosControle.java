/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.MoreSupra.Controle;

import com.MoreSupra.modelos.Veiculos;
import java.util.ArrayList;

/**
 *
 * @author Pichau
 */
public interface IVeiculosControle {
    void incluir(Veiculos objeto) throws Exception;
    void alterar(Modelos objeto) throws Exception;
    ArrayList<Veiculos> listagemModelos() throws Exception;
}
