/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Operater;
import edunova.utility.EdunovaException;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ObradaOperater extends ObradaOsoba<Operater>{

    @Override
    public List<Operater> getEntiteti() {
        return session.createQuery("from Operater").list();
    }
    
    public Operater getOperater(String email){
        
        return (Operater)session.createQuery("from Operater a "
                + " where a.email=:email ")
                .setParameter("email", email).list().get(0);
        
        
    }

    @Override
    protected void kontrolaOIB(String oib) throws EdunovaException {
        
    }
    
    
    
}
