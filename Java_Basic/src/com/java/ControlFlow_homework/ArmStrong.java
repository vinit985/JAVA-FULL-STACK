package com.java.ControlFlow_homework;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter number to be checked for ArmStrong");
		int number = s.nextInt();
		int num = number;
		int newNumber = 0;
		while(number>0)
		{
			int lastDigit = number%10;
			 newNumber = newNumber+ (lastDigit*lastDigit*lastDigit);
			 number = number/10;
		}
		if(newNumber==num)
		{
			System.out.println("ArmStrong number");
		}
		else
		{
			System.out.println("Number is not ArmStrong number");
		}

	}

}
