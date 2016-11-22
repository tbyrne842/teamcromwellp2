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
public class Admin {
    private String adminID;
    private String password;
    
    public Admin(String adminID, String password){
        this.adminID = adminID;
        this.password = password;
    }
    
    public Boolean login(String adminID, String password){
        boolean login = false;
        if((this.adminID.equals(adminID)) && (this.password.equals(password))){
            login = true;
            return login;
        }
        else{
            return login;
            
        }
    }
    
}
