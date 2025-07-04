package com.java.String_homework;

import java.util.Scanner;

public class copyOneToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s  =  new Scanner(System.in);
    System.out.println("Enter a string to copy it's value to other string");
    String str  = s.nextLine();
    String newString = "";
    newString = str;
    System.out.println(newString);
	}

}
