/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MoreSupra.Controle;

import com.MoreSupra.modelos.Cadastro;
import com.MoreSupra.persistencia.CadastrarMore;
import com.MoreSupra.persistencia.ICadastroMore;
import java.util.ArrayList;

/**
 *
 * @author Pichau
 */
public class CadastroControle implements ICadastroControle{
    
    ICadastroMore cadastroPersistencia = null;

    public CadastroControle() {
        this.cadastroPersistencia = new CadastrarMore();
    }

    private boolean verificarVazio(Cadastro objeto){
        if(objeto.getLogin().equals("") || objeto.getSenha().equals("")) return true;
        return false;
    }
    
    public CadastroControle(Cadastro objeto) throws Exception {
        if(verificarVazio(objeto)) throw new Exception("Alguns campos não foram preenchidos!");
        this.cadastroPersistencia = new CadastrarMore();
    }

    @Override
    public void Cadastrar(Cadastro objeto) throws Exception {
        cadastroPersistencia.Cadastrar(objeto);
    }

    @Override
    public ArrayList<Cadastro> listagemDeCadastro() throws Exception {
       return cadastroPersistencia.listagemDeCadastro();
    }
    
}
