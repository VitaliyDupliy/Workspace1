package lesson14;

public class Clokcs {

	public static void showTime() {
		
		HOUR:		
		for(int hour = 0; hour <= 6; hour++) {
			MINUTE:
			for(int minute = 0; minute <= 59; minute++) {
				if(hour > 1 && minute % 10 == 0 ) {
					break HOUR;
				}
				
				for(int second = 1; second <= 59; second++) {
					System.out.println(hour + ":" + minute + ":" + second);
					 if ((second * hour) > minute ) {
						continue MINUTE;
					}
		//			System.out.println(hour + ":" + minute + ":" + second);
					}
					
					
					}
					
				}
			
			}
			
		
	
	
	
	public static void main(String[] args) {
		
		showTime();
		
	}

}
