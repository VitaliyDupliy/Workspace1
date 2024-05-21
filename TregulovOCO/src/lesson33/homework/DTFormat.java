package lesson33.homework;

import java.time.*;
import java.time.format.*;


public class DTFormat {
	
	DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("YYYY,MMMM-dd!!hh:mm");
	DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/YY");
	
	public void smena(LocalDateTime ldt1, LocalDateTime ldt2, Period p, Duration d) {
		while(ldt1.isBefore(ldt2)) {
			System.out.print("We work from: " + ldt1.format(dtf1)+ " ");
			ldt1=ldt1.plus(p);
			System.out.println("to: " + ldt1.format(dtf1));
			
			System.out.print("relax from: " + ldt1.format(dtf2)+ " ");
			ldt1 = ldt1.plus(d);
			System.out.println("to: " + ldt1.format(dtf2));
			
		}
	}

	public static void main(String[] args) {
		
		LocalDateTime ldt1 = LocalDateTime.of(2024, Month.MAY, 8, 8, 0);
	//	System.out.println(ldt1.format(dtf1));
		LocalDateTime ldt2 = LocalDateTime.of(2024, Month.MAY, 20, 19, 0);
	//	System.out.println(ldt2.format(dtf2));
		Period p = Period.ofDays(1);
		Duration d = Duration.ofDays(3);
		
		DTFormat dtf = new DTFormat();
		dtf.smena(ldt1, ldt2, p, d);

	}

}
