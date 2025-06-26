package com.java.ControlFlow_homework;

import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number to find sum of digit");
		int number  = s.nextInt();
		int sum =0;
		while(number>0)
		{
			int n =  number%10;
			sum+= n;
			number = number/10;
		}
		System.out.println("Sum of digit in number is :"+ sum);

	}

}
