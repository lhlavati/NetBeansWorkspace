/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Smjer;
import edunova.utility.EdunovaException;
import edunova.utility.ObradaInterface;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ObradaSmjer extends Obrada<Smjer> implements ObradaInterface<Smjer>{
    
    
    public  ObradaSmjer(){
        super();
    }
    
    public List<Smjer> read(){
        //ovdje ćemo otići u bazu po podatke
        List<Smjer> smjerovi = new ArrayList<>();
        
        Smjer s = new Smjer(
                1, 
                "Java", 
                130, 
                new BigDecimal(5000),
                new BigDecimal(500), 
                true
        );
        
        smjerovi.add(s);
        
        return smjerovi;
    }
    
    public Smjer create(Smjer s) throws EdunovaException{
        //kontrolira
        kontrolaNaziv(s);
        
        //ovdje dođu sve ostale kontrole
        
        //sprema
        s= dao.spremi(s);
        
        //vraća s ID
        return s;
    }
    
    public void update(Smjer s) throws EdunovaException{
        
        kontrolaNaziv(s);
        
        dao.spremi(s);
    }

    private void kontrolaNaziv(Smjer s) throws EdunovaException {
        if(s.getNaziv()!=null){
            s.setNaziv(s.getNaziv().trim());
        }
        
        if(s.getNaziv()==null || s.getNaziv().length()==0){
            throw new EdunovaException("Naziv mora biti postavljen");
        }
        
        if(s.getNaziv().length()>50){
            throw new EdunovaException("Naziv može biti maksimalno 50 znakova");
        }
    }
    
    public boolean delete(Smjer s){
        
        System.out.println("Brišem u bazi");
        
        return true;
    }
    
}
