package com.java.ControlFlow;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s = new Scanner(System.in);
         System.out.println("Enter marks of student to be graded");
         int marks  = s.nextInt();
         if(marks>=90)
         {
        	 System.out.println("A+");
         }
         else if(marks>=80 && marks <90)
         {
        	 System.out.println("A");
         }
         else if(marks>=70 && marks <80)
         {
        	 System.out.println("B");
         }
         else
         {
        	 System.out.println("Average marks");
         }
	}

}
