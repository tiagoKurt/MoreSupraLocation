/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.MoreSupra.Controle;
import com.MoreSupra.modelos.Acessorios;
import java.util.ArrayList;

/**
 *
 * @author Pichau
 */
public interface IAcessoriosControle {
    void incluir(Acessorios objeto)throws Exception;
     void alterar(Acessorios objeto)throws Exception;
     ArrayList<Acessorios> listagemDeAcessorios()throws Exception;
     Acessorios buscar(int id)throws Exception;
}
