package com.shashi.basic;

import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.Scanner;


public class DateDemo 
{  
      public static void main(String[] args)throws Exception
  {
	
	 @SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Date(Format dd/MM/yyyy)");
	 String s =sc.next();
	 
	SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
	
	Date d =sm.parse(s);
	 
	sm =new SimpleDateFormat("EEEE");
	
	System.out.println(sm.format(d));
  }  
} 