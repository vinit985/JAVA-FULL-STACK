package com.java.OOPs.oops1;

public class StudentImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s =  new Student();
		s.marks =90;
		s.name = "Vinit Singh";
		s.setstudentMobileNumber(6203102809L);
		s.setAddress("Bengaluru");
		System.out.println(s);
		System.out.println(s.marks);
		System.out.println(s.name);
		System.out.println(s.getstudentMobileNumber());
		System.out.println(s.getAddress());
		System.out.println(s.studentCount);

	}

}
