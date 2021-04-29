package javaOOPBasics;

public class Student extends User {
	private String email;
	private int numberOfCoursesTaken;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumberOfCoursesTaken() {
		return numberOfCoursesTaken;
	}
	public void setNumberOfCoursesTaken(int numberOfCoursesTaken) {
		if(numberOfCoursesTaken <0)
		{
			System.out.println("You cannot enter a negative number for number of courses taken.");
		}
		else {
			this.numberOfCoursesTaken = numberOfCoursesTaken;
		}
	}
}