package Bridgelabz;

abstract class A{
	public abstract void animalSound();
	public void sleep() {
		System.out.println("zzzzzzz");
	}
}
class B extends A{
	public void animalSound() {
		System.out.println("piiiiii");
	}
	//public void animalSound();
}

public class AbstractAnimal {

	public static void main(String[] args) {
		B p1 = new B();
		p1.animalSound();
		p1.sleep();

	}

}
