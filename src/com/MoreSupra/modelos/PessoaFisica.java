/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MoreSupra.modelos;

/**
 *
 * @author Pichau
 */
public class PessoaFisica{
    
    private int id = 0;
    private String cpf;
    private String nome;
    private String identidade;
    private String telefone;
    private String email;   
    private String endereco;
    private String oqe = "FÍSICO";
    private String aux = "";
    
    public PessoaFisica(){}
    
    public PessoaFisica(int id, String cpf, String nome, String identidade, String telefone,
            String email, String endereco, String oqe, String aux){
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.identidade = identidade;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getOqe() {
        return oqe;
    }

    public void setOqe(String oqe) {
        this.oqe = oqe;
    }

    public String getAux() {
        return aux;
    }

    public void setAux(String aux) {
        this.aux = aux;
    }   

    @Override
    public String toString() {
        return id + ";" + cpf + ";" + nome + ";" + identidade + ";" + telefone + ";" + email + ";" + endereco + ";" + oqe + aux + ";";
    }
}
