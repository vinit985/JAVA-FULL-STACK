package com.java.ControlFlow_homework;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number to print table");
		int number= s.nextInt();
		for(int i =1;i<=10;i++)
		{
			System.out.println(number+"*"+i+"="+(number*i));
		}

	}

}
