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
public class Predavac extends Osoba implements Serializable{
    
    private String iban;

    public Predavac() {
        super();
    }

    public Predavac(Integer sifra, String ime, String prezime, String oib, String email,String iban) {
        super(sifra, ime, prezime, oib, email);
        this.iban = iban;
    }
  

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
    
    
    
}
