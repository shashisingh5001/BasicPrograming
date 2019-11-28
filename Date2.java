package com.shashi.basic;


//Java Program illustrating  
//use of parse() method 

import java.text.*; 
import java.util.Calendar; 

public class Date2 
{ 
 public static void main(String[] args) throws InterruptedException 
 { 
     SimpleDateFormat geek = new SimpleDateFormat("dd / MM / yyyy"); 
     try
     { 
         Calendar c = Calendar.getInstance(); 

         // Use of .parse() method to parse Date From String 's' 
         String s = "20 / 11 / 2019" ; 
           
         c.setTime(geek.parse(s)); 
         System.out.println("Time parsed from String : "+c.getTime()); 
     } 
     catch (ParseException excpt) 
     { 
         excpt.printStackTrace(); 
     } 
 } 
} 
