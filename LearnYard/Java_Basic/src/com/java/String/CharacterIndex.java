package com.java.String;

import java.util.Scanner;

public class CharacterIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter String to find index of specific charcter");
		String str = s.nextLine();
		System.out.println("ENter character whose index we need to find");
		char ch = s.next().charAt(0);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				System.out.print((i+1)+" ");
			}
		}
		

	}

}
