/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova;

import edunova.controller.ObradaSmjer;
import edunova.model.Smjer;
import edunova.utility.EdunovaException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Admin
 */
public class Start {
    
    public static void main(String[] args) {
     //ovo je CLI view
        Smjer s = new Smjer();
        s.setNaziv(JOptionPane.showInputDialog("Unesi ime"));
        
        
        ObradaSmjer os = new ObradaSmjer();
        
        try {
            os.create(s);
           
        } catch (EdunovaException ex) {
            System.out.println(ex.getPoruka());
        }
        
        
    }
    
}
