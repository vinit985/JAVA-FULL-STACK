package com.java.ControlFlow_homework;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number to find prime factor");
		int number = s.nextInt();
		int i =2;
		while(i<=number)
		{
			if(number%i ==0)
			{
				boolean checkPrime = check(i);
				if(checkPrime)
				{
				System.out.println("Prime Factor is : "+i);
				}
			}
			i++;
		}

	}
	public static boolean check(int n)
	{
		int count =0;
		for(int i =1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count<=2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
