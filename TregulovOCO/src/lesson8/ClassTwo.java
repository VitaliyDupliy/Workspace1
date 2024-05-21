package lesson8;

public class ClassTwo {

	public static void main(String[] args) {
		
		System.out.println(ClassOne.multiplication(5, 8, 3));
		System.out.println(ClassOne.multiplication(3, 4, 5));
		
		ClassOne.division(15, 4);
		ClassOne.division(10, 2);
		
		
		ClassOne co = new ClassOne();
		
		System.out.println(co.areaOfCircle(4.0));
		
		System.out.println(ClassOne.circumference(4));
		
		co.circumParameters(4);

	}

}
