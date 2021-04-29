package javaOOPBasics;

public class InstructorManager extends UserManager {

	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " was added with this username : "
				+instructor.getUserName() + " as an instructor.");
	}
	public void addCourse(Instructor instructor){
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " 
				+  " added a new course. The instructor has " + instructor.getNumberOfCoursesGiven()+1 
				+ " courses now.");
		instructor.setNumberOfCoursesGiven(instructor.getNumberOfCoursesGiven()+1);
	}
	@Override
	public void logIn() {
		System.out.println("Logged in as an instructor.");
	}
	@Override
	public void signUp() {
		System.out.println("Signed up as an instructor.");
	}
}
