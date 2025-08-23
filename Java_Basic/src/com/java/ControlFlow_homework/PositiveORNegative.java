package com.java.ControlFlow_homework;

import java.util.Scanner;

public class PositiveORNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s =  new Scanner(System.in);
      System.out.println("Enter number to be checked for Postive ,Negative or Zero");
      int num = s.nextInt();
      if(num>0)
      {
    	  System.out.println("Positive Number");
      }
      else if(num<0)
      {
    	  System.out.println("Negative Number");
      }
      else
      {
    	  System.out.println("Number is equal to zero");
      }
	}

}
