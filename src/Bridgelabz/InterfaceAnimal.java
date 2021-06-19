package Bridgelabz;

interface Animal11{
	public void animalSound();
	public void sleep();	
}

class Pig1 implements Animal11{
	public void animalSound() {
		System.out.println("piiiiii");
	}
	public void sleep() {
		System.out.println("zzzzz");
	}
}

public class InterfaceAnimal {

	public static void main(String[] args) {
		Pig1 p1 = new Pig1();
		p1.animalSound();
		p1.sleep();

	}

}
