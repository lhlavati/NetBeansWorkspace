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
public class ObradaSmjer extends Obrada<Smjer> {

    @Override
    public List<Smjer> getEntiteti() {
        return session.createQuery("from Smjer").list();
    }

    @Override
    protected void kontrolaSpremi(Smjer entitet) throws EdunovaException {
        kontrolaNaziv(entitet);
        kontrolaTrajanje(entitet);
    }

    @Override
    protected void kontrolaBrisi(Smjer entitet) throws EdunovaException {

    }

    private void kontrolaNaziv(Smjer entitet) throws EdunovaException {
        if (entitet.getNaziv() == null
                || entitet.getNaziv().trim().length() == 0) {
            throw new EdunovaException("Naziv smjera obavezno");
        }
    }

    private void kontrolaTrajanje(Smjer entitet) throws EdunovaException {
        if (entitet.getTrajanje() <= 0 || entitet.getTrajanje() > 300) {
            throw new EdunovaException("Trajanje mora biti između 1 i 300 sati");
        }
    }

}
