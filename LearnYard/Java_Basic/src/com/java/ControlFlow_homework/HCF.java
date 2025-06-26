package com.java.ControlFlow_homework;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number to find GCD/HCF");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int highest = num1>num2?num1:num2;
		int i =1;
		int HCF = -1;
		while(i<highest)
		{
			if(num1%i==0 && num2%i==0)
			{
				HCF = i;
			}
			i++;
		}
     System.out.println("Highest Divisor :"+HCF);
	}

}
