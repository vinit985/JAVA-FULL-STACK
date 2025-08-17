package com.java.Arrays;

import java.util.Scanner;

public class EvenandOdd {
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
	private static int evenC(int[] arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
		}
		return count;
	}
	private static int oddC(int[] arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				count++;
			}
		}
		return count;
	}
	private static int[] InsertEvenValue(int[] arr,int originalArr[])
	{
		int k =0;
		for(int i=0;i<originalArr.length;i++)
		{
			if(originalArr[i]%2==0)
			{
				arr[k] = originalArr[i];
				k++;
			}
		}
		return arr;
	}
	private static int[] InsertOddValue(int[] arr,int originalArr[])
	{
		int k =0;
		for(int i=0;i<originalArr.length;i++)
		{
			if(originalArr[i]%2!=0)
			{
				arr[k] = originalArr[i];
				k++;
			}
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner s =new Scanner(System.in);
	       System.out.println("Enter size of array for which we need to insert value");
	       int length = s.nextInt();
	       int[] arr = takeInput(length);
	       int evenCount = evenC(arr);
	       int oddCount  = oddC(arr);
	       int evenArray[]  = new int[evenCount];
	       int oddArray[] = new int[oddCount];
	       int EArray[] = InsertEvenValue(evenArray,arr);
	       int OArray[] = InsertOddValue(oddArray,arr);
	       print(EArray);
	       System.out.println();
	       print(OArray);
		

	}

}
