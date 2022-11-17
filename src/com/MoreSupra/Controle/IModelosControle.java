/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.MoreSupra.Controle;

import com.MoreSupra.modelos.Modelos;
import com.MoreSupra.persistencia.ModelosMore;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public interface IModelosControle {
    void incluir(Modelos objeto) throws Exception;
    void alterar(Modelos objeto) throws Exception;
    ArrayList<Modelos> listagemModelos() throws Exception;
    
}
