package lesson26.homework.p2;

import lesson26.homework.p1.*;

public class Y extends X {

	Y() {System.out.println("constructorY"); }

	public void abc() {
		System.out.println("abcY");
	}
	
	public void def() {
		Y y = new Y();
		y.abc();
	}
	
	public void ghi() {
		X x = new Y();
		System.out.println("**********************************");
		x.abc();
	}
	
	
	public static void main(String[] args) {
		Y a = new Y();
		System.out.println("88888888888888888888888");
	//	a.abc();
	//	a.def();
		a.ghi();
	}
	
}
