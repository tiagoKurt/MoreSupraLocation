/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.MoreSupra.persistencia;

import com.MoreSupra.modelos.Categoria;
import java.util.ArrayList;

/**
 *
 * @author Pichau
 */
public interface ICategoriaMore {
    void incluir(Categoria objeto) throws Exception;
    void alterar(Categoria objeto) throws Exception;
    Categoria buscar(int id)throws Exception;
    ArrayList<Categoria> listagemDeCategorias() throws Exception;
    
}
