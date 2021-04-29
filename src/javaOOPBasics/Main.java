package javaOOPBasics;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setFirstName("Ali");
		user.setLastName("Yılmaz");
		user.setUserName("aliylmz");
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Ahmet");
		instructor.setLastName("Yeşil");
		instructor.setUserName("ahmt.ysl");
		instructor.setNumberOfCoursesGiven(5);
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Fatma");
		student.setLastName("Gürsu");
		student.setUserName("FtmGrsss");
		student.setEmail("ftmgrs1254@hotmail.com");
		student.setNumberOfCoursesTaken(8);
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Ömer");
		student2.setLastName("Dinç");
		student2.setUserName("OMrDnc");
		student2.setEmail("omdc4579@hotmail.com");
		student2.setNumberOfCoursesTaken(4);
		
		UserManager userManager = new UserManager();
		userManager.logIn();
		userManager.signUp();
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.signUp();
		instructorManager.logIn();
		instructorManager.addCourse(instructor);
		instructorManager.addCourse(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.signUp();
		studentManager.logIn();
		studentManager.joinCourse(student);
		studentManager.joinCourse(student);
		
		System.out.println("----------------------------");
		
		studentManager.signUp();
		studentManager.logIn();
		studentManager.joinCourse(student2);
		studentManager.joinCourse(student2);
		
	}

}
