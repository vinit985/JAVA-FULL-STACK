package com.java.String_homework;

import java.util.Scanner;

public class vowelAndConstantCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string to find vowel and constant ");
		String str =  s.nextLine();
		int[] arr = new int[126];
		for(int i=0;i<str.length();i++)
		{
			int ASCIIValue = str.charAt(i);
			arr[ASCIIValue]++;
		}
		int vowel =0;
		int constant =0;
	    for(int i = 65;i<arr.length;i++)
	    {
	    	if(arr[i]>0)
	    	{
	    	if(i==65||i==45||i==49||i==79||i==85||i==97||i==101||i==105||i==111||i==117)
	    	{
	    		vowel+= arr[i];
	    	}
	    	else
	    	{
	    		constant+=arr[i];
	    	}
	    	}
	    }
	    System.out.println("Vowel: "+vowel);
	    System.out.println("Constant: "+constant);

	}

}
