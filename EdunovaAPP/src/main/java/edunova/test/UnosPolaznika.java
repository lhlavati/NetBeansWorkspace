/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.test;

import edunova.controller.ObradaPolaznik;
import edunova.model.Polaznik;
import edunova.utility.EdunovaException;
import edunova.utility.Utility;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class UnosPolaznika {
    
    public static void izvedi(int ukupno){
        ObradaPolaznik obrada = new ObradaPolaznik();
        Polaznik p;
        for(int i=0;i<ukupno;i++){
            p=new Polaznik();
            p.setIme("Polaznik");
            p.setPrezime("" +i);
            p.setOib(Utility.dohvatiOib());
            
            try {
                p = obrada.spremi(p);
                
                System.out.println("Spremio " + p.getSifra());
                
            } catch (EdunovaException ex) {
                System.out.println(ex.getPoruka());
            }
            
            try {
                Thread.sleep((int)Math.random()*1000);
            } catch (InterruptedException ex) {
                
            }
            
            
        }
    }
    
}
