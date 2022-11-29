package com.regexProgram;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidEmail {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Email : ");
		String Email = scan.nextLine();
		
		if(Pattern.matches("^[a-zA-Z0-9]+[@][a-zA-Z]{3,15}[.][a-zA-Z]{2,5}",Email)) {
			System.out.println("Last Name : "+Email);
			System.out.println("Email is in Valid Format");
		}
		else {
			System.out.println("Email is in Invalid Format");
		}
	}

}
