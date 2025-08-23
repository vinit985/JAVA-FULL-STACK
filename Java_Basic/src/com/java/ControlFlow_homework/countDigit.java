package com.java.ControlFlow_homework;

import java.util.Scanner;

public class countDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number to count its digit");
		int number  =  s.nextInt();
		int count =0;
		while(number>0)
		{
			number = number/10;
			count++;
		}
		System.out.println("Number of digit is :"+count);

	}

}
