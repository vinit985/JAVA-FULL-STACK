package com.java.functions;

import java.util.Scanner;

public class ArmStrongNumber {
	public static boolean ArmStrongNumber(int num)
	{
		int originalNumber= num;
		int newNum=0;
		while(num>0)
		{
			int lastDigit = num%10;
			newNum = newNum+(int)Math.pow(lastDigit, 3);
			num = num/10;
			
		}
		return newNum==originalNumber?true:false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s  =  new Scanner(System.in);
		System.out.println("Enter number upto which we need to print Armstrong Number");
		int  num =s.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(ArmStrongNumber(i)==true)
			{
				System.out.print(i+" ");
			}
			
		}

	}

}
