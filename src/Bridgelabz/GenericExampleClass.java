package Bridgelabz;

public class GenericExampleClass<T>{
	private T t;
	public void add(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
public static void main(String[] args) {
	GenericExampleClass<Integer> i = new GenericExampleClass<Integer>();
	GenericExampleClass<String> s = new GenericExampleClass<String>();
	
	i.add(new Integer(10));
	s.add(new String("kiran"));
	
	System.out.println("integer value: " + i.get());
	System.out.print("String value: " + s.get());

		
	}
}