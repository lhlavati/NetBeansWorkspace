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
public class Polaznik extends Osoba{
    
    private String brojUgovora;

    public Polaznik() {
    }

    public Polaznik(String brojUgovora, Integer sifra, String oib, String ime, String prezime, String email) {
        super(sifra, oib, ime, prezime, email);
        this.brojUgovora = brojUgovora;
    }
    
    
    

    public String getBrojUgovora() {
        return brojUgovora;
    }

    public void setBrojUgovora(String brojUgovora) {
        this.brojUgovora = brojUgovora;
    }
    
    
    
}
