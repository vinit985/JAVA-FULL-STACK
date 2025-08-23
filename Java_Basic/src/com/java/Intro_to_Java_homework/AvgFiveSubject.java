package com.java.Intro_to_Java_homework;
import java.util.Scanner;
public class AvgFiveSubject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter marks of five Subjects:");
		int a = s.nextInt();
		int b =s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		int e = s.nextInt();
		int avg = (a+b+c+d+e)/5;
		double percentage = ((a+b+c+d+e)*100)/500;
		System.out.println("Average:"+avg);
		System.out.println("Percentage:"+percentage);

	}

}
