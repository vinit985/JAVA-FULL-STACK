package com.java.Multithreading;

//Creating thread using runnable interface
public class MyThread implements Runnable {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("value of i:" + i);
			try {
			Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

}
