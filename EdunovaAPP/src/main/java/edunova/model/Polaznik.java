/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author Admin
 */
@Entity
public class Polaznik extends Osoba implements Serializable{
    
    private String brojUgovora;
    
    @ManyToMany(mappedBy = "polaznici")
    private List<Grupa> grupe=new ArrayList<>();

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

    public List<Grupa> getGrupe() {
        return grupe;
    }

    public void setGrupe(List<Grupa> grupe) {
        this.grupe = grupe;
    }
    
    
    
}
