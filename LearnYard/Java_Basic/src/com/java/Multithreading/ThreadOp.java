package com.java.Multithreading;

public class ThreadOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program started");
		int x = 30+40;
		System.out.println("Sum: "+x);
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("MyMain");
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getPriority() );
		System.out.println("Program Ended");

	}

}
