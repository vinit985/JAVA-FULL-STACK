package com.java.OOPs.oops2;

//class Z{
/*
 * Z() { System.out.println("Class Z constructor"); } }
 */
class A {
	int val = 10;

	A() {
		System.out.println("Class A constructor");
	}

	void abc() {
		System.out.println("A function");
	}
}

class B extends A {
	B() {
		/*
		 * System.out.println(super.val); super.print();
		 */
	}

	void abc()
	{
		System.out.println("B abc");
//		super.print();
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
        obj.abc();
	}

}
