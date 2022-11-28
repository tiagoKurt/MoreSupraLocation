/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MoreSupra.Controle;

import com.MoreSupra.modelos.PessoaJuridica;
import com.MoreSupra.persistencia.IPessoaJuridicaMore;
import com.MoreSupra.persistencia.PessoaJuridicaMore;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Pichau
 */
public class PessoaJuridicaControle implements IPessoaJuridicaControle{
    
    
    IPessoaJuridicaMore pessoaJuridicaPersistencia = null;

    public PessoaJuridicaControle() {
        this.pessoaJuridicaPersistencia = new PessoaJuridicaMore();
    }

    private boolean buscarPessoa(String cnpj, String nome, String razaoSocial) throws Exception {
        try {
            ArrayList<PessoaJuridica> listagem = pessoaJuridicaPersistencia.listagemDePessoas();
            Iterator<PessoaJuridica> lista = listagem.iterator();
            while (lista.hasNext()) {
                PessoaJuridica aux = lista.next();
                if (aux.getCnpj().equalsIgnoreCase(cnpj) && aux.getNome().equalsIgnoreCase(nome)&& aux.getRazaoSocial().equalsIgnoreCase(razaoSocial)) {
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }
    
    private boolean alterarPessoa (String cnpj, String nome, String razaoSocial) throws Exception{
        try {
            ArrayList<PessoaJuridica> listagem = pessoaJuridicaPersistencia.listagemDePessoas();
            Iterator<PessoaJuridica> lista = listagem.iterator();
            while (lista.hasNext()){
                PessoaJuridica aux = lista.next();
                if(aux.getCnpj().equalsIgnoreCase(cnpj) && aux.getNome().equalsIgnoreCase(nome) && aux.getRazaoSocial().equalsIgnoreCase(razaoSocial)){
                    return true;
            }
        }return false;
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void incluir(PessoaJuridica objeto) throws Exception {
        objeto.setCnpj(verificarDescricao(objeto.getCnpj()));
        if(verificarVazio(objeto)) throw new Exception("Alguns campos não foram preenchidos!");
        if(buscarPessoa(objeto.getCnpj(), objeto.getNome(), objeto.getRazaoSocial())){
            throw new Exception("Cliente já cadastrado");
        }
        
        pessoaJuridicaPersistencia.incluir(objeto);
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
    
    private boolean verificarVazio(PessoaJuridica objeto){
        if(objeto.getCnpj().equals("") || objeto.getNome().equals("") || objeto.getRazaoSocial().equals("")) return true;
        return false;
    }

    @Override
    public void alterar(PessoaJuridica objeto) throws Exception {
        if (buscarPessoa(objeto.getCnpj(), objeto.getNome(), objeto.getRazaoSocial())) {
            throw new Exception("Marca já foi cadastrada");
        }
        pessoaJuridicaPersistencia.alterar(objeto);
    }

    @Override
    public ArrayList<PessoaJuridica> listagemDePessoas() throws Exception {
        return pessoaJuridicaPersistencia.listagemDePessoas();
    }

    @Override
    public PessoaJuridica buscar(int id) throws Exception {
        return pessoaJuridicaPersistencia.buscar(id);
    }
    
    
}
