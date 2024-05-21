package lesson28;

public abstract class Animal {
	
	String name = "animal";
	
	public Animal(String name) {
		this.name = name;
	}

	abstract void eat();
	abstract void sleep();
	
	
	
}
