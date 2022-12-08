/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.MoreSupra.visao;

import ImagensTabela.JTableRenderer;
import com.MoreSupra.Controle.IPessoaFisicaControle;
import com.MoreSupra.Controle.PessoaFisicaControle;
import com.MoreSupra.modelos.Endereco;
import com.MoreSupra.modelos.PessoaFisica;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import com.MoreSupra.visao.utill.limitaCaracteres;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class telaPessoaFisica extends javax.swing.JFrame {
    
    IPessoaFisicaControle controle = new PessoaFisicaControle();
    

    String end;
    
    
    public telaPessoaFisica() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        jTextField1_identidade.setDocument(new limitaCaracteres(7, limitaCaracteres.tipoEntrada.NUMEROINTEIRO));
        jTextField6_emailFIsica.setDocument(new limitaCaracteres(28, limitaCaracteres.tipoEntrada.EMAIL));
        jTextField2_nomeFisica.setDocument(new limitaCaracteres(32, limitaCaracteres.tipoEntrada.NOME));
        jTextField3_enderecoFisica.setDocument(new limitaCaracteres(28, limitaCaracteres.tipoEntrada.ENDERECO));
        jTextField8_IDFisica.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jButton4_voltar1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField1_identidade = new javax.swing.JTextField();
        jTextField2_nomeFisica = new javax.swing.JTextField();
        jTextField3_enderecoFisica = new javax.swing.JTextField();
        jTextField6_emailFIsica = new javax.swing.JTextField();
        jButton2_incluir = new javax.swing.JButton();
        jButton1_alterar = new javax.swing.JButton();
        jTextField8_IDFisica = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jFormattedTextField1_Telefone = new javax.swing.JFormattedTextField();
        jFormattedTextField1_cpf = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setPreferredSize(new java.awt.Dimension(1460, 710));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4_voltar1.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jButton4_voltar1.setForeground(new java.awt.Color(51, 0, 153));
        jButton4_voltar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/voltar (1).png"))); // NOI18N
        jButton4_voltar1.setText(" VOLTAR");
        jButton4_voltar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton4_voltar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4_voltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_voltar1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4_voltar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 610, 169, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/arrrrr.png"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 190, 120));

        jLabel10.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ENDEREÇO");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 170, 40));

        jLabel13.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CADASTRO PESSOA FÍSICA");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 470, 40));

        jLabel14.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("NOME");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 100, 40));

        jLabel15.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("IDENTIDADE");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 190, 40));

        jLabel16.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("CPF");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 70, 40));

        jLabel17.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("EMAIL");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 100, 40));

        jLabel18.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("TELEFONE");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 170, 40));

        jTextField1_identidade.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jTextField1_identidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel3.add(jTextField1_identidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 220, 40));

        jTextField2_nomeFisica.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jTextField2_nomeFisica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField2_nomeFisica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2_nomeFisicaKeyTyped(evt);
            }
        });
        jPanel3.add(jTextField2_nomeFisica, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 360, 40));

        jTextField3_enderecoFisica.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jTextField3_enderecoFisica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField3_enderecoFisica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3_enderecoFisicaKeyTyped(evt);
            }
        });
        jPanel3.add(jTextField3_enderecoFisica, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 400, 40));

        jTextField6_emailFIsica.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jTextField6_emailFIsica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField6_emailFIsica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6_emailFIsicaKeyTyped(evt);
            }
        });
        jPanel3.add(jTextField6_emailFIsica, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 400, 40));

        jButton2_incluir.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jButton2_incluir.setForeground(new java.awt.Color(51, 0, 153));
        jButton2_incluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/incluirIcone.png"))); // NOI18N
        jButton2_incluir.setText("  INCLUIR");
        jButton2_incluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton2_incluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2_incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_incluirActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2_incluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 200, 169, -1));

        jButton1_alterar.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jButton1_alterar.setForeground(new java.awt.Color(51, 0, 153));
        jButton1_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/alterarIcone.png"))); // NOI18N
        jButton1_alterar.setText("  ALTERAR");
        jButton1_alterar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton1_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_alterarActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1_alterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 240, 169, -1));

        jTextField8_IDFisica.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jTextField8_IDFisica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel3.add(jTextField8_IDFisica, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 70, 40));

        jLabel28.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("ID");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, 40));

        jFormattedTextField1_Telefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        try {
            jFormattedTextField1_Telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)# ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1_Telefone.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jFormattedTextField1_Telefone.setPreferredSize(new java.awt.Dimension(64, 27));
        jPanel3.add(jFormattedTextField1_Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 250, 40));

        jFormattedTextField1_cpf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        try {
            jFormattedTextField1_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1_cpf.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jFormattedTextField1_cpf.setPreferredSize(new java.awt.Dimension(64, 27));
        jPanel3.add(jFormattedTextField1_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 350, 40));

        jLabel4.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/FADETELA.jpg"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1620, 850));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1620, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4_voltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_voltar1ActionPerformed
        // TODO add your handling code here:
        TelaPrincipal princ = new TelaPrincipal();
        princ.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton4_voltar1ActionPerformed

    private void jButton2_incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_incluirActionPerformed
        try {
            
            File arquivo = new File("./src/com/MoreSupra/arquivoDisco/Clientes.txt");
            arquivo.createNewFile();
            PessoaFisica cliente = new PessoaFisica(0, jFormattedTextField1_cpf.getText(), jTextField2_nomeFisica.getText(), 
                    jTextField1_identidade.getText(), jFormattedTextField1_Telefone.getText(), jTextField6_emailFIsica.getText(), 
                    jTextField3_enderecoFisica.getText(), "FÍSICO", "");
            
            controle.incluir(cliente);
            controle.incluirMotorista(cliente);
            
            jTextField1_identidade.setText("");
            jTextField2_nomeFisica.setText("");
            jTextField3_enderecoFisica.setText("");
            jTextField6_emailFIsica.setText("");
            jTextField8_IDFisica.setText("");
            jFormattedTextField1_cpf.setText("");
            jFormattedTextField1_Telefone.setText("");
                    

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }

    }//GEN-LAST:event_jButton2_incluirActionPerformed

    private void jButton1_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_alterarActionPerformed
       

    }//GEN-LAST:event_jButton1_alterarActionPerformed

    
    
    private void jTextField2_nomeFisicaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_nomeFisicaKeyTyped
        char c=evt.getKeyChar();

        if(Character.isLowerCase(c)){
            evt.setKeyChar(Character.toUpperCase(c));
        }
    }//GEN-LAST:event_jTextField2_nomeFisicaKeyTyped

    private void jTextField6_emailFIsicaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6_emailFIsicaKeyTyped

    }//GEN-LAST:event_jTextField6_emailFIsicaKeyTyped

    private void jTextField3_enderecoFisicaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_enderecoFisicaKeyTyped
        char c=evt.getKeyChar();

        if(Character.isLowerCase(c)){
            evt.setKeyChar(Character.toUpperCase(c));
        }
    }//GEN-LAST:event_jTextField3_enderecoFisicaKeyTyped

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
            java.util.logging.Logger.getLogger(telaPessoaFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPessoaFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPessoaFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPessoaFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPessoaFisica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_alterar;
    private javax.swing.JButton jButton2_incluir;
    private javax.swing.JButton jButton4_voltar1;
    private javax.swing.JFormattedTextField jFormattedTextField1_Telefone;
    private javax.swing.JFormattedTextField jFormattedTextField1_cpf;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1_identidade;
    private javax.swing.JTextField jTextField2_nomeFisica;
    private javax.swing.JTextField jTextField3_enderecoFisica;
    private javax.swing.JTextField jTextField6_emailFIsica;
    private javax.swing.JTextField jTextField8_IDFisica;
    // End of variables declaration//GEN-END:variables
}
