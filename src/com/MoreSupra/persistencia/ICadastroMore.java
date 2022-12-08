/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.MoreSupra.persistencia;

import com.MoreSupra.modelos.Cadastro;
import java.util.ArrayList;

/**
 *
 * @author Pichau
 */
public interface ICadastroMore {
    
    Cadastro buscar(String login, String senha)throws Exception;
    void Cadastrar (Cadastro objeto) throws Exception;
    ArrayList<Cadastro> listagemDeCadastro() throws Exception;
}
