package com.java.Multithreading_Producer_Consumer_Problem;

public class Consumer extends Thread {

	Company company;
	public Consumer(Company c) {
		// TODO Auto-generated constructor stub
		this.company =c;
	}
	public void run()
	{
		while(true)
		{
		 System.out.println(this.company.consume_item());
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
