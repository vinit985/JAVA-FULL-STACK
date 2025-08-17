package com.java.OOPs.oops1;

public class Student {

	int marks;
	String name;
	private Long studentMobileNumber;
	private String address;
	static int studentCount;
	public Student()
	{
		studentCount++;
	}
	 
	public void setstudentMobileNumber(Long no)
	{
		this.studentMobileNumber = no;
	}
	public void setAddress(String add)
	{
		this.address = add;
	}
	public Long getstudentMobileNumber()
	{
		return this.studentMobileNumber;
	}
	public String getAddress()
	{
		return this.address;
	}
	
}
