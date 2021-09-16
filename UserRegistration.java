package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean validateLastName(String lastName) {
        String regex = "^[A-Z]{1}[a-zA-Z]{2,20}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);

        if (matcher.matches()) {
            System.out.println("Valid LastName");

        } else {
            System.out.println("Invalid LastName....!");
            System.out.println("Your Lastname should start with capital letter and has minimum 3 characters ");
        }
        return false;
    }
}