package com.java.Multithreading_Producer_Consumer_Problem;

public class Company {

	int n;
	boolean f = false;
//	if f is false then we need to produce.
	public synchronized void produce_item(int n)
	{
		if(f)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.n =  n;
		f= true;
		System.out.println("Producer: "+n);
	}
	public synchronized int consume_item()
	{
	
		if(!f)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Consumed Item: "+this.n);
		f= false;
		return this.n;
		
		
		
	}
}
