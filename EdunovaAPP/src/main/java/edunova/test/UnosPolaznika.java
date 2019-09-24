/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.test;

import edunova.controller.ObradaPolaznik;
import edunova.model.Polaznik;
import edunova.utility.Utility;

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
            
            
            
        }
    }
    
}
