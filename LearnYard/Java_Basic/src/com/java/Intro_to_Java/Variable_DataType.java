package com.java.Intro_to_Java;

public class Variable_DataType {

	public static void main(String[] args)
	{
		/*
		 * int a = 5; System.out.println(a); Object aa = (Object)a;
		 * System.out.println(aa.getClass().getName()); System.out.println("a"); long b
		 * =1000L; System.out.println(b); Object bb = (Object)b;
		 * System.out.println(bb.getClass().getName()); float c= 3.45f; double d =3.125;
		 * System.out.println(d); boolean e = true; boolean f=false;
		 * System.out.println(e); System.out.println(f);
		 */
		int a =10;
		long b =1000000L;
		double c = 3.15248; //Stores value upto 7 precision digits
		float d = 3.21878F;  //Stores value upto 15 precision digits
		char e = 'V';
		boolean f = true;
		String g  = "Vinit Singh";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
	}
}
