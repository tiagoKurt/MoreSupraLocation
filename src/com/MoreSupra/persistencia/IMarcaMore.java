/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.MoreSupra.persistencia;
import com.MoreSupra.modelos.Marca;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public interface IMarcaMore {  
    void incluir(Marca objeto) throws Exception;
    void alterar(Marca objeto) throws Exception;
    Marca buscar(int id)throws Exception;
    ArrayList<Marca> listagemDeMarcas() throws Exception;
}
