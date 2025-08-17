package com.java.ControlFlow_NestedForLoop;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n =5;    
	for(int i=1;i<=n;i++)
	{
//		  space
		for(int j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
//		star
		for(int j=n-i+1;j<=n+i-1;j++)
		{
			System.out.print("*");
		}

		System.out.println();
	}
	int m =n+4;
	for(int i=1;i<=n-1;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int j=i;j<m-i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	}

}
