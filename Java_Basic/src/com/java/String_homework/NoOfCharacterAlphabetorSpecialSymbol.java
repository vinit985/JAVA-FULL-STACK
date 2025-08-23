package com.java.String_homework;

import java.util.Scanner;

public class NoOfCharacterAlphabetorSpecialSymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter String to find character,Alphabet and digits");
		String str = s.nextLine();
		int[] frequency   = new int[127];
		int index = 0;
		for(int i=0;i<str.length();i++)
		{
			index = str.charAt(i);
			frequency[index]++;
	     
			
		}
		int specialCharacter = 0,number=0,alphabet=0;
		for(int i =33;i<=47;i++)
		{
			if(frequency[i]>0)
			{
				specialCharacter++;
			}
		}
		for(int i =48;i<=57;i++)
		{
			if(frequency[i]>0)
			{
				number++;
			}
		}
		for(int i =58;i<=64;i++)
		{
			if(frequency[i]>0)
			{
				specialCharacter++;
			}
		}
		for(int i =65;i<=90;i++)
		{
			if(frequency[i]>0)
			{
				alphabet++;
			}
		}
		for(int i =91;i<=96;i++)
		{
			if(frequency[i]>0)
			{
				specialCharacter++;
			}
		}
		for(int i =97;i<=122;i++)
		{
			if(frequency[i]>0)
			{
				alphabet++;
			}
		}
		for(int i =123;i<=126;i++)
		{
			if(frequency[i]>0)
			{
				specialCharacter++;
			}
		}
		System.out.println("Enter of special character: "+specialCharacter);
		System.out.println("Number of number in string: "+number);
		System.out.println("Number of alphabet in string: "+alphabet);

		

	}

}
