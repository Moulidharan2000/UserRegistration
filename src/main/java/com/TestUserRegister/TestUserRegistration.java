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
			String result = validate.userRegistrationValidation("Daniel", "Mike", "dani.mikeg@gmail.co.in", "91 1234567890", "mikedaniel@");
			Assert.assertEquals("VALID", result);
		}

	    @Test
	    public void givenIncorrectDetailsReturnSad() {
			UserRegistration validate = new UserRegistration();
			String result = validate.userRegistrationValidation("daniel", "mike", "mike-daniel@gmail.co.in1", "919856321456", "DMike@");
			Assert.assertEquals("INVALID", result);
		}
	}
