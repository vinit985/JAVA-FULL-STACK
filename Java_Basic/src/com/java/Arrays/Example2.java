package com.java.Arrays;

public class Example2 {
	private static void print(int arr[],int a)
	{
		System.out.println("Array Length "+arr.length);
		arr[0]=1000;
		a = 1000;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[3];
		int a=1;
		arr[0]=1;
		arr[1]=10;
		arr[2]=100;
		print(arr,a);
		System.out.println(a);
		System.out.println(arr[0]);
		

	}

}
