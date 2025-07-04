package com.java.String;

import java.util.Scanner;

public class maximumOccuringcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s = new Scanner(System.in);
      System.out.println("Enter String to find maximum occuring character");
      String str = s.nextLine().toUpperCase();
      int[] arr = new int[91];
      for(int i=0;i<str.length();i++)
      {
    	  int index = str.charAt(i);
    	  arr[index]++;
      }
      int maximumIndex = -1;
      int maximumVakue=0;
      for(int i=65;i<arr.length;i++)
      {
			
			  if(arr[i]>maximumVakue) 
			 { 
				  maximumVakue =arr[i];
			     maximumIndex =i;
			 } 
      }
      System.out.println("Maximum occuring character is :"+(char)maximumIndex);
	}

}
