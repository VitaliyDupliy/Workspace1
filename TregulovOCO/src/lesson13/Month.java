package lesson13;

public class Month {

	int monthNumber;
	
	public static void showNumberDays(int monthNumber) {
		
		switch(monthNumber) {
		
		case 1: System.out.println("in January 31 days");
		break;
		case 3: System.out.println("in March 31 days");
		break;
		
		case 2: System.out.println("in Fabruary 29 days");
		break;
		
		case 6: System.out.println("in June 31 days");
		break;
		
		case 8: System.out.println("in August 31 days");
		break;
		case 10: System.out.println("in October 31 days");
		break;
		case 12: System.out.println("in December 31 days");
		break;
		case 4: System.out.println("in April 30 days");
		break;
		
		case 5: System.out.println("in May 30 days");
		break;
		
		
		
		case 7: System.out.println("in Yuly 30 days");
		break;
		
		
		
		case 9: System.out.println("in September 30 days");
		break;
		
		
		
		case 11: System.out.println("in November 30 days");
		break;
		
		
		
		
		}
		
		
	}
	
	public static void main(String[] args) {
		
		
		showNumberDays(11);
	}
}
