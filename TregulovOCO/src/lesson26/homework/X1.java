package lesson26.homework;

public class X1 {

	public X1() {
		System.out.println("X1");
	}

	public X1(int i) {
		System.out.println("X1" + i);
	}

	private boolean abc() {
		return false;
	}

	public static void main(String[] args) {

		X1 x = new Y1(18);
		System.out.println(x.abc());
	}

}

class Y1 extends X1{
	public Y1(int i) {
		System.out.println("Y1");
	}
	
	public boolean abc() {
		return true;
	}
}



