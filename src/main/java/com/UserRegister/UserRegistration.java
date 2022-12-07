package com.UserRegister;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class UserRegistration {
	static final String firstNamePattern = "^[A-Z][a-z]{2,}";
    static final String lastNamePattern = "^[A-Z][a-z]{2,}";
    static final String emailPattern = "^[a-z0-9]+([.+_-]?[a-z0-9]+)?@{1}[a-z0-9]+[.]([a-z0-9]+[.])?[a-z]{2,}";
    static final String phoneNumberPattern = "^[0-9]{1,2}\\s[0-9]{10}";
    static final String passwordPattern = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&]{1})[A-Za-z0-9@$!%*?&]{8,}";

    public static boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(firstName);
        boolean matchFound = matcher.find();
        return matchFound;
    }
    
    public static boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(lastNamePattern);
        Matcher matcher = pattern.matcher(lastName);
        boolean matchFound = matcher.find();
        return matchFound;
    }

    public static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        boolean matchFound = matcher.find();
        return matchFound;
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(phoneNumberPattern);
        Matcher matcher = pattern.matcher(phoneNumber);
        boolean matchFound = matcher.find();
        return matchFound;
    }

    public static boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(passwordPattern);
        Matcher matcher = pattern.matcher(password);
        boolean matchFound = matcher.find();
        return matchFound;
    }

    public String userRegistrationValidation(String firstName, String lastName, String email, String phoneNumber,
            String password) {
        if (validateFirstName(firstName) && validateLastName(lastName) && validateEmail(email)
                && validatePhoneNumber(phoneNumber) && validatePassword(password)) {
            return "VALID";
        } else {
            return "INVALID";
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to UserRegistration Program");

    }
}