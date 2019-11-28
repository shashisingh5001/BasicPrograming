
package com.shashi.basic;

import java.util.Scanner;

public class SET1 {

	public static void main(String[] args) 
	{
		int n,m,sum=0;
        
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Number");
		
		m=sc.nextInt();
		
		while(m>0)
		{
			n=m%10;
			m=m/10;
			if(n%2!=0)
			{
				sum=sum+n;
			}
		}
        System.out.println(sum);
	}

}
