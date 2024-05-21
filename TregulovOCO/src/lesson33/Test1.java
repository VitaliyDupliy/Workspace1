package lesson33;
import java.time.*;


public class Test1 {
	
	public static void main(String[] args) {
//		System.out.println(LocalDate.now());
//		System.out.println(LocalTime.now());
//		System.out.println(LocalDateTime.now());
		
		LocalDate ld =  LocalDate.of(2024, 5, 7);
		LocalDate ld1 =  LocalDate.of(2024, Month.MAY, 7);
		
		System.out.println(ld);
		ld = ld.plusMonths(10);
		System.out.println(ld);

//		LocalTime lt = LocalTime.of(20, 27);
//		System.out.println(lt);
//		LocalTime lt1 = LocalTime.of(20, 27, 35);
//		System.out.println(lt1);
//		
//		LocalDateTime ldt = LocalDateTime.of(ld1, lt1);
//		System.out.println(ldt);
//		
//		LocalDateTime ldt1 = LocalDateTime.of(2024, Month.MAY, 7, 20, 34);
//		System.out.println(ldt1);
	}

}
