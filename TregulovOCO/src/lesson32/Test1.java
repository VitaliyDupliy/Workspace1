package lesson32;

import java.io.*;

public class Test1 {
	
	
	static StringBuilder abc() {
		StringBuilder a = new StringBuilder("Privet");
		
		try {
			File f = new File("test.txt");
			FileInputStream fis = new FileInputStream(f);
			
			} catch (FileNotFoundException e) {
				
				System.out.println("Exception poyman");
				System.out.println("Peremennya \"a\" v catch bloke: " + a);
				return a;
			}
			finally {
				a = a.append("!!!");
				System.out.println("eto block finally");
				System.out.println("Peremennya \"a\" v finally bloke: " + a);
				
			}
		return a;
	}

	public static void main(String[] args) {

		System.out.println(abc());
		
	}

}
