package com.MoreSupra.persistencia;

import com.MoreSupra.modelos.Locacao;
import java.util.ArrayList;

public interface ILocacaoMore {
    
    void locar(Locacao objeto) throws Exception;
    void devolver(Locacao objeto) throws Exception;
    ArrayList<Locacao> listagemDeLocacao() throws Exception;
    
}
