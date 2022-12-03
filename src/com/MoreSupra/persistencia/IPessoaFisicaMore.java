package com.MoreSupra.persistencia;

import com.MoreSupra.modelos.PessoaFisica;
import java.util.ArrayList;

/**
 *
 * @author Pichau
 */
public interface IPessoaFisicaMore {
    void incluir(PessoaFisica objeto) throws Exception;
    void alterar(PessoaFisica objeto) throws Exception;
    ArrayList<PessoaFisica> listagemDePessoas() throws Exception;
    PessoaFisica buscar(int id)throws Exception;
    
}
