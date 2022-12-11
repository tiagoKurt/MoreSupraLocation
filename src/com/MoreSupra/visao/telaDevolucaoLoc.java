/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.MoreSupra.visao;

import ImagensTabela.JTableRenderer;
import com.MoreSupra.Controle.ILocacaoControle;
import com.MoreSupra.Controle.LocacaoControle;
import com.MoreSupra.modelos.Locacao;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pichau
 */
public class telaDevolucaoLoc extends javax.swing.JFrame {

    ILocacaoControle locacaoControle = new LocacaoControle();
    
    
    
    public telaDevolucaoLoc() {
        initComponents();
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

                if(aux.getSituacaoLocacao().equalsIgnoreCase("ANDAMENTO")){
                    locacaoControle.listagemDeLocacao();
                    
                //Incluir nova linha na Tabela,saida[0]
                Object[] dados = {saida[0], saida[1], saida[2], saida[3], saida[4], saida[5], saida[6], saida[7], saida[8], saida[9],
                    saida[10], saida[11], saida[12]};
                model.addRow(dados);
                }
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }

    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jTextField2_nomeMoto = new javax.swing.JTextField();
        jTextField1_precoCat = new javax.swing.JTextField();
        jTextField2_modelo = new javax.swing.JTextField();
        jTextField1_nomeCAT = new javax.swing.JTextField();
        jTextField1_diasCont = new javax.swing.JTextField();
        jTextField1_precoAcesso = new javax.swing.JTextField();
        jTextField1_nomeAcess = new javax.swing.JTextField();
        jTextField2_STATUS = new javax.swing.JTextField();
        jTextField1_idDevolution = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_saidaGeral = new javax.swing.JTable();
        jButton4_voltar = new javax.swing.JButton();
        jButton2_LimparCategoria1 = new javax.swing.JButton();
        jButton2_DEVOLVER = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2_nomeMoto.setFont(new java.awt.Font("Serif", 3, 17)); // NOI18N
        jTextField2_nomeMoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jFrame1.getContentPane().add(jTextField2_nomeMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 340, 30));

        jTextField1_precoCat.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jTextField1_precoCat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jFrame1.getContentPane().add(jTextField1_precoCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 190, 40));

        jTextField2_modelo.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jTextField2_modelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jFrame1.getContentPane().add(jTextField2_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 190, 40));

        jTextField1_nomeCAT.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jTextField1_nomeCAT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jFrame1.getContentPane().add(jTextField1_nomeCAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 190, 40));

        jTextField1_diasCont.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        jTextField1_diasCont.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jFrame1.getContentPane().add(jTextField1_diasCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 70, 50));

        jTextField1_precoAcesso.setFont(new java.awt.Font("Serif", 3, 17)); // NOI18N
        jTextField1_precoAcesso.setText("0");
        jTextField1_precoAcesso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField1_precoAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_precoAcessoActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(jTextField1_precoAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 340, 200, 40));

        jTextField1_nomeAcess.setFont(new java.awt.Font("Serif", 3, 15)); // NOI18N
        jTextField1_nomeAcess.setText("N/A");
        jTextField1_nomeAcess.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jFrame1.getContentPane().add(jTextField1_nomeAcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 270, 200, 40));

        jTextField2_STATUS.setFont(new java.awt.Font("Serif", 3, 17)); // NOI18N
        jTextField2_STATUS.setText("DEVOLVIDO");
        jTextField2_STATUS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jFrame1.getContentPane().add(jTextField2_STATUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 360, 30));
        jFrame1.getContentPane().add(jTextField1_idDevolution, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 70, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/FADETELA.jpg"))); // NOI18N
        jFrame1.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1_saidaGeral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTable1_saidaGeral.setFont(new java.awt.Font("Serif", 3, 16)); // NOI18N
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
            jTable1_saidaGeral.getColumnModel().getColumn(1).setPreferredWidth(120);
            jTable1_saidaGeral.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTable1_saidaGeral.getColumnModel().getColumn(5).setPreferredWidth(55);
            jTable1_saidaGeral.getColumnModel().getColumn(6).setPreferredWidth(110);
            jTable1_saidaGeral.getColumnModel().getColumn(7).setPreferredWidth(50);
            jTable1_saidaGeral.getColumnModel().getColumn(12).setPreferredWidth(130);
            jTable1_saidaGeral.getColumnModel().getColumn(13).setPreferredWidth(0);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 1310, 320));

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
        getContentPane().add(jButton4_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 650, 200, -1));

        jButton2_LimparCategoria1.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jButton2_LimparCategoria1.setForeground(new java.awt.Color(51, 0, 153));
        jButton2_LimparCategoria1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/limpar (1).png"))); // NOI18N
        jButton2_LimparCategoria1.setText("        LIMPAR ");
        jButton2_LimparCategoria1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton2_LimparCategoria1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2_LimparCategoria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_LimparCategoria1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2_LimparCategoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 600, 200, -1));

        jButton2_DEVOLVER.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jButton2_DEVOLVER.setForeground(new java.awt.Color(51, 0, 153));
        jButton2_DEVOLVER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/devolution (1).png"))); // NOI18N
        jButton2_DEVOLVER.setText(" DEVOLUÇÃO");
        jButton2_DEVOLVER.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton2_DEVOLVER.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2_DEVOLVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_DEVOLVERActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2_DEVOLVER, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 550, 200, -1));

        jLabel4.setFont(new java.awt.Font("Serif", 3, 38)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DEVOLUÇÃO DE VEÍCULOS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 500, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/arrrrr.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 190, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/FADETELA.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1_saidaGeralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1_saidaGeralMouseClicked
        jTextField1_idDevolution.setText(jTable1_saidaGeral.getValueAt(jTable1_saidaGeral.getSelectedRow(), 0).toString());
        jTextField2_nomeMoto.setText(jTable1_saidaGeral.getValueAt(jTable1_saidaGeral.getSelectedRow(), 1).toString());
        jTextField2_modelo.setText(jTable1_saidaGeral.getValueAt(jTable1_saidaGeral.getSelectedRow(), 2).toString());
        jTextField1_nomeCAT.setText(jTable1_saidaGeral.getValueAt(jTable1_saidaGeral.getSelectedRow(), 3).toString());
        jTextField1_precoCat.setText(jTable1_saidaGeral.getValueAt(jTable1_saidaGeral.getSelectedRow(), 4).toString());
        jTextField1_diasCont.setText(jTable1_saidaGeral.getValueAt(jTable1_saidaGeral.getSelectedRow(), 5).toString());
        jTextField1_nomeAcess.setText(jTable1_saidaGeral.getValueAt(jTable1_saidaGeral.getSelectedRow(), 6).toString());
        jTextField1_precoAcesso.setText(jTable1_saidaGeral.getValueAt(jTable1_saidaGeral.getSelectedRow(), 7).toString());
        
    }//GEN-LAST:event_jTable1_saidaGeralMouseClicked

    private void jButton4_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_voltarActionPerformed
        // TODO add your handling code here:
        TelaPrincipal principal = new TelaPrincipal();
        principal.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton4_voltarActionPerformed

    private void jButton2_LimparCategoria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_LimparCategoria1ActionPerformed
        
    }//GEN-LAST:event_jButton2_LimparCategoria1ActionPerformed

    private void jButton2_DEVOLVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_DEVOLVERActionPerformed
            
        if(jTable1_saidaGeral.getSelectedRow() != -1){
        try {

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
            
            Date data = new Date();
            
            LocalDate dataAgora = LocalDate.now();
            dataAgora = dataAgora.plusDays(Long.parseLong(jTextField1_diasCont.getText()));
            
            String AgoraFormat = dataAgora.format(formatter);           
            String dataFormatada = formatador.format(data);
            
            
            File arquivo = new File("./src/com/MoreSupra/arquivoDisco/Locacao.txt");
            arquivo.createNewFile();

            float total = ((Float.parseFloat(jTextField1_diasCont.getText()) * Float.parseFloat(jTextField1_precoCat.getText()))
                    + Float.parseFloat(jTextField1_precoAcesso.getText()));

            float cauc = (float) (double) (total * 0.50);

            float total2 = (total + cauc);
            

            Locacao loc = new Locacao(Integer.parseInt(jTextField1_idDevolution.getText()), jTextField2_nomeMoto.getText(), jTextField2_modelo.getText(),
                    jTextField1_nomeCAT.getText(), jTextField1_nomeAcess.getText(),
                    Float.parseFloat(jTextField1_precoAcesso.getText()),
                    dataFormatada,
                    AgoraFormat,
                    Float.parseFloat(jTextField1_precoCat.getText()),
                    cauc,
                    total2,
                    "DEVOLVIDO", Integer.parseInt(jTextField1_diasCont.getText()));

                      locacaoControle.devolver(loc);
                      jTextField2_nomeMoto.setText("");
                      jTextField2_modelo.setText("");
                      jTextField1_precoCat.setText("");
                      jTextField1_nomeCAT.setText("");
                      jTextField1_precoAcesso.setText("0");
                      jTextField1_nomeAcess.setText("N/A");
                      jTextField1_diasCont.setText("");
                      imprimirDados(locacaoControle.listagemDeLocacao());
            
        } catch (IOException ex) {
            Logger.getLogger(telaLocacao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(telaLocacao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else JOptionPane.showMessageDialog(null, "Selecione uma locação para devolvê-la") ;
        
    }//GEN-LAST:event_jButton2_DEVOLVERActionPerformed

    private void jTextField1_precoAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_precoAcessoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_precoAcessoActionPerformed

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
            java.util.logging.Logger.getLogger(telaDevolucaoLoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaDevolucaoLoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaDevolucaoLoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaDevolucaoLoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaDevolucaoLoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2_DEVOLVER;
    private javax.swing.JButton jButton2_LimparCategoria1;
    private javax.swing.JButton jButton4_voltar;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1_saidaGeral;
    private javax.swing.JTextField jTextField1_diasCont;
    private javax.swing.JTextField jTextField1_idDevolution;
    private javax.swing.JTextField jTextField1_nomeAcess;
    private javax.swing.JTextField jTextField1_nomeCAT;
    private javax.swing.JTextField jTextField1_precoAcesso;
    private javax.swing.JTextField jTextField1_precoCat;
    private javax.swing.JTextField jTextField2_STATUS;
    private javax.swing.JTextField jTextField2_modelo;
    private javax.swing.JTextField jTextField2_nomeMoto;
    // End of variables declaration//GEN-END:variables
}
