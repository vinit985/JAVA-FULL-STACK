package com.java.Intro_to_Java_homework;
import java.util.Scanner;
public class SimpleInterset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter principal amount");
		double p = s.nextDouble();
		System.out.println("Enter rate");
		double r = s.nextDouble();
		System.out.println("Enter time");
		double t = s.nextDouble();
//		calculationg P*R*T
		double SI = (p*r*t)/100;
		System.out.println("SimpleInterset: "+SI);

	}

}
