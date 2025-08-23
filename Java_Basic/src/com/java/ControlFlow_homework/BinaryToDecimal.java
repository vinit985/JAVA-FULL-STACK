package com.java.ControlFlow_homework;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s = new Scanner(System.in);
      System.out.println("Enter number to get converted to Decimal from binary");
      int binaryNum = s.nextInt();
      int newNum=0;
      int j =0;
      while(binaryNum>0)
      {
    	  int lastDigit = binaryNum % 10;
    	  newNum = (int) (newNum + lastDigit*(Math.pow(2,j)));
    	  j++;
    	  binaryNum = binaryNum/10;
      }
      System.out.println(newNum);
	}
 

}
