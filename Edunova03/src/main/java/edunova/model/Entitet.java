/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

/**
 *
 * @author Admin
 */
public abstract class Entitet {
    
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
