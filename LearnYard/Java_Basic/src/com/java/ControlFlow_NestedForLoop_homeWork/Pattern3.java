package com.java.ControlFlow_NestedForLoop_homeWork;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m =5;
		int starCount=1;
		int leftSpace = m-1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=leftSpace;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=starCount;j++)
			{
				System.out.print("*");
			}
			starCount = starCount+2;
			leftSpace--;
			System.out.println();
		}
	}

}
