package emailapp;

import java.util.Scanner;

public class EmailApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Your Last Name: ");
		String lastName = sc.nextLine();
		
		Email a = new Email(name,lastName); 
		
		System.out.println(a.showInfo());
		}
}
