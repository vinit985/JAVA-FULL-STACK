package com.java.Intro_to_Java_homework;

import java.util.Scanner;

public class AreaPerimeterrectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s= new Scanner(System.in);
     int length = s.nextInt();
     int breadth = s.nextInt();
     int area = length*breadth;
     int perimeter = 2*(length+breadth);
     System.out.println("Area :"+area);
     System.out.println("Perimeter: "+perimeter);
     
	}

}
