package com.java.ControlFlow_homework;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s = new Scanner(System.in);
     System.out.println("Enter number to be checked for Palindrome");
     int number  =  s.nextInt();
     int num1= number;
     int newNum =0;
     while(number>0)
     {
    	 int lastDigit = number%10;
    	 newNum = newNum*10+lastDigit;
    	 number = number/10;
     }
     System.out.println(newNum==num1?"Palindrome Number":"Not Palindrome Number");
	}

}
