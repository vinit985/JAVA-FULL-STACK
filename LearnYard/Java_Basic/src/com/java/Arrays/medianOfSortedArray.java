package com.java.Arrays;

public class medianOfSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6};
	     median(arr);

	}
	private static void median(int[] arr)
	{
		int mid;
		if(arr.length%2 ==0)
		{
			mid = (arr.length-1)/2;
			System.out.println((arr[mid]+arr[mid+1])/2.0);
		}
		else 
		{
			mid = (arr.length-1)/2;
			System.out.println(arr[mid]);
		}
	}

}
