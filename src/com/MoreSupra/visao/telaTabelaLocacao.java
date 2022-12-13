/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.MoreSupra.visao;

import ImagensTabela.JTableRenderer;
import com.MoreSupra.Controle.ILocacaoControle;
import com.MoreSupra.Controle.LocacaoControle;
import com.MoreSupra.modelos.Locacao;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pichau
 */
public class telaTabelaLocacao extends javax.swing.JFrame {

    ILocacaoControle locacaoControle = new LocacaoControle();
    
    
    public telaTabelaLocacao() {
        initComponents();
        
        jComboBox2.setVisible(false);
        jComboBox3.setVisible(false);
        
        
        setExtendedState(MAXIMIZED_BOTH);
        
        try {
            imprimirDados(locacaoControle.listagemDeLocacao());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }

    
    
    public void imprimirDados(ArrayList<Locacao> listaDeLocacao) {
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1_saidaGeral.getModel();
            JTableRenderer JtableRenderer = new JTableRenderer();
            jTable1_saidaGeral.getColumnModel().getColumn(13).setCellRenderer(JtableRenderer);

            //Limpa a tabela 
            model.setNumRows(0);
            Iterator<Locacao> lista = listaDeLocacao.iterator();
            while (lista.hasNext()) {
                String[] saida = new String[13];
                Locacao aux = lista.next();
                saida[0] = aux.getId() + "";
                saida[1] = aux.getNomeMot();
                saida[2] = aux.getNomeVei() + "";
                saida[3] = aux.getCategoria();
                saida[4] = aux.getValorDiaria() + "";
                saida[5] = aux.getDias() + "";
                saida[6] = aux.getAcessorio();
                saida[7] = aux.getValorAcessorio() + "";
                saida[8] = aux.getDataLocacao();
                saida[9] = aux.getDataDevolucao();
                saida[10] = aux.getValorCalcao() + "";
                saida[11] = aux.getTotal() + "";
                saida[12] = aux.getSituacaoLocacao();

                
                
                //Incluir nova linha na Tabela,saida[0]
                Object[] dados = {saida[0], saida[1], saida[2], saida[3], saida[4], saida[5], saida[6], saida[7], saida[8], saida[9],
                    saida[10], saida[11], saida[12]};
                model.addRow(dados);
                
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }
    
    public void procurados(ArrayList<Locacao> listaDeLocacao) {
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1_saidaGeral.getModel();
            JTableRenderer JtableRenderer = new JTableRenderer();
            jTable1_saidaGeral.getColumnModel().getColumn(13).setCellRenderer(JtableRenderer);

            //Limpa a tabela 
            model.setNumRows(0);
            Iterator<Locacao> lista = listaDeLocacao.iterator();
            while (lista.hasNext()) {
                String[] saida = new String[13];
                Locacao aux = lista.next();
                saida[0] = aux.getId() + "";
                saida[1] = aux.getNomeMot();
                saida[2] = aux.getNomeVei() + "";
                saida[3] = aux.getCategoria();
                saida[4] = aux.getValorDiaria() + "";
                saida[5] = aux.getDias() + "";
                saida[6] = aux.getAcessorio();
                saida[7] = aux.getValorAcessorio() + "";
                saida[8] = aux.getDataLocacao();
                saida[9] = aux.getDataDevolucao();
                saida[10] = aux.getValorCalcao() + "";
                saida[11] = aux.getTotal() + "";
                saida[12] = aux.getSituacaoLocacao();

                if(jComboBox1.getSelectedIndex() == 0){
                   if(aux.getNomeMot().equalsIgnoreCase(jTextField1.getText())){
                       locacaoControle.listagemDeLocacao();
                       Object[] dados = {saida[0], saida[1], saida[2], saida[3], saida[4], saida[5], saida[6], saida[7], saida[8], saida[9],
                       saida[10], saida[11], saida[12]};
                       model.addRow(dados);
                   }
                }else if (jComboBox1.getSelectedIndex() == 1){
                    if(aux.getCategoria().equalsIgnoreCase(jTextField1.getText())){
                       locacaoControle.listagemDeLocacao();
                       Object[] dados = {saida[0], saida[1], saida[2], saida[3], saida[4], saida[5], saida[6], saida[7], saida[8], saida[9],
                       saida[10], saida[11], saida[12]};
                       model.addRow(dados);
                    } 
                } else if (jComboBox1.getSelectedIndex() == 2){
                    if(aux.getSituacaoLocacao().equalsIgnoreCase(jTextField1.getText())){
                       locacaoControle.listagemDeLocacao();
                       Object[] dados = {saida[0], saida[1], saida[2], saida[3], saida[4], saida[5], saida[6], saida[7], saida[8], saida[9],
                       saida[10], saida[11], saida[12]};
                       model.addRow(dados);
                    }
                }
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4_voltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_saidaGeral = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4_voltar.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jButton4_voltar.setForeground(new java.awt.Color(51, 0, 153));
        jButton4_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/voltar (1).png"))); // NOI18N
        jButton4_voltar.setText("        VOLTAR");
        jButton4_voltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton4_voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_voltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 630, 200, -1));

        jTable1_saidaGeral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTable1_saidaGeral.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jTable1_saidaGeral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "VEÍCULO", "CAT", "R$ DIÁRIA ", "DIAS", "ACESSÓRIO", "R$ ACES", "RETIRADA", "ENTREGA", "CAUÇÃO", "TOTAL", "SITUAÇÃO", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1_saidaGeral.setRowHeight(50);
        jTable1_saidaGeral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1_saidaGeralMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1_saidaGeral);
        if (jTable1_saidaGeral.getColumnModel().getColumnCount() > 0) {
            jTable1_saidaGeral.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1_saidaGeral.getColumnModel().getColumn(1).setPreferredWidth(110);
            jTable1_saidaGeral.getColumnModel().getColumn(4).setPreferredWidth(60);
            jTable1_saidaGeral.getColumnModel().getColumn(5).setPreferredWidth(40);
            jTable1_saidaGeral.getColumnModel().getColumn(7).setPreferredWidth(50);
            jTable1_saidaGeral.getColumnModel().getColumn(12).setPreferredWidth(110);
            jTable1_saidaGeral.getColumnModel().getColumn(13).setPreferredWidth(0);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 1160, 320));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/arrrrr.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 190, 130));

        jLabel4.setFont(new java.awt.Font("Serif", 3, 38)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("RELAÇÃO DE LOCAÇÕES");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 510, 60));

        jTextField1.setFont(new java.awt.Font("Serif", 3, 16)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, 260, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/lupa4.0.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 190, 40, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/fechar.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 190, 40, 40));

        jLabel2.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BUSCAR POR:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 160, 30));

        jComboBox1.setFont(new java.awt.Font("Serif", 3, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOME", "CATEGORIA", "STATUS" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, 140, 50));

        jComboBox2.setFont(new java.awt.Font("Serif", 3, 16)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "⠀⠀⠀⠀⠀", "ANDAMENTO", "DEVOLVIDO", "CANCELADO" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 130, 150, 50));

        jComboBox3.setFont(new java.awt.Font("Serif", 3, 16)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "⠀⠀⠀⠀⠀", "SEDAN", "SUV", "PICKUP", "HATCH" }));
        jComboBox3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 130, 150, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/FADETELA.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_voltarActionPerformed
        // TODO add your handling code here:
        TelaPrincipal principal = new TelaPrincipal();
        principal.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton4_voltarActionPerformed

    private void jTable1_saidaGeralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1_saidaGeralMouseClicked

    }//GEN-LAST:event_jTable1_saidaGeralMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            procurados(locacaoControle.listagemDeLocacao());
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(telaTabelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            jTextField1.setText("");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jComboBox1.setSelectedIndex(0);
        jComboBox3.setVisible(false);
        jComboBox2.setVisible(false);
        jTextField1.setEnabled(true);
        jTextField1.setVisible(true);
        try {
            imprimirDados(locacaoControle.listagemDeLocacao());
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(telaTabelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
        if(jComboBox1.getSelectedIndex() == 2){
            jTextField1.setEnabled(false);
            jComboBox2.setVisible(true);
            jTextField1.setVisible(false);
            jComboBox3.setVisible(false);
          
        } else if(jComboBox1.getSelectedIndex() ==1){
            jTextField1.setEnabled(false);
            jComboBox3.setVisible(true);
            jTextField1.setVisible(false);
            jComboBox2.setVisible(false);
        }else{
            jTextField1.setEnabled(true);
            jComboBox2.setVisible(false);
            jTextField1.setVisible(true);
            jComboBox3.setVisible(false);
        }
      
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
            jComboBox3.setVisible(false);
        
            
            if(jComboBox2.getSelectedIndex() == 0){
                try {
            imprimirDados(locacaoControle.listagemDeLocacao());
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(telaTabelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            }else if(jComboBox2.getSelectedIndex() == 1){
            jTextField1.setText("ANDAMENTO");
                try {
            procurados(locacaoControle.listagemDeLocacao());
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(telaTabelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            jTextField1.setText("");
            }else if(jComboBox2.getSelectedIndex() == 2){
                jTextField1.setText("DEVOLVIDO");
                try {
            procurados(locacaoControle.listagemDeLocacao());
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(telaTabelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            jTextField1.setText("");
            }else if (jComboBox2.getSelectedIndex() == 3){
                jTextField1.setText("CANCELADO");
                try {
            procurados(locacaoControle.listagemDeLocacao());
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(telaTabelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            jTextField1.setText("");
        }       
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed

        if(jComboBox3.getSelectedIndex() == 1){
            
            jTextField1.setText("SEDAN");
                try {
            procurados(locacaoControle.listagemDeLocacao());
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(telaTabelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            jTextField1.setText("");
            }else if(jComboBox3.getSelectedIndex() == 2){
                jTextField1.setText("SUV");
                try {
            procurados(locacaoControle.listagemDeLocacao());
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(telaTabelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            jTextField1.setText("");
            }else if (jComboBox3.getSelectedIndex() == 3){
                jTextField1.setText("PICKUP");
                try {
            procurados(locacaoControle.listagemDeLocacao());
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(telaTabelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            jTextField1.setText("");
        }else if (jComboBox3.getSelectedIndex() == 4){
                jTextField1.setText("HATCH");
                try {
            procurados(locacaoControle.listagemDeLocacao());
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(telaTabelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            jTextField1.setText("");
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

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
            java.util.logging.Logger.getLogger(telaTabelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaTabelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaTabelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaTabelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaTabelaLocacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4_voltar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1_saidaGeral;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
