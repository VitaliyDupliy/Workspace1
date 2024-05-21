package lesson27;

public class Test {

	public static void main(String[] args) {
		
		Mechenosec mech = new Mechenosec("Mechenosec");
		System.out.println(mech.name);

		mech.eat();
		mech.sleep();
		mech.swim();
		Speakable ping = new Pinguin("Ping");
		
		ping.speak();
		
		Animal lev = new Lev("Leopold");
		System.out.println(lev.name);
		lev.eat();
		lev.sleep();
		Mammal ma = new Lev("Ljova");
		System.out.println(ma.name);
		ma.eat();
		ma.run();
		ma.sleep();
		ma.speak();

		
		
		
		
		
		
	}

}
