package com.java.Multithreading;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("creating thread using Runnable interface");
		MyThread t1 = new MyThread();
		Thread thread = new Thread(t1);
		thread.start();
		MyThread2 thread2 = new MyThread2();
		thread2.start();
//		Creating thread using Lamda expression
		Runnable tRunnable = ()->{
			System.out.println("thread creating using runnable interface and lamda Expression");
		};
		Thread t4 = new Thread(tRunnable);
		t4.start(); 
		t4.setName("Vinit" );
		System.out.println(t4.getName());
		

	}

}
