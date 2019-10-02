/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author Admin
 */
//@Entity(name = "smjer_tablica")
@Entity
public class Smjer extends Entitet implements Serializable {
    
   
    //@Column(name = "naz", length = 34, columnDefinition = "char")
    private String naziv;
    private BigDecimal cijena;
    private BigDecimal upisnina;
    private Integer trajanje;
    private boolean certificiran;
    
    @OneToMany(mappedBy = "smjer")
    private List<Grupa> grupe = new ArrayList<>();

    public List<Grupa> getGrupe() {
        return grupe;
    }

    public void setGrupe(List<Grupa> grupe) {
        this.grupe = grupe;
    }
    
    

    public Smjer() {
        super();
    }

    public Smjer(Integer sifra, String naziv, BigDecimal cijena, BigDecimal upisnina, Integer trajanje, boolean certificiran) {
        super(sifra);
        this.naziv = naziv;
        this.cijena = cijena;
        this.upisnina = upisnina;
        this.trajanje = trajanje;
        this.certificiran = certificiran;
    }

   

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public BigDecimal getUpisnina() {
        return upisnina;
    }

    public void setUpisnina(BigDecimal upisnina) {
        this.upisnina = upisnina;
    }

    public Integer getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(Integer trajanje) {
        this.trajanje = trajanje;
    }

    public boolean isCertificiran() {
        return certificiran;
    }

    public void setCertificiran(boolean certificiran) {
        this.certificiran = certificiran;
    }

    
    @Override
    public String toString() {
        return naziv;
    }
    
    

    
    
}
