package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean validateEmail(String Email) {
        String regex = "^[a-zA-Z0-9+_.]+@[a-zA-Z.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Email);

        if (matcher.matches()) {
            System.out.println("Valid Email");

        } else {
            System.out.println("Invalid Email....!");
        }
        return false;
    }
}