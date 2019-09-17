/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova;

import edunova.test.TestOperater;
import edunova.test.TestSmjer;
import edunova.utility.HibernateUtil;
import edunova.view.Autorizacija;
import edunova.view.SplashScreen;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Start {
    
    public static void main(String[] args) {
       
            //HibernateUtil.getSession();
            //TestOperater.test();
            new SplashScreen().setVisible(true);
       
    }
    
}
