package com.java.OOPs.oops2;
interface AAA{
	void print();
	void sum();
}

	class BBB implements AAA {

		@Override
		public void print() {
			// TODO Auto-generated method stub
			System.out.println("print method in BBB");
			
		}

		@Override
		public void sum() {
			// TODO Auto-generated method stub
			System.out.println("Sum method in BBB");
			
		}

		

	}

	public class Interfacee {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			AAA obj = new BBB();
			obj.print();
			obj.sum();

		}

	

}
