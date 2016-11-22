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
public class BronzeSeat extends Seat{
    private double price;
    
    public BronzeSeat(String seatID, String name, double price){
        super(seatID, name);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
