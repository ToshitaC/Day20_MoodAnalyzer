package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean validateFirstName(String firstName) {

        String Toshita;

        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);

        if (matcher.matches()) {
            System.out.println("Valid Firstname");

        } else {
            System.out.println("Invalid Firstname....!");
            System.out.println("Your Firstname should start with capital letter and has minimum 3 characters ");
        }
        return false;

    }
}