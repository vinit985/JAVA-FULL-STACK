package com.java.Arrays;

public class duplicateCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,2,3,4,4};
		int maxNumber =0;
		for(int i =0;i<arr.length;i++)
		{
			maxNumber = Math.max(maxNumber, arr[i]);
		}
		int frequency[] = new int[maxNumber+1];
		for(int i=0;i<arr.length;i++)
		{
			int value = arr[i];
			frequency[value]++;
		}
		int count =0;
		for(int i =0;i<frequency.length;i++)
		{
			 if(frequency[i]>=2)
			 {
				 count++;
			 }
		}
		System.out.println(count);

	}

}
