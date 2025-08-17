package com.java.Intro_to_Java;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TypeCasting:-Converting one data type to other data type
//		1.Implicit type casting:-Smaller->Bigger
//		2.Explicit type casting:- Bigger->Smaller
		int a =10;
		long b = a;
		
		float c = 7.5f;
		double d = c;
		 
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
//		Explicit type casting
		long x = 10000;
		int y  = (int)x;
		
		double p = 3.045782587958462;
		float q = (float)p;
		System.out.println(x); 
		System.out.println(y);
		System.out.println(p);
		System.out.println(q);

	}

}
