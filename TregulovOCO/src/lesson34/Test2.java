package lesson34;

import java.util.ArrayList;

public class Test2 {

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

		FindStudentOverGrade fso = new FindStudentOverGrade();
		Student.test(list, fso);
		System.out.println("***********************************");
		FindStudentUndeGrade fsug = new FindStudentUndeGrade();
		Student.test(list, fsug);
		System.out.println("***********************************");
		FindStudentMixCondition fsmc = new FindStudentMixCondition();
		Student.test(list, fsmc);
		
	}

}

interface StudentChecks {

	boolean testStudent(Student s);
}

class FindStudentOverGrade implements StudentChecks {

	@Override
	public boolean testStudent(Student s) {

		return s.avgGrade > 8.5;
	}

}

class FindStudentUndeGrade implements StudentChecks {

	@Override
	public boolean testStudent(Student s) {

		return s.avgGrade < 8.5;
	}
}

class FindStudentOverAge implements StudentChecks {

	@Override
	public boolean testStudent(Student s) {

		return s.age > 25;
	}
}

class FindStudentMixCondition implements StudentChecks {

	@Override
	public boolean testStudent(Student s) {

		return  s.avgGrade > 8 && s.age < 30 && s.sex == 'f';
	}
}
