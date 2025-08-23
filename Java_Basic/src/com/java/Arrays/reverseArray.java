package com.java.Arrays;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,25,8,55,10,33,17};
		int[] reverseArray = reverse(arr);
		for(int i =0;i<reverseArray.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
	private static int[] reverse(int[] arr)
	{
		int i =0;
		int j = arr.length-1;
		while(i<j)
		{
			int temp = arr[i];
			arr[i] =arr[j];
			arr[j] =temp;
			i++;
			j--;
		}
		return arr;
	}

}
