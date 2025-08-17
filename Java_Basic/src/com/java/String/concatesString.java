package com.java.String;

import java.util.Scanner;

public class concatesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first STring to concate with another one");
		String str = s.nextLine();
		System.out.println("ENter second string to concat with other string");
		String str1 = s.nextLine();
		System.out.println("COncated String is :"+str.concat(" "+str1));
 
	}

}
