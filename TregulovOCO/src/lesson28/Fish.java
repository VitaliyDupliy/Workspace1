package lesson28;

public  abstract class Fish extends Animal{

	String name;
	
	public Fish(String name) {
		super(name);
		this.name = name;
				
	}
	
	
	public void sleep() {
		System.out.println("Vsegda interesno nabludat kak spyat ribi");
	}
	

	abstract void swim();
	
	
	
	
	
	
	
	
	
}










