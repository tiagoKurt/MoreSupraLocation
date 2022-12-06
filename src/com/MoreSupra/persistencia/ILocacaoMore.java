/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.MoreSupra.persistencia;

import com.MoreSupra.modelos.Locacao;
import java.util.ArrayList;

public interface ILocacaoMore {
    
    void locar(Locacao objeto) throws Exception;
    void devolver(Locacao objeto) throws Exception;
    Locacao buscar(int id)throws Exception;
    ArrayList<Locacao> listagemDeLocacao() throws Exception;
    
}
