package com.java.ControlFlow_NestedForLoop;

public class NumberPattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m  =5;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m-i+1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
