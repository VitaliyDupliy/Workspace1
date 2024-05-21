package lesson28;

public class Pinguin extends Bird{

	public Pinguin(String name) {
		super(name);
		this.name = name;
	}

	@Override
	void fly() {
		System.out.println("Pinguini ne umeyut letat");
		
	}

	@Override
	void eat() {
		System.out.println("Pinguini lubyat est ribu");
		
	}

	@Override
	void sleep() {
		System.out.println("Pinguini spyat prigavshis drug k drugu");
		
	}

	
    
    @Override
    public void speak() {
    	
    	System.out.println("Pinguini ne umeyut pet kak solovji");
    }
	

	
}
