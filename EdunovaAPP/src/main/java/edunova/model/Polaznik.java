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
public class Polaznik extends Osoba implements Serializable{
    
    private String brojUgovora;

    public Polaznik() {
        super();
    }

    public Polaznik(Integer sifra, String ime, String prezime, String oib, String email, String brojUgovora) {
        super(sifra, ime, prezime, oib, email);
        this.brojUgovora = brojUgovora;
    }
    
    

    public String getBrojUgovora() {
        return brojUgovora;
    }

    public void setBrojUgovora(String brojUgovora) {
        this.brojUgovora = brojUgovora;
    }
    
    
    
}
