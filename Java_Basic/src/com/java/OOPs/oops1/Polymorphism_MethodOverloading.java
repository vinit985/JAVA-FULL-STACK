package com.java.OOPs.oops1;

public class Polymorphism_MethodOverloading {
	public static  void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	public static  int sum(int a,int b,int c)
	{
		return (a+b+c);
	}
	public static double sum(double a,double b)
	{
		return(a+b);
	}
	public  double sum(double a,double b,double c)
	{
		return (a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(5,6);
		System.out.println(sum(5,6,4));
		System.out.println(sum(5.2,4.8));
		Polymorphism_MethodOverloading obj =  new Polymorphism_MethodOverloading();
		System.out.println(obj.sum(1.2,2.3,6.3));

	}

}
