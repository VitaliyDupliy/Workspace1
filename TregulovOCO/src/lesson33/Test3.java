package lesson33;

import java.time.*;


public class Test3 {

	public static void main(String[] args) {
//		LocalDate nachalo = LocalDate.of(2024, Month.MAY, 8);
		Period p = Period.ofDays(3);
//		System.out.println(nachalo.plus(p));
		
		LocalDateTime ldt = LocalDateTime.of(2024, 5, 8, 12, 40); 
		Duration d = Duration.ofMinutes(7);
		System.out.println(ldt);
		System.out.println(ldt.plus(d).plus(p));

	}

}
