package com.java._2DArray;

import java.util.Scanner;

public class SumofRowAndColumn {
	public static void main(String[] args) {
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
	rowSum(arr);
	columnSum(arr);
	}
	private static void rowSum(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int sum =0;
			for(int j=0;j<arr[0].length;j++)
			{
					sum += arr[i][j];
			}
			System.out.println("Sum of "+i+"th row is:" +sum);
		}
	}
	private static void columnSum(int[][] arr)
	{
		int column =0;
		 for(int i =0;i<arr[0].length;i++)
		 {
			 int sum = 0;
			 for(int j=0;j<arr.length;j++)
			 {
				 sum+=arr[j][i];
			 }
			 System.out.println("Sum of "+column+" column is "+sum);
			 column++;
		 }
	}
}
