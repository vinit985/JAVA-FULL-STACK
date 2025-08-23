package com.java.Arrays;
// Time Complexity :Worst Case:O(n),Best Case: O(1)
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,12,20,25,13,10,9,40,60,5};
		int index = search(arr,25);
		System.out.println("Element is present at index :"+index);

	}
	private static int search(int[] arr ,int value)
	{
		int index =-1;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]==value)
			{
				index = i;
				return index;
			}
		}
		return index;
	}

}
