package lesson27;

public abstract class Bird extends Animal implements Speakable{

	String name;

	public Bird(String name) {
		super(name);

	}

	abstract void fly();
	
	public void speak() {
		System.out.println(name + "Sings");
	}

}
