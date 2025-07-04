package com.java.Intro_to_Java_homework;
import java.util.Scanner;
public class ArithmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Ente two number to perform arithmetic operation on it");
		int a =s.nextInt();
		int b = s.nextInt();
		System.out.println("Addition: "+(a+b));
		System.out.println("Subtraction: "+ (a-b));
		System.out.println("Multiplication: "+(a*b));
		System.out.println("Division: "+(a/b));
		System.out.println("Modulus: "+(a%b));
		
		

	}

}
