package com.java.ControlFlow_homework;

import java.util.Scanner;

public class characterORDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s = new Scanner(System.in);
     System.out.println("Enter character to be checked for alphabet or Digit");
     char ch = s.next().charAt(0);
//     A-65,Z-90
//     a-97,z-122
//   0-48,9 -57
     int asciiValue = ch;
     if(asciiValue>=65 && asciiValue<=90)
     {
    	 System.out.println("Capital Alphabet");
     }
     else if (asciiValue>=97 && asciiValue<=122)
     {
    	 System.out.println("Small Alphabet");
     }
     else if (asciiValue>=48 && asciiValue<=57)
     {
    	 System.out.println("Number");
     }
	}

}
