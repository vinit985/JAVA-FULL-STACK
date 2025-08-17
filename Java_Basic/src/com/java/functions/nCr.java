package com.java.functions;

import java.util.Scanner;

public class nCr {
	private static int factorial(int number)
	{
		int fact = 1;
		if(number==0)
		{
			return fact;
		}
		for(int i =2;i<=number;i++)
		{
			fact = fact*i;
		}
		return fact;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s =  new Scanner(System.in);
      System.out.println("Enter value to find nCr");
      int n = s.nextInt();
      int r  = s.nextInt();
      if(n>r)
      {
    	  int numerator = factorial(n);
    	  int denominator = factorial(r)*factorial(n-r);
    	  System.out.println("Comnination of "+n+"C"+r+" is "+ (numerator/denominator));
      }
      else
      {
    	  System.out.println("We cannot find combination if value of n is smaller than r");
      }
	}

}
