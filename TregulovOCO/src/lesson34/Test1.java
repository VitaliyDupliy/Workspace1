package lesson34;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
		Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
		Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
		Student st4 = new Student("Petr", 'm', 35, 4, 7.0);
		Student st5 = new Student("Maria", 'f', 23, 3, 9.1);
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);
		
		
	}
}

class Student {

	String name;
	char sex;
	int age;
	int course;
	double avgGrade;

	public Student(String name, char sex, int age, int course, double avgGrade) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.course = course;
		this.avgGrade = avgGrade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + ", age=" + age + ", course=" + course + ", avgGrade="
				+ avgGrade + "]";
	}
	
	

	 static void printStudentsOverGrade(ArrayList<Student> al, double avgGrade) {
		for (Student s : al) {
			if (s.avgGrade > avgGrade) {
				System.out.println(s);
			}
		}
	}
	
	 static	void printStudentsUnderGrade(ArrayList<Student> al, double avgGrade) {
		for (Student s : al) {
			if (s.avgGrade < avgGrade) {
				System.out.println(s);
			}
		}
	}
	
	 static	void printStudentsOverAge(ArrayList<Student> al, int age) {
		for (Student s : al) {
			if (s.age > age) {
				System.out.println(s);
			}
		}
	}
	
	 static	void printStudentsUnderAge(ArrayList<Student> al, int age) {
		for (Student s : al) {
			if (s.age < age) {
				System.out.println(s);
			}
		}
	}
	
	 static	void printStudentsBySex(ArrayList<Student> al, char sex) {
		for (Student s : al) {
			if (s.sex == sex) {
				System.out.println(s);
			}
		}
	}
	
	 static	void printStudentsMixCondition(ArrayList<Student> al, double avgGrade, int age, char sex) {
		for (Student s : al) {
			if (s.avgGrade > avgGrade && s.age < age && s.sex == sex) {
				System.out.println(s);
			}
		}
	}
	
	static void test(ArrayList<Student> al, StudentChecks sc) {
		
		for(Student s: al) {
			if(sc.testStudent(s)) {
				System.out.println(s);
			}
		}
	}
	
	
	
}
