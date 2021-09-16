package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void validatePassword(String password) {
        String passwordPattern = "^[a-zA-Z0-9@#!]{8}[a-zA-z0-9@#!]*";
        Pattern pattern = Pattern.compile(passwordPattern);
        Matcher matcher = pattern.matcher(password);

        if (matcher.find()) {
            System.out.println(password + " is valid");
        } else {
            System.out.println(password + " is not valid");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "";
        System.out.println("Enter the password");
        password = sc.nextLine();
        validatePassword(password);//validation of Password
        sc.close();
    }

}