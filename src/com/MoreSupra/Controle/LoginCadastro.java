/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MoreSupra.Controle;

import com.MoreSupra.modelos.Cadastro;
import com.MoreSupra.persistencia.CadastrarMore;
import com.MoreSupra.visao.TelaLoginGestor;
import com.MoreSupra.visao.TelaPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author Pichau
 */
public class LoginCadastro {
    
    private TelaLoginGestor pog;
    
    
    public LoginCadastro(TelaLoginGestor login){
        this.pog = pog;
    }

    public void autenticar() throws Exception {
           
        String user = pog.getjTextField2_Login().getText();
        String senha = pog.getjTextField2_Senha().getText();
        String senha2 = pog.getjPasswordField1().getText();

             Cadastro cad = new Cadastro(user, senha);
             CadastrarMore UserCadastro = new CadastrarMore();
             boolean existe = UserCadastro.autenticarUsuario(cad);
                
            if(existe){
            TelaPrincipal tabelaClientes = new TelaPrincipal();
            tabelaClientes.setVisible(true);  
            pog.dispose();
            
            } else{
                JOptionPane.showMessageDialog(pog, "invalido");
            }
    }
}
