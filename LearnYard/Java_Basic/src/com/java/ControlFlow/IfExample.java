package com.java.ControlFlow;
import java.util.Scanner;
public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter marks of student to check for pass or fail");
		int marks = s.nextInt();
		if(marks>=40)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
