/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Admin
 */
@Entity
public class Operater extends Osoba implements Serializable{
    
    
    private String lozinka;

    public Operater() {
        super();
    }

    public Operater( Integer sifra, String ime, String prezime, String oib, String email,String lozinka) {
        super(sifra, ime, prezime, oib, email);
        this.lozinka = lozinka;
    }
    
    

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }
    
    
}
