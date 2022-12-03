/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.MoreSupra.Controle;

import com.MoreSupra.modelos.Motorista;
import java.util.ArrayList;


public interface IMotoristaControle {
    
    void incluir(Motorista objeto) throws Exception;
    void alterar(Motorista objeto) throws Exception;
    ArrayList<Motorista> listagemDeMotorista() throws Exception;  
    Motorista buscar(int id)throws Exception;
    
}
