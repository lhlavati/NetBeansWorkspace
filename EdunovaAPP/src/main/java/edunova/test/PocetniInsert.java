/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.test;

import edunova.controller.ObradaGrupa;
import edunova.controller.ObradaOperater;
import edunova.controller.ObradaSmjer;
import edunova.model.Grupa;
import edunova.model.Operater;
import edunova.model.Smjer;
import edunova.utility.EdunovaException;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Admin
 */
public class PocetniInsert {
    
    public static void izvedi(){
        Smjer s = new Smjer();
        s.setNaziv("Java programiranje");
        s.setTrajanje(130);
        ObradaSmjer obrada = new ObradaSmjer();
        try {
            s = obrada.spremi(s);
        } catch (EdunovaException e) {
            System.out.println(e.getPoruka());
        }

       
         Grupa g = new Grupa();
        g.setNaziv("J20");
        g.setSmjer(s);
        ObradaGrupa obradag = new ObradaGrupa();
        try {
            obradag.spremi(g);
        } catch (EdunovaException ex) {
            System.out.println(ex.getPoruka());
        }
        
         Operater o = new Operater();
        o.setIme("Tomislav");
        o.setPrezime("Jakopec");
        o.setEmail("tjakopec@gmail.com");
        o.setLozinka(BCrypt.hashpw("t", BCrypt.gensalt()));

        ObradaOperater obradao = new ObradaOperater();
        try {
            o = obradao.spremi(o);
        } catch (EdunovaException e) {
            System.out.println(e.getPoruka());
        }
        
        System.out.println("GOTOV");
    }
    
}
