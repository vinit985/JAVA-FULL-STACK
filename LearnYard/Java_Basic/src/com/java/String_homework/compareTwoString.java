package com.java.String_homework;

import java.util.Scanner;

public class compareTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first STring to concate with another one");
		String str = s.nextLine();
		System.out.println("ENter second string to concat with other string");
		String str1 = s.nextLine();
        System.out.println(str.compareTo(str1));
        System.out.println(str.compareToIgnoreCase(str1));

	}

}
