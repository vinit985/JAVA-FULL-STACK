package com.java.Arrays;

import java.util.Scanner;

public class InsertElementAtSpecificPosition {
	private static int[] insertvalue(int[] arr,int index,int value)
	{
		int[] arr1 = new int[arr.length+1];
		for(int i =0;i<index-1;i++)
		{
			arr1[i] = arr[i];
		}
		arr1[index-1] = value;
		for(int i = index;i<arr1.length;i++)
		{
			arr1[i] = arr[i-1];
		}
		return arr1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s =new Scanner(System.in);
       System.out.println("Enter size of array for which we need to insert value");
       int length = s.nextInt();
       System.out.println("Enter index at which we need to insert value and value");
       int index = s.nextInt();
       int value =s.nextInt();
       int[] arr = takeInput(length);
      int newArray[] =  insertvalue(arr,index,value);
      print(newArray);
     
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
