package lesson40.test27;

public class B extends A {

	int a = 5;
	
	@Override
	int returnA() {
		System.out.println("KLass B " + a);
		return a;
	}
}
