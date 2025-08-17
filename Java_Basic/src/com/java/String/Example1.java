package com.java.String;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
//		String str1 = s.nextLine();
//		char ch = s.next().charAt(0);
//		System.out.println(str);
//		System.out.println(str1);
//		System.out.println(ch);
//		String st = "Vinit";
//		String s1 = "Singh";
//		String newString = st+s1;
//		System.out.println(newString);
		String b = "World";
		System.out.println(str.concat(b));
		System.out.println(str+b);
		System.out.println(b.substring(1,4));
		String a ="aa";
		String z = "az";
		System.out.println(a.compareTo(a));
		System.out.println(a.compareTo(z));
		System.out.println(z.compareTo(a));
		
		

	}

}
