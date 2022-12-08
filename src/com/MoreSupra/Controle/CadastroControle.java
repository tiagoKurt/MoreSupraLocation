/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MoreSupra.Controle;

import com.MoreSupra.modelos.Cadastro;
import com.MoreSupra.persistencia.CadastrarMore;
import com.MoreSupra.persistencia.ICadastroMore;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Pichau
 */
public class CadastroControle implements ICadastroControle{
    
    ICadastroMore cadastroPersistencia = null;

    
    public CadastroControle() {
        this.cadastroPersistencia = new CadastrarMore();
    }
    
    private boolean buscarCadastro(String login, String senha) throws Exception {
        try {
            ArrayList<Cadastro> listagem = cadastroPersistencia.listagemDeCadastro();
            Iterator<Cadastro> lista = listagem.iterator();
            while (lista.hasNext()) {
                Cadastro aux = lista.next();
                if (aux.getLogin().equalsIgnoreCase(login) || aux.getSenha().equalsIgnoreCase(senha)) {
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }
    
    
    

    private boolean verificarVazio(Cadastro objeto){
        if(objeto.getLogin().equals("") || objeto.getSenha().equals("")) return true;
        return false;
    }

    @Override
    public void Cadastrar(Cadastro objeto) throws Exception {
        cadastroPersistencia.Cadastrar(objeto);
    }

    @Override
    public ArrayList<Cadastro> listagemDeCadastro() throws Exception {
       return cadastroPersistencia.listagemDeCadastro();
    }

    @Override
    public Cadastro buscar(String login, String senha) throws Exception {
        return cadastroPersistencia.buscar(login, senha);
    }

    
}
