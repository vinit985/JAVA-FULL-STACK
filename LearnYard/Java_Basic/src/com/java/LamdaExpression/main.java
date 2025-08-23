package com.java.LamdaExpression;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to my System.");
//	Following are the ways to use Functional Interface in Java
//	    1.To implement functional Interface by any class and then use that class object to call method in functional interface

		MyInterface impl = new MyInterImpl();
		impl.sayHello();

//		2.Creating anonymous class function

		MyInterface iter = new MyInterface() {

			public void sayHello() {
				System.out.println("My anonymous class");

			}

		};
		iter.sayHello();

//		3.Using Lamda Expression we can implement FunctionalInterface
		MyInterface interface1 = () -> System.out
				.println("Using lamda Expression to call say hello method in My Inter class");
		interface1.sayHello();
		System.out.println("Implementing Functional Interface of Add:");
		System.out.println("Using anonymous class");
		SumInterface sumInterface = new SumInterface() {

			@Override
			public int sum(int a, int b) {
				return a + b;
			}
		};
		System.out.println(sumInterface.sum(10, 20));
		System.out.println("Using lamda Expression:");
		SumInterface sumInterface2 = (a, b) -> a + b;
		System.out.println(sumInterface2.sum(30, 50));
		StringLength stringLength = (str)-> str.length();
		System.out.println(stringLength.getlength("vinit"));
	    Runnable runnable  = ()->{
//	    	This is the body of thread;
	    	for(int i =0;i<10;i++)
	    	{
	    		
	    		System.out.println("Value is "+i);
	    		try {
	    		Thread.sleep(2000);
	    		}
	    		catch(InterruptedException e)
	    		{
	    			e.printStackTrace();
	    		}
	    	}
	    };
	    Thread thread = new Thread(runnable);
	    thread.start();
	    Runnable runnable2 = () -> {
	    	for(int i =1;i<11;i++)
	    	{
	    		System.out.println("2 * "+i+" = "+(2*i));
	    		try {
	    			Thread.sleep(1000);
	    		}
	    		catch(InterruptedException e)
	    		{
	    			e.printStackTrace();
	    		}
	    	}
	    };
	    Thread thread2  =  new Thread(runnable2);
	    thread2.start();
	    Runnable runnable3  = () ->{
	    	System.out.println("hello I am inside run method of Runnable interface:"); 
	    };
	    Thread thread3 =new Thread(runnable3);
	    thread3.start();
	    
	    

	}

}
