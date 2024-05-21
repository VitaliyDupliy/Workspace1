package Lesson6;

public class Student {

	int id;
	String name;
	String Surename;
	byte course;
	double averageGrade;
	
	Student (int id, String name, String surename, byte course, double averagegrade){
		 this.id = id;
		 this.Surename = surename;
		 this.name = name;
		 this.averageGrade = averagegrade;
	}
	
	Student (int id, String name, String surename){
		this(id, name, surename, (byte) 0, 0.0);
	}
}
