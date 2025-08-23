 package com.java.Intro_to_Java;

public class Operators {

	public static void main(String[] args)
	{
//		Arithmetic Operator and Assignment Operators
	int a = 10;
	int b = 5;
	int c = 10;
	int d = a+b;
	int e =a-b;
	int f = a*b;
	int g = a/b;
	int h  = a%b;
	int i = b%a;
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
	System.out.println(g);
	System.out.println(h);
	System.out.println(i);
//	Relational Opearators
	System.out.println(a>b);
	System.out.println(a<b);
	System.out.println(a>=b);
	System.out.println(a<=b);
	System.out.println(a==b);
	System.out.println(a!=b);
//	Logical Operators
	System.out.println(a>b && a<b);
	System.out.println(a>b || b<c);
	System.out.println(!(a>b));
}
}
