package com.java.Arrays;

public class rotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[] = rotateArray(new int[]{10,20,30,40,50,60,70},3);
       for(int i=0;i<arr.length;i++)
       {
    	   System.out.print(arr[i]+" ");
       }
	}

	private static int[] rotateArray(int[] is, int k) {
		int newArray[] = new int[is.length];
		for(int i = 0;i<is.length;i++)
		{
			if(i>=k)
			{
				newArray[i-k] = is[i];
			}
			else
			{
				 newArray[(is.length+i)-k] = is[i];
			}
		}
		
		return newArray;
	}

}
