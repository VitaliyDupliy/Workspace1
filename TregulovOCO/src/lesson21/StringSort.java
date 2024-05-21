package lesson21;

import java.util.ArrayList;
import java.util.Collections;

public class StringSort {

	
	public static ArrayList<String> abc(String...str) {
		ArrayList<String> result = new ArrayList<>();
		for(String s: str) {
			if(!result.contains(s)) {
				result.add(s);
				
			}
		}
		Collections.sort(result);
		System.out.println(result);
		return result;
	}
	
	public static void main(String[] args) {
		
		abc("cat", "dog", "cat", "hello", "madam", "ABBA","mister", "boy", "boy", "ABBA");
	}
}
