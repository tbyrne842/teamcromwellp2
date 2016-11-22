/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamcromwellp2;

/**
 *
 * @author julesandsteve
 */
public class SilverSeat extends Seat{
    private double price;
    private boolean freeProgramme = false;
    
    public SilverSeat(String seatID, String name, double price){
        super(seatID, name);
        this.price = price;
        this.freeProgramme = true;
        
    }
    //constructor for Silver seat, remember that admin must be prompted to have their programme allocated to them

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isFreeProgramme() {
        return freeProgramme;
    }

    public void setFreeProgramme(boolean freeProgramme) {
        this.freeProgramme = freeProgramme;
    }
    
    
    
}
