package com.java.Multithreading;
//creating thread using Thread class
public class MyThread2 extends Thread{

	public void run()
	{
		System.out.println("printing table of 2");
		for(int i =1;i<=10;i++)
		{
			System.out.println(2*i);
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
