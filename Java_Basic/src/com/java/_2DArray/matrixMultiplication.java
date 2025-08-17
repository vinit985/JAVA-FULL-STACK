package com.java._2DArray;

import java.util.Scanner;

public class matrixMultiplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int arr1[][] = input();
	   int arr2[][] = input();
	   int[][] resultMAtrix = {};
	   if(arr1[0].length == arr2.length)
	   {
		  resultMAtrix =  multiplication(arr1,arr2);
	   }
	   print(resultMAtrix);
		

	}
	private static void print(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	private static int[][] multiplication(int[][] arr1,int[][] arr2)
	{
		int[][] newArray =  new int[arr1.length][arr2.length];
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				int sum = 0;
				for(int k=0;k<arr2[0].length;k++)
				{
					
				   sum += arr1[i][k]*arr2[k][j];
				}
				newArray[i][j]=sum;
			}
		}
		return newArray;
	}
  private static int[][] input()
  {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter rows and column to print 2D arrays");
		int rows = s.nextInt();
		int columns = s.nextInt();
		int[][] arr = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println("Enter element at index arr[" + i + "][" + j + "]");
				arr[i][j] = s.nextInt();
			}
		}
		return arr;
  }
}
