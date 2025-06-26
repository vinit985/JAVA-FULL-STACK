package com.java.Arrays;

public class _1stSmallestAnd2ndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr  =  {12,25,8,55,10,33,17,11};
        int[] newArr =  firstAndSecondSmallestInArray(arr);
        System.out.println("Smallest:"+newArr[0]);
        System.out.println("Second Smallest:"+newArr[1]);
	}

	private static int[] firstAndSecondSmallestInArray(int[] arr) {
		// TODO Auto-generated method stub
		int newArray[] =  new int[2];
		int minimum = Integer.MAX_VALUE;
		int secondMinimum = Integer.MAX_VALUE;
		for(int i  = 0 ;i<arr.length;i++)
		{
			if(i==0)
			{
				minimum = arr[i];
			}
			if(minimum >arr[i])
			{
				secondMinimum = minimum;
				minimum = arr[i];
			}
			if(minimum<arr[i] && secondMinimum >arr[i])
			{
				secondMinimum = arr[i];
			}
		}
		newArray[0] = minimum;
		newArray[1] = secondMinimum;
		return newArray;
	}

	/*
	 * private static int[] firstAndSecondSmallestInArray(int[] arr) { int[]
	 * newArray = new int[2]; int smallest = arr[0]; for(int i = 0
	 * ;i<arr.length;i++) { if(arr[i]<smallest) { smallest = arr[i]; } } newArray[0]
	 * = smallest; smallest =arr[0]; for(int i =0;i<arr.length;i++) {
	 * if(arr[i]<smallest && arr[i]!= newArray[0]) { smallest =arr[i]; } }
	 * newArray[1] = smallest; return newArray; }
	 */
	
}
