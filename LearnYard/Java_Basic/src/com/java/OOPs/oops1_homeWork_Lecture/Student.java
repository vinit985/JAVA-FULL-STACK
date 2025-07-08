package com.java.OOPs.oops1_homeWork_Lecture;

public class Student {

	private String name;
	private int age;
	private int[] listOfGrades ;
	public Student()
	{
		listOfGrades = new int[3];
	}
	public Student(String name,int age,int[] listOfGrades)
	{
		this.name =name;
		this.age =age;
		this.listOfGrades = listOfGrades;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setListofGrade(int[] arr)
	{
		listOfGrades[0] =arr[0];
		listOfGrades[1] =arr[1];
		listOfGrades[2]= arr[2];
	}
	public String getName()
	{
		return (this.name);
	}
	public int getAge()
	{
		return (this.age);
	}
	public int gethighestGrade()
	{
		int max =listOfGrades[0];
		for(int i =1;i<listOfGrades.length;i++)
		{
			if(listOfGrades[i]>max)
			{
				max = listOfGrades[i];
			}
		}
		return max;
	}
	
}
