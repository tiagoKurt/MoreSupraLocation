/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.MoreSupra.Controle;
import com.MoreSupra.modelos.Marca;
import com.MoreSupra.persistencia.MarcaMore;
import java.util.ArrayList;
/**
 *
 * @author Aluno
 */
public interface IMarcasControle {
     void incluir(Marca objeto)throws Exception;
     void alterar(Marca objeto)throws Exception;
     ArrayList<Marca> listagemDeMarcas()throws Exception;
     Marca buscar(int id)throws Exception;
}
