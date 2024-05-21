package lesson27;

public class Mechenosec extends Fish {

	public Mechenosec(String name) {
		super(name);
		this.name = name;
	}

	@Override
	void swim() {
		System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet");
		
	}

	@Override
	void eat() {
		System.out.println("Mechenosec est rybiy korm");
		
	}
	
	
}
