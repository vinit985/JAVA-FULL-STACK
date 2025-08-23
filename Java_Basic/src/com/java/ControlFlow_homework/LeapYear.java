package com.java.ControlFlow_homework;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter year to get checked for Leap year");
	    int year  =  s.nextInt();
	    if(year%4 ==0)
	    {
	    	if(year%100 ==0)
	    	{
	    		if(year%400==0)
	    		{
	    			System.out.println("Leap year");
	    		}
	    		else
	    		{
	    			System.out.println("Not leap year");
	    		}
	    	}
	    	else
	    	{
	    		System.out.println("Leap year");
	    	}
	    }
	    else
	    {
	    	System.out.println("Not leap year");
	    }

	}

}
