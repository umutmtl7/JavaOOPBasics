package javaOOPBasics;

public class Instructor extends User {
	private int numberOfCoursesGiven;

	public int getNumberOfCoursesGiven() {
		return numberOfCoursesGiven;
	}

	public void setNumberOfCoursesGiven(int numberOfCoursesGiven) {
		if(numberOfCoursesGiven < 0)
		{
			System.out.println("You cannot enter a negative number for number of courses given.");
		}
		else
		{
			this.numberOfCoursesGiven = numberOfCoursesGiven;
		}
	}
}
