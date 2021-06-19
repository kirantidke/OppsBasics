package Bridgelabz;

public class EncapsulationPerson {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	public static void main(String[] args) {
		EncapsulationPerson p1 = new EncapsulationPerson();
		p1.setName("kiran");
		System.out.println(p1.getName());
		}
}
