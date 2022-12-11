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
import com.MoreSupra.Controle.IVeiculosControle;
import com.MoreSupra.Controle.LocacaoControle;
import com.MoreSupra.Controle.ModelosControle;
import com.MoreSupra.Controle.MotoristaControle;
import com.MoreSupra.Controle.VeiculosControle;
import com.MoreSupra.modelos.Acessorios;
import com.MoreSupra.modelos.Categoria;
import com.MoreSupra.modelos.Locacao;
import com.MoreSupra.modelos.Modelos;
import com.MoreSupra.modelos.Motorista;
import com.MoreSupra.modelos.Veiculos;
import com.MoreSupra.visao.utill.limitaCaracteres;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
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
    IVeiculosControle veiculoControle = new VeiculosControle();

    public telaLocacao() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);

        jTextField2_modelo.setEnabled(false);
        jTextField2_nomeMoto.setEnabled(false);
        jTextField1_nomeCAT.setEnabled(false);
        jTextField1_precoCat.setEnabled(false);
        jTextField1_precoAcesso.setEnabled(false);
        jTextField1_nomeAcess.setEnabled(false);

        jTextField1_diasCont.setDocument(new limitaCaracteres(4, limitaCaracteres.tipoEntrada.NUMEROINTEIRO));
        
        
        jDialog1.setSize(700, 490);
        jDialog1.setLocationRelativeTo(null);
        jDialog1.setTitle("cadastroincompleto");
        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        jDialog1.setResizable(false);
        
        jDialog2.setSize(700, 490);
        jDialog2.setLocationRelativeTo(null);
        jDialog2.setTitle("cadastroincompleto");
        jDialog2.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        jDialog2.setResizable(false);

        try {
            imprimirVeiculos(veiculoControle.listagemVeiculos());
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

        jDialog1 = new javax.swing.JDialog();
        jLabel22 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jDialog2 = new javax.swing.JDialog();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton2_Confimar3 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_saidaGeral = new javax.swing.JTable();
        jButton4_voltar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2_motorista = new javax.swing.JTable();
        jTextField2_nomeMoto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1_veiculos = new javax.swing.JTable();
        jTextField1_precoCat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2_modelo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton2_lOCAR = new javax.swing.JButton();
        jButton1_Devolveer = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jTextField1_nomeCAT = new javax.swing.JTextField();
        jButton2_LimparCategoria = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton2_LimparMotorista = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel17_dias1 = new javax.swing.JLabel();
        jLabel17_dias = new javax.swing.JLabel();
        jTextField1_diasCont = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField1_precoAcesso = new javax.swing.JTextField();
        jTextField1_nomeAcess = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1_acessorios = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jButton2_LimparCategoria1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jDialog1.setUndecorated(true);
        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/confirmGif.gif"))); // NOI18N
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        jDialog1.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 220, 190));

        jLabel16.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("LOCAÇÃO REALIZADO COM SUCESSO!!");
        jDialog1.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 600, 50));

        jLabel21.setFont(new java.awt.Font("Serif", 3, 22)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("E INCLUIDOS NO BANCO");
        jDialog1.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 270, 50));

        jLabel23.setFont(new java.awt.Font("Serif", 3, 22)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("DADOS FORAM ATUALIZADOS ");
        jDialog1.getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 340, 50));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/arrrrr.png"))); // NOI18N
        jDialog1.getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 200, 140));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/FADETELA.jpg"))); // NOI18N
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 4));
        jDialog1.getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 490));

        jDialog2.setUndecorated(true);
        jDialog2.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("CADASTRO NÃO REALIZADO!");
        jDialog2.getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 500, 50));

        jLabel37.setFont(new java.awt.Font("Serif", 3, 22)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("VERIFIQUE INFORMAÇÕES INVÁLIDAS OU CAMPOS VAZIOS");
        jDialog2.getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 690, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/arrrrr.png"))); // NOI18N
        jDialog2.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, 130));

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
        jDialog2.getContentPane().add(jButton2_Confimar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 100, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/INITIALDCADASTROINVALIDO.gif"))); // NOI18N
        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        jDialog2.getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 360, 200));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/FADETELA.jpg"))); // NOI18N
        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 4));
        jDialog2.getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 490));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/arrrrr.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 110, 190, 130));

        jLabel4.setFont(new java.awt.Font("Serif", 3, 38)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LOCAÇÃO DE VEÍCULOS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 50, 460, 60));

        jTable1_saidaGeral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTable1_saidaGeral.setFont(new java.awt.Font("Serif", 3, 15)); // NOI18N
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
            jTable1_saidaGeral.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable1_saidaGeral.getColumnModel().getColumn(4).setPreferredWidth(75);
            jTable1_saidaGeral.getColumnModel().getColumn(5).setPreferredWidth(50);
            jTable1_saidaGeral.getColumnModel().getColumn(7).setPreferredWidth(60);
            jTable1_saidaGeral.getColumnModel().getColumn(8).setPreferredWidth(90);
            jTable1_saidaGeral.getColumnModel().getColumn(9).setPreferredWidth(90);
            jTable1_saidaGeral.getColumnModel().getColumn(13).setPreferredWidth(0);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 1120, 320));

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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 410, 90));

        jTextField2_nomeMoto.setFont(new java.awt.Font("Serif", 3, 17)); // NOI18N
        jTextField2_nomeMoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jTextField2_nomeMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 340, 30));

        jLabel5.setFont(new java.awt.Font("Serif", 3, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MOTORISTA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 160, 30));

        jLabel6.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NOME");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 160, 40));

        jTable1_veiculos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTable1_veiculos.setFont(new java.awt.Font("Serif", 3, 16)); // NOI18N
        jTable1_veiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "MODELO", "CAT", "PREÇO", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1_veiculos.setRowHeight(60);
        jTable1_veiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1_veiculosMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable1_veiculos);
        if (jTable1_veiculos.getColumnModel().getColumnCount() > 0) {
            jTable1_veiculos.getColumnModel().getColumn(0).setPreferredWidth(25);
            jTable1_veiculos.getColumnModel().getColumn(4).setPreferredWidth(0);
        }

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 430, 170));

        jTextField1_precoCat.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jTextField1_precoCat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jTextField1_precoCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 190, 40));

        jLabel7.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CATÉGORIA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, 150, 20));

        jTextField2_modelo.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jTextField2_modelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jTextField2_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 190, 40));

        jLabel8.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("MODELO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 90, 30));

        jLabel9.setFont(new java.awt.Font("Serif", 3, 26)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ACESSÓRIO");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 230, 150, 20));

        jLabel12.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PREÇO DIÁRIA");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 150, 20));

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

        jButton1_Devolveer.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jButton1_Devolveer.setForeground(new java.awt.Color(51, 0, 153));
        jButton1_Devolveer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/MOTORISTA.png"))); // NOI18N
        jButton1_Devolveer.setText("CADASTRAR MOTORISTA");
        jButton1_Devolveer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton1_Devolveer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1_Devolveer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_DevolveerActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_Devolveer, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 340, -1));

        jLabel18.setFont(new java.awt.Font("Serif", 3, 26)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("VEÍCULO");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 150, 20));

        jTextField1_nomeCAT.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jTextField1_nomeCAT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jTextField1_nomeCAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 190, 40));

        jButton2_LimparCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/limpar (1).png"))); // NOI18N
        jButton2_LimparCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton2_LimparCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2_LimparCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_LimparCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2_LimparCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 340, -1, -1));

        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 470, 330));

        jButton2_LimparMotorista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/limpar (1).png"))); // NOI18N
        jButton2_LimparMotorista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton2_LimparMotorista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2_LimparMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_LimparMotoristaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2_LimparMotorista, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, -1));

        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 450, 210));

        jLabel17_dias1.setFont(new java.awt.Font("Serif", 3, 22)); // NOI18N
        jLabel17_dias1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17_dias1.setText("DIAS:");
        getContentPane().add(jLabel17_dias1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 70, 30));

        jLabel17_dias.setFont(new java.awt.Font("Serif", 3, 22)); // NOI18N
        jLabel17_dias.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17_dias.setText("POR QUANTOS DIAS SERÁ A LOCAÇÃO?");
        getContentPane().add(jLabel17_dias, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 420, 30));

        jTextField1_diasCont.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        jTextField1_diasCont.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jTextField1_diasCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 70, 50));

        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 450, 120));

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
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 310, 70, 30));

        jLabel20.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("ACESSÓRIO");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 240, 120, 30));

        jTextField1_precoAcesso.setFont(new java.awt.Font("Serif", 3, 17)); // NOI18N
        jTextField1_precoAcesso.setText("0");
        jTextField1_precoAcesso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField1_precoAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_precoAcessoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1_precoAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 340, 200, 40));

        jTextField1_nomeAcess.setFont(new java.awt.Font("Serif", 3, 15)); // NOI18N
        jTextField1_nomeAcess.setText("N/A");
        jTextField1_nomeAcess.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jTextField1_nomeAcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 270, 200, 40));

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

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 250, 250, 140));

        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 220, 470, 170));

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
        getContentPane().add(jButton2_LimparCategoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 470, 200, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/FADETELA.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void imprimirVeiculos(ArrayList<Veiculos> listaDeCliente) {
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1_veiculos.getModel();
            JTableRenderer JtableRenderer = new JTableRenderer();
            jTable1_veiculos.getColumnModel().getColumn(5).setCellRenderer(JtableRenderer);

            //Limpa a tabela 
            model.setNumRows(0);
            Iterator<Veiculos> lista = listaDeCliente.iterator();

            while (lista.hasNext()) {
                String[] saida = new String[6];
                Veiculos aux = lista.next();

                saida[0] = aux.getId() + "";
                saida[1] = modeloControle.buscar(aux.getModelo().getId()).getDescricao();
                saida[2] = aux.getTipoDoVeiculo() + "";
                saida[3] = aux.getPrecoDeCompra() + "";
                saida[4] = modeloControle.buscar(aux.getModelo().getId()).getUrl();

                
                //Incluir nova linha na Tabela
                Object[] dados = {saida[0], saida[1], saida[2], saida[3], saida[4]};
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
            if(!jTextField1_diasCont.getText().isEmpty() && !jTextField1_nomeCAT.getText().isEmpty() && !jTextField2_nomeMoto.getText().isEmpty()){
                
            
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
            

            Locacao loc = new Locacao(0, jTextField2_nomeMoto.getText(), jTextField2_modelo.getText(),
                    jTextField1_nomeCAT.getText(), jTextField1_nomeAcess.getText(),
                    Float.parseFloat(jTextField1_precoAcesso.getText()),
                    dataFormatada,
                    AgoraFormat,
                    Float.parseFloat(jTextField1_precoCat.getText()),
                    cauc,
                    total2,
                    "ANDAMENTO", Integer.parseInt(jTextField1_diasCont.getText()));

            locacaoControle.locar(loc);
            imprimirDados(locacaoControle.listagemDeLocacao());
            jTextField2_nomeMoto.setText("");
            jTextField2_modelo.setText("");
            jTextField1_precoCat.setText("");
            jTextField1_nomeCAT.setText("");
            jTextField1_precoAcesso.setText("0");
            jTextField1_nomeAcess.setText("N/A");
            jTextField1_diasCont.setText("");
            
            Timer timer = new Timer(3900, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    jDialog1.setVisible(false);
                    jDialog1.dispose();
                }
             });
                 timer.setRepeats(false);
                 timer.start();
                 jDialog1.setVisible(true);
            
            
            
            }else{
                jDialog2.setVisible(true);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(telaLocacao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(telaLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton2_lOCARActionPerformed

    private void jButton1_DevolveerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_DevolveerActionPerformed
        TelaMotorista mot = new TelaMotorista();
        mot.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1_DevolveerActionPerformed

    private void jButton2_LimparCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_LimparCategoriaActionPerformed
        jTextField2_modelo.setText("");
        jTextField1_precoCat.setText("");
        jTextField1_nomeCAT.setText("");
    }//GEN-LAST:event_jButton2_LimparCategoriaActionPerformed

    private void jButton2_LimparMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_LimparMotoristaActionPerformed
        jTextField2_nomeMoto.setText("");
    }//GEN-LAST:event_jButton2_LimparMotoristaActionPerformed

    private void jTable2_motoristaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2_motoristaMouseClicked

        jTextField2_nomeMoto.setText(jTable2_motorista.getValueAt(jTable2_motorista.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_jTable2_motoristaMouseClicked

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

        jTextField2_nomeMoto.setText(jTable1_saidaGeral.getValueAt(jTable1_saidaGeral.getSelectedRow(), 1).toString());
        jTextField2_modelo.setText(jTable1_saidaGeral.getValueAt(jTable1_saidaGeral.getSelectedRow(), 2).toString());
        jTextField1_nomeCAT.setText(jTable1_saidaGeral.getValueAt(jTable1_saidaGeral.getSelectedRow(), 3).toString());
        jTextField1_precoCat.setText(jTable1_saidaGeral.getValueAt(jTable1_saidaGeral.getSelectedRow(), 4).toString());
        jTextField1_diasCont.setText(jTable1_saidaGeral.getValueAt(jTable1_saidaGeral.getSelectedRow(), 5).toString());
        jTextField1_nomeAcess.setText(jTable1_saidaGeral.getValueAt(jTable1_saidaGeral.getSelectedRow(), 6).toString());
        jTextField1_precoAcesso.setText(jTable1_saidaGeral.getValueAt(jTable1_saidaGeral.getSelectedRow(), 7).toString());

    }//GEN-LAST:event_jTable1_saidaGeralMouseClicked

    private void jTable1_veiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1_veiculosMouseClicked
        jTextField2_modelo.setText(jTable1_veiculos.getValueAt(jTable1_veiculos.getSelectedRow(), 1).toString());
        jTextField1_nomeCAT.setText(jTable1_veiculos.getValueAt(jTable1_veiculos.getSelectedRow(), 2).toString());
        jTextField1_precoCat.setText(jTable1_veiculos.getValueAt(jTable1_veiculos.getSelectedRow(), 3).toString());
        
    }//GEN-LAST:event_jTable1_veiculosMouseClicked

    private void jButton2_LimparCategoria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_LimparCategoria1ActionPerformed
        jTextField2_nomeMoto.setText("");
            jTextField2_modelo.setText("");
            jTextField1_precoCat.setText("");
            jTextField1_nomeCAT.setText("");
            jTextField1_precoAcesso.setText("0");
            jTextField1_nomeAcess.setText("N/A");
            jTextField1_diasCont.setText("");
    }//GEN-LAST:event_jButton2_LimparCategoria1ActionPerformed

    private void jButton2_Confimar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_Confimar3ActionPerformed
        jDialog2.dispose();
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
    private javax.swing.JButton jButton1_Devolveer;
    private javax.swing.JButton jButton2_Confimar3;
    private javax.swing.JButton jButton2_LimparCategoria;
    private javax.swing.JButton jButton2_LimparCategoria1;
    private javax.swing.JButton jButton2_LimparMotorista;
    private javax.swing.JButton jButton2_lOCAR;
    private javax.swing.JButton jButton4_voltar;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel17_dias;
    private javax.swing.JLabel jLabel17_dias1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1_acessorios;
    private javax.swing.JTable jTable1_saidaGeral;
    private javax.swing.JTable jTable1_veiculos;
    private javax.swing.JTable jTable2_motorista;
    private javax.swing.JTextField jTextField1_diasCont;
    private javax.swing.JTextField jTextField1_nomeAcess;
    private javax.swing.JTextField jTextField1_nomeCAT;
    private javax.swing.JTextField jTextField1_precoAcesso;
    private javax.swing.JTextField jTextField1_precoCat;
    private javax.swing.JTextField jTextField2_modelo;
    private javax.swing.JTextField jTextField2_nomeMoto;
    // End of variables declaration//GEN-END:variables
}
