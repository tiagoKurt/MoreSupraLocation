package com.MoreSupra.persistencia;

import com.MoreSupra.GeradorID.GeradorIdentificador;
import com.MoreSupra.modelos.PessoaJuridica;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Pichau
 */
public class PessoaJuridicaMore implements IPessoaJuridicaMore{
    
    
    private String nomeArquivoNoDisco;
    
    public PessoaJuridicaMore(){
        nomeArquivoNoDisco = "./src/com/MoreSupra/arquivoDisco/Clientes.txt";
    }
    
    
    public PessoaJuridica buscar(int id) throws Exception{
       
        FileReader fr = new FileReader(nomeArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
           // ArrayList<Marca> lista = listagem();
            String linha = "";
            while((linha = br.readLine()) !=null ){
                PessoaJuridica objetoPessoa = new PessoaJuridica();
                String vetorString[] = linha.split(";");
                objetoPessoa.setId(Integer.parseInt(vetorString[0]));
                objetoPessoa.setCnpj(vetorString[1]);
                objetoPessoa.setNome(vetorString[2]);
                objetoPessoa.setRazaoSocial(vetorString[3]);
                objetoPessoa.setTelefone(vetorString[4]);
                objetoPessoa.setEmail(vetorString[5]);
                objetoPessoa.setEndereco(vetorString[6]);
                objetoPessoa.setOqe(vetorString[7]);
                objetoPessoa.setAux(vetorString[8]);
                if(objetoPessoa.getId() == id){
                br.close();
                return new PessoaJuridica(Integer.parseInt(vetorString[0]), vetorString[1], vetorString[2], vetorString[3], 
                        vetorString[4], vetorString[5], vetorString[6], vetorString[7], vetorString[8]);
                }               
            }
            return null;           
    }
    
    @Override
    public void incluir(PessoaJuridica objeto) throws Exception {
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
    public void alterar(PessoaJuridica objeto) throws Exception {
        try {
            ArrayList<PessoaJuridica> lista = listagemDePessoas();
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
    public ArrayList<PessoaJuridica> listagemDePessoas() throws Exception {
        try {
            ArrayList<PessoaJuridica> listaDePessoas = new ArrayList<PessoaJuridica>();
            FileReader fr = new FileReader(nomeArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);

            String linha = "";

            while((linha = br.readLine()) != null){
                PessoaJuridica objetoPessoa = new PessoaJuridica();
                String vetorString[] = linha.split(";");
                objetoPessoa.setId(Integer.parseInt(vetorString[0]));
                objetoPessoa.setCnpj(vetorString[1]);
                objetoPessoa.setNome(vetorString[2]);
                objetoPessoa.setRazaoSocial(vetorString[3]);
                objetoPessoa.setTelefone(objetoPessoa.getTelefone());
                objetoPessoa.setEmail(vetorString[4]);
                objetoPessoa.setEndereco(vetorString[5]);
                listaDePessoas.add(objetoPessoa);
            }
            br.close();
            return listaDePessoas;     
        } catch (Exception erro) {
            throw erro;
        }
    }
    
}
