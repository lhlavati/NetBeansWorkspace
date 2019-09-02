/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Admin
 */
@MappedSuperclass
public abstract class Entitet {

    @Id
    @GeneratedValue
    private Integer sifra;

    public Entitet() {
    }

    public Entitet(Integer sifra) {
        this.sifra = sifra;
    }

    public Integer getSifra() {
        return sifra;
    }

    public void setSifra(Integer sifra) {
        this.sifra = sifra;
    }

}
