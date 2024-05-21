package lesson33;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class Test4 {

	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.of(2024, Month.MAY, 8);
		LocalDateTime ldt = LocalDateTime.of(2024, Month.MAY, 8, 12, 47);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM dd yyyy, hh:mm");
		System.out.println(ldt.format(dtf));
		
//		LocalTime lt = LocalTime.of(12, 54);
//		System.out.println(ld.getDayOfWeek());
//		System.out.println(ldt.getMinute());
//		
//		
//		DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;
//		System.out.println(ldt.format(d1));
//		
//		DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
//		System.out.println(ldt.format(d2));
		
//		DateTimeFormatter tf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
//
//		System.out.println(ldt.format(tf));
		
	}

	
	
	
}
