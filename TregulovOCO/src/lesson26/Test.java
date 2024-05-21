package lesson26;

public class Test {
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		//emp.sleep();
		Employee e = new Teacher();
		Teacher t = new Teacher();
		Employee emp2 = new Teacher();
		
		emp2.sleep();
		t.sleep();
	}

}

class Employee {
	double salary = 100;

	  void sleep() {
		System.out.println("employee sleeps");
	}
}


class Teacher  extends Employee{

	 void sleep() {
		System.out.println("teacher sleeps");
	}
}
	

