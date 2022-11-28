/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.MoreSupra.visao;

import ImagensTabela.JTableRenderer;
import com.MoreSupra.Controle.IPessoaJuridicaControle;
import com.MoreSupra.Controle.PessoaJuridicaControle;
import com.MoreSupra.modelos.PessoaJuridica;
import com.MoreSupra.visao.utill.limitaCaracteres;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class telaPessoaJuridica extends javax.swing.JFrame {

    IPessoaJuridicaControle controle = new PessoaJuridicaControle();
    
    
    public telaPessoaJuridica() {
        initComponents();
        jTextField11_razaoSocial.setDocument(new limitaCaracteres(28, limitaCaracteres.tipoEntrada.DESCRICAO));
        jTextField9_emailJuri.setDocument(new limitaCaracteres(28, limitaCaracteres.tipoEntrada.EMAIL));
        jTextField8_enderecoJuridica.setDocument(new limitaCaracteres(28, limitaCaracteres.tipoEntrada.ENDERECO));
        jTextField12_nomeJuridica.setDocument(new limitaCaracteres(28, limitaCaracteres.tipoEntrada.NOME));
        setExtendedState(MAXIMIZED_BOTH);
        jTextField8_idJuridica.setEnabled(false);
        
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

        jButton4_voltar2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField8_enderecoJuridica = new javax.swing.JTextField();
        jTextField9_emailJuri = new javax.swing.JTextField();
        jTextField12_nomeJuridica = new javax.swing.JTextField();
        jLabel22_FotoFisica1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton1_alterar1 = new javax.swing.JButton();
        jButton2_incluir1 = new javax.swing.JButton();
        jButton3_buscar1 = new javax.swing.JButton();
        jTextField8_idJuridica = new javax.swing.JTextField();
        jTextField11_razaoSocial = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jFormattedTextField1_cnpj = new javax.swing.JFormattedTextField();
        jFormattedTextField1_telefone = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_cliente = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4_voltar2.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jButton4_voltar2.setForeground(new java.awt.Color(51, 0, 153));
        jButton4_voltar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/voltar (1).png"))); // NOI18N
        jButton4_voltar2.setText(" VOLTAR");
        jButton4_voltar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton4_voltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_voltar2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4_voltar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 610, 169, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/arrrrr.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 190, 130));

        jLabel11.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CADASTRO PESSOA JURÍDICA");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 530, 40));

        jLabel19.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("ENDEREÇO");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 170, 40));

        jLabel20.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("EMAIL");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 100, 40));

        jLabel21.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("TELEFONE");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 170, 40));

        jLabel23.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("CNPJ");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 80, 40));

        jLabel24.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("ID");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, 40));

        jLabel27.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("NOME");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 100, 40));

        jTextField8_enderecoJuridica.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jTextField8_enderecoJuridica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField8_enderecoJuridica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8_enderecoJuridicaKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField8_enderecoJuridica, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 430, 40));

        jTextField9_emailJuri.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jTextField9_emailJuri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField9_emailJuri.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9_emailJuriKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField9_emailJuri, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 490, 40));

        jTextField12_nomeJuridica.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jTextField12_nomeJuridica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField12_nomeJuridica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField12_nomeJuridicaKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField12_nomeJuridica, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 380, 40));

        jLabel22_FotoFisica1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jLabel22_FotoFisica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 150, 220, 190));

        jLabel26.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        jLabel26.setText("FOTO");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 100, -1, -1));

        jButton1_alterar1.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jButton1_alterar1.setForeground(new java.awt.Color(51, 0, 153));
        jButton1_alterar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/alterarIcone.png"))); // NOI18N
        jButton1_alterar1.setText("  ALTERAR");
        jButton1_alterar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton1_alterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_alterar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_alterar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 230, 169, -1));

        jButton2_incluir1.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jButton2_incluir1.setForeground(new java.awt.Color(51, 0, 153));
        jButton2_incluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/incluirIcone.png"))); // NOI18N
        jButton2_incluir1.setText("  INCLUIR");
        jButton2_incluir1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton2_incluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_incluir1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2_incluir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 190, 169, -1));

        jButton3_buscar1.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jButton3_buscar1.setForeground(new java.awt.Color(51, 0, 153));
        jButton3_buscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/lupa4.0.png"))); // NOI18N
        jButton3_buscar1.setText("  BUSCAR");
        jButton3_buscar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton3_buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_buscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3_buscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 150, 169, -1));

        jTextField8_idJuridica.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jTextField8_idJuridica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jTextField8_idJuridica, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 70, 40));

        jTextField11_razaoSocial.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jTextField11_razaoSocial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField11_razaoSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField11_razaoSocialKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField11_razaoSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 370, 40));

        jLabel25.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("RAZÃO SOCIAL");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 220, 40));

        jFormattedTextField1_cnpj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        try {
            jFormattedTextField1_cnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1_cnpj.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jFormattedTextField1_cnpj.setPreferredSize(new java.awt.Dimension(64, 27));
        getContentPane().add(jFormattedTextField1_cnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 300, 40));

        jFormattedTextField1_telefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        try {
            jFormattedTextField1_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)# ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1_telefone.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jFormattedTextField1_telefone.setPreferredSize(new java.awt.Dimension(64, 27));
        getContentPane().add(jFormattedTextField1_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 200, 40));

        jTable1_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTable1_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "CNPJ", "NOME", "RAZÃO S", "TELFONE", "EMAIL", "ENDEERECO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
            jTable1_cliente.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 890, 260));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MoreSupra/visao/icons/FADETELA.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4_voltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_voltar2ActionPerformed
        // TODO add your handling code here:
        TelaPrincipal princ = new TelaPrincipal();
        princ.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4_voltar2ActionPerformed

    private void jButton1_alterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_alterar1ActionPerformed
        try {
            PessoaJuridica cliente = new PessoaJuridica(0, jFormattedTextField1_cnpj.getText(), jTextField12_nomeJuridica.getText(), 
                    jTextField11_razaoSocial.getText(), jFormattedTextField1_telefone.getText(), jTextField9_emailJuri.getText(), 
                    jTextField8_enderecoJuridica.getText());
            
            controle.alterar(cliente);
            if (jTable1_cliente.getSelectedRow() != -1) {
                jTable1_cliente.setValueAt(jTextField8_idJuridica.getText(), jTable1_cliente.getSelectedRow(), 0);
                jTable1_cliente.setValueAt(jFormattedTextField1_cnpj.getText(), jTable1_cliente.getSelectedRow(), 1);
                jTable1_cliente.setValueAt(jTextField12_nomeJuridica.getText(), jTable1_cliente.getSelectedRow(), 2);
                jTable1_cliente.setValueAt(jTextField11_razaoSocial.getText(), jTable1_cliente.getSelectedRow(), 3);
                jTable1_cliente.setValueAt(jFormattedTextField1_telefone.getText(), jTable1_cliente.getSelectedRow(), 4);
                jTable1_cliente.setValueAt(jTextField9_emailJuri.getText(), jTable1_cliente.getSelectedRow(), 5);
                jTable1_cliente.setValueAt(jTextField8_enderecoJuridica.getText(), jTable1_cliente.getSelectedRow(), 6);
                
                
                
            jFormattedTextField1_cnpj.setText("");
            jTextField12_nomeJuridica.setText("");
            jTextField11_razaoSocial.setText("");
            jFormattedTextField1_telefone.setText("");
            jTextField9_emailJuri.setText("");
            jTextField8_enderecoJuridica.setText("");
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButton1_alterar1ActionPerformed

    private void jButton2_incluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_incluir1ActionPerformed
        try {
            File arquivo = new File("./src/com/MoreSupra/arquivoDisco/PessoaJuridica.txt");
            arquivo.createNewFile();
            PessoaJuridica cliente = new PessoaJuridica(0, jFormattedTextField1_cnpj.getText(), jTextField12_nomeJuridica.getText(), 
                    jTextField11_razaoSocial.getText(), jFormattedTextField1_telefone.getText(), jTextField9_emailJuri.getText(), 
                    jTextField8_enderecoJuridica.getText());
            
            controle.incluir(cliente);
            jFormattedTextField1_cnpj.setText("");
            jTextField12_nomeJuridica.setText("");
            jTextField11_razaoSocial.setText("");
            jFormattedTextField1_telefone.setText("");
            jTextField9_emailJuri.setText("");
            jTextField8_enderecoJuridica.setText("");
                    

            imprimirDadosNaGrid(controle.listagemDePessoas());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
        
        
    }//GEN-LAST:event_jButton2_incluir1ActionPerformed

    private void jButton3_buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_buscar1ActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser fc = new JFileChooser("./src/com/MoreSupra/imagensClientes");
            File buscar = new File(".src/com/MoreSupra/imagensClientes");
            fc.setCurrentDirectory(buscar);
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fc.showOpenDialog(this);
            File arquivo = fc.getSelectedFile();
            String nomeDoArquivo = arquivo.getPath();
            jLabel22_FotoFisica1.setText(nomeDoArquivo);
            ImageIcon iconLogo = new ImageIcon(nomeDoArquivo);
            iconLogo.setImage(iconLogo.getImage().getScaledInstance(
                jLabel22_FotoFisica1.getWidth(), jLabel22_FotoFisica1.getHeight(), 1));
        jLabel22_FotoFisica1.setIcon(iconLogo);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }//GEN-LAST:event_jButton3_buscar1ActionPerformed

    private void imprimirDadosNaGrid(ArrayList<PessoaJuridica> listaDeCliente) {
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1_cliente.getModel();
            JTableRenderer JtableRenderer = new JTableRenderer();
            jTable1_cliente.getColumnModel().getColumn(6).setCellRenderer(JtableRenderer); 

            //Limpa a tabela 
            model.setNumRows(0);
            Iterator<PessoaJuridica> lista = listaDeCliente.iterator();

            while (lista.hasNext()) {
                String[] saida = new String[7];
                PessoaJuridica aux = lista.next();
                saida[0] = aux.getId() + "";
                saida[1] = aux.getCnpj();
                saida[2] = aux.getNome();
                saida[3] = aux.getRazaoSocial();
                saida[4] = aux.getTelefone();
                saida[5] = aux.getEmail();
                saida[6] = aux.getEndereco();
                //Incluir nova linha na Tabela
                Object[] dados = {saida[0], saida[1], saida[2], saida[3], saida[4], saida[5], saida[6]};
                model.addRow(dados);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }

    }
    
    private void jTextField12_nomeJuridicaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12_nomeJuridicaKeyTyped
        char c=evt.getKeyChar();

        if(Character.isLowerCase(c)){
            evt.setKeyChar(Character.toUpperCase(c));
        }
    }//GEN-LAST:event_jTextField12_nomeJuridicaKeyTyped

    private void jTextField11_razaoSocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11_razaoSocialKeyTyped
        char c=evt.getKeyChar();

        if(Character.isLowerCase(c)){
            evt.setKeyChar(Character.toUpperCase(c));
        }
    }//GEN-LAST:event_jTextField11_razaoSocialKeyTyped

    private void jTextField9_emailJuriKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9_emailJuriKeyTyped
        char c=evt.getKeyChar();

        if(Character.isLowerCase(c)){
            evt.setKeyChar(Character.toUpperCase(c));
        }
    }//GEN-LAST:event_jTextField9_emailJuriKeyTyped

    private void jTextField8_enderecoJuridicaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8_enderecoJuridicaKeyTyped
        char c=evt.getKeyChar();

        if(Character.isLowerCase(c)){
            evt.setKeyChar(Character.toUpperCase(c));
        }
    }//GEN-LAST:event_jTextField8_enderecoJuridicaKeyTyped

    private void jTable1_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1_clienteMouseClicked
        jTable1_cliente.setValueAt(jTextField8_idJuridica.getText(), jTable1_cliente.getSelectedRow(), 0);
                jTable1_cliente.setValueAt(jFormattedTextField1_cnpj.getText(), jTable1_cliente.getSelectedRow(), 1);
                jTable1_cliente.setValueAt(jTextField12_nomeJuridica.getText(), jTable1_cliente.getSelectedRow(), 2);
                jTable1_cliente.setValueAt(jTextField8_idJuridica.getText(), jTable1_cliente.getSelectedRow(), 3);
                jTable1_cliente.setValueAt(jFormattedTextField1_telefone.getText(), jTable1_cliente.getSelectedRow(), 4);
                jTable1_cliente.setValueAt(jTextField9_emailJuri.getText(), jTable1_cliente.getSelectedRow(), 5);
    }//GEN-LAST:event_jTable1_clienteMouseClicked

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
            java.util.logging.Logger.getLogger(telaPessoaJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPessoaJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPessoaJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPessoaJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPessoaJuridica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_alterar1;
    private javax.swing.JButton jButton2_incluir1;
    private javax.swing.JButton jButton3_buscar1;
    private javax.swing.JButton jButton4_voltar2;
    private javax.swing.JFormattedTextField jFormattedTextField1_cnpj;
    private javax.swing.JFormattedTextField jFormattedTextField1_telefone;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22_FotoFisica1;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1_cliente;
    private javax.swing.JTextField jTextField11_razaoSocial;
    private javax.swing.JTextField jTextField12_nomeJuridica;
    private javax.swing.JTextField jTextField8_enderecoJuridica;
    private javax.swing.JTextField jTextField8_idJuridica;
    private javax.swing.JTextField jTextField9_emailJuri;
    // End of variables declaration//GEN-END:variables
}
