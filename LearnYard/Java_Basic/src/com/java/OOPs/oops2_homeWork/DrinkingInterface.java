package com.java.OOPs.oops2_homeWork;
interface Drinks{
	public void drinkingFeeling();
	public void getName();
}
class Water implements Drinks{

	@Override
	public void drinkingFeeling() {
		// TODO Auto-generated method stub
		System.out.println("We should always drink adequate amount of water daily");
		
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("Water class");
	}
	
}
class Milk implements Drinks{

	@Override
	public void drinkingFeeling() {
		// TODO Auto-generated method stub
		System.out.println("Milk is healthy to drink");
		
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("Milk class ");
	}
	
}
public class DrinkingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drinks d = new Water();
		d.drinkingFeeling();
		d.getName();
		Drinks d1 = new Milk();
		d1.drinkingFeeling();
		d1.getName();
		
		

	}

}
