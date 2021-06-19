package Bridgelabz;

class Animal{
	public void animalSound() {
		System.out.println("animal makes sound");
	}
}
class Pig extends Animal{
	public void animalSound() {
		System.out.println("sound of pig is piiii");
	}
}
class Dog extends Animal{
	public void animalSound() {
		System.out.println("sound of dog is biiii");
	}
}
class Animal1{

	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Pig();
		Animal a3 = new Dog();
		
		a1.animalSound();
		a2.animalSound();
		a3.animalSound();
	}

}
