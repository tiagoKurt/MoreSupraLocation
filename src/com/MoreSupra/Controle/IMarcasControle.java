package com.MoreSupra.Controle;
import com.MoreSupra.modelos.Marca;
import com.MoreSupra.persistencia.MarcaMore;
import java.util.ArrayList;

public interface IMarcasControle {
     void incluir(Marca objeto)throws Exception;
     void alterar(Marca objeto)throws Exception;
     ArrayList<Marca> listagemDeMarcas()throws Exception;
     Marca buscar(int id)throws Exception;
}