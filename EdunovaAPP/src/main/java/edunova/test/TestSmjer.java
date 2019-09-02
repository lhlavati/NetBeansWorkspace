/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.test;

import edunova.controller.ObradaSmjer;
import edunova.model.Smjer;
import edunova.utility.EdunovaException;
import edunova.utility.HibernateUtil;
import java.math.BigDecimal;

/**
 *
 * @author Admin
 */
public class TestSmjer {

    public static void test() {
        Smjer s = new Smjer();
        s.setNaziv("Java programiranje");

        ObradaSmjer obrada = new ObradaSmjer();
        try {
            s = obrada.spremi(s);
        } catch (EdunovaException e) {
            System.out.println(e.getPoruka());
        }

        System.out.println(s.getSifra());

        Smjer zaPromjenu = HibernateUtil.getSession().get(Smjer.class, 1);

        zaPromjenu.setCijena(new BigDecimal(5000));
        try {
            obrada.spremi(zaPromjenu);
        } catch (EdunovaException e) {
            System.out.println(e.getPoruka());
        }

        for (Smjer smjer : obrada.getSmjerovi()) {
            System.out.println(smjer.getSifra() + ": "
                    + smjer.getNaziv());
        }
        try {
            obrada.brisi(s);
        } catch (EdunovaException e) {
            System.out.println(e.getPoruka());
        }

    }

}
