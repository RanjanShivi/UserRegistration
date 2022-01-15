package com.regex;

public class UserRegistration {
    public static void main(String args[]) throws UserRegistrationException{
        UserInfo userInfo = new UserInfo();

        System.out.println(userInfo.userFirstName());
        System.out.println(userInfo.userLastName());
        System.out.println(userInfo.userEmailId());
        System.out.println(userInfo.userMobNum());
        System.out.println(userInfo.userPassword());
    }
}

