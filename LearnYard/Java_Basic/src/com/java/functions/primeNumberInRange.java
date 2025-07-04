package com.java.functions;

import java.util.Scanner;

public class primeNumberInRange {
	private static boolean primeNumber(int num)
	{
		int numberCount = 0;
		boolean b = false;
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				numberCount++;
			}
			
		}
		if(numberCount<=1)
		{
			b = true;
		}
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter two number in which range we need to find out prime number");
		int lowerLimit = s.nextInt();
		int upperLimit = s.nextInt();
		for(int i = lowerLimit;i<=upperLimit;i++)
		{
			if(primeNumber(i))
			System.out.println("Prime Number:"+i);
		}

	}

}
