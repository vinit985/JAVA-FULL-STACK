package com.java.OOPs.oops1_homeWork_Lecture;
class Rectange{
	private double length;
	private double breadth;
	public Rectange(double length,double breadth)
	{
		this.length =length;
		this.breadth =breadth;
	}
	public double perimeter()
	{
		return (2*(length+breadth));
	}
	public double Area()
	{
		return (length*breadth);
	}
}
class Square extends Rectange{
	
	public Square(double length,double breadth) {
		super(length,breadth);
	}
}
public class PermimeterAndAreaOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s1  = new Square(10.0,20.0);
		System.out.println("Area: "+s1.Area());
		System.out.println("Perimeter: "+s1.perimeter());
		
		

	}

}
