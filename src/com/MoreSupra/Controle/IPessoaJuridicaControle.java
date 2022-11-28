/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.MoreSupra.Controle;

import com.MoreSupra.modelos.PessoaJuridica;
import java.util.ArrayList;

/**
 *
 * @author Pichau
 */
public interface IPessoaJuridicaControle {
    void incluir(PessoaJuridica objeto)throws Exception;
     void alterar(PessoaJuridica objeto)throws Exception;
     ArrayList<PessoaJuridica> listagemDePessoas()throws Exception;
     PessoaJuridica buscar(int id)throws Exception;
}
