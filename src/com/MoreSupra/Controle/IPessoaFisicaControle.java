/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.MoreSupra.Controle;

import com.MoreSupra.modelos.PessoaFisica;
import java.util.ArrayList;

/**
 *
 * @author Pichau
 */
public interface IPessoaFisicaControle {
    void incluir(PessoaFisica objeto)throws Exception;
     void alterar(PessoaFisica objeto)throws Exception;
     ArrayList<PessoaFisica> listagemDePessoas()throws Exception;
     PessoaFisica buscar(int id)throws Exception;
     
     void incluirMotorista(PessoaFisica objeto) throws Exception;
    ArrayList<PessoaFisica> listagemFisicosMotoristas() throws Exception;
    PessoaFisica buscarFisicosMotoristas(int id)throws Exception;
}
