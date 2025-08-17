package com.java.String_homework;

import java.util.Scanner;

public class CountWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string to find number of word in it");
		String str = s.nextLine().trim();
		String[] strArr = str.split(" ");
		System.out.println("Number of word in string is: "+ strArr.length);

	}

}
