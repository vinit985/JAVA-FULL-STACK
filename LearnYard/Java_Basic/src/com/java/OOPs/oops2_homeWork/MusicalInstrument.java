package com.java.OOPs.oops2_homeWork;
class Instrument{
	void makeSound()
	{
		System.out.println("The instrument makes beautiful sound");
	}
}
class Erhhu extends Instrument{
	void makeSound()
	{
		System.out.println("Erhu sound is beautiful");
	}
}
class Piano extends Instrument{
	void makeSound()
	{
		System.out.println("Piano soud is beautiful");
	}
}
class Violin extends Instrument{
	void makeSound()
	{
		System.out.println("Violin sound is beautiful");
	}
}
public class MusicalInstrument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Erhhu erhu = new Erhhu();
		Piano piano = new Piano();
		Violin violin = new Violin();
		erhu.makeSound();
		piano.makeSound();
		violin.makeSound();
	    

	}

}
