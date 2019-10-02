/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Polaznik;
import edunova.utility.EdunovaException;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ObradaPolaznik extends ObradaOsoba<Polaznik>{

    @Override
    public List<Polaznik> getEntiteti() {
        return session.createQuery("from Polaznik").list();
    }
    
    public List<Polaznik> getEntiteti(String uvjet) {
        return session.createQuery("from Polaznik a "
                + " where a.ime like :uvjet or "
                + " a.prezime like :uvjet")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(20)
                .list();
    }


    @Override
    protected void kontrolaSpremi(Polaznik entitet) throws EdunovaException {
        super.kontrolaSpremi(entitet); //kontrole ObradaOsoba
        //moje kontrole Polaznika
        kontrolaBrojUgovora(entitet);
    }

    @Override
    protected void kontrolaBrisi(Polaznik entitet) throws EdunovaException {
        super.kontrolaBrisi(entitet); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    private void kontrolaBrojUgovora(Polaznik entitet) throws EdunovaException {
        
    }
    
    
    
}
