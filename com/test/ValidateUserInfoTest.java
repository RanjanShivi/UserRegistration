package com.test;

import com.regex.UserRegistrationException;
import com.regex.ValidateUserInfo;
import org.junit.Assert;
import org.junit.Test;

public class ValidateUserInfoTest {

    ValidateUserInfo validateInfo = new ValidateUserInfo();

    @Test
    public void firstNameValid() throws UserRegistrationException {
        try {
            String expectedVal = "First name matches";
            String actualResult = validateInfo.firstName("Mukul");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void firstNameInValid() {
        try {
            String expectedVal = "Not Matched";
            String actualResult = validateInfo.firstName("mukul");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void lastNameValid() {
        try {
            String expectedVal = "Last Name Matches";
            String actualResult = validateInfo.lastName("Jain");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void lastNameInValid() {
        try {
            String expectedVal = "Not Matched";
            String actualResult = validateInfo.lastName("jain");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void emailIdValid() {
        try {
            String expectedVal = "E-Mail Matches";
            String actualResult = validateInfo.emailId("mukul.jain@sample.com");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void emailIdInValid() {
        try {
            String expectedVal = "Not Matched";
            String actualResult = validateInfo.emailId("mukul.jain.co.in");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void mobNumValid() {
        try {
            String expectedVal = "Mobile Number Matches";
            String actualResult = validateInfo.mobNum("54-5465322154");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void mobNumInValid() {
        try {
            String expectedVal = "Not Matched";
            String actualResult = validateInfo.mobNum("54-55465322154");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void passwordValid() {
        try {
            String expectedVal = "Password matches";
            String actualResult = validateInfo.password("ab98cDE@&fg");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void passwordInValid() {
        try {
            String expectedVal = "Not Matched";
            String actualResult = validateInfo.password("ab98cDEfg");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }
}