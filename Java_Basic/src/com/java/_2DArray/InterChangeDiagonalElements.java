package com.java._2DArray;

import java.util.Scanner;

public class InterChangeDiagonalElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[4][4];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter rows and column to print 2D arrays");
		int rows = s.nextInt();
		int columns = s.nextInt();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println("Enter element at index arr[" + i + "][" + j + "]");
				arr[i][j] = s.nextInt();
			}
		}
		int newArr[][] = InterChangeDiagonal(arr);
		for (int i = 0; i < newArr.length; i++) {
			for (int j = 0; j < newArr[i].length; j++) {
				System.out.print(newArr[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static int[][] InterChangeDiagonal(int[][] arr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {

			int temp = arr[i][j];
			arr[i][j] = arr[i][arr.length - 1 - j];
		 	arr[i][arr.length - 1 - j] = temp;
			j++;

		}
		return arr;

	}

}
