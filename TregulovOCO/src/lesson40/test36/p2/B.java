package lesson40.test36.p2;

import lesson40.test36.p1.*;
import static lesson40.test36.p1.A.*;

public class B {
	
	B(){
		System.out.println("construktor B");
	}

	static A a1 = new A();
	static A a2 = new A();
	
	{
		System.out.println("Vsem horoshego dnya");
	}
	
	public static void main(String[] args) {
		A a3 = new A();
		B b = new B();
		a1.x = 5;
		a2.x = 10;
		System.out.println(a1.x);
	}
}
