/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Grupa;
import edunova.utility.EdunovaException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ObradaGrupa extends Obrada<Grupa>{

    @Override
    protected void kontrolaSpremi(Grupa entitet) throws EdunovaException {
        kontrolaNaziv(entitet);
        kontrolaSmjer(entitet);
        kontrolaPredavac(entitet);
        kontrolaDatumPocetka(entitet);
    }

    @Override
    protected void kontrolaBrisi(Grupa entitet) throws EdunovaException {
        
    }

    @Override
    public List<Grupa> getEntiteti() {
        return session.createQuery("from Grupa").list();
    }

    private void kontrolaNaziv(Grupa entitet) throws EdunovaException{
        if(entitet.getNaziv().trim().length()==0){
            throw new EdunovaException("Naziv obavezno");
        }
        if(entitet.getNaziv().trim().length()>255){
            throw new EdunovaException("Naziv predugačak");
        }
    }
    
    private void kontrolaSmjer(Grupa entitet) throws EdunovaException{
        if(entitet.getSmjer().getSifra().equals(0)){
            throw new EdunovaException("Obavezna odabir smjera");
        }
    }
    
    private void kontrolaPredavac(Grupa entitet) throws EdunovaException{
        if(entitet.getPredavac().getSifra().equals(0)){
           entitet.setPredavac(null);
        }
    }
    
    private void kontrolaDatumPocetka(Grupa entitet) throws EdunovaException{
        if(entitet.getDatumPocetka()==null){
            return;
        }
        
        if(entitet.getDatumPocetka().before(new Date())){
            throw new EdunovaException("Datum početka ne može biti prije danas");
        }
        
        GregorianCalendar c = (GregorianCalendar) Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.YEAR, 3);
        if(entitet.getDatumPocetka().after(c.getTime())){
            throw new EdunovaException("Datum početka ne može biti nakjon 3 godine od danas");
        }
        
    }
    
}
