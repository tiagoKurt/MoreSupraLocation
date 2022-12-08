/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.MoreSupra.visao;

import com.MoreSupra.Controle.CadastroControle;
import com.MoreSupra.Controle.ICadastroControle;
import com.MoreSupra.modelos.Cadastro;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Pichau
 */
public class TelaCadastroGESTORES extends javax.swing.JFrame {

    ICadastroControle controle = new CadastroControle();

    public TelaCadastroGESTORES() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);

        jDialog1.setSize(700, 490);
        jDialog1.setLocationRelativeTo(null);
        jDialog1.setTitle("ajudinha");
        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        jDialog1.setResizable(false);
        
        
        jDialog2_cadastroRealizado.setSize(700, 490);
        jDialog2_cadastroRealizado.setLocationRelativeTo(null);
        jDialog2_cadastroRealizado.setTitle("cadastrorealizado");
        jDialog2_cadastroRealizado.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        jDialog2_cadastroRealizado.setResizable(false);
        
        jDialog3_cadastroInvalido.setSize(700, 490);
        jDialog3_cadastroInvalido.setLocationRelativeTo(null);
        jDialog3_cadastroInvalido.setTitle("cadastroincompleto");
        jDialog3_cadastroInvalido.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        jDialog3_cadastroInvalido.setResizable(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2_Confimar1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jDialog2_cadastroRealizado = new javax.swing.JDialog();
        jButton2_Confimar2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jDialog3_cadastroInvalido = new javax.swing.JDialog();
        jButton2_Confimar3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton2_Voltar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2_Senha = new javax.swing.JTextField();
        jTextField2_Login = new javax.swing.JTextField();
        jTextField2_Senha1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2_Ajuda = new javax.swing.JButton();
        jButton_Logar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton_Logar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jDialog1.setUndecorated(true);
        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/arrrrr.png"))); // NOI18N
        jDialog1.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, 140));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/gifAJUDINHA.gif"))); // NOI18N
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        jDialog1.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 310, 200));

        jButton2_Confimar1.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        jButton2_Confimar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/OKICON.png"))); // NOI18N
        jButton2_Confimar1.setText(" OK");
        jButton2_Confimar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 4));
        jButton2_Confimar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2_Confimar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_Confimar1ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jButton2_Confimar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 100, -1));

        jLabel15.setFont(new java.awt.Font("Serif", 3, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("VERIFIQUE A SENHA REPETIDA.");
        jDialog1.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 360, 50));

        jLabel16.setFont(new java.awt.Font("Serif", 3, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("DIGITE UM NOVO LOGIN E UMA NOVA SENHA");
        jDialog1.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 500, 50));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/FADETELA.jpg"))); // NOI18N
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 4));
        jDialog1.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 490));

        jDialog2_cadastroRealizado.setUndecorated(true);
        jDialog2_cadastroRealizado.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2_Confimar2.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        jButton2_Confimar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/OKICON.png"))); // NOI18N
        jButton2_Confimar2.setText(" OK");
        jButton2_Confimar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 4));
        jButton2_Confimar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2_Confimar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_Confimar2ActionPerformed(evt);
            }
        });
        jDialog2_cadastroRealizado.getContentPane().add(jButton2_Confimar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 100, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/arrrrr.png"))); // NOI18N
        jDialog2_cadastroRealizado.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, 140));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/CADASTROREALIZADO.gif"))); // NOI18N
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        jDialog2_cadastroRealizado.getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 220, 190));

        jLabel20.setFont(new java.awt.Font("Serif", 3, 22)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("E DIGITE OS DADOS CADASTRADOS");
        jDialog2_cadastroRealizado.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 400, 50));

        jLabel21.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("CADASTRO REALIZADO COM SUCESSO!!");
        jDialog2_cadastroRealizado.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 600, 50));

        jLabel23.setFont(new java.awt.Font("Serif", 3, 22)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("VOLTE PARA A TELA DE LOGIN");
        jDialog2_cadastroRealizado.getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 340, 50));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/FADETELA.jpg"))); // NOI18N
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 4));
        jDialog2_cadastroRealizado.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 490));

        jDialog3_cadastroInvalido.setUndecorated(true);
        jDialog3_cadastroInvalido.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2_Confimar3.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        jButton2_Confimar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/OKICON.png"))); // NOI18N
        jButton2_Confimar3.setText(" OK");
        jButton2_Confimar3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 4));
        jButton2_Confimar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2_Confimar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_Confimar3ActionPerformed(evt);
            }
        });
        jDialog3_cadastroInvalido.getContentPane().add(jButton2_Confimar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 100, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/arrrrr.png"))); // NOI18N
        jDialog3_cadastroInvalido.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, 130));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/INITIALDCADASTROINVALIDO.gif"))); // NOI18N
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        jDialog3_cadastroInvalido.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 360, 200));

        jLabel24.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("CADASTRO NÃO REALIZADO!");
        jDialog3_cadastroInvalido.getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 500, 50));

        jLabel25.setFont(new java.awt.Font("Serif", 3, 22)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("VERIFIQUE AS SENHAS DIGITADAS, OU CAMPOS VAZIOS.");
        jDialog3_cadastroInvalido.getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 630, 50));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/FADETELA.jpg"))); // NOI18N
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 4));
        jDialog3_cadastroInvalido.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 490));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2_Voltar.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        jButton2_Voltar.setForeground(new java.awt.Color(51, 0, 153));
        jButton2_Voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/voltar (1).png"))); // NOI18N
        jButton2_Voltar.setText(" VOLTAR");
        jButton2_Voltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton2_Voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2_Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 470, 210, -1));

        jLabel4.setFont(new java.awt.Font("Serif", 3, 38)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CADASTRO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 200, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/arrrrr.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 140));

        jLabel6.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("LOGIN");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 90, -1));

        jLabel7.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SENHA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 100, -1));

        jTextField2_Senha.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jTextField2_Senha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField2_Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_SenhaActionPerformed(evt);
            }
        });
        jTextField2_Senha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2_SenhaKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField2_Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 270, 40));

        jTextField2_Login.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jTextField2_Login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField2_Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2_LoginKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField2_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 270, 40));

        jTextField2_Senha1.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jTextField2_Senha1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField2_Senha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_Senha1ActionPerformed(evt);
            }
        });
        jTextField2_Senha1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2_Senha1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField2_Senha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, 270, 40));

        jLabel9.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CONFIRME A SENHA");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 280, -1));

        jButton2_Ajuda.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        jButton2_Ajuda.setForeground(new java.awt.Color(51, 0, 153));
        jButton2_Ajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/ponto-de-interrogacao.png"))); // NOI18N
        jButton2_Ajuda.setText("   AJUDA");
        jButton2_Ajuda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton2_Ajuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2_Ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_AjudaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2_Ajuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 320, 210, 40));

        jButton_Logar.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        jButton_Logar.setForeground(new java.awt.Color(51, 0, 153));
        jButton_Logar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/cadastro (1).png"))); // NOI18N
        jButton_Logar.setText("CADASTRAR");
        jButton_Logar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton_Logar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LogarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Logar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 220, 210, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/r34CUspindoFOGOO.gif"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 500, 265));

        jButton_Logar1.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        jButton_Logar1.setForeground(new java.awt.Color(51, 0, 153));
        jButton_Logar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/limpar (1).png"))); // NOI18N
        jButton_Logar1.setText("  LIMPAR");
        jButton_Logar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton_Logar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Logar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Logar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Logar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 270, 210, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/FADETELA.jpg"))); // NOI18N
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1800, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_VoltarActionPerformed
        // TODO add your handling code here:
        TelaLoginGestor princ = new TelaLoginGestor();
        princ.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2_VoltarActionPerformed

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1AncestorAdded

    private void jTextField2_SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_SenhaActionPerformed

    }//GEN-LAST:event_jTextField2_SenhaActionPerformed

    private void jTextField2_SenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_SenhaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_SenhaKeyTyped

    private void jTextField2_LoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_LoginKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_LoginKeyTyped

    private void jTextField2_Senha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_Senha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_Senha1ActionPerformed

    private void jTextField2_Senha1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_Senha1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_Senha1KeyTyped

    private void jButton2_AjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_AjudaActionPerformed
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton2_AjudaActionPerformed

    private void jButton_LogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LogarActionPerformed

        
        try {
        if (!jTextField2_Login.getText().isEmpty()  && 
                jTextField2_Senha.getText().equalsIgnoreCase(jTextField2_Senha1.getText()) ) {
            
            File arquivo = new File("./src/com/MoreSupra/arquivoDisco/Cadastro.txt");
            arquivo.createNewFile();
            Cadastro cad = new Cadastro(jTextField2_Login.getText(), jTextField2_Senha.getText());
            jDialog2_cadastroRealizado.setVisible(true);
            controle.Cadastrar(cad);
            jTextField2_Login.setText("");
            jTextField2_Senha.setText("");
            jTextField2_Senha1.setText("");
       
        } else {
            jDialog3_cadastroInvalido.setVisible(true);
        }   
        } catch (Exception ex) {
            Logger.getLogger(TelaCadastroGESTORES.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton_LogarActionPerformed

    private void jButton2_Confimar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_Confimar1ActionPerformed
        jDialog1.dispose();
    }//GEN-LAST:event_jButton2_Confimar1ActionPerformed

    private void jButton_Logar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Logar1ActionPerformed
        jTextField2_Login.setText("");
        jTextField2_Senha.setText("");
        jTextField2_Senha1.setText("");
    }//GEN-LAST:event_jButton_Logar1ActionPerformed

    private void jButton2_Confimar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_Confimar2ActionPerformed
        jDialog2_cadastroRealizado.dispose();
    }//GEN-LAST:event_jButton2_Confimar2ActionPerformed

    private void jButton2_Confimar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_Confimar3ActionPerformed
        jDialog3_cadastroInvalido.dispose();
    }//GEN-LAST:event_jButton2_Confimar3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroGESTORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroGESTORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroGESTORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroGESTORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroGESTORES().setVisible(true);
            }
        });
    }
    private String verificarDescricao(String descricao){
        String str;
        while(descricao.endsWith(" ")){
            descricao = descricao.replaceFirst(".$", "");
        }
        while(descricao.startsWith(" ")){
            descricao = descricao.substring(1);
        }
        return descricao;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2_Ajuda;
    private javax.swing.JButton jButton2_Confimar1;
    private javax.swing.JButton jButton2_Confimar2;
    private javax.swing.JButton jButton2_Confimar3;
    private javax.swing.JButton jButton2_Voltar;
    private javax.swing.JButton jButton_Logar;
    private javax.swing.JButton jButton_Logar1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2_cadastroRealizado;
    private javax.swing.JDialog jDialog3_cadastroInvalido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField2_Login;
    private javax.swing.JTextField jTextField2_Senha;
    private javax.swing.JTextField jTextField2_Senha1;
    // End of variables declaration//GEN-END:variables
}
