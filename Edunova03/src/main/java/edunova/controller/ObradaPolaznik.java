/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Polaznik;
import edunova.utility.EdunovaException;
import edunova.utility.ObradaInterface;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ObradaPolaznik extends Obrada<Polaznik> implements ObradaInterface<Polaznik>{

    public ObradaPolaznik() {
        super();
    }
    
    //implementacija CRUD

    @Override
    public Polaznik create(Polaznik entitet) throws EdunovaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Polaznik> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Polaznik entitet) throws EdunovaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Polaznik entitet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
