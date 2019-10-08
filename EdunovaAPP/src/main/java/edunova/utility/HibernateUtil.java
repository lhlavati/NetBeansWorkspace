/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.utility;

import java.io.File;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Admin
 */
//singleton pattern
public class HibernateUtil {
    
    private static Session session;
    
    //zabranimo konstruiranje klase
    protected HibernateUtil(){
        
    }
    
    public static Session getSession(){
        if(session==null){
            try {
                
                /*
                String putanjaDirektorija = new File(HibernateUtil.class.getProtectionDomain().
                        getCodeSource().getLocation().toURI()).getParent();
                
                
                session = new Configuration()
                        .configure(new File(putanjaDirektorija + File.separator + "hibernate.cfg.xml"))
                        // design pattern: FactoryPattern
                        .buildSessionFactory()
                        .openSession();
*/
                
                 session = new Configuration()
                        .configure()
                        // design pattern: FactoryPattern
                        .buildSessionFactory()
                        .openSession();
                
            } catch (Throwable e) {
                //ovdeje će završiti ako imamo problema s hibernate.cfg.xml
                throw new ExceptionInInitializerError(e);
            }
        }
        
        return session;
    }
    
}
