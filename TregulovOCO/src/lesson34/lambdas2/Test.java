package lesson34.lambdas2;

import java.util.ArrayList;
public class Test {
	
	public static void main(String[] args) {
		
		var tit = new TestInferenceType();
		var i = 10;
		var w = 1.5f;
		var array = new String[] {"a", "b"};
		
		Object obj = "privet";
		var obj2 = obj;
		
		ArrayList<String> al = new ArrayList<>(); 
		for(var s: al) {
			System.out.println(s);
		}
	}

}

class TestInferenceType{}