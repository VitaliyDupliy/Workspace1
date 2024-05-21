package lesson23;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("one");
		al1.add("two");
		al1.add("three");
		al1.add("four");
		al1.add("five");
		
		System.out.println("al1 = " + al1);
		System.out.println("***********************");
//		
//		ArrayList<String> al2 = new ArrayList<>();
//		al2.add("one");
//		al2.add("three");
//		al2.add("four");
//		al2.add("ten");
//		boolean result = al1.containsAll(al2);
//		System.out.println(result);
//		List<String> sublist = al1.subList(1, 4);
//		System.out.println(sublist);
//		sublist.add("ten");
//		System.out.println(sublist);
//		System.out.println(al1);
		
//		al1.add("million");
//		System.out.println(sublist);
		
		String[] array = al1.toArray(new String[1]);
		for(String s: array) {
			System.out.println(s);
		}
		
	}

}
