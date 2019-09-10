/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Grupa;
import edunova.utility.EdunovaException;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ObradaGrupa extends Obrada<Grupa>{

    @Override
    protected void kontrolaSpremi(Grupa entitet) throws EdunovaException {
        
    }

    @Override
    protected void kontrolaBrisi(Grupa entitet) throws EdunovaException {
        
    }

    @Override
    public List<Grupa> getEntiteti() {
        return session.createQuery("from Grupa").list();
    }
    
}
