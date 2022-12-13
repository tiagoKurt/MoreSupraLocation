/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.MoreSupra.visao;

import ImagensTabela.JTableRenderer;
import com.MoreSupra.Controle.IPessoaFisicaControle;
import com.MoreSupra.Controle.PessoaFisicaControle;
import com.MoreSupra.modelos.PessoaFisica;
import com.MoreSupra.modelos.Endereco;
import com.MoreSupra.modelos.PessoaJuridica;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class TelaTabelaClientes extends javax.swing.JFrame {
    
    IPessoaFisicaControle controle = new PessoaFisicaControle();
    
    public TelaTabelaClientes() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        
        try {
            imprimirDadosNaGrid(controle.listagemDePessoas());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_cliente = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton4_voltar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTable1_cliente.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jTable1_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "CPF/CNPJ", "NOME", "IDENTIDADE/RAZÃO S", "TELFONE", "EMAIL", "ENDERECO", "CLIENTE", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1_cliente.setRowHeight(60);
        jTable1_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1_clienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1_cliente);
        if (jTable1_cliente.getColumnModel().getColumnCount() > 0) {
            jTable1_cliente.getColumnModel().getColumn(0).setResizable(false);
            jTable1_cliente.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable1_cliente.getColumnModel().getColumn(1).setPreferredWidth(110);
            jTable1_cliente.getColumnModel().getColumn(2).setPreferredWidth(110);
            jTable1_cliente.getColumnModel().getColumn(3).setPreferredWidth(160);
            jTable1_cliente.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable1_cliente.getColumnModel().getColumn(5).setPreferredWidth(180);
            jTable1_cliente.getColumnModel().getColumn(6).setPreferredWidth(195);
            jTable1_cliente.getColumnModel().getColumn(7).setPreferredWidth(70);
            jTable1_cliente.getColumnModel().getColumn(8).setPreferredWidth(0);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 1140, 360));

        jLabel13.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("RELAÇÃO CADASTRO CLIENTES");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 630, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/arrrrr.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 190, 120));

        jButton4_voltar.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jButton4_voltar.setForeground(new java.awt.Color(51, 0, 153));
        jButton4_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/voltar (1).png"))); // NOI18N
        jButton4_voltar.setText(" VOLTAR");
        jButton4_voltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton4_voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_voltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 640, 169, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/lupa4.0.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 190, 40, 40));

        jTextField1.setFont(new java.awt.Font("Serif", 3, 16)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 380, 40));

        jLabel1.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BUSCAR CLIENTE POR:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, 280, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/fechar.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 190, 40, 40));

        jComboBox1.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOME", "TIPO" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 140, 130, 40));

        jLabel4.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/FADETELA.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1620, 850));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void imprimirDadosNaGrid(ArrayList<PessoaFisica> listaDeCliente) {
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1_cliente.getModel();
            JTableRenderer JtableRenderer = new JTableRenderer();
            jTable1_cliente.getColumnModel().getColumn(8).setCellRenderer(JtableRenderer); 

            //Limpa a tabela 
            model.setNumRows(0);
            Iterator<PessoaFisica> lista = listaDeCliente.iterator();

            while (lista.hasNext()) {
                String[] saida = new String[9];
                PessoaFisica aux = lista.next();
                saida[0] = aux.getId() + "";
                saida[1] = aux.getCpf();
                saida[2] = aux.getNome();
                saida[3] = aux.getIdentidade();
                saida[4] = aux.getTelefone();
                saida[5] = aux.getEmail();
                saida[6] = aux.getEndereco();
                saida[7] = aux.getOqe();
                saida[8] = aux.getAux();

                //Incluir nova linha na Tabela
                Object[] dados = {saida[0], saida[1], saida[2], saida[3], saida[4], saida[5], saida[6], saida[7], saida[8]};
                model.addRow(dados);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }
    
    private void imprimirProcura(ArrayList<PessoaFisica> listaDeCliente) {
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1_cliente.getModel();
            JTableRenderer JtableRenderer = new JTableRenderer();
            jTable1_cliente.getColumnModel().getColumn(8).setCellRenderer(JtableRenderer); 

            //Limpa a tabela 
            model.setNumRows(0);
            Iterator<PessoaFisica> lista = listaDeCliente.iterator();

            while (lista.hasNext()) {
                String[] saida = new String[9];
                PessoaFisica aux = lista.next();
                saida[0] = aux.getId() + "";
                saida[1] = aux.getCpf();
                saida[2] = aux.getNome();
                saida[3] = aux.getIdentidade();
                saida[4] = aux.getTelefone();
                saida[5] = aux.getEmail();
                saida[6] = aux.getEndereco();
                saida[7] = aux.getOqe();
                saida[8] = aux.getAux();

                if(jComboBox1.getSelectedIndex() == 0){
                    if(aux.getNome().equalsIgnoreCase(jTextField1.getText())){
                    controle.listagemDePessoas();
                    Object[] dados = {saida[0], saida[1], saida[2], saida[3], saida[4], saida[5], saida[6], saida[7], saida[8]};
                    model.addRow(dados);
                    }             
                }else if (jComboBox1.getSelectedIndex() == 1){
                    if(aux.getOqe().equalsIgnoreCase(jTextField1.getText())){
                    controle.listagemDePessoas();
                    Object[] dados = {saida[0], saida[1], saida[2], saida[3], saida[4], saida[5], saida[6], saida[7], saida[8]};
                    model.addRow(dados);
                    }
                }
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }
    
    private void jTable1_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1_clienteMouseClicked
    }//GEN-LAST:event_jTable1_clienteMouseClicked

    private void jButton4_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_voltarActionPerformed
        // TODO add your handling code here:
        TelaPrincipal principal = new TelaPrincipal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4_voltarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            imprimirProcura(controle.listagemDePessoas());
            jTextField1.setText("");
        } catch (Exception ex) {
            Logger.getLogger(TelaTabelaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            imprimirDadosNaGrid(controle.listagemDePessoas());
        } catch (Exception ex) {
            Logger.getLogger(TelaTabelaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaTabelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTabelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTabelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTabelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTabelaClientes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4_voltar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1_cliente;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
