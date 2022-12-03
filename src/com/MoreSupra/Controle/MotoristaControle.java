/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MoreSupra.Controle;

import com.MoreSupra.modelos.Motorista;
import com.MoreSupra.persistencia.IMotoristaMore;
import com.MoreSupra.persistencia.MotoristaMore;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Pichau
 */
public class MotoristaControle implements IMotoristaControle{
    
    IMotoristaMore motoristaPersistencia = null;

    public MotoristaControle() {
        this.motoristaPersistencia = new MotoristaMore();
    }

    private boolean buscarMotorista(String nome, int num) throws Exception {
        try {
            ArrayList<Motorista> listagem = motoristaPersistencia.listagemDeMotorista();
            Iterator<Motorista> lista = listagem.iterator();
            while (lista.hasNext()) {
                Motorista aux = lista.next();
                if (aux.getNome().equalsIgnoreCase(nome)) {
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }
    
    private boolean alterarMotorista (String descricao) throws Exception{
        try {
            ArrayList<Motorista> listagem = motoristaPersistencia.listagemDeMotorista();
            Iterator<Motorista> lista = listagem.iterator();
            while (lista.hasNext()){
                Motorista aux = lista.next();
                if(aux.getNome().equalsIgnoreCase(descricao)){
                    return true;
            }
        }return false;
        } catch (Exception erro) {
            throw erro;
        }
    }

    public void incluir(Motorista objeto) throws Exception {
        objeto.setNome(verificarNome(objeto.getNome()));
        if(verificarVazio(objeto)) throw new Exception("Alguns campos não foram preenchidos!");
        if(buscarMotorista(objeto.getNome(), objeto.getNumeroCNH())){
            throw new Exception("Motorista já cadastrado");
        }
        
        motoristaPersistencia.incluir(objeto);
    }
    
    private String verificarNome(String nome){
        String str;
        while(nome.endsWith(" ")){
            nome = nome.replaceFirst(".$", "");
        }
        while(nome.startsWith(" ")){
            nome = nome.substring(1);
        }
        return nome;
    }
    
    private boolean verificarVazio(Motorista objeto){
        if(objeto.getNome().equals("") || objeto.getNumeroCNH() == 0) return true;
        return false;
    }

    public void alterar(Motorista objeto) throws Exception {
        if (buscarMotorista(objeto.getNome(), objeto.getNumeroCNH())) {
            throw new Exception("Marca já foi cadastrada");
        }
        motoristaPersistencia.alterar(objeto);
    }

    public ArrayList<Motorista> listagemDeMotorista() throws Exception {
        return motoristaPersistencia.listagemDeMotorista();
    }

    public Motorista buscar(int id) throws Exception {
        return motoristaPersistencia.buscar(id);
    }
    
}
