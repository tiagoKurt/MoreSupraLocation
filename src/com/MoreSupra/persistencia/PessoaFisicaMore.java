package com.MoreSupra.persistencia;

import com.MoreSupra.GeradorID.GeradorIdentificador;
import com.MoreSupra.modelos.PessoaFisica;
import com.MoreSupra.modelos.Telefone;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;

/**
 *
 * @author Pichau
 */
public class PessoaFisicaMore implements IPessoaFisicaMore{
    
    private String nomeArquivoNoDisco;
    
    public PessoaFisicaMore(){
        nomeArquivoNoDisco = "./src/com/MoreSupra/arquivoDisco/PessoaFisica.txt";
    }
    
    
    public PessoaFisica buscar(int id) throws Exception{
       
        FileReader fr = new FileReader(nomeArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
           // ArrayList<Marca> lista = listagem();
            String linha = "";
            while((linha = br.readLine()) !=null ){
                PessoaFisica objetoPessoa = new PessoaFisica();
                String vetorString[] = linha.split(";");
                objetoPessoa.setId(Integer.parseInt(vetorString[0]));
                objetoPessoa.setCpf(vetorString[1]);
                objetoPessoa.setNome(vetorString[2]);
                objetoPessoa.setIdentidade(vetorString[3]);
                objetoPessoa.setTelefone(vetorString[4]);
                objetoPessoa.setEmail(vetorString[5]);
                objetoPessoa.setEndereco(vetorString[6]);
                if(objetoPessoa.getId() == id){
                br.close();
                return new PessoaFisica(Integer.parseInt(vetorString[0]), vetorString[1], vetorString[2], vetorString[3], 
                        vetorString[4], vetorString[5], vetorString[6]);
                }               
            }
            return null;           
    }
    
    @Override
    public void incluir(PessoaFisica objeto) throws Exception {
        try {
            FileWriter fw = new FileWriter(nomeArquivoNoDisco, true);
            BufferedWriter bw  = new BufferedWriter(fw);
            objeto.setId(GeradorIdentificador.getID());
            
            bw.write(objeto.toString() + "\n");            
            bw.close();
        } catch (Exception erro) {
            throw erro;
        }
    }

    
    @Override
    public void alterar(PessoaFisica objeto) throws Exception {
        try {
            ArrayList<PessoaFisica> lista = listagemDePessoas();
            FileWriter fw =new FileWriter(nomeArquivoNoDisco);
            BufferedWriter bw =new BufferedWriter(fw);
            for(int i = 0; i < lista.size();i++){
                if(objeto.getId()== lista.get(i).getId()){
                    bw.write(objeto.toString() + "\n");
                }
                else{
                    bw.write(lista.get(i).toString() + "\n");
                }
                
            }
            bw.close();
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public ArrayList<PessoaFisica> listagemDePessoas() throws Exception {
        try {
            ArrayList<PessoaFisica> listaDePessoas = new ArrayList<PessoaFisica>();
            FileReader fr = new FileReader(nomeArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);

            String linha = "";

            while((linha = br.readLine()) != null){
                PessoaFisica objetoPessoa = new PessoaFisica();
                String vetorString[] = linha.split(";");
                objetoPessoa.setId(Integer.parseInt(vetorString[0]));
                objetoPessoa.setCpf(vetorString[1]);
                objetoPessoa.setNome(vetorString[2]);
                objetoPessoa.setIdentidade(vetorString[3]);
                objetoPessoa.setTelefone(vetorString[4]);
                objetoPessoa.setEmail(vetorString[5]);
                objetoPessoa.setEndereco(vetorString[6]);
                listaDePessoas.add(objetoPessoa);
            }
            br.close();
            return listaDePessoas;     
        } catch (Exception erro) {
            throw erro;
        }
    }
}
