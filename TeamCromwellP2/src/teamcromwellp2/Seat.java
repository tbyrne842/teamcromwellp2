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
abstract public class Seat {
    private String seatID;
    private boolean booked;
    private String name;
    
    public Seat(String seatID,String name){
        this.seatID = seatID;
        this.booked = false;
        this.name = name;
    }

    public String getSeatID() {
        return seatID;
    }

    public void setSeatID(String seatID) {
        this.seatID = seatID;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
  
   
    
}
