package com.java._2DArray;

import java.util.Scanner;

public class LowerTriangularMatrix {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[][] arr = new int[3][3];
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
			printUpperTriangularMatrix(arr);

		}

		private static void printUpperTriangularMatrix(int[][] arr) {
			// TODO Auto-generated method stub
			for(int i =0;i<arr.length;i++)
			{
				for(int j =0;j<arr[i].length;j++)
				{
					if(i>=j)
					{
						System.out.print(arr[i][j]+" ");
					}
					else
					{
						System.out.print("_"+" ");
					}
				}
				System.out.println();
			}
					
			
		}

}
