package com.regexProgram;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidLastName {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Last Name : ");
		String LastName = scan.nextLine();
		
		if(Pattern.matches("^[A-z][a-z]{0,3}",LastName)) {
			System.out.println("Last Name : "+LastName);
			System.out.println("Last Name is in Valid Format");
		}
		else {
			System.out.println("Last Name is in Invalid Format");
		}
	}

}
