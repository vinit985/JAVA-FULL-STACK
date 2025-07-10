package com.java.OOPs.oops2;

abstract class AA {
	abstract void print();

	void normalFUnction() {
//		logic
		System.out.println("Non abstract function");
	}
}
class BB extends AA{

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("Print method implementation in Class BB");
		
	}
	
}

public class AbstraceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA obj  =  new BB();
		obj.print();
		

	}

}
