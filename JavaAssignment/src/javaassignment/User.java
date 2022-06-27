/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class User {
public String UserName,UserID,UserPassword;      

public String Delimeter = "@#;";

User (String UN,String UID, String Pass){
UserName = UN;
UserID = UID;
UserPassword = Pass;

}



public boolean CreateUser(){
boolean sucess = true;

    try{

            FileWriter fw = new FileWriter("User.txt",true);
            fw.write( this.UserName + Delimeter + this.UserID +Delimeter+ this.UserPassword + Delimeter);
            fw.write(System.getProperty("line.separator"));
            fw.close();
            
            
        } catch (IOException ex) {
            sucess = false;
            JOptionPane.showMessageDialog(null, "Error Occurred");
        }
    return sucess;
}


}
