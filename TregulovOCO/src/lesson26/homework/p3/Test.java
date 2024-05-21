package lesson26.homework.p3;

public class Test {
	
	public static void abc(X x, Y y) {
		System.out.println("privet");
	}
	public static void abc(Y y, X x ) {
		System.out.println("poka");
	}

	
	public static void main(String[] args) {
		Y a = new Y();
		X b = new Y();
		
	}
}


class X{
	String s = "privet";
}

class Y extends X{
	boolean bool = false;
}
