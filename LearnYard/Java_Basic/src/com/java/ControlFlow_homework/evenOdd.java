package com.java.ControlFlow_homework;

import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("ENter number to be checked for even or odd");
		int num = s.nextInt();
		String evenORodd = num%2==0? "Even":"Odd";
		System.out.println(evenORodd);

	}

}
