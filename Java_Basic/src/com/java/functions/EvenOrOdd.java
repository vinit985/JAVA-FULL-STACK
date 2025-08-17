package com.java.functions;

import java.util.Scanner;

public class EvenOrOdd {

	public static boolean evenOrOdd(int num)
	{
		boolean b = num%2==0?true:false;
		return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		boolean b  = evenOrOdd(num);
		System.out.println(b);

	}

}
