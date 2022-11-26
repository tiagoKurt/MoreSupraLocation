/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.MoreSupra.visao;

import ImagensTabela.JTableRenderer;
import com.MoreSupra.Controle.CategoriasControle;
import com.MoreSupra.Controle.ICategoriasControle;
import com.MoreSupra.modelos.Categoria;
import com.MoreSupra.visao.utill.limitaCaracteres;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pichau
 */
public class TelaCategorias extends javax.swing.JFrame {
    
      ICategoriasControle controle = new CategoriasControle();

    /**
     * Creates new form TelaCategorias
     */
    public TelaCategorias() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        jTextField1_IDENTIFICADOR.setEnabled(false);
        jTextField2_precoLocacao.setDocument(new limitaCaracteres(11, limitaCaracteres.tipoEntrada.PRECO));
        jTextField1_descricao.setDocument(new limitaCaracteres(22, limitaCaracteres.tipoEntrada.DESCRICAO));
        
        try {
            imprimirDadosNaGrid(controle.listagemDeCategorias());
        } catch (Exception ex) {
            Logger.getLogger(TelaMarcas.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1_IDENTIFICADOR = new javax.swing.JTextField();
        jTextField1_descricao = new javax.swing.JTextField();
        jTextField2_precoLocacao = new javax.swing.JTextField();
        jButton1_alterar = new javax.swing.JButton();
        jButton2_incluir = new javax.swing.JButton();
        jButton3_buscar = new javax.swing.JButton();
        jButton4_voltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7_fotoCategoria = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/arrrrr.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 130));

        jLabel2.setFont(new java.awt.Font("Serif", 3, 38)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CADASTRO DE CATEGORIAS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 510, -1));

        jLabel3.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("IDENTIFICADOR");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DESCRIÇÃO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PREÇO LOCAÇÃO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("IMAGEM");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, -1, -1));

        jTextField1_IDENTIFICADOR.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField1_IDENTIFICADOR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField1_IDENTIFICADOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_IDENTIFICADORActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1_IDENTIFICADOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 75, 37));

        jTextField1_descricao.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField1_descricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField1_descricao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1_descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_descricaoActionPerformed(evt);
            }
        });
        jTextField1_descricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1_descricaoKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1_descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 320, 35));

        jTextField2_precoLocacao.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField2_precoLocacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField2_precoLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_precoLocacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2_precoLocacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 250, 260, 35));

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
        getContentPane().add(jButton1_alterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 240, 169, -1));

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
        getContentPane().add(jButton2_incluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 200, 169, -1));

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
        getContentPane().add(jButton3_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 160, 169, -1));

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
        getContentPane().add(jButton4_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 640, 169, -1));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTable1.setFont(new java.awt.Font("Serif", 3, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "DESCRIÇÃO", "PREÇO", "LOGO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setRowHeight(60);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 1251, 333));

        jLabel7_fotoCategoria.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7_fotoCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jLabel7_fotoCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 240, 140));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/FADETELA.jpg"))); // NOI18N
        jLabel7.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel7AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_IDENTIFICADORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_IDENTIFICADORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_IDENTIFICADORActionPerformed

    private void jTextField1_descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_descricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_descricaoActionPerformed

    private void jTextField1_descricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_descricaoKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();

        if(Character.isLowerCase(c)){
            evt.setKeyChar(Character.toUpperCase(c));
        }
    }//GEN-LAST:event_jTextField1_descricaoKeyTyped

    private void imprimirDadosNaGrid(ArrayList<Categoria> listaDeMarcas) {
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            JTableRenderer JtableRenderer = new JTableRenderer();
            jTable1.getColumnModel().getColumn(3).setCellRenderer(JtableRenderer);

            //Limpa a tabela 
            model.setNumRows(0);
            Iterator<Categoria> lista = listaDeMarcas.iterator();

            while (lista.hasNext()) {
                String[] saida = new String[3];
                Categoria aux = lista.next();
                saida[0] = aux.getId() + "";
                saida[1] = aux.getDescricao();
                saida[2] = aux.getValorLocacao() + "";
                ImageIcon iconlogo = new ImageIcon();
                //Incluir nova linha na Tabela
                Object[] dados = {saida[0], saida[1], saida[2], iconlogo};
                model.addRow(dados);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }

    }
    private void jTextField2_precoLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_precoLocacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_precoLocacaoActionPerformed

    private void jButton1_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_alterarActionPerformed
        // TODO add your handling code here:
        try {
            Categoria categoria = new Categoria(Integer.parseInt(jTextField1_IDENTIFICADOR.getText()), jTextField1_descricao.getText(), 
                    Float.parseFloat(jTextField2_precoLocacao.getText()));
            controle.alterar(categoria);
            if (jTable1.getSelectedRow() != -1) {
                jTable1.setValueAt(jTextField1_IDENTIFICADOR.getText(), jTable1.getSelectedRow(), 0);
                jTable1.setValueAt(jTextField1_descricao.getText(), jTable1.getSelectedRow(), 1);
                jTable1.setValueAt(jTextField2_precoLocacao.getText(), jTable1.getSelectedRow(), 2);
                jTextField1_descricao.setText("");
                jTextField1_IDENTIFICADOR.setText("");
                jTextField2_precoLocacao.setText("");
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButton1_alterarActionPerformed

    private void jButton2_incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_incluirActionPerformed
        // TODO add your handling code here:
        try {
            File arquivo = new File("./src/com/MoreSupra/arquivoDisco/Categoria.txt");
            arquivo.createNewFile();
            Categoria marca = new Categoria(0, jTextField1_descricao.getText(), Float.parseFloat(jTextField2_precoLocacao.getText()));

            controle.incluir(marca);
            jTextField1_descricao.setText("");
            jTextField1_IDENTIFICADOR.setText("");
            jTextField2_precoLocacao.setText("");

            imprimirDadosNaGrid(controle.listagemDeCategorias());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButton2_incluirActionPerformed

    private void jButton3_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_buscarActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser fc = new JFileChooser("./src/com/MoreSupra/imagensCategoria");
            File buscar = new File(".src/com/MoreSupra/imagensCategoria");
            fc.setCurrentDirectory(buscar);
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fc.showOpenDialog(this);
            File arquivo = fc.getSelectedFile();
            String nomeDoArquivo = arquivo.getPath();
            
            ImageIcon iconLogo = new ImageIcon(nomeDoArquivo);
            iconLogo.setImage(iconLogo.getImage().getScaledInstance(
                    jLabel7_fotoCategoria.getWidth(), jLabel7_fotoCategoria.getHeight(), 1));
            jLabel7_fotoCategoria.setIcon(iconLogo);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }//GEN-LAST:event_jButton3_buscarActionPerformed

    private void jButton4_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_voltarActionPerformed
        // TODO add your handling code here:
        TelaPrincipal principal = new TelaPrincipal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4_voltarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if (jTable1.getSelectedRow() != -1) {
            jTextField1_IDENTIFICADOR.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            jTextField1_descricao.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
            jTextField2_precoLocacao.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
            String nomeUrl = jTextField2_precoLocacao.getText();
            ImageIcon iconLogo = new ImageIcon(nomeUrl);
            iconLogo.setImage(iconLogo.getImage().getScaledInstance(jLabel7_fotoCategoria.getWidth(), jLabel7_fotoCategoria.getHeight(), 1));
            jLabel7_fotoCategoria.setIcon(iconLogo);

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel7AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel7AncestorAdded
        // TODO add your handling code here
        ImageIcon iconLogo = (ImageIcon) jLabel7.getIcon();
        Icon dimensionarIcone = new ImageIcon(iconLogo.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_DEFAULT));
        jLabel7.setIcon(dimensionarIcone);
        this.repaint();
    }//GEN-LAST:event_jLabel7AncestorAdded

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
            java.util.logging.Logger.getLogger(TelaCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCategorias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_alterar;
    private javax.swing.JButton jButton2_incluir;
    private javax.swing.JButton jButton3_buscar;
    private javax.swing.JButton jButton4_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel7_fotoCategoria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1_IDENTIFICADOR;
    private javax.swing.JTextField jTextField1_descricao;
    private javax.swing.JTextField jTextField2_precoLocacao;
    // End of variables declaration//GEN-END:variables
}