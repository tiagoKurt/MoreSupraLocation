package com.MoreSupra.Controle;

import com.MoreSupra.modelos.Locacao;
import java.util.ArrayList;


public interface ILocacaoControle {
    
    void locar(Locacao objeto) throws Exception;
    void devolver(Locacao objeto) throws Exception;
    ArrayList<Locacao> listagemDeLocacao() throws Exception;
    
}
