package studentDataBaseApp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null ;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	//Constructor prompt user to enter name and year
	
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student First Name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter Student Last Name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student Class Level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);	
		
		
		
		
		
	}
	
	// generate an ID 
	
	private void setStudentID () {
		// Grade Year  + ID 
		id++ ;
		this.studentID =  gradeYear + "" + id;
	}
	
	// Enroll in 
	public void enroll() {
		// Get inside a loop, user hits 0;
		System.out.println("Enter course to enroll ( 0 to quit ): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if (course != "Q") {
			
			courses = courses + "\n" + course;
			
			tuitionBalance = tuitionBalance + costOfCourse;
		}
		System.out.println("ENROLLED IN: " + courses);
		System.out.println("TUITION BALANCE: " +tuitionBalance);
		
	}

	// view balance
	
	//pay tuition 
	
	//show status

}
