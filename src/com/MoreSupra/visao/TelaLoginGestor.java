package com.MoreSupra.visao;

import com.MoreSupra.Controle.CadastroControle;
import com.MoreSupra.Controle.ICadastroControle;
import com.MoreSupra.Controle.LoginCadastro;
import com.MoreSupra.visao.TelaTabelaClientes;
import com.MoreSupra.visao.utill.limitaCaracteres;
import java.awt.Dimension;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLoginGestor extends javax.swing.JFrame {

    
    ICadastroControle controle = new CadastroControle();
    
    private final LoginCadastro autenticador;
    
    
     
    public TelaLoginGestor() {
        initComponents();
        
        autenticador = new LoginCadastro(this);
        
        
        setExtendedState(MAXIMIZED_BOTH);
        jTextField2_Senha.setDocument(new limitaCaracteres(20, limitaCaracteres.tipoEntrada.DESCRICAO));
        jPasswordField1.setDocument(new limitaCaracteres(20, limitaCaracteres.tipoEntrada.DESCRICAO));
        
        jDialog1.setSize(700, 490);
        jDialog1.setLocationRelativeTo(null);
        jDialog1.setTitle("ajudinha");
        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        jDialog1.setResizable(false);
        
        try {
            controle.listagemDeCadastro();
        } catch (Exception ex) {
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jDialog1 = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2_Confimar1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2_Senha = new javax.swing.JTextField();
        jTextField2_Login = new javax.swing.JTextField();
        jButton2_Voltar = new javax.swing.JButton();
        jButton_Logar = new javax.swing.JButton();
        jButton2_Ajuda = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2_verSenha = new javax.swing.JButton();
        jButton2_esconderSenha = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton2_cadastrrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jFrame1.setName("Ajudinha"); // NOI18N
        jFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/FADETELA.jpg"))); // NOI18N
        jFrame1.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 440));

        jDialog1.setUndecorated(true);
        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Serif", 3, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("OU REALIZE O CADASTRO");
        jDialog1.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 280, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/arrrrr.png"))); // NOI18N
        jDialog1.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 140));

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
        jLabel15.setText("DIGITE O LOGIN E A SENHA FORNECIDOS PELOS GESTORES");
        jDialog1.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 660, 50));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/FADETELA.jpg"))); // NOI18N
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 4));
        jDialog1.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 490));
        jLabel2.setSize(500, 500);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Serif", 3, 38)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LOGIN");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 120, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/arrrrr.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 140));

        jLabel6.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("LOGIN");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 100, -1));

        jLabel7.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SENHA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 110, -1));

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
        getContentPane().add(jTextField2_Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 0, 0));

        jTextField2_Login.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jTextField2_Login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField2_Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2_LoginKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField2_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, 270, 40));

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
        getContentPane().add(jButton2_Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 560, 169, -1));

        jButton_Logar.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        jButton_Logar.setForeground(new java.awt.Color(51, 0, 153));
        jButton_Logar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/pessoaFisica.png"))); // NOI18N
        jButton_Logar.setText(" LOGAR");
        jButton_Logar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton_Logar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LogarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Logar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 300, 169, 40));

        jButton2_Ajuda.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        jButton2_Ajuda.setForeground(new java.awt.Color(51, 0, 153));
        jButton2_Ajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/ponto-de-interrogacao.png"))); // NOI18N
        jButton2_Ajuda.setText(" AJUDA");
        jButton2_Ajuda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton2_Ajuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2_Ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_AjudaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2_Ajuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 350, 169, 40));

        jPasswordField1.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 270, 40));

        jButton2_verSenha.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jButton2_verSenha.setForeground(new java.awt.Color(51, 0, 153));
        jButton2_verSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/visualizarSenha.png"))); // NOI18N
        jButton2_verSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton2_verSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2_verSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_verSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2_verSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 350, 40, 40));

        jButton2_esconderSenha.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jButton2_esconderSenha.setForeground(new java.awt.Color(51, 0, 153));
        jButton2_esconderSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/visualiza.png"))); // NOI18N
        jButton2_esconderSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton2_esconderSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2_esconderSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_esconderSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2_esconderSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 350, 0, 0));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/GIFLOGIN7777.gif"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 470, 340));

        jButton2_cadastrrar.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        jButton2_cadastrrar.setForeground(new java.awt.Color(51, 0, 153));
        jButton2_cadastrrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/cadastro (1).png"))); // NOI18N
        jButton2_cadastrrar.setText("CADASTRAR");
        jButton2_cadastrrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton2_cadastrrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2_cadastrrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_cadastrrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2_cadastrrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 220, 40));

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

    private void jTextField2_SenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_SenhaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_SenhaKeyTyped

    private void jTextField2_LoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_LoginKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_LoginKeyTyped

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1AncestorAdded

    private void jTextField2_SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_SenhaActionPerformed
        
    }//GEN-LAST:event_jTextField2_SenhaActionPerformed

    private void jButton2_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_VoltarActionPerformed
        // TODO add your handling code here:
        TelaPrincipal princ = new TelaPrincipal();
        princ.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2_VoltarActionPerformed

    private void jButton_LogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LogarActionPerformed
        try {
            // TODO add your handling code here:
            
        
            
            autenticador.autenticar();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(TelaLoginGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton_LogarActionPerformed

    private void jButton2_AjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_AjudaActionPerformed
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton2_AjudaActionPerformed

    private void jButton2_verSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_verSenhaActionPerformed
        jTextField2_Senha.setText(jPasswordField1.getText());
        jPasswordField1.setSize(0, 0);
        jTextField2_Senha.setSize(270, 40);
        jButton2_verSenha.setSize(0, 0);
        jButton2_esconderSenha.setSize(40, 40);
    }//GEN-LAST:event_jButton2_verSenhaActionPerformed

    private void jButton2_esconderSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_esconderSenhaActionPerformed
        jPasswordField1.setText(jTextField2_Senha.getText());
        jTextField2_Senha.setSize(0, 0);
        jPasswordField1.setSize(270, 40);
        jButton2_esconderSenha.setSize(0, 0);
        jButton2_verSenha.setSize(40, 40);
    }//GEN-LAST:event_jButton2_esconderSenhaActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton2_Confimar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_Confimar1ActionPerformed
        jDialog1.dispose();
    }//GEN-LAST:event_jButton2_Confimar1ActionPerformed

    private void jButton2_cadastrrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_cadastrrarActionPerformed
        TelaCadastroGESTORES tel = new TelaCadastroGESTORES();
        tel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2_cadastrrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLoginGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoginGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoginGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoginGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLoginGestor().setVisible(true);
            }
        });
    }

    public JPasswordField getjPasswordField1() {
        return jPasswordField1;
    }

    public void setjPasswordField1(JPasswordField jPasswordField1) {
        this.jPasswordField1 = jPasswordField1;
    }

    public JTextField getjTextField2_Login() {
        return jTextField2_Login;
    }

    public void setjTextField2_Login(JTextField jTextField2_Login) {
        this.jTextField2_Login = jTextField2_Login;
    }

    public JTextField getjTextField2_Senha() {
        return jTextField2_Senha;
    }

    public void setjTextField2_Senha(JTextField jTextField2_Senha) {
        this.jTextField2_Senha = jTextField2_Senha;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2_Ajuda;
    private javax.swing.JButton jButton2_Confimar1;
    private javax.swing.JButton jButton2_Voltar;
    private javax.swing.JButton jButton2_cadastrrar;
    private javax.swing.JButton jButton2_esconderSenha;
    private javax.swing.JButton jButton2_verSenha;
    private javax.swing.JButton jButton_Logar;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2_Login;
    private javax.swing.JTextField jTextField2_Senha;
    // End of variables declaration//GEN-END:variables
}
