package day3;

public class Student {
	
	//state
	String name;
	int age;
	int studentID;
	double grades;
	
	//behavior
	public void studies() {
		System.out.println("Studying");
	}
	
	public void printStudentDetails() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(studentID);
		System.out.println(grades);
	}
	

}
