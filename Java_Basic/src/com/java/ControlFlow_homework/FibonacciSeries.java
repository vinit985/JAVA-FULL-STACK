package com.java.ControlFlow_homework;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("ENter number upto which we need to print fibonacci series");
		int num = s.nextInt();
		int i = 1;
		int a =0,b=1;
		System.out.print(a+" "+b+" ");
		while(i<=num-2)
		{
		   int thirdTerm = a+b;
		   System.out.print(thirdTerm+" ");
		   a=b;
		   b = thirdTerm;
		   i++;
		}

	}

}
