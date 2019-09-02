/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author Admin
 */
@Entity
public class Grupa extends Entitet implements Serializable{
    
    private String naziv;
    
    private Date datumPocetka;
    
    @ManyToOne
    private Smjer smjer;
    
    @ManyToOne
    private Predavac predavac;
    
    @ManyToMany
    private List<Polaznik> polaznici;

    public Grupa() {
        super();
    }

    public Grupa(String naziv, Date datumPocetka, Smjer smjer, Predavac predavac, List<Polaznik> polaznici, Integer sifra) {
        super(sifra);
        this.naziv = naziv;
        this.datumPocetka = datumPocetka;
        this.smjer = smjer;
        this.predavac = predavac;
        this.polaznici = polaznici;
    }
    
    
    
    
    

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Date getDatumPocetka() {
        return datumPocetka;
    }

    public void setDatumPocetka(Date datumPocetka) {
        this.datumPocetka = datumPocetka;
    }

    public Smjer getSmjer() {
        return smjer;
    }

    public void setSmjer(Smjer smjer) {
        this.smjer = smjer;
    }

    public Predavac getPredavac() {
        return predavac;
    }

    public void setPredavac(Predavac predavac) {
        this.predavac = predavac;
    }

    public List<Polaznik> getPolaznici() {
        return polaznici;
    }

    public void setPolaznici(List<Polaznik> polaznici) {
        this.polaznici = polaznici;
    }
    
    
}
