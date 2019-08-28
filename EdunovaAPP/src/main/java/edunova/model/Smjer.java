/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Admin
 */
//@Entity(name = "smjer_tablica")
@Entity
public class Smjer implements Serializable {
    
    @Id
    private Integer sifra;
    //@Column(name = "naz", length = 34, columnDefinition = "char")
    private String naziv;
    private BigDecimal cijena;
    private BigDecimal upisnina;
    private Integer trajanje;
    private boolean certificiran;
    
    @Column(name = "ttt", 
            columnDefinition = "char(11)",
            nullable = true)
    private String nova;

    public String getNova() {
        return nova;
    }

    public void setNova(String nova) {
        this.nova = nova;
    }
    
    

    public Smjer() {
    }

    public Smjer(Integer sifra, String naziv, BigDecimal cijena, BigDecimal upisnina, Integer trajanje, boolean certificiran) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.cijena = cijena;
        this.upisnina = upisnina;
        this.trajanje = trajanje;
        this.certificiran = certificiran;
    }

    public Integer getSifra() {
        return sifra;
    }

    public void setSifra(Integer sifra) {
        this.sifra = sifra;
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
    
    

    
    
}
