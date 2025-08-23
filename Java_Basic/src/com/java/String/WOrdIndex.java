package com.java.String;

import java.util.Scanner;

public class WOrdIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string to find word index");
		String str = s.nextLine();
	    System.out.println("ENter target word");
	    String st  = s.next();
	    int j=0;
	    for(int i=0;i<str.length();i++)
	    {
	    	if(match(str,st,i)==true)
	    	{
	    		System.out.println(i+" ");
	    	}
	    }

	}
	public static boolean match(String s,String t,int startIndex)
	{
		
		int j=0,i=startIndex;
		while(i<s.length() && j<t.length())
		{
			if(s.charAt(i)!=t.charAt(j))
			{
				return false;
			}
			i++;
			j++;
			
		}
		return true;
	}

}
