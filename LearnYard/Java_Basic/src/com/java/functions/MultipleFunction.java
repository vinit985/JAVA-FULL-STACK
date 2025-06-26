package com.java.functions;

public class MultipleFunction {
	
	public static void f1()
	{
		f2();
		System.out.println(1);
	}
	public static void f2()
	{
		f3();
		System.out.println(2);
	}
	public static void f3()
	{
		System.out.println(3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f1();
		System.out.println("Vinit Singh");

	}

}
