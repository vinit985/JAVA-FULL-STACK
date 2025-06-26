package com.java._2DArray;

import java.util.Scanner;

public class printElementDiagonally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter rows and column of matrix");
		int row = s.nextInt();
		int column =s.nextInt();
		int[][] arr = new int[row][column];
		int[][] inputArray = input(arr);
		for(int i = 0;i<inputArray.length;i++)
		{
			printD(inputArray,i,0);
		}
		for(int j = 1;j<inputArray[0].length;j++)
		{
		    	
			printD(inputArray,inputArray.length-1,j);
		}

	}

	private static int[][] input(int[][] arr) {
		Scanner s = new Scanner(System.in);
		for(int i =0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j] = s.nextInt();
			}
		}
		return arr;
	}
	private static void printD(int[][] input,int i ,int j)
	{
	   while(i>=0 && j<input[i].length)
	   {
		   System.out.print(input[i][j]+" ");
		   i--;
		   j++;
	   }
	   System.out.println();
	}

}
