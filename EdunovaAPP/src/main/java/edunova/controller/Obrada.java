/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Entitet;
import edunova.utility.EdunovaException;
import edunova.utility.HibernateUtil;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
public abstract class Obrada<T extends Entitet> {
    
    protected abstract void kontrolaSpremi(T entitet)throws EdunovaException;
    protected abstract void kontrolaBrisi(T entitet)throws EdunovaException;
    public abstract List<T> getEntiteti();
    
    protected Session session;

    public Obrada() {
        this.session = HibernateUtil.getSession();
    }
    
    public T spremi(T entitet) throws EdunovaException{
        //polimorfizam
        kontrolaSpremi(entitet);
        entitet.setDatumPromjene(new Date());
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
        
        return entitet;
    }
    
    public void brisi(T entitet)throws EdunovaException{
        kontrolaBrisi(entitet);
        session.beginTransaction();
        session.delete(entitet);
        session.getTransaction().commit();
    }
    
    
    
}
