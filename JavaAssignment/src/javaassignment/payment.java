/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

/**
 *
 * @author Kriso
 */

public class payment extends Booking{
    
 public int DayofStay;
 public double RoomCharges,ServiceTax,TourismTax;
 
 payment (String ID, String OD,int DOS,double RC,double ST,double TT)
 {
     
     super (ID,OD);
     DayofStay = DOS;
     RoomCharges = RC;
     ServiceTax = ST;
     TourismTax = TT;
 }
 
    public int GetDay(){
     return DayofStay;
     }
     public double GetCharges(){
     return RoomCharges;
     }
     public double GetSTax(){
     return ServiceTax;
     }
     public double GetTTax(){
     return TourismTax;
     }
     
     public double GetPayment(){
     
     double p = GetDay()*GetCharges();
     return p;
     }
      
     public double GetPaymentSTax(){
         
     double ST = GetPayment()*GetSTax();
     return ST;
     }   
     
     public double GetPaymentTTax(){
         
     double TT = GetDay()*GetTTax();
     return TT;
     }   
     
     public double GetTotalPayment(){
         
     double TP = GetPayment()+GetPaymentSTax()+GetPaymentTTax();
     return TP;
     }  
}
