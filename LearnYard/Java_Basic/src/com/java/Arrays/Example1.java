package com.java.Arrays;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 datatype variableName[] =  new datatype[size];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array to be initiliazed");
		int n  =s.nextInt();
		int arr[] =  new int[n];
//		arr[index] = value;
		for(int i =0;i<n;i++)
		{
			System.out.println("Enter value in array for index "+i);
			arr[i] =s.nextInt();
		}
		for(int i =0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
