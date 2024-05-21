package Lesson6;

public class OverloadingTest {

	public static void main(String[] args) {
		
		Overloading ov = new Overloading();
		
		ov.sum();
		ov.sum(0,1);
		ov.sum(0,1,2);
		ov.sum(0,1,2,3);
		
	}

}
