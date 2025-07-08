package com.java.OOPs.oops1_homeWork_Lecture;
class Vehicle{
   
	private int speed;
	private int volume;
	private double acceleration;
	private double time;
	public Vehicle(Double acceleration,double time)
	{
		this.acceleration = acceleration;
		this.time = time;
	}
	public void move()
	{
		System.out.println("Speed: "+speed);
		System.out.println("Volume: "+volume);
		System.out.println("Acceleration: "+acceleration);
	}
	public void setSpeed(int Speed)
	{
		this.speed= Speed;
		System.out.println(this.speed);
	}
	public void speedUp()
	{
		System.out.println("SpeedUp: "+ (speed+(acceleration*time)));
	}
	public void speedDown()
	{
		double speedDownLocal = speed-(acceleration*time);
		if(speedDownLocal>0)
		{
		System.out.println("Speed down: "+speedDownLocal);
		}
	}
	public void setSize(int size)
	{
		this.volume =size;
	}
}

public class UsingTransportationMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 =  new Vehicle(10.0,2.0);
		v1.setSize(8);
		v1.setSpeed(40);
		v1.move();
		v1.speedUp();
		v1.speedDown();
		

	}

}
