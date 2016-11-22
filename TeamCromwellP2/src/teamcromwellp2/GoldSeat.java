/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamcromwellp2;

import java.util.Random;

/**
 *
 * @author julesandsteve
 */
public class GoldSeat extends Seat {
    private double price;
    
    
    public GoldSeat(String seatID, String name, double price){
        super(seatID, name);
        this.price = price;
        
        
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    public boolean raffleDraw(String seatID){
        boolean result = false;
        Random rn = new Random();
        int seatNumber = rn.nextInt(10) + 1;
        int winningNumber = rn.nextInt(10) + 1;
        if(seatNumber == winningNumber){
            result = true;
            return result;
        }
        else{
            return result;
        }
        
    }
            
}
