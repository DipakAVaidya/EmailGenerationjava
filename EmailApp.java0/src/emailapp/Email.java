package emailapp;

import java.util.Scanner;

public class Email {
	private String	firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailBoxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String companySuffix;
	private String alternateEmail;
	
	// Constructor to recieve first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("\n");
		
		// call a method asking for the department - return the departmet
		this.department = setDepartment();
		System.out.println("\n");
		
		// call method that return company name
		this.companySuffix = setCompanySuffix();
		System.out.println("\n\n");
		
		// combine element to generate email
		email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix.toLowerCase() + ".com";
//		System.out.println("Your generated comapny email as per your Detail :  " + email);
		
		// call a method that return Random password
		this.password = randomPassword(defaultPasswordLength);
//		System.out.println("Your generated random Password is:" + this.password);
		
	
		
		}
	
	 // Ask for the Department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES \n1: for Sales\n2: for Development\n3: for Accounting\n4: for Marketing\n5:for BPM \n0: for None\nEnter Department code  Were You Work: ");
		Scanner sc = new Scanner(System.in);
		int depChoise = sc.nextInt();
		if (depChoise == 1 ) {
			return "Sales";
		} 
		else if (depChoise == 2) {
			return "Development";
		}
		else if (depChoise == 3) {
			return "Accounting";
		}
		else if (depChoise == 4) {
			return "Marketing";
		}
		else if (depChoise == 5) {
			return "BPM";
		}
		else {
			return "";
		}
	}
	
	// Generate a Random password;
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ124567890!@#$%^&*()|\\':\".,?/ ";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// enter your company name 
	public String setCompanySuffix() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Company Name: ");
		String a = sc.next();
		return a;
	}
	
	// Set mail box capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	
	// Set the alternate email
	public void setAlternateEmail (String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// change the password
	public void changPassword(String password) {
		this.password = password;
	}
	
	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return " NAME : " + firstName  + " " + lastName +
				"\n DEPARTMENT : " + department +
				"\n COMPANY : " + companySuffix +
				"\n EMAIL ID : " + email +
				"\n PASSWORD : " + password;
	}
	
	
}











