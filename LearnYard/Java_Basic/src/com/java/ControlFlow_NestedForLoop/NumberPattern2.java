package com.java.ControlFlow_NestedForLoop;

public class NumberPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i =1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
