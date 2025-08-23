package com.java.ControlFlow_homework;

import java.util.Scanner;

public class ArmStrongUptoN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter number to be checked for ArmStrong upto");
		int num = s.nextInt();
		int number;
		for(int i =1;i<=num;i++)
		{
			number = i;
			int newNumber=0;
	
		   while(number>0)
		   {
			int lastDigit = number%10;
			 newNumber = newNumber+ (lastDigit*lastDigit*lastDigit);
			 number = number/10;
		    }
		   if(newNumber==i)
		   {
			System.out.println("ArmStrong number " +newNumber);
		   }
		  
		}

	}

}
