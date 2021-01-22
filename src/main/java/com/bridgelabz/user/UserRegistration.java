package com.bridgelabz.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        final String REGEX_NAME = "[A-Z]{1}[a-z]{2,}";
        String firstName = "Bridgelabz";
        validateFirstName(firstName,REGEX_NAME);
    }
    public static void validateFirstName(String firstName, String regex)
    {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        boolean b = matcher.matches();
        if (b == true){
            System.out.println("Pattern Matched, You have Entered " +
                    "Correct name");
        }
        else{ System.out.println("Please enter valid firstname!!"); }
    }
}


