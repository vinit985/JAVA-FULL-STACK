package com.java.functions;

import java.util.Scanner;

public class SumOfNumber {
	private static int sumOfNumber(int number)
	{
		int sum = 0;
		while(number>0)
		{
			int lastDigit = number%10;
			sum = sum+lastDigit;
			number = number/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number whose digit sum we need to find");
		int num  = s.nextInt();
        int sum =  sumOfNumber(num);
        System.out.println("Sum of digit of number "+num+" is "+sum);
	}

}
