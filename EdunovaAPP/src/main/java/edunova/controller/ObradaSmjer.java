/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Smjer;
import edunova.utility.EdunovaException;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ObradaSmjer extends Obrada<Smjer>{

    
    public List<Smjer> getSmjerovi(){
        return session.createQuery("from Smjer").list();
    }
    
    @Override
    protected void kontrolaSpremi() throws EdunovaException{
      //napisati kontrole 
    }

    @Override
    protected void kontrolaBrisi()throws EdunovaException {
        
    }
    
}
