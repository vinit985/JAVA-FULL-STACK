package com.java.ControlFlow_NestedForLoop;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m =5;
		int leftSpace =m-1;
		int middleSpace=3;
		for(int i =1;i<=m;i++)
		{
			for(int j=1;j<=leftSpace;j++)
			{
				System.out.print(" ");
			}
			if(i==1||i==m)
			{
				for(int j=1;j<=m;j++)
				{
					System.out.print("*");
				}
			}
			else
			{
			  System.out.print("*");
			  for(int j =1;j<=middleSpace;j++)
				{
					System.out.print(" ");
				}

			  System.out.print("*");
			  
			}
			leftSpace--; 
			System.out.println();
		}
		
		

	}

}
