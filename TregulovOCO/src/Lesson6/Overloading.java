package Lesson6;

public class Overloading {
	
	int sum()
	{
		int result = 0;
		System.out.println("Result = 0");
		return result;
	}
	
	int sum(int a)
	{
		int result = a;
		System.out.println("Result = " + result);
		return result;
	}
	
	int sum(int a, int b)
	{
		int result = a + b;
		System.out.println("Result = " + result);
		return result;
	}
	
	int sum(int a, int b, int c)
	{
		int result = a + b + c;
		System.out.println("Result = " + result);
		return result;
	}
	
	int sum(int a, int b, int c, int d)
	{
		int result = a + b + c + d;
		System.out.println("Result = " + result);
		return result;
	}
	
	
}
