package com.java._2DArray;

import java.util.Scanner;

public class diaganolSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter rows and column to print 2D arrays");
		int rows =s.nextInt();
		int columns = s.nextInt();
		int[][] arr = new int[rows][columns];
		for(int i =0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.println("Enter element at index arr["+i+"]["+j+"]");
				arr[i][j] = s.nextInt();
			}
		}
		diagonalSum(arr);
	}
	private static void diagonalSum(int[][] arr)
	{
		int leftDSum=0;
		int rightDSum=0;
		if(arr.length==arr[0].length)
		{
			for(int i =0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++)
				{
//					left Diagonal
					if(i==j)
					{
						leftDSum += arr[i][j];
					}
//					right Diagonal
					if((i+j)==(arr.length-1))
					{
						rightDSum += arr[i][j];
					}
				}
			}
		}
		System.out.println("Sum of left Diagonal is:"+leftDSum);
		System.out.println("Sum of right Diagonal is:"+rightDSum);
	}

}
