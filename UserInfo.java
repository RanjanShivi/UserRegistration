package com.regex;

import java.util.Scanner;

public class UserInfo {
    Scanner sc = new Scanner(System.in);
    ValidateUserInfo validateInfo = new ValidateUserInfo();

    public String userFirstName() throws UserRegistrationException {
        System.out.println("Enter Your First Name : ");
        String firstName = sc.next();
        return validateInfo.firstName(firstName);
    }

    public String userLastName() throws UserRegistrationException {
        System.out.println("Enter Your Last Name : ");
        String lastName = sc.next();
        return validateInfo.lastName(lastName);
    }

    public String userEmailId() throws UserRegistrationException {
        System.out.println("Enter Your Email : ");
        String emailID = sc.next();
        return validateInfo.emailId(emailID);
    }

    public String userMobNum() throws UserRegistrationException {
        System.out.println("Enter Your Mobile Number : ");
        String mobileNum = sc.next();
        return validateInfo.mobNum(mobileNum);
    }

    public String userPassword() throws UserRegistrationException {
        System.out.println("Enter Your Password : ");
        String passWord = sc.next();
        return validateInfo.password(passWord);
    }
}


