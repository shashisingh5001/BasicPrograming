//Set1-Q1

package com.shashi.basic;
import java.util.*;
public class Evenodd 
{

	public static void main(String[] args) 
	{
         int n,m,sum=0;
         
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Number");
		
		m=sc.nextInt();
		
		while( m>0)
		{
			n=m%10;	
			
			m=m/10;
			sum=sum+n;
			
		}
		System.out.println(sum);
	}

}
	