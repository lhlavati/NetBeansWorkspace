/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Predavac;
import edunova.utility.EdunovaException;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ObradaPredavac extends ObradaOsoba<Predavac>{

    @Override
    public List<Predavac> getEntiteti() {
        return session.createQuery("from Predavac").list();
    }
    
}
