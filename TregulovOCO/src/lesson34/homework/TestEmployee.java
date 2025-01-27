package lesson34.homework;

import java.util.ArrayList;
import java.util.function.*;

public class TestEmployee {
	
	public void printEmployee(Employee e){
		System.out.println("Emplyee name: " + e.name + "; Department: " + e.department + "; Salary: " + e.salary);
	}
	
	public void employeeFiltration(ArrayList<Employee> list, Predicate<Employee> p) {
		
		for(Employee e: list) {
			if(p.test(e)) {
				printEmployee(e);
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		Employee e1 = new Employee("Mark", "IT", 201);
		Employee e2 = new Employee("Maria", "Logistic", 400);
		Employee e3 = new Employee("Edvard", "Sale", 500);
		Employee e4 = new Employee("Emma", "IT", 500);
		Employee e5 = new Employee("Arnold", "Production", 700);
		Employee e6 = new Employee("Emily", "Sale", 450);
		Employee e7 = new Employee("Sale", "Sale", 450);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		
		TestEmployee te = new TestEmployee();
		te.employeeFiltration(list, p -> p.department == "IT" && p.salary > 200);
		System.out.println("***************************");
		te.employeeFiltration(list, p -> p.name.startsWith("E") && p.salary != 450);
		System.out.println("***************************");
		te.employeeFiltration(list, p -> p.department.equalsIgnoreCase(p.name));
		
		
	}

}
