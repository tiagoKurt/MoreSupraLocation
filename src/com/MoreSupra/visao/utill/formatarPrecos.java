/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MoreSupra.visao.utill;

import java.awt.Component;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Pichau
 */
public class formatarPrecos extends DefaultTableCellRenderer{
    
    NumberFormat nf = NumberFormat.getCurrencyInstance((new Locale("pt", "BR")));
    
    public Component getTableCellRendererComponent(JTable table, Object value,
                          boolean isSelected, boolean hasFocus, int row, int column){
        
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        if(value instanceof Float){
            this.setText(nf.format((Float) value));
        }
        return this;
    }
}
