package lesson34.lambdas2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;



public class Test2 {

	public static void main(String[] args) {
		List<String> list = List.of("privet", "poka", "kak dela", "vse norm");
		
		for(String s: list) {
			Predicate<String> p = el -> el.length()>4;
			
			if(p.test(s)) System.out.println(s);
		}
		
//		list.forEach(s -> {
//			
//				s=s.toUpperCase();
//				System.out.println(s);
//		});
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(6);
		al.add(8);
		al.add(1);
		al.add(3);
		al.add(7);
		al.add(2);
		al.add(5);
		al.add(4);
		
		System.out.println(al);
		al.removeIf(element -> element%3 == 0); 
		System.out.println(al);
		
		al.sort((a,b) -> a.compareTo(b));
		System.out.println(al);
	}
	
	
	
}
