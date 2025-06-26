package com.java.ControlFlow_NestedForLoop;

public class StarPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m =5;
		int middleSpace=0;
		for(int i =1;i<=m;i++)
		{
			if(i==1)
			{
				for(int j=1;j<=m*2;j++)
				{
					System.out.print("*");
				}
			}
			else
			{
			middleSpace = middleSpace+2;
			int startCount = m-i+1;
			for(int j=1;j<=startCount;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=middleSpace;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=startCount;j++)
			{
				System.out.print("*");
			}
			
			}
			System.out.println();
		}
		
		for(int i=1;i<=m;i++)
		{
			if(i==m*2)
			{
				for(int j=1;j<=m*2;j++)
				{
					System.out.print("*");
				}
			}
			else
			{
			int starCount=i;
			for(int j=1;j<=starCount;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=middleSpace;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=starCount;j++)
			{
				System.out.print("*");
			}
			}
			System.out.println();
			middleSpace = middleSpace-2;
			
		}

	}

}
