package com.java.Multithreading_Producer_Consumer_Problem;

public class Producer extends Thread{

	Company company;
	public Producer(Company c) {
		// TODO Auto-generated constructor stub
		this.company =c;
	}
	public void run() {
		// TODO Auto-generated method stub
		int i =1;
		while(true)
		{
		   this.company.produce_item(i++);
		   try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		

	}

}
