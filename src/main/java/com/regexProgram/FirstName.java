package com.regexProgram;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FirstName {
	public static void main(String [] args ) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the First Name : ");
		String firstName = scan.nextLine();
		
		if(Pattern.matches("^[A-Z][a-z]{1,}",firstName)) {
			System.out.println("First Name : "+firstName);
			System.out.println("First Name is in Valid Format");
		}
		else {
			System.out.println("First Name is in Invalid Format");
		}
	}
}