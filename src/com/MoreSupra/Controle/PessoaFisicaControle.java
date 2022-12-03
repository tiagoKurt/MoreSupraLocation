/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MoreSupra.Controle;

import com.MoreSupra.modelos.PessoaFisica;
import com.MoreSupra.persistencia.IPessoaFisicaMore;
import com.MoreSupra.persistencia.PessoaFisicaMore;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Pichau
 */
public class PessoaFisicaControle implements IPessoaFisicaControle{
    
    
    IPessoaFisicaMore pessoaFisicaPersistencia = null;

    public PessoaFisicaControle() {
        this.pessoaFisicaPersistencia = new PessoaFisicaMore();
    }

    private boolean buscarPessoa(String cpf, String nome, String identidade) throws Exception {
        try {
            ArrayList<PessoaFisica> listagem = pessoaFisicaPersistencia.listagemDePessoas();
            Iterator<PessoaFisica> lista = listagem.iterator();
            while (lista.hasNext()) {
                PessoaFisica aux = lista.next();
                if (aux.getCpf().equalsIgnoreCase(cpf) && aux.getNome().equalsIgnoreCase(nome)&& aux.getIdentidade().equalsIgnoreCase(identidade)) {
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }
    
    private boolean buscarMarca(String descricao) throws Exception {
        try {
            ArrayList<PessoaFisica> listagem = pessoaFisicaPersistencia.listagemDePessoas();
            Iterator<PessoaFisica> lista = listagem.iterator();
            while (lista.hasNext()) {
                PessoaFisica aux = lista.next();
                if (aux.getNome().equalsIgnoreCase(descricao)) {
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }
    
    private boolean alterarPessoa (String cpf, String nome, String identidade) throws Exception{
        try {
            ArrayList<PessoaFisica> listagem = pessoaFisicaPersistencia.listagemDePessoas();
            Iterator<PessoaFisica> lista = listagem.iterator();
            while (lista.hasNext()){
                PessoaFisica aux = lista.next();
                if(aux.getCpf().equalsIgnoreCase(cpf) && aux.getNome().equalsIgnoreCase(nome) && aux.getIdentidade().equalsIgnoreCase(identidade)){
                    return true;
            }
        }return false;
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void incluir(PessoaFisica objeto) throws Exception {
        objeto.setCpf(verificarDescricao(objeto.getCpf()));
        if(verificarVazio(objeto)) throw new Exception("Alguns campos não foram preenchidos!");
        if(buscarPessoa(objeto.getCpf(), objeto.getNome(), objeto.getIdentidade())){
            throw new Exception("Cliente já cadastrado");
        }
        
        pessoaFisicaPersistencia.incluir(objeto);
    }
    
    private String verificarDescricao(String descricao){
        String str;
        while(descricao.endsWith(" ")){
            descricao = descricao.replaceFirst(".$", "");
        }
        while(descricao.startsWith(" ")){
            descricao = descricao.substring(1);
        }
        return descricao;
    }
    
    private boolean verificarVazio(PessoaFisica objeto){
        if(objeto.getCpf().equals("") || objeto.getNome().equals("") || objeto.getIdentidade().equals("")) return true;
        return false;
    }

    @Override
    public void alterar(PessoaFisica objeto) throws Exception {
        if (buscarPessoa(objeto.getCpf(), objeto.getNome(), objeto.getIdentidade())) {
            throw new Exception("Marca já foi cadastrada");
        }
        pessoaFisicaPersistencia.alterar(objeto);
    }

    @Override
    public ArrayList<PessoaFisica> listagemDePessoas() throws Exception {
        return pessoaFisicaPersistencia.listagemDePessoas();
    }

    @Override
    public PessoaFisica buscar(int id) throws Exception {
        return pessoaFisicaPersistencia.buscar(id);
    }  
}
