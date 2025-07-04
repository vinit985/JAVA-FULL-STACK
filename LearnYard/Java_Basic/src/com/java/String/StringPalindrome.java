package com.java.String;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abccba";
		int i =0,j=str.length()-1;
		boolean b = true;
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				b =false;
				break;
			}
			i++;
			j--;
		}
		if(b)
		{
			System.out.println("String is palindrome");
			
		}
		else
		{
			System.out.println("String is not palindrome");
		}

	}

}
