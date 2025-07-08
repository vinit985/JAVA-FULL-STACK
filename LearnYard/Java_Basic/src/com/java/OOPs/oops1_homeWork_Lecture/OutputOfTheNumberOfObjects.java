package com.java.OOPs.oops1_homeWork_Lecture;

class SchoolMember{
	String name;
	Long phnNumber;
	 static int totalNumberOfMember;
	 public SchoolMember()
	 {
		 totalNumberOfMember++;
		 System.out.println("School memeber constructor");
	 }
	
}
class Teacher extends SchoolMember{
	public Teacher()
	{
//		totalNumberOfMember++;
		System.out.println("Teacher constructor");
	}
	double salary;
}
class Students extends SchoolMember{
	public Students()
	{
//		totalNumberOfMember++;
		System.out.println("Students Constructor");
	}
	int grade;
}

public class OutputOfTheNumberOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1 =  new Students();
		Teacher  t1 = new Teacher();
		System.out.println(SchoolMember.totalNumberOfMember);
		System.out.println(SchoolMember.totalNumberOfMember);
		
		
	}

}
