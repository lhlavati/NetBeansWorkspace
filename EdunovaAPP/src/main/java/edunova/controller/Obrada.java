/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.utility.EdunovaException;
import edunova.utility.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
public abstract class Obrada<T> {
    
    protected abstract void kontrolaSpremi()throws EdunovaException;
    protected abstract void kontrolaBrisi()throws EdunovaException;
    
    protected Session session;

    public Obrada() {
        this.session = HibernateUtil.getSession();
    }
    
    public T spremi(T entitet) throws EdunovaException{
        //polimorfizam
        kontrolaSpremi();
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
        
        return entitet;
    }
    
    public void brisi(T entitet)throws EdunovaException{
        kontrolaBrisi();
        session.beginTransaction();
        session.delete(entitet);
        session.getTransaction().commit();
    }
    
    
    
}
