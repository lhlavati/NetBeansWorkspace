/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.test;

import edunova.controller.ObradaGrupa;
import edunova.controller.ObradaSmjer;
import edunova.model.Grupa;
import edunova.model.Smjer;
import edunova.utility.EdunovaException;
import edunova.utility.HibernateUtil;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class TestGrupa {

    public static void test() {
        Smjer prvi = 
                HibernateUtil.getSession().get(Smjer.class, 1);

        Grupa g = new Grupa();
        g.setNaziv("J20");
        g.setSmjer(prvi);
        ObradaGrupa obrada = new ObradaGrupa();
        try {
            obrada.spremi(g);
        } catch (EdunovaException ex) {
            System.out.println(ex.getPoruka());
        }
        
    }

}
