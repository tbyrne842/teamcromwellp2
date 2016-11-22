/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamcromwellp2;

import java.util.Date;

/**
 *
 * @author julesandsteve
 */
public class Concert {
    private String concertID;
    private Date concertDate;
  
    
    public Concert(String concertID, Date concertDate){
        this.concertID = concertID;
        this.concertDate = concertDate;
      
    }

    public String getConcertID() {
        return concertID;
    }

    public void setConcertID(String concertID) {
        this.concertID = concertID;
    }

    public Date getConcertDate() {
        return concertDate;
    }

    public void setConcertDate(Date concertDate) {
        this.concertDate = concertDate;
    }
    
}
