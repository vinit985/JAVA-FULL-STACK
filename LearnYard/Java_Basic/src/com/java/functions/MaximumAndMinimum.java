package com.java.functions;

import java.util.Scanner;

public class MaximumAndMinimum {
	
	private static int[] maximumANDminimum(int number1,int number2)
	{
		int maximum = number1>number2?number1:number2;
		int minimum = number1<number2?number1:number2;
		int arr[] = new int[2];
		arr[0]= maximum;
		arr[1]= minimum;
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two number between which we need to find maximum and minimum");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int[] arr = maximumANDminimum(num1,num2);
		System.out.println("Maximum number is "+arr[0]);
		System.out.println("Minimum number is "+arr[1]);
		

	}

}
