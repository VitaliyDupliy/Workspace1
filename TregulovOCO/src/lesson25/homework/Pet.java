package lesson25.homework;

public class Pet extends Animal{
	
	String name;
	public static int tales = 1;
	public static int raw= 4;
	
	public Pet() {
		eyes = 2;
		System.out.println("I am pet");
	}
	
	public void run() {
		System.out.println("Pet runs");
	}
	
	public void jump() {
		System.out.println("Pet jumps");
	}

}
