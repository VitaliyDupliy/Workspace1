package lesson8;

public class ClassOne {
	
	static final double pi = 3.14;

	static int multiplication(int a, int b, int c) {
		return a*b*c;
	}
	
	static void division(int a, int b) {
		System.out.println("Chastnoe ot deleniya = " + a/b + "; Ostatok = " + a%b);
						
	}
	
	double areaOfCircle(double r) {
		return pi*r*r;
	}
	
	static double circumference(double r) {
		return 2*r*pi;
	}
	
	void circumParameters(double r) {
		double area = areaOfCircle(r);
		double lenght = circumference(r);
		System.out.println("Radius = " + r + "\n" + "Ploschad = " + area + "\n"
		+ "DlinaOkrugnosti = " + lenght);
	}
	
}
