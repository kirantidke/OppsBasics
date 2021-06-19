package Bridgelabz;

public class GenericExample {
	public static < E > void printArray( E[] inputArray) {
		for(E element : inputArray) {
			System.out.print("  " + element);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {2.1,2.3,4.4,6.6};
		Character[] charArray = {'f','t','i','p'};
		
		System.out.println("integerArray contains: ");
		printArray(intArray);
		
		System.out.println("doubleArray contains: ");
		printArray(doubleArray);
		
		System.out.println("charArray contains: ");
		printArray(charArray);
		
	}

}
