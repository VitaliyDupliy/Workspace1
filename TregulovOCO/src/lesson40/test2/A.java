package lesson40.test2;

public class A {

	
	public A() { abc("String 1");}
	static String str1 = abc("String 2");
	String str3 = abc("String 3");
	{
		str1 = abc("String 4");
		
	}
	
	static {str1 = abc("String 5");}
	static String str2 = abc("String 6");
	String str4 = abc("String 7");
	
	public static void main(String[] args) {
		
		A a = new A(); 
	}
	
	static String abc(String str) {
		System.out.println(str);
		return str;
	}

}
