package lesson33;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Test2 {

	static void smenaDejurnogo(LocalDate nachalo, LocalDate konec, Period p) {
		LocalDate data = nachalo;
		int count = 0;
		while (data.isBefore(konec)) {
			
			System.out.println("Nastupila data " + data + ", Pora menyat dejurnogo" + ++count);
			data = data.plus(p);
		}
	}

	public static void main(String[] args) {
		LocalDate nachalo = LocalDate.of(2020, Month.SEPTEMBER, 1);
		LocalDate konec = LocalDate.of(2021, Month.MAY,25);
		Period p = Period.ofDays(10);
		
		smenaDejurnogo(nachalo, konec, p);
		
	}
}
