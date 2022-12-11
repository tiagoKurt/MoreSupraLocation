/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MoreSupra.Controle;

import com.MoreSupra.modelos.Locacao;
import com.MoreSupra.persistencia.ILocacaoMore;
import com.MoreSupra.persistencia.LocacaoMore;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Pichau
 */
public class LocacaoControle implements ILocacaoControle{

    ILocacaoMore locacaoPersistencia = null;

    public LocacaoControle() {
        this.locacaoPersistencia = new LocacaoMore();
    }
 
    
    @Override
    public void locar(Locacao objeto) throws Exception {
        locacaoPersistencia.locar(objeto);
    }

    @Override
    public void devolver(Locacao objeto) throws Exception {
            
        locacaoPersistencia.devolver(objeto);
        
    }

    @Override
    public ArrayList<Locacao> listagemDeLocacao() throws Exception {
        return locacaoPersistencia.listagemDeLocacao();
    }
    
}
