package com.java.ControlFlow_homework;

import java.util.Scanner;

public class sumofeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number upt ot which we need to find sum of even number");
		int num =  s.nextInt();
		int i = 1,evenSum =0,oddSum=0;
		while(i<=num)
		{ 
			 if(i%2==0)
			 evenSum =  evenSum+i;
			 else
			 oddSum = oddSum+i;
			 i++;
		}
		System.out.println("EvenSum: "+evenSum);
		System.out.println("OddSum: "+oddSum);

	}

}
