package lesson28;

public class Lev extends Mammal{

	String okras = "Polosatiy";
	public Lev(String name) {
		super(name);
		this.name = name;
	}

	@Override
	void run() {
		System.out.println("Lev ne samaja bistraja koshka");
		
	}

	@Override
	void eat() {
		System.out.println("Lev lubit myaso");
		
	}

	@Override
	void sleep() {
		System.out.println("Lev spit bolshuju chast dnya");
		
	}

	@Override
	public void speak() {
		System.out.println("RRRRRRRRRRRR");
	}
	
	
	

}
