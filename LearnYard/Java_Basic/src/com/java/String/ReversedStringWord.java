package com.java.String;

import java.util.Scanner;

public class ReversedStringWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string to print it's word in reversed order");
		String str = s.nextLine().trim();
		String[] arr = str.split(" ");
	    for(int i=arr.length-1;i>=0;i--)
	    {
	    	System.out.print(arr[i]+" ");
	    }

	}

}
