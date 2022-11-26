package com.MoreSupra.persistencia;
import com.MoreSupra.modelos.Marca;
import java.util.ArrayList;

public interface IMarcaMore {  
    void incluir(Marca objeto) throws Exception;
    void alterar(Marca objeto) throws Exception;
    Marca buscar(int id)throws Exception;
    ArrayList<Marca> listagemDeMarcas() throws Exception;
}
