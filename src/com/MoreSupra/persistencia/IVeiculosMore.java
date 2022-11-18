/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.MoreSupra.persistencia;

import com.MoreSupra.modelos.Modelos;
import java.util.ArrayList;

/**
 *
 * @author Pichau
 */
public interface IVeiculosMore {
    void incluir(Modelos objeto) throws Exception;
    void alterar(Modelos objeto) throws Exception;
    ArrayList<Modelos> listagemModelos() throws Exception;
}
