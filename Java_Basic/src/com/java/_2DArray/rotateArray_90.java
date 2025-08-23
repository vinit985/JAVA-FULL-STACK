package com.java._2DArray;

import java.util.Scanner;

public class rotateArray_90 {

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
		int[][] newArray= transpose(arr);
		print(newArray);
		int[][] newArray1 = rotate(newArray);
		print(newArray1);

	}

	private static int[][] rotate(int[][] newArray) {
		// TODO Auto-generated method stub
		for(int i=0;i<newArray.length;i++)
		{
			int j =0,k = newArray.length-1;
			if(j<k)
			{
				int temp = newArray[i][j];
				newArray[i][j] = newArray[i][k];
				newArray[i][k] = temp;
			}
		}
		return newArray;
	}

	private static void print(int[][] newArray) {
		// TODO Auto-generated method stub
		for(int i=0;i<newArray.length;i++)
		{
			for(int j=0;j<newArray[i].length;j++)
			{
				System.out.print(newArray[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	private static int[][] transpose(int[][] arr) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i<j)
				{
					int temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i]=temp;
				}
			}
		}
		return arr;
	}

}
