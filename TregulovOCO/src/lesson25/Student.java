package lesson25;

public class Student {
	private StringBuilder name;
	private int course;
	private int grade;
	
	public StringBuilder getName() {
		StringBuilder sb = new StringBuilder(name);
		return sb;
	}
	
	public void setName(StringBuilder sb) {
		if(sb.length() >= 3) {
			name = sb;
		}
		
	}

	public int getCourse() {
		return course;
	}
	
	public void setCourse(int c) {
		if(c > 0 && c <= 4) {
			course = c;
		}
	}
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int g) {
		if(g > 0 && g <= 10) {
			grade = g;
		}
	}
	
	public void showInfo() {
		
		System.out.println("Student: " + getName() + "\n"+ "Course: " + getCourse() + "\n" 
		+ "Grade: " + getGrade());
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + ", grade=" + grade + "]";
	}
	
	
	
	
	
	
	
}
