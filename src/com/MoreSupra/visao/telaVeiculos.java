/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.MoreSupra.visao;
import com.MoreSupra.enumeration.tipoDoVeiculo;
import com.MoreSupra.enumeration.situacao;
import com.MoreSupra.enumeration.tipoDeCombustivel;
import com.MoreSupra.visao.utill.limitaCaracteres;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class telaVeiculos extends javax.swing.JFrame {

    /**
     * Creates new form telaVeiculos
     */
    public telaVeiculos() {
        initComponents();
        carregarComboBox();      
        jTextField_placa.setDocument(new limitaCaracteres(7, limitaCaracteres.tipoEntrada.PLACA));
        jTextField_renavam.setDocument(new limitaCaracteres(11, limitaCaracteres.tipoEntrada.NUMEROINTEIRO));
        jTextField_precodeCompra.setDocument(new limitaCaracteres(15, limitaCaracteres.tipoEntrada.PRECO));
        jTextField_precoDeVenda.setDocument(new limitaCaracteres(15, limitaCaracteres.tipoEntrada.PRECO));
        jTextField_quilometragem.setDocument(new limitaCaracteres(10, limitaCaracteres.tipoEntrada.PRECO));
        setExtendedState(MAXIMIZED_BOTH);
        jTextField8_idVeiculos.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField8_idVeiculos = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jButton4_voltar = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jTextField_placa = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField_renavam = new javax.swing.JTextField();
        jTextField_precodeCompra = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextField_precoDeVenda = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jComboBox1_combustivel = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        jComboBox1_tipoDoVeiculo = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jTextField_quilometragem = new javax.swing.JTextField();
        jComboBox1_situacao = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jButton1_alterar = new javax.swing.JButton();
        jButton2_incluir = new javax.swing.JButton();
        jButton3_buscar = new javax.swing.JButton();
        jComboBox1_anoFabricacao = new javax.swing.JComboBox<>();
        jComboBox1_AnoModelo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/arrrrr.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 190, 130));

        jLabel11.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CADASTRO DE VEÍCULOS");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 440, 40));

        jTextField8_idVeiculos.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jTextField8_idVeiculos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jTextField8_idVeiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 70, 40));

        jLabel24.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("ID");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, 40));

        jButton4_voltar.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jButton4_voltar.setForeground(new java.awt.Color(51, 0, 153));
        jButton4_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/voltar (1).png"))); // NOI18N
        jButton4_voltar.setText(" VOLTAR");
        jButton4_voltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton4_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_voltarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 640, 169, -1));

        jLabel25.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("COMBUSTÍVEL");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, 40));

        jTextField_placa.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jTextField_placa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jTextField_placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 230, 40));

        jLabel26.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("RENAVAM");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, -1, 40));

        jTextField_renavam.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jTextField_renavam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jTextField_renavam, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 90, 250, 40));

        jTextField_precodeCompra.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jTextField_precodeCompra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jTextField_precodeCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 230, 40));

        jLabel27.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("PREÇO DE COMPRA");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, 40));

        jLabel28.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("ANO FABRICAÇÃO");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, -1, 40));

        jLabel29.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("PREÇO DE VENDA");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, -1, 40));

        jTextField_precoDeVenda.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jTextField_precoDeVenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jTextField_precoDeVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 140, 250, 40));

        jLabel30.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("ANO MODELO");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, 40));

        jComboBox1_combustivel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jComboBox1_combustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_combustivelActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1_combustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 160, 40));

        jLabel31.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("PLACA");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, 40));

        jComboBox1_tipoDoVeiculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jComboBox1_tipoDoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_tipoDoVeiculoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1_tipoDoVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 240, 170, 40));

        jLabel32.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("TIPO DO VEÍCULO");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, -1, 40));

        jLabel33.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("QUILOMETRAGEM");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, 40));

        jTextField_quilometragem.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jTextField_quilometragem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jTextField_quilometragem, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 230, 40));

        jComboBox1_situacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jComboBox1_situacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_situacaoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1_situacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 290, 170, 40));

        jLabel34.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("SITUAÇÃO");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, -1, 40));

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
        jPanel1.add(jButton1_alterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 420, 169, -1));

        jButton2_incluir.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jButton2_incluir.setForeground(new java.awt.Color(51, 0, 153));
        jButton2_incluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/incluirIcone.png"))); // NOI18N
        jButton2_incluir.setText("  INCLUIR");
        jButton2_incluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton2_incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_incluirActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2_incluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 380, 169, -1));

        jButton3_buscar.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jButton3_buscar.setForeground(new java.awt.Color(51, 0, 153));
        jButton3_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/lupa4.0.png"))); // NOI18N
        jButton3_buscar.setText("  BUSCAR");
        jButton3_buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton3_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_buscarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 340, 169, -1));

        jComboBox1_anoFabricacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012" }));
        jComboBox1_anoFabricacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jComboBox1_anoFabricacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_anoFabricacaoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1_anoFabricacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 190, 170, 40));

        jComboBox1_AnoModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012" }));
        jComboBox1_AnoModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jComboBox1_AnoModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_AnoModeloActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1_AnoModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 160, 40));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PLACA", "RENAVAM", "COMPRA", "VENDA", "FABRICAÇÃO", "MODELO", "COMBUSTIVEL", "QUILOMETRAGEM", "TIPO", "SITUAÇÃO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 900, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/FADETELA.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 790));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_voltarActionPerformed
        // TODO add your handling code here:
        TelaPrincipal princ = new TelaPrincipal();
        princ.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton4_voltarActionPerformed

    private void jComboBox1_combustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_combustivelActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_jComboBox1_combustivelActionPerformed

    private void jComboBox1_tipoDoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_tipoDoVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1_tipoDoVeiculoActionPerformed

    private void jComboBox1_situacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_situacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1_situacaoActionPerformed

    private void jButton1_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_alterarActionPerformed
        // TODO add your handling code here:
        try {
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButton1_alterarActionPerformed

    private void jButton2_incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_incluirActionPerformed
        // TODO add your handling code here:
        try {
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButton2_incluirActionPerformed

    private void jButton3_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_buscarActionPerformed
        // TODO add your handling code here:
        try {
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }//GEN-LAST:event_jButton3_buscarActionPerformed

    private void jComboBox1_anoFabricacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_anoFabricacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1_anoFabricacaoActionPerformed

    private void jComboBox1_AnoModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_AnoModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1_AnoModeloActionPerformed

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
            java.util.logging.Logger.getLogger(telaVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaVeiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_alterar;
    private javax.swing.JButton jButton2_incluir;
    private javax.swing.JButton jButton3_buscar;
    private javax.swing.JButton jButton4_voltar;
    private javax.swing.JComboBox<String> jComboBox1_AnoModelo;
    private javax.swing.JComboBox<String> jComboBox1_anoFabricacao;
    private javax.swing.JComboBox<tipoDeCombustivel> jComboBox1_combustivel;
    private javax.swing.JComboBox<situacao> jComboBox1_situacao;
    private javax.swing.JComboBox<tipoDoVeiculo> jComboBox1_tipoDoVeiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField8_idVeiculos;
    private javax.swing.JTextField jTextField_placa;
    private javax.swing.JTextField jTextField_precoDeVenda;
    private javax.swing.JTextField jTextField_precodeCompra;
    private javax.swing.JTextField jTextField_quilometragem;
    private javax.swing.JTextField jTextField_renavam;
    // End of variables declaration//GEN-END:variables

    private void carregarComboBox() {
        jComboBox1_situacao.setModel(new DefaultComboBoxModel<>(situacao.values()));
        jComboBox1_tipoDoVeiculo.setModel(new DefaultComboBoxModel<>(tipoDoVeiculo.values()));
        jComboBox1_combustivel.setModel(new DefaultComboBoxModel<>(tipoDeCombustivel.values()));
        }
}
