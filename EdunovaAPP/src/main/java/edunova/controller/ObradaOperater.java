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

    @Override
    protected void kontrolaOIB(String oib) throws EdunovaException {
        
    }
    
    
    
}
