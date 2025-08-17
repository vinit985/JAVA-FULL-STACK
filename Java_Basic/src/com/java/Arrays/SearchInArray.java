package com.java.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInArray {
	private static int[] insertElementInArray(int size)
	{
		Scanner s =  new Scanner(System.in);
		 int arr[] = new int[size];
	       for(int i =0;i<arr.length;i++)
	       {
	    	   System.out.println("Enter element in array at index "+i);
	    	   arr[i]=s.nextInt();
	       }
	       return arr;
	}
	private static void search(int number,int[] arr)
	{
		 
	       for(int i =0;i<arr.length;i++)
	       {
	    	   if(arr[i]==number)
	    	   {
	    		   System.out.println("Element found at index "+i);
	    	   }
	       }
	}
	private static void maximum(int[] arr)
	{
		Arrays.sort(arr);
		System.out.println("Maximum number in array is :"+arr[arr.length-1]);
	}
	private static void minimum(int[] arr)
	{
		Arrays.sort(arr);
		System.out.println("Minimum element in array is: "+arr[0]);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s =  new Scanner(System.in);
       System.out.println("Enter array size");
       int size = s.nextInt();
       int[] arr = insertElementInArray(size);
       System.out.println("Enter element to be searched");
       int element  = s.nextInt();
        search(element,arr);
        maximum(arr);
        minimum(arr);
     
       
      
    
	}

}
