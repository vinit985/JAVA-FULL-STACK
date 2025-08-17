package com.java.Arrays;

import java.util.Scanner;

public class printSubArray {
	private static void subArray(int[] arr)
	{
		for(int i =0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				for(int k =i;k<=j;k++)
				{
					System.out.print(arr[k]);
				}
				System.out.println();
			}
			
		}
		
	}

		public static void main(String[] args) {

			// TODO Auto-generated method stub
	       Scanner s =new Scanner(System.in);
	       System.out.println("Enter size of array for which we need to insert value");
	       int length = s.nextInt();
	       int[] arr = takeInput(length);
	       subArray(arr);
	       
	     
		}
		private static int[] takeInput(int length)

		{
			Scanner s = new Scanner(System.in);
			  int[] arr= new int[length];
		       for(int i =0;i<length;i++)
		       {
		    	   System.out.println("Enter element at index "+i);
		    	   arr[i]=s.nextInt();
		       }
		       return arr;
		}
		private static void print(int[] arr)

		{
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");;
			}
		}

	}



