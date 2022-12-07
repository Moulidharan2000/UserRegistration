package com.TestUserRegister;

import java.util.regex.Matcher;

import org.junit.Assert;
import org.junit.Test;

import com.UserRegister.FirstName;
import com.UserRegister.UserRegistration;

public class TestUserRegistration { 
	    @Test
	    public void givenCorrectDetailsReturnHappy() {
			UserRegistration validate = new UserRegistration();
			String result = validate.userRegistrationValidation("Tekesh", "Singh", "tekesh.singh@gmail.co.in", "91 1234567890", "Tekesh1Singh@");
			Assert.assertEquals("VALID", result);
		}

	    @Test
	    public void givenIncorrectDetailsReturnSad() {
			UserRegistration validate = new UserRegistration();
			String result = validate.userRegistrationValidation("tekesh", "singh", "tekesh-Singh@gmail.co.in1", "919087654321", "Tekesh@");
			Assert.assertEquals("INVALID", result);
		}
	}
