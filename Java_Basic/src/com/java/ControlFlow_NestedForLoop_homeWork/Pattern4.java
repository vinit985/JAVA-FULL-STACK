package com.java.ControlFlow_NestedForLoop_homeWork;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m =5;
		int leftSpaces=0;
		int middleSpace= m+2;
		for(int i=1;i<=m;i++)
		{
//			 LeftSpaces
			for(int j=1;j<=leftSpaces;j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j=1;j<=middleSpace;j++)
			{
				System.out.print(" ");
			}
			if(i!=m)
			{
			System.out.print("*");
			}
			middleSpace = middleSpace-2;
			leftSpaces++;
			System.out.println();
			
		}
		leftSpaces = leftSpaces-2;   ;
		middleSpace =1;
		for(int i=1;i<=m-1;i++)
		{
//			leftSpaces
			for(int j=1;j<=leftSpaces;j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j=1;j<=middleSpace;j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			leftSpaces--;
			middleSpace = middleSpace+2;
			System.out.println();
		}

	}

}
