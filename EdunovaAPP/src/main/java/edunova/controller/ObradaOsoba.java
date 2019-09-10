/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Osoba;
import edunova.utility.EdunovaException;
import java.util.List;

/**
 *
 * @author Admin
 * @param <T> extends Osoba
 */
public abstract class ObradaOsoba<T extends Osoba> extends Obrada<T>{

    @Override
    protected void kontrolaSpremi(T entitet) throws EdunovaException {
        //kontrola imena, prezimena, email, oib
        kontrolaOIB(entitet.getOib());
    }

    @Override
    protected void kontrolaBrisi(T entitet) throws EdunovaException {
        
    }

    protected void kontrolaOIB(String oib) throws EdunovaException{
        if (oib.length() != 11){
            throw new EdunovaException("OIB mora imati 11 znamenaka");
        }
            

        try {
            Long.parseLong(oib);
        } catch (NumberFormatException e) {
            throw new EdunovaException("OIB ima znak koji nije brojčani");
        }

        int a = 10;
        for (int i = 0; i < 10; i++) {
            a = a + Integer.parseInt(oib.substring(i, i+1));
            a = a % 10;
            if (a == 0)
                a = 10;
            a *= 2;
            a = a % 11;
        }
        int kontrolni = 11 - a;
        if (kontrolni == 10)
            kontrolni = 0;

        if(kontrolni != Integer.parseInt(oib.substring(10))){
            throw new EdunovaException("OIB je neispravan");
        }
    }

    
    
}
