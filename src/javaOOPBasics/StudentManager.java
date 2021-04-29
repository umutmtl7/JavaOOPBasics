package javaOOPBasics;

public class StudentManager extends UserManager {
	@Override
	public void logIn() {
		System.out.println("Logged in as a student.");
	}
	@Override
	public void signUp() {
		System.out.println("Signed up as a student.");
	}
	public void joinCourse(Student student)
	{
		System.out.println(student.getUserName() + " joined the course. The student has " 
	+ (student.getNumberOfCoursesTaken() + 1)  
				+ " courses right now.");
		student.setNumberOfCoursesTaken(student.getNumberOfCoursesTaken() + 1);
	}
}
