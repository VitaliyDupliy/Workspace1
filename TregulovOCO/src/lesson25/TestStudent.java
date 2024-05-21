package lesson25;

public class TestStudent {

	public static void main(String[] args) {
		
		Student st = new Student();
		st.setName(new StringBuilder("Alex"));
		st.setCourse(3);
		st.setGrade(8);
//		System.out.println(st);
		st.showInfo();

	}

}
