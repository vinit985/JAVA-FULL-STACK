package com.java._2DArray;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][3];
		arr[0][0]=1;
		arr[1][1]=10;
		char arr1[][] = new char[3][3];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter rows and column to print 2D arrays");
		int rows =s.nextInt();
		int columns = s.nextInt();
		for(int i =0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.println("Enter element at index arr["+i+"]["+j+"]");
				arr[i][j] = s.nextInt();
			}
		}
//		print(arr);
		printC(arr);
		

	}
//	rowwise traversal
	public static void print(int[][] arr)
	{
		for(int i = 0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
//	column wise traversal'
	public static void printC(int[][] arr)
	{
		for(int i = 0;i<arr[0].length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
