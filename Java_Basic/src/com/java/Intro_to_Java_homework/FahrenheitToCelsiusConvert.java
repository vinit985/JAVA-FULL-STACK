package com.java.Intro_to_Java_homework;
import java.util.Scanner;
public class FahrenheitToCelsiusConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter temperature in fahrenheit");
	     double f = s.nextDouble();
	     double c = (f-32)*(5.0/9.0);
	     System.out.println("Temperature in celsius is :"+c);

	}

}
