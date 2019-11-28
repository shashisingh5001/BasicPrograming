package com.shashi.basic;

//import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateG 
{
		
   public static void main(String[] args)throws Exception
   {
     
	   public static int getOccurenceOfDayInMonth() {
		    return Calendar.getInstance().get(Calendar.DAY_OF_WEEK_IN_MONTH);
		}
	   
	   /*String sd="21/3/1990";
      Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sd);
      System.out.println(date1);
	  //LocalDate d= LocalDate.now(); 
	  //System.out.println(d);
   }
}
