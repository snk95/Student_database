package student_database_app;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;

	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first name");
		this.firstName = in.nextLine();

		System.out.println("Enter last name");
		this.lastName = in.nextLine();

		System.out.println("1- Freshman\n2-Sophomore\n3- Junior\n4- SeniorEnter class level");
		this.gradYear = in.nextInt();

		setStudentID();

		
	}

	private void setStudentID() {
		id++;
		this.studentID = gradYear + "" + id;
	}

	public void enroll() {
		do {
			System.out.print("Enter course to enroll (q to quit):");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equalsIgnoreCase("q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			} else {
				break;
			}
		} while (1 != 0);
		
		
	}
	
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: ");
		Scanner in= new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank for payment of: "+payment);
		viewBalance();
	}

	public  void viewBalance() {
		System.out.println("Your balance is: "+tuitionBalance);
		
	}
	
	public String showInfo() {
		return "Name: "+firstName+" "+lastName+
				"\nStudentID: "+studentID+
				"\nGradLevel: "+gradYear+
				"\nCourses Enrolled: "+courses+
				"\nBalance: "+tuitionBalance;
	}
}
