package lesson28;

public class Test {

	public static void main(String[] args) {
		
		Animal an1 = new Lev("Lev1");
		Animal an2 = new Mechenosec("Mech1");
		Animal an3 = new Pinguin("Ping1");
		Bird br = new Pinguin("Ping2"); 
		Fish f = new Mechenosec("Mech2");
		Mammal m = new Lev("Lev2");
		Speakable sp1 = new Lev("Lev3");
		Speakable sp2 = new Pinguin("Ping3");
		Lev lev = new Lev("Lev4");
		Mechenosec mech = new Mechenosec("Mech3");
		Pinguin p = new Pinguin("Ping4");
		
		
		Animal[] animalArray =  {an1, an2, an3, br, f, m, lev, mech, p};
		Speakable[] spArray = {sp1, sp2, br, m, lev, p};
		
		
		
		for(Animal a: animalArray) {
			if (a instanceof Lev) {
				Lev l = (Lev) a;
				System.out.println(l.name);
				System.out.println(l.okras);
				l.eat();
				l.run();
				l.sleep();
				l.speak();
								
			}
			
			
			if (a instanceof Mechenosec) {
				
				Mechenosec m2 = (Mechenosec)a;
				System.out.println(m2.name);
				
				m2.eat();
				m2.sleep();
				m2.swim();
				
				
			}
			
			if (a instanceof Pinguin) {
				Pinguin p1 = (Pinguin)a; 
				System.out.println(p1.name);
				p1.eat();
				p1.fly();
				p1.sleep();
				p1.speak();
				
				
				
			}
			
			System.out.println("*********************************");
			
		}
		
		
		for(Speakable s: spArray) {
			if(s instanceof Lev) {
				Lev l = (Lev) s;
				System.out.println(l.name);
				System.out.println(l.okras);
				l.eat();
				l.run();
				l.sleep();
				l.speak();
			
			}
			
			
			if(s instanceof Pinguin) {
			
				Pinguin p1 = (Pinguin)s;
				
				System.out.println(p1.name);
				p1.eat();
				p1.fly();
				p1.sleep();
				p1.speak();
				
				
				
			}
			System.out.println("*********************************");
		}		
		
		
	}

}
