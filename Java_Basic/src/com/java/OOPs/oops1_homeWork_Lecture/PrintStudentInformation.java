package com.java.OOPs.oops1_homeWork_Lecture;

public class PrintStudentInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 =  new Student();
		s1.setName("Vinit Singh");
		s1.setAge(25);
		s1.setListofGrade(new int[] {100,98,45});
		System.out.println("Name: "+s1.getName());
		System.out.println("Age: "+s1.getAge());
		System.out.println("Achievement: "+s1.gethighestGrade());
		Student s2 = new Student("Kishan",26,new int[] {70,60,30});
		System.out.println("Name: "+s2.getName());
		System.out.println("Age: "+s2.getAge());
		System.out.println("Achievement: "+s2.gethighestGrade());
		

	}

}
