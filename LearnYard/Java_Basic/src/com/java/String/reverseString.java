package com.java.String;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdefghi";
		StringBuilder sb =  new StringBuilder(str);
		int i =0,j=str.length()-1;
		boolean b = true;
		while(i<j)
		{
			char ch  = sb.charAt(i);
			sb.setCharAt(i,sb.charAt(j));
			sb.setCharAt(j, ch);
			i++;
			j--;
			
			
		}
		System.out.println(sb);
	}

}
