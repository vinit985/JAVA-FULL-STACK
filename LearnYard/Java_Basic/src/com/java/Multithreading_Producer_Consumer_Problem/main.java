package com.java.Multithreading_Producer_Consumer_Problem;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company company = new Company();
		Producer producer = new Producer(company);
		producer.start();
		Consumer consumer = new Consumer(company);
		consumer.start();

	}

}
