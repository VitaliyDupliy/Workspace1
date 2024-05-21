package lesson32;

import java.io.*;

public class Test2 {

	FileInputStream fis1, fis2;

	public void abc() {

		try {
			fis1 = new FileInputStream("test1.txt");

			try {
				fis2 = new FileInputStream("test1.txt");
			} catch (FileNotFoundException e) {
				System.out.println("File test2.txt ne nayden");
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("File test1.txt ne nayden");
		}
		
		finally {
			System.out.println("Eto vneshniy finally block");
			try {
				fis1.close();
				fis2.close();
			} catch (Exception e) {
				System.out.println("Eto  catch vo vneshnem  finally blocke");
				System.out.println( e.getMessage());
				
				
			}
			
			
		}
		System.out.println("Posle bloka finally");

	}
	
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.abc();
	}

}
