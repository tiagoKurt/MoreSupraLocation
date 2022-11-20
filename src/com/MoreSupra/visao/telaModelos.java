/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.MoreSupra.visao;
import ImagensTabela.JTableRenderer;
//import com.MoreSupra.persistencia.ModelosMore;
import com.MoreSupra.modelos.Modelos;
import com.MoreSupra.Controle.IModelosControle;
//import com.MoreSupra.persistencia.IModelosMore;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import com.MoreSupra.Controle.*;
import com.MoreSupra.modelos.Marca;
import com.MoreSupra.visao.utill.limitaCaracteres;
//import com.MoreSupra.persistencia.MarcaMore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;

/**
 *
 * @author Aluno
 */
public class telaModelos extends javax.swing.JFrame {
    
    IModelosControle modeloControle = new ModelosControle();
    IMarcasControle marcaControle = new MarcasControle();

    /**
     * Creates new form telaVeiculos
     */
    public telaModelos() {
        initComponents();
        
        TelaMarcas telaDeMarcas = new TelaMarcas();
        setExtendedState(MAXIMIZED_BOTH);
        jTextField2_descricao.setDocument(new limitaCaracteres(20, limitaCaracteres.tipoEntrada.DESCRICAO));
        jTextField3_url.setEnabled(false);
        jTextField1_Identificador.setEnabled(false);
        jTable1_Modelos.getSelectionModel().setSelectionInterval(WIDTH, WIDTH);
        
        try {
            ArrayList <Marca> combolista = marcaControle.listagemDeMarcas();
            int lim = combolista.size();
            String marcas[] = new String[lim];

            for(int i = 0; i < combolista.size(); i++){
                marcas[i] = combolista.get(i).getDescricao();
                jComboBox1_marca.addItem(marcas[i]);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        try {
            imprimirDados(modeloControle.listagemModelos());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
    public void imprimirDados(ArrayList<Modelos> listaDeModelos){
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1_Modelos.getModel();
            JTableRenderer JtableRenderer = new JTableRenderer();
            jTable1_Modelos.getColumnModel().getColumn(3).setCellRenderer(JtableRenderer);
            jTable1_Modelos.getColumnModel().getColumn(4).setCellRenderer(JtableRenderer);

            //Limpa a tabela 
            model.setNumRows(0);
            Iterator<Modelos> lista = listaDeModelos.iterator();
            while(lista.hasNext()){
                String[] saida= new String[4];
                Modelos aux = lista.next();
                saida[0]= aux.getId()+"";
                saida[1]= aux.getDescricao();
                saida[2] = aux.getUrl();
                saida[3] = marcaControle.buscar(aux.getMarca().getId()).getUrl();
                ImageIcon iconlogo = new ImageIcon((aux.getUrl()));
                
                //Incluir nova linha na Tabela,saida[0]
                
                Object[]dados = {saida[0],saida[1],saida[2],saida[3],iconlogo};
                model.addRow(dados);
            }
        } catch(Exception erro){
            JOptionPane.showMessageDialog(this, erro.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1_Identificador = new javax.swing.JTextField();
        jTextField2_descricao = new javax.swing.JTextField();
        jTextField3_url = new javax.swing.JTextField();
        jComboBox1_marca = new javax.swing.JComboBox<>();
        jButton3_buscar = new javax.swing.JButton();
        jButton2_incluir = new javax.swing.JButton();
        jButton1_alterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_Modelos = new javax.swing.JTable();
        jButton4_voltar = new javax.swing.JButton();
        jLabel9_ModeloImage = new javax.swing.JLabel();
        jLabel9_marcaLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/gifModelos.gif"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 320, 570));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/arrrrr.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, -10, 220, 200));

        jLabel4.setFont(new java.awt.Font("Serif", 3, 38)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MODELOS DE VEÍCULOS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 460, 60));

        jLabel5.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("IDENTIFICADOR");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 230, 30));

        jLabel6.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DESCRIÇÃO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 170, -1));

        jLabel7.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("URL");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 80, -1));

        jLabel8.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("MODELO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 130, -1));

        jLabel9.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("MARCA");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 110, -1));

        jLabel10.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("MARCA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 90, 110, -1));

        jTextField1_Identificador.setFont(new java.awt.Font("Serif", 3, 16)); // NOI18N
        jTextField1_Identificador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jTextField1_Identificador, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 70, 40));

        jTextField2_descricao.setFont(new java.awt.Font("Serif", 3, 16)); // NOI18N
        jTextField2_descricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField2_descricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2_descricaoKeyTyped(evt);
            }
        });
        jPanel1.add(jTextField2_descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 270, 40));

        jTextField3_url.setFont(new java.awt.Font("Serif", 3, 16)); // NOI18N
        jTextField3_url.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jTextField3_url, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 380, 40));

        jComboBox1_marca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jComboBox1_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_marcaActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 130, 40));

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
        jPanel1.add(jButton3_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 140, 169, -1));

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
        jPanel1.add(jButton2_incluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 180, 169, -1));

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
        jPanel1.add(jButton1_alterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 220, 169, -1));

        jTable1_Modelos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTable1_Modelos.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jTable1_Modelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DESCRIÇÃO", "URL", "MARCA", "MODELO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1_Modelos.setColumnSelectionAllowed(true);
        jTable1_Modelos.setPreferredSize(new java.awt.Dimension(375, 500));
        jTable1_Modelos.setRowHeight(60);
        jTable1_Modelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1_ModelosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1_Modelos);
        jTable1_Modelos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 980, 340));

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
        jPanel1.add(jButton4_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 650, 169, -1));

        jLabel9_ModeloImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jLabel9_ModeloImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, 180, 150));

        jLabel9_marcaLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jLabel9_marcaLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 130, 160, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/FADETELA.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 1430, 740));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1430, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_buscarActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser fc = new JFileChooser("./src/com/MoreSupra/imagensModelo");
            File buscar = new File(".src/com/MoreSupra/imagensModelo");
            fc.setCurrentDirectory(buscar);
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fc.showOpenDialog(this);
            File arquivo = fc.getSelectedFile();
            String nomeDoArquivo = arquivo.getPath();
            jTextField3_url.setText(nomeDoArquivo);
            ImageIcon iconLogo = new ImageIcon(nomeDoArquivo);
            iconLogo.setImage(iconLogo.getImage().getScaledInstance(
                jLabel9_ModeloImage.getWidth(), jLabel9_ModeloImage.getHeight(), 1));
        jLabel9_ModeloImage.setIcon(iconLogo);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }//GEN-LAST:event_jButton3_buscarActionPerformed

    private void jButton2_incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_incluirActionPerformed
        // TODO add your handling code here:
        try {
            File arquivo = new File("./src/com/MoreSupra/arquivoDisco/Modelos.txt");
            arquivo.createNewFile();
            int macc = 0;
            Modelos modelo = new Modelos(0, jTextField2_descricao.getText(), jTextField3_url.getText(),
                    marcaControle.buscar(macc));
            ArrayList<Marca> lista = marcaControle.listagemDeMarcas();
            for(int i = 0; i < lista.size(); i++){
                if(jComboBox1_marca.getSelectedItem().equals(lista.get(i).getDescricao())){
                    modelo.setMarca(lista.get(i));
                    
                }
            }
            
            modeloControle.incluir(modelo);
            imprimirDados(modeloControle.listagemModelos());
            jTextField2_descricao.setText("");
            jTextField3_url.setText("");
            jTextField1_Identificador.setText("");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButton2_incluirActionPerformed

    private void jButton1_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_alterarActionPerformed
        // TODO add your handling code here:
        if(jTable1_Modelos.getSelectedRow() != -1){
            try {
                int macc = 0;
                Modelos modelo = new Modelos(Integer.parseInt(jTextField1_Identificador.getText()), 
                        jTextField2_descricao.getText(), jTextField3_url.getText(),marcaControle.buscar(macc));       
                 ArrayList<Marca> lista = marcaControle.listagemDeMarcas();
            for(int i = 0; i < lista.size(); i++){
                if(jComboBox1_marca.getSelectedItem().equals(lista.get(i).getDescricao())){
                    modelo.setMarca(lista.get(i));
                }
            }
                modeloControle.alterar(modelo);              
                imprimirDados(modeloControle.listagemModelos());
                jTextField1_Identificador.setText("");
                jTextField2_descricao.setText("");
                jTextField3_url.setText("");
                
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, erro.getMessage());
            }
        }else JOptionPane.showMessageDialog(null, "Selecione um Modelo primeiro para alterá-lo.");
    }//GEN-LAST:event_jButton1_alterarActionPerformed

    private void jButton4_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_voltarActionPerformed
        // TODO add your handling code here:
        TelaPrincipal principal = new TelaPrincipal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4_voltarActionPerformed

    private void jTable1_ModelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1_ModelosMouseClicked
        // TODO add your handling code here:
        if (jTable1_Modelos.getSelectedRow() != -1) {
            jTextField1_Identificador.setText(jTable1_Modelos.getValueAt(jTable1_Modelos.getSelectedRow(), 0).toString());
            jTextField2_descricao.setText(jTable1_Modelos.getValueAt(jTable1_Modelos.getSelectedRow(), 1).toString());
            jTextField3_url.setText(jTable1_Modelos.getValueAt(jTable1_Modelos.getSelectedRow(), 2).toString());
            String nomeUrl = jTextField3_url.getText();
            ImageIcon iconLogo = new ImageIcon(nomeUrl);
            iconLogo.setImage(iconLogo.getImage().getScaledInstance(jLabel9_ModeloImage.getWidth(), 
            jLabel9_ModeloImage.getHeight(), 1));
            jLabel9_ModeloImage.setIcon(iconLogo);
            Object pog = jTable1_Modelos.getValueAt(jTable1_Modelos.getSelectedRow(), 3);
            ImageIcon marca = new ImageIcon((String) pog);
            marca.setImage(marca.getImage().getScaledInstance(jLabel9_marcaLogo.getWidth(), 
            jLabel9_marcaLogo.getHeight(), 1));
            jLabel9_marcaLogo.setIcon(marca);
            

        }
    }//GEN-LAST:event_jTable1_ModelosMouseClicked

    private void jComboBox1_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_marcaActionPerformed
        // TODO add your handling code here:
        TelaMarcas marcas = new TelaMarcas();
        try{
        int macc = 0;
            Modelos modelo = new Modelos(0, jTextField2_descricao.getText(), jTextField3_url.getText(),
                    marcaControle.buscar(macc));
            ArrayList<Marca> lista = marcaControle.listagemDeMarcas();
            for(int i = 0; i < lista.size(); i++){
                if(jComboBox1_marca.getSelectedItem().equals(lista.get(i).getDescricao())){
                    modelo.setMarca(lista.get(i));
            }
        }
        }catch (Exception erro) {
                JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }//GEN-LAST:event_jComboBox1_marcaActionPerformed

    private void jTextField2_descricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_descricaoKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();

        if(Character.isLowerCase(c)){
            evt.setKeyChar(Character.toUpperCase(c));
    }//GEN-LAST:event_jTextField2_descricaoKeyTyped

}
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
            java.util.logging.Logger.getLogger(telaModelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaModelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaModelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaModelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaModelos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_alterar;
    private javax.swing.JButton jButton2_incluir;
    private javax.swing.JButton jButton3_buscar;
    private javax.swing.JButton jButton4_voltar;
    private javax.swing.JComboBox<String> jComboBox1_marca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel9_ModeloImage;
    private javax.swing.JLabel jLabel9_marcaLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1_Modelos;
    private javax.swing.JTextField jTextField1_Identificador;
    private javax.swing.JTextField jTextField2_descricao;
    private javax.swing.JTextField jTextField3_url;
    // End of variables declaration//GEN-END:variables
}

