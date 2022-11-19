/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MoreSupra.visao.utill;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Pichau
 */
public class limitaCaracteres extends PlainDocument {

    public enum tipoEntrada {
        NUMEROINTEIRO,
        NOME,
        EMAIL,
        DATA,
        PLACA,
        ENDERECO,
        PRECO,
        DESCRICAO;
    };
    private int qtdCaracteres;
    private tipoEntrada tpEntrada;

    public limitaCaracteres(int qtdCaracteres, tipoEntrada tpEntrada) {
        this.qtdCaracteres = qtdCaracteres;
        this.tpEntrada = tpEntrada;
    }

    @Override
    public void insertString(int i, String string, AttributeSet a) throws BadLocationException {
        if (string == null || getLength() == qtdCaracteres) {
            return;
        }
        int totalCarac = getLength() + string.length();

        String regex = "";
        switch (tpEntrada) {
            case NUMEROINTEIRO:
                regex = "[^0-9]";
                break;
            case PLACA:
                regex = "[^\\p{IsLatin}\\ ^0-9]";
                break;
            case NOME:
                regex = "[^\\p{IsLatin} ]";
                break;
            case EMAIL:
                regex = "[^\\p{IsLatin}@.\\-_\\^0-9]";
                break;
            case DATA:
                regex = "[^0-9/]";
                break;
            case ENDERECO:
                regex = "[^\\p{IsLatin}\\^0-9\\ ,-]";
                break;
            case PRECO:
                regex = "[^0-9\\.]";
                break;
            case DESCRICAO:
                regex = "[^\\p{IsLatin}\\ ^0-9]";
                break;
        }

        string = string.replaceAll(regex, "");

        if (totalCarac <= qtdCaracteres) {
            super.insertString(i, string, a);
        } else {
            String nova = string.substring(0, qtdCaracteres);
            super.insertString(i, nova, a);

        }
    }
}
