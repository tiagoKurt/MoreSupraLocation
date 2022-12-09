/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.MoreSupra.visao;

import ImagensTabela.JTableRenderer;
import com.MoreSupra.Controle.AcessoriosControle;
import com.MoreSupra.Controle.CategoriasControle;
import com.MoreSupra.Controle.IAcessoriosControle;
import com.MoreSupra.Controle.ICategoriasControle;
import com.MoreSupra.Controle.ILocacaoControle;
import com.MoreSupra.Controle.IModelosControle;
import com.MoreSupra.Controle.IMotoristaControle;
import com.MoreSupra.Controle.LocacaoControle;
import com.MoreSupra.Controle.ModelosControle;
import com.MoreSupra.Controle.MotoristaControle;
import com.MoreSupra.modelos.Acessorios;
import com.MoreSupra.modelos.Categoria;
import com.MoreSupra.modelos.Locacao;
import com.MoreSupra.modelos.Modelos;
import com.MoreSupra.modelos.Motorista;
import com.MoreSupra.visao.utill.limitaCaracteres;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;

/**
 *
 * @author Pichau
 */
public class telaLocacao extends javax.swing.JFrame {

    IModelosControle modeloControle = new ModelosControle();
    ICategoriasControle categoriaControle = new CategoriasControle();
    IMotoristaControle motoristaControle = new MotoristaControle();
    IAcessoriosControle acessoriosControle = new AcessoriosControle();
    ILocacaoControle locacaoControle = new LocacaoControle();

    public telaLocacao() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);

        jTextField2_modelo.setEnabled(false);
        jTextField1_cnhMoto.setEnabled(false);
        jTextField2_nomeMoto.setEnabled(false);
        jTextField1_nomeCAT.setEnabled(false);
        jTextField1_precoCat.setEnabled(false);
        jTextField1_precoAcesso.setEnabled(false);
        jTextField1_nomeAcess.setEnabled(false);

        jLabel17_anos.setVisible(false);
        jLabel17_meses.setVisible(false);

        jTextField1_diasCont.setDocument(new limitaCaracteres(5, limitaCaracteres.tipoEntrada.NUMEROINTEIRO));
        jTextField1_mesesCont.setDocument(new limitaCaracteres(2, limitaCaracteres.tipoEntrada.NUMEROINTEIRO));
        jTextField1_AnosCont.setDocument(new limitaCaracteres(1, limitaCaracteres.tipoEntrada.NUMEROINTEIRO));

        try {
            imprimirModelo(modeloControle.listagemModelos());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        try {
            imprimirCat(categoriaControle.listagemDeCategorias());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        try {
            imprimirMot(motoristaControle.listagemDeMotorista());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        try {
            imprimirAce(acessoriosControle.listagemDeAcessorios());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        try {
            imprimirDados(locacaoControle.listagemDeLocacao());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_saidaGeral = new javax.swing.JTable();
        jButton4_voltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2_motorista = new javax.swing.JTable();
        jTextField1_cnhMoto = new javax.swing.JTextField();
        jTextField2_nomeMoto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3_VEICULOS = new javax.swing.JTable();
        jTextField1_precoCat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2_modelo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4_categorias = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2_lOCAR = new javax.swing.JButton();
        jButton1_Cancelar = new javax.swing.JButton();
        jButton1_Devolveer = new javax.swing.JButton();
        jButton1_LimparVeiculos = new javax.swing.JButton();
        jTextField1_nomeCAT = new javax.swing.JTextField();
        jButton2_LimparCategoria = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2_LimparMotorista = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboBox1_dias = new javax.swing.JComboBox<>();
        jLabel17_dias = new javax.swing.JLabel();
        jLabel17_meses = new javax.swing.JLabel();
        jLabel17_anos = new javax.swing.JLabel();
        jTextField1_diasCont = new javax.swing.JTextField();
        jTextField1_mesesCont = new javax.swing.JTextField();
        jTextField1_AnosCont = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField1_precoAcesso = new javax.swing.JTextField();
        jTextField1_nomeAcess = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1_acessorios = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/arrrrr.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 110, 190, 130));

        jLabel4.setFont(new java.awt.Font("Serif", 3, 38)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LOCAÇÃO DE VEÍCULOS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 50, 460, 60));

        jTable1_saidaGeral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTable1_saidaGeral.setFont(new java.awt.Font("Serif", 3, 16)); // NOI18N
        jTable1_saidaGeral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "CNH", "VEÍCULO", "CAT", "ACESSÓRIO", "RETIRADA", "ENTREGA", "DIÁRIA ", "CAUÇÃO", "TOTAL", "SITUAÇÃO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
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
            jTable1_saidaGeral.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 960, 320));

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
        getContentPane().add(jButton4_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 650, 210, -1));

        jLabel2.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CNH");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 60, 40));

        jTable2_motorista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTable2_motorista.setFont(new java.awt.Font("Serif", 3, 16)); // NOI18N
        jTable2_motorista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "CNH", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2_motorista.setRowHeight(50);
        jTable2_motorista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2_motoristaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2_motorista);
        if (jTable2_motorista.getColumnModel().getColumnCount() > 0) {
            jTable2_motorista.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable2_motorista.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable2_motorista.getColumnModel().getColumn(2).setResizable(false);
            jTable2_motorista.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTable2_motorista.getColumnModel().getColumn(3).setPreferredWidth(0);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 240, 130));

        jTextField1_cnhMoto.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jTextField1_cnhMoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jTextField1_cnhMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 190, 30));

        jTextField2_nomeMoto.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jTextField2_nomeMoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jTextField2_nomeMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 190, 30));

        jLabel5.setFont(new java.awt.Font("Serif", 3, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MOTORISTA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 160, 30));

        jLabel6.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NOME");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 160, 40));

        jTable3_VEICULOS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTable3_VEICULOS.setFont(new java.awt.Font("Serif", 3, 16)); // NOI18N
        jTable3_VEICULOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "MODELO", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3_VEICULOS.setRowHeight(50);
        jTable3_VEICULOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3_VEICULOSMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3_VEICULOS);
        if (jTable3_VEICULOS.getColumnModel().getColumnCount() > 0) {
            jTable3_VEICULOS.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable3_VEICULOS.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable3_VEICULOS.getColumnModel().getColumn(2).setPreferredWidth(0);
            jTable3_VEICULOS.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 260, 130));

        jTextField1_precoCat.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jTextField1_precoCat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jTextField1_precoCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 350, 190, 30));

        jLabel7.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CATÉGORIA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 150, 20));

        jTextField2_modelo.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jTextField2_modelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jTextField2_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 190, 30));

        jLabel8.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("MODELO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 90, 30));

        jLabel9.setFont(new java.awt.Font("Serif", 3, 26)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ACESSÓRIO");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 230, 150, 20));

        jTable4_categorias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTable4_categorias.setFont(new java.awt.Font("Serif", 3, 16)); // NOI18N
        jTable4_categorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "CAT", "PREÇO", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4_categorias.setRowHeight(50);
        jTable4_categorias.getTableHeader().setReorderingAllowed(false);
        jTable4_categorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4_categoriasMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4_categorias);
        if (jTable4_categorias.getColumnModel().getColumnCount() > 0) {
            jTable4_categorias.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable4_categorias.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable4_categorias.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTable4_categorias.getColumnModel().getColumn(3).setResizable(false);
            jTable4_categorias.getColumnModel().getColumn(3).setPreferredWidth(120);
            jTable4_categorias.getColumnModel().getColumn(4).setPreferredWidth(200);
        }

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 250, 130));

        jLabel12.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PREÇO DIÁRIA");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 150, 20));

        jLabel10.setFont(new java.awt.Font("Serif", 3, 26)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CATEGORIA");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 160, 30));

        jButton2_lOCAR.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jButton2_lOCAR.setForeground(new java.awt.Color(51, 0, 153));
        jButton2_lOCAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/adicionar-produto (1).png"))); // NOI18N
        jButton2_lOCAR.setText("         LOCAR");
        jButton2_lOCAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton2_lOCAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2_lOCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_lOCARActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2_lOCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 420, 200, -1));

        jButton1_Cancelar.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jButton1_Cancelar.setForeground(new java.awt.Color(51, 0, 153));
        jButton1_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/caixacancelar (1).png"))); // NOI18N
        jButton1_Cancelar.setText(" CANCELAR");
        jButton1_Cancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton1_Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 500, 200, -1));

        jButton1_Devolveer.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jButton1_Devolveer.setForeground(new java.awt.Color(51, 0, 153));
        jButton1_Devolveer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/devolution (1).png"))); // NOI18N
        jButton1_Devolveer.setText(" DEVOLVER");
        jButton1_Devolveer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton1_Devolveer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1_Devolveer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_DevolveerActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_Devolveer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 460, 200, -1));

        jButton1_LimparVeiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/limpar (1).png"))); // NOI18N
        jButton1_LimparVeiculos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton1_LimparVeiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1_LimparVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_LimparVeiculosActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_LimparVeiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 170, -1, -1));

        jTextField1_nomeCAT.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jTextField1_nomeCAT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jTextField1_nomeCAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, 190, 30));

        jButton2_LimparCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/limpar (1).png"))); // NOI18N
        jButton2_LimparCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton2_LimparCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2_LimparCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_LimparCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2_LimparCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 230, -1, -1));

        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 470, 170));

        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 470, 170));

        jButton2_LimparMotorista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/limpar (1).png"))); // NOI18N
        jButton2_LimparMotorista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton2_LimparMotorista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2_LimparMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_LimparMotoristaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2_LimparMotorista, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 450, 170));

        jLabel16.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("LOCAÇÃO SERÁ POR :");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jComboBox1_dias.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        jComboBox1_dias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DIAS", "MESES", "ANOS" }));
        jComboBox1_dias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jComboBox1_dias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1_dias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_diasActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1_dias, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 140, 40));

        jLabel17_dias.setFont(new java.awt.Font("Serif", 3, 22)); // NOI18N
        jLabel17_dias.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17_dias.setText("QUANTOS DIAS?");
        getContentPane().add(jLabel17_dias, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 180, 30));

        jLabel17_meses.setFont(new java.awt.Font("Serif", 3, 22)); // NOI18N
        jLabel17_meses.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17_meses.setText("QUANTOS MESES?");
        getContentPane().add(jLabel17_meses, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 200, 30));

        jLabel17_anos.setFont(new java.awt.Font("Serif", 3, 22)); // NOI18N
        jLabel17_anos.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17_anos.setText("QUANTOS ANOS?");
        getContentPane().add(jLabel17_anos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 180, 30));

        jTextField1_diasCont.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        jTextField1_diasCont.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jTextField1_diasCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 70, 50));

        jTextField1_mesesCont.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        jTextField1_mesesCont.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jTextField1_mesesCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 70, 50));

        jTextField1_AnosCont.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        jTextField1_AnosCont.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jTextField1_AnosCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 70, 50));

        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 450, 170));

        jLabel18.setFont(new java.awt.Font("Serif", 3, 26)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("VEÍCULO");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 150, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/limpar (1).png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 230, -1, -1));

        jLabel19.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("PREÇO");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 320, 70, 30));

        jLabel20.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("ACESSÓRIO");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 250, 120, 30));

        jTextField1_precoAcesso.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jTextField1_precoAcesso.setText("0");
        jTextField1_precoAcesso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField1_precoAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_precoAcessoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1_precoAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 350, 200, 30));

        jTextField1_nomeAcess.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jTextField1_nomeAcess.setText("N/A");
        jTextField1_nomeAcess.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jTextField1_nomeAcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 280, 200, 30));

        jTable1_acessorios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTable1_acessorios.setFont(new java.awt.Font("Serif", 3, 16)); // NOI18N
        jTable1_acessorios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "ACES", "PREÇO", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1_acessorios.setRowHeight(50);
        jTable1_acessorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1_acessoriosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable1_acessorios);
        if (jTable1_acessorios.getColumnModel().getColumnCount() > 0) {
            jTable1_acessorios.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable1_acessorios.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1_acessorios.getColumnModel().getColumn(3).setPreferredWidth(0);
            jTable1_acessorios.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 260, 250, 130));

        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 220, 470, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/FADETELA.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void imprimirDados(ArrayList<Locacao> listaDeLocacao) {
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1_saidaGeral.getModel();
            JTableRenderer JtableRenderer = new JTableRenderer();
            jTable1_saidaGeral.getColumnModel().getColumn(11).setCellRenderer(JtableRenderer);

            //Limpa a tabela 
            model.setNumRows(0);
            Iterator<Locacao> lista = listaDeLocacao.iterator();
            while (lista.hasNext()) {
                String[] saida = new String[13];
                Locacao aux = lista.next();
                saida[0] = aux.getId() + "";
                saida[1] = aux.getNomeMot();
                saida[2] = aux.getCnh();
                saida[3] = aux.getNomeVei() + "";
                saida[4] = aux.getCategoria();
                saida[5] = aux.getAcessorio();
                saida[6] = aux.getDataLocacao();
                saida[7] = aux.getDataDevolucao();
                saida[8] = aux.getValorDiaria() + "";
                saida[9] = aux.getValorCalcao() + "";
                saida[10] = aux.getTotal() + "";
                saida[11] = aux.getSituacaoLocacao();

                //Incluir nova linha na Tabela,saida[0]
                Object[] dados = {saida[0], saida[1], saida[2], saida[3], saida[4], saida[5], saida[6], saida[7], saida[8], saida[9],
                    saida[10], saida[11]};
                model.addRow(dados);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }

    }

    private void imprimirModelo(ArrayList<Modelos> listaDeCliente) {
        try {
            DefaultTableModel model = (DefaultTableModel) jTable3_VEICULOS.getModel();
            JTableRenderer JtableRenderer = new JTableRenderer();
            jTable3_VEICULOS.getColumnModel().getColumn(3).setCellRenderer(JtableRenderer);

            //Limpa a tabela 
            model.setNumRows(0);
            Iterator<Modelos> lista = listaDeCliente.iterator();

            while (lista.hasNext()) {
                String[] saida = new String[3];
                Modelos aux = lista.next();

                saida[0] = aux.getId() + "";
                saida[1] = aux.getDescricao();
                saida[2] = aux.getUrl();
                ImageIcon iconlogo = new ImageIcon((aux.getUrl()));

                //Incluir nova linha na Tabela
                Object[] dados = {saida[0], saida[1], iconlogo};
                model.addRow(dados);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }

    private void imprimirCat(ArrayList<Categoria> listaDeCliente) {
        try {
            DefaultTableModel model = (DefaultTableModel) jTable4_categorias.getModel();
            JTableRenderer JtableRenderer = new JTableRenderer();
            jTable4_categorias.getColumnModel().getColumn(4).setCellRenderer(JtableRenderer);

            //Limpa a tabela 
            model.setNumRows(0);
            Iterator<Categoria> lista = listaDeCliente.iterator();

            while (lista.hasNext()) {
                String[] saida = new String[4];
                Categoria aux = lista.next();
                saida[0] = aux.getId() + "";
                saida[1] = aux.getDescricao();
                saida[2] = aux.getValorLocacao() + "";
                saida[3] = aux.getUrl() + "";
                ImageIcon iconlogo = new ImageIcon((aux.getUrl()));

                //Incluir nova linha na Tabela
                Object[] dados = {saida[0], saida[1], saida[2], iconlogo};
                model.addRow(dados);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }

    private void imprimirMot(ArrayList<Motorista> listaDeCliente) {
        try {
            DefaultTableModel model = (DefaultTableModel) jTable2_motorista.getModel();
            JTableRenderer JtableRenderer = new JTableRenderer();
            jTable2_motorista.getColumnModel().getColumn(3).setCellRenderer(JtableRenderer);

            //Limpa a tabela 
            model.setNumRows(0);
            Iterator<Motorista> lista = listaDeCliente.iterator();

            while (lista.hasNext()) {
                String[] saida = new String[4];
                Motorista aux = lista.next();
                saida[0] = aux.getId() + "";
                saida[1] = aux.getNome();
                saida[2] = aux.getNumeroCNH() + "";
                saida[3] = "";

                //Incluir nova linha na Tabela
                Object[] dados = {saida[0], saida[1], saida[2], saida[3]};
                model.addRow(dados);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }

    private void imprimirAce(ArrayList<Acessorios> listaDeCliente) {
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1_acessorios.getModel();
            JTableRenderer JtableRenderer = new JTableRenderer();
            jTable1_acessorios.getColumnModel().getColumn(4).setCellRenderer(JtableRenderer);

            //Limpa a tabela 
            model.setNumRows(0);
            Iterator<Acessorios> lista = listaDeCliente.iterator();

            while (lista.hasNext()) {
                String[] saida = new String[4];
                Acessorios aux = lista.next();
                saida[0] = aux.getId() + "";
                saida[1] = aux.getDescricao();
                saida[2] = aux.getValorDaLocacao() + "";
                saida[3] = aux.getUrl() + "";
                ImageIcon iconlogo = new ImageIcon((aux.getUrl()));

                //Incluir nova linha na Tabela
                Object[] dados = {saida[0], saida[1], saida[2], iconlogo};
                model.addRow(dados);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }


    private void jButton4_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_voltarActionPerformed
        // TODO add your handling code here:
        TelaPrincipal principal = new TelaPrincipal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4_voltarActionPerformed

    private void jButton2_lOCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_lOCARActionPerformed
        try {

            File arquivo = new File("./src/com/MoreSupra/arquivoDisco/Locacao.txt");
            arquivo.createNewFile();

            float total = ((Float.parseFloat(jTextField1_diasCont.getText()) * Float.parseFloat(jTextField1_precoCat.getText()))
                    + Float.parseFloat(jTextField1_precoAcesso.getText()));
            
            float cauc = (float) (double) (total * 0.50);
            
            float total2 = (total + cauc);

            Locacao loc = new Locacao(0, jTextField2_nomeMoto.getText(), jTextField1_cnhMoto.getText(), jTextField2_modelo.getText(),
                    jTextField1_nomeCAT.getText(), jTextField1_nomeAcess.getText(),
                    "09/12/2022",
                    "00/00/2022",
                    Float.parseFloat(jTextField1_precoCat.getText()),
                    cauc,
                    total2,
                    "LOCADO");

            locacaoControle.locar(loc);
            
            imprimirDados(locacaoControle.listagemDeLocacao());
            jTextField2_nomeMoto.setText("");
            jTextField2_modelo.setText("");
            jTextField1_precoCat.setText("");
            jTextField1_nomeCAT.setText("");
            jTextField1_precoAcesso.setText("0");
            jTextField1_nomeAcess.setText("N/A");
            jTextField1_mesesCont.setText("");
            jTextField1_AnosCont.setText("");
            jTextField1_diasCont.setText("");

        } catch (IOException ex) {
            Logger.getLogger(telaLocacao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(telaLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton2_lOCARActionPerformed

    private void jButton1_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_CancelarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1_CancelarActionPerformed

    private void jButton1_DevolveerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_DevolveerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_DevolveerActionPerformed

    private void jTable3_VEICULOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3_VEICULOSMouseClicked
        jTextField2_modelo.setText(jTable3_VEICULOS.getValueAt(jTable3_VEICULOS.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_jTable3_VEICULOSMouseClicked

    private void jButton1_LimparVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_LimparVeiculosActionPerformed
        jTextField2_modelo.setText("");
    }//GEN-LAST:event_jButton1_LimparVeiculosActionPerformed

    private void jButton2_LimparCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_LimparCategoriaActionPerformed
        jTextField1_precoCat.setText("");
        jTextField1_nomeCAT.setText("");
    }//GEN-LAST:event_jButton2_LimparCategoriaActionPerformed

    private void jButton2_LimparMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_LimparMotoristaActionPerformed
        jTextField2_nomeMoto.setText("");
        jTextField1_cnhMoto.setText("");
    }//GEN-LAST:event_jButton2_LimparMotoristaActionPerformed

    private void jTable4_categoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4_categoriasMouseClicked
        jTextField1_nomeCAT.setText(jTable4_categorias.getValueAt(jTable4_categorias.getSelectedRow(), 1).toString());
        jTextField1_precoCat.setText(jTable4_categorias.getValueAt(jTable4_categorias.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_jTable4_categoriasMouseClicked

    private void jTable2_motoristaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2_motoristaMouseClicked
        jTextField1_cnhMoto.setText(jTable2_motorista.getValueAt(jTable2_motorista.getSelectedRow(), 2).toString());
        jTextField2_nomeMoto.setText(jTable2_motorista.getValueAt(jTable2_motorista.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_jTable2_motoristaMouseClicked

    private void jComboBox1_diasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_diasActionPerformed
        if (jComboBox1_dias.getSelectedIndex() == 0) {
            jLabel17_dias.setVisible(true);
            jLabel17_anos.setVisible(false);
            jLabel17_meses.setVisible(false);

            jTextField1_diasCont.setVisible(true);
            jTextField1_mesesCont.setVisible(false);
            jTextField1_AnosCont.setVisible(true);

            jTextField1_diasCont.setText("");
            jTextField1_mesesCont.setText("");
            jTextField1_AnosCont.setText("");

        } else if (jComboBox1_dias.getSelectedIndex() == 1) {
            jLabel17_meses.setVisible(true);
            jLabel17_anos.setVisible(false);
            jLabel17_dias.setVisible(false);

            jTextField1_diasCont.setVisible(false);
            jTextField1_mesesCont.setVisible(true);
            jTextField1_AnosCont.setVisible(false);

            jTextField1_diasCont.setText("");
            jTextField1_mesesCont.setText("");
            jTextField1_AnosCont.setText("");

        } else if (jComboBox1_dias.getSelectedIndex() == 2) {
            jLabel17_meses.setVisible(false);
            jLabel17_anos.setVisible(true);
            jLabel17_dias.setVisible(false);

            jTextField1_diasCont.setVisible(false);
            jTextField1_mesesCont.setVisible(false);
            jTextField1_AnosCont.setVisible(true);

            jTextField1_diasCont.setText("");
            jTextField1_mesesCont.setText("");
            jTextField1_AnosCont.setText("");
        }
    }//GEN-LAST:event_jComboBox1_diasActionPerformed

    private void jTable1_acessoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1_acessoriosMouseClicked
        jTextField1_precoAcesso.setText(jTable1_acessorios.getValueAt(jTable1_acessorios.getSelectedRow(), 2).toString());
        jTextField1_nomeAcess.setText(jTable1_acessorios.getValueAt(jTable1_acessorios.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_jTable1_acessoriosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextField1_precoAcesso.setText("0");
        jTextField1_nomeAcess.setText("N/A");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1_precoAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_precoAcessoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_precoAcessoActionPerformed

    private void jTable1_saidaGeralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1_saidaGeralMouseClicked
        jTextField1_nomeAcess.setText(jTable1_saidaGeral.getValueAt(jTable1_saidaGeral.getSelectedRow(), 0).toString());
        jTextField2_nomeMoto.setText(jTable1_saidaGeral.getValueAt(jTable1_saidaGeral.getSelectedRow(), 1).toString());
        jTextField1_cnhMoto.setText(jTable1_saidaGeral.getValueAt(jTable1_saidaGeral.getSelectedRow(), 2).toString());
        jTextField2_modelo.setText(jTable1_saidaGeral.getValueAt(jTable1_saidaGeral.getSelectedRow(), 3).toString());
        jTextField1_nomeCAT.setText(jTable1_saidaGeral.getValueAt(jTable1_saidaGeral.getSelectedRow(), 4).toString());
        jTextField1_nomeAcess.setText(jTable1_saidaGeral.getValueAt(jTable1_saidaGeral.getSelectedRow(), 5).toString());
        jTextField1_precoCat.setText(jTable1_saidaGeral.getValueAt(jTable1_saidaGeral.getSelectedRow(), 8).toString());
        
    }//GEN-LAST:event_jTable1_saidaGeralMouseClicked

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
            java.util.logging.Logger.getLogger(telaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaLocacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1_Cancelar;
    private javax.swing.JButton jButton1_Devolveer;
    private javax.swing.JButton jButton1_LimparVeiculos;
    private javax.swing.JButton jButton2_LimparCategoria;
    private javax.swing.JButton jButton2_LimparMotorista;
    private javax.swing.JButton jButton2_lOCAR;
    private javax.swing.JButton jButton4_voltar;
    private javax.swing.JComboBox<String> jComboBox1_dias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel17_anos;
    private javax.swing.JLabel jLabel17_dias;
    private javax.swing.JLabel jLabel17_meses;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1_acessorios;
    private javax.swing.JTable jTable1_saidaGeral;
    private javax.swing.JTable jTable2_motorista;
    private javax.swing.JTable jTable3_VEICULOS;
    private javax.swing.JTable jTable4_categorias;
    private javax.swing.JTextField jTextField1_AnosCont;
    private javax.swing.JTextField jTextField1_cnhMoto;
    private javax.swing.JTextField jTextField1_diasCont;
    private javax.swing.JTextField jTextField1_mesesCont;
    private javax.swing.JTextField jTextField1_nomeAcess;
    private javax.swing.JTextField jTextField1_nomeCAT;
    private javax.swing.JTextField jTextField1_precoAcesso;
    private javax.swing.JTextField jTextField1_precoCat;
    private javax.swing.JTextField jTextField2_modelo;
    private javax.swing.JTextField jTextField2_nomeMoto;
    // End of variables declaration//GEN-END:variables
}
