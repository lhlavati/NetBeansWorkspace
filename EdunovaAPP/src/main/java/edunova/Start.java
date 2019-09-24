/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova;

import edunova.test.PocetniInsert;
import edunova.test.TestGrupa;
import edunova.view.SplashScreen;

/**
 *
 * @author Admin
 */
public class Start {
    
    public static void main(String[] args) {
       
           
            new SplashScreen().setVisible(true);
            /*
            Na novom računalu postaviti u hibernate.cfg.xml
            <property name="hbm2ddl.auto">create</property>
            pa izvesti PocetniInsert.izvedi()
            pa vratiti 
            <property name="hbm2ddl.auto">update</property>
            */
            //PocetniInsert.izvedi();
       
    }
    
}
