package com.java.OOPs.oops2;
class Car{
	int tyre =4;
	int speed = 100;
	public Car()
	{
		
	}
	void print()
	{
		System.out.println("Car print method");
	}
	
}
class BMW extends Car{
	public BMW()
	{
		
	}
	void bmwPrint()
	{
		System.out.println("BMW print");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW b = new BMW();
		b.bmwPrint();
		b.print();
		System.out.println(b.speed);
		System.out.println(b.tyre);

	}

}
