/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.view;

import edunova.model.Smjer;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Admin
 */
public class SmjerCellRenderer extends JLabel implements ListCellRenderer<Smjer>{

    @Override
    public Component getListCellRendererComponent(JList<? extends Smjer> list, Smjer value, int index, boolean isSelected, boolean cellHasFocus) {
        String naziv = value.getNaziv();
        setText(naziv);
        
        if (isSelected) {
            setBackground(Color.GRAY);
            setForeground(Color.BLACK);
        } else {
            setBackground(Color.WHITE);
            setForeground(Color.BLACK);
        }
        
        return this;
    }
    
}
