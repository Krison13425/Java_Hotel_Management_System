
package javaassignment;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Booking {
    
 public String CustomerName,CustomerEM,Room,CustomerIC,CustomerContact;      
 protected String Inday,Outday;
 
 public String Delimeter = "@#;";

Booking(String ID,String OD){
Inday = ID;
Outday = OD;
}
        
Booking (String CN,String CIC,String CC, String CEM, String ID, String OD,String R){
CustomerName = CN;
CustomerIC = CIC;
CustomerContact = CC;
CustomerEM = CEM;
Inday = ID;
Outday = OD;
Room = R;
}

public String GetInday()
{
return Inday ;
}
public String GetOutday()
{
return Outday;
}
public String GetRoom()
{
return Room;
}


 

public boolean save(){
boolean sucess = true;

    try{

            FileWriter fw = new FileWriter("F1Booking.txt",true);
            fw.write( this.CustomerName + Delimeter + this.CustomerIC +Delimeter+ this.CustomerContact + Delimeter+ this.CustomerEM
                    + Delimeter + this.Inday +Delimeter + this.Outday + Delimeter+ this.Room +Delimeter);
            fw.write(System.getProperty("line.separator"));
            fw.close();
            
            
        } catch (IOException ex) {
            sucess = false;
            JOptionPane.showMessageDialog(null, "Error Occurred");
        }
    return sucess;
}

public boolean save2(){
boolean sucess = true;

    try{
            FileWriter fw = new FileWriter("F2Booking.txt",true);
            fw.write( this.CustomerName + Delimeter + this.CustomerIC +Delimeter+ this.CustomerContact + Delimeter+ this.CustomerEM
                    + Delimeter + this.Inday +Delimeter + this.Outday + Delimeter+ this.Room +Delimeter);
            fw.write(System.getProperty("line.separator"));
            fw.close();
            
            
        } catch (IOException ex) {
            sucess = false;
            JOptionPane.showMessageDialog(null, "Error Occurred");
        }
    return sucess;
}
}
