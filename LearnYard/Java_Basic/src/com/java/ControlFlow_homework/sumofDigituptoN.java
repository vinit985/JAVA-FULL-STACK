package com.java.ControlFlow_homework;

import java.util.Scanner;

public class sumofDigituptoN {
    public static void  main(String[] args)
    {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number to find sum of digit upto");
	int number  = s.nextInt();
	int sum =0;
	for(int i =1;i<=number;i++)
	{
	  int num  =i;
	  while(num>0)
	   {
		int n =  num%10;
		sum+= n;
		num = num/10;
	   }
	}
	System.out.println("Sum of digit in number is :"+ sum);
    }

}
