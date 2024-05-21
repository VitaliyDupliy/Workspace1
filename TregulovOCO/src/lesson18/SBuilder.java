package lesson18;

public class SBuilder {

	public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
		
		boolean result = false;
		
		if(sb1.length() == sb2.length()) {
			for(int i = 0; i < sb1.length();  i++) {
				if(sb1.charAt(i) != sb2.charAt(i)) {
					result = false;
					break;
					
				}else {
					result = true;
				}
			}
		} 
		
		return result;
	}
	
	
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("String");
		StringBuilder sb2 = new StringBuilder("String");
		
		System.out.println(ravenstvo(sb1, sb2));
	}
}
