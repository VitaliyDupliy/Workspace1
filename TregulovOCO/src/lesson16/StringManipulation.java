package lesson16;

public class StringManipulation {
	
	public static void findEmail(String str) {
		
		int firstSimbol = 0;
		int lastSimbol = 0;
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i)=='@') {
				firstSimbol = i+1;
			}
			if(str.charAt(i)=='.') {
				lastSimbol = i;
				System.out.println(str.substring(firstSimbol, lastSimbol));
			}
			
		}
	}

	public static void main(String[] args) {
	String emails = "ya@yahoo.com; mail@meta.com; google@gmail.com ma@mail.com";
	
	findEmail(emails);
	
	
}
}
