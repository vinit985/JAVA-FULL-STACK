package com.java.ControlFlow_homework;

import java.util.Scanner;

public class numDivisibleby_5_OR_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number to be checked for divisible by 5 or 11");
		int num = s.nextInt();
		if(num%5==0 && num%11==0)
		{
			System.out.println("Number is divisible by both 5 and 11");
		}
		

	}

}
