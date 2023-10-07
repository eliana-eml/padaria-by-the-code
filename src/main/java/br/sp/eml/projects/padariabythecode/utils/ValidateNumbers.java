/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.sp.eml.projects.padariabythecode.utils;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author eduar
 */
public class ValidateNumbers extends PlainDocument {

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        super.insertString(offs, str.replaceAll("[^0-9]", ""), a); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
