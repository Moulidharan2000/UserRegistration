package com.regexProgram;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidPhoneNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Phone Number : ");
		CharSequence phoneNumber = scan.next();
		
		if(Pattern.matches("(91)?[\\s8-9][0-9]{9}",phoneNumber)) {
			System.out.println("Last Name : "+phoneNumber);
			System.out.println("PhoneNumber is in Valid Format");
		}
		else {
			System.out.println("PhoneNumber is in Invalid Format");
		}
	}

}
