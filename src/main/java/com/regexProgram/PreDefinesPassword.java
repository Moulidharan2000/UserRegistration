package com.regexProgram;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PreDefinesPassword {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Password : ");
		String password = scan.nextLine();
		System.out.println("Password : "+password);
		
		if(Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$",password)) {
			
			System.out.println("Password is Valid");
		}
		else {
			System.out.println("Password is Invalid");
		}

	}

}
