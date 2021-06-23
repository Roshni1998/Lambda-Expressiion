package com.bridgelabz.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author ROSHNI
 * User Registration Problem
 */

public class UserValidator {

    public static void main(String[] args) {

        //First name starts with Cap and has minimum 3 characters
        ArrayList<String> firstName = new ArrayList<String>();
        firstName.add("Roshni");
        firstName.add("aayush2");
        firstName.add("Mohak");
        Pattern validFirstName = Pattern.compile("^[A-Z][a-z]{3,15}$");
        List<String> isValidFirstName = firstName.stream().filter(p -> validFirstName.matcher(p).find()).collect(Collectors.<String>toList());
        System.out.println("Valid First Name :-");
        isValidFirstName.forEach(System.out::println);

        // Last name starts with Cap and has minimum 3 characters
        ArrayList<String> lastName = new ArrayList<String>();
        lastName.add("Mali");
        lastName.add("paliwal");
        lastName.add("Narang");
        Pattern validLastName = Pattern.compile("^[A-Z][a-z]{3,15}$");
        List<String> isValidLastName = lastName.stream().filter(p -> validLastName.matcher(p).find()).collect(Collectors.<String>toList());
        System.out.println("Valid Last Name :-");
        isValidLastName.forEach(System.out::println);

        //Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
        ArrayList<String> emailId = new ArrayList<String>();
        emailId.add("roshni123@gmail.com");
        emailId.add("@aayush#.123@.com");
        emailId.add("mohak.@gmail..co");
        emailId.add("mohak@gmail.co");
        Pattern validEmailId = Pattern.compile("^[a-zA-Z0-9]+([.+-_][0-9a-zA-Z]+)*" + "@([a-zA-Z0-9][-]?)+[.][a-zA-Z]{2,4}+([.][a-zA-Z]{0,2})?$");
        List<String> isValidEmailId = emailId.stream().filter(p -> validEmailId.matcher(p).find()).collect(Collectors.<String>toList());
        System.out.println("Valid Email Ids :-");
        isValidEmailId.forEach(System.out::println);

        //Country code follow by space and 10 digit number
        ArrayList<String> mobileNo = new ArrayList<String>();
        mobileNo.add("91 9993344553");
        mobileNo.add("919993344553");
        mobileNo.add("436789002");
        mobileNo.add("0 8949393423");
        Pattern validMobileNo = Pattern.compile("(0|91)?\\s([7-9][0-9]{9})");
        List<String> isValidMobileNo = mobileNo.stream().filter(p -> validMobileNo.matcher(p).find()).collect(Collectors.<String>toList());
        System.out.println("Valid Mobile Numbers :-");
        isValidMobileNo.forEach(System.out::println);

        /* Password should contain minimum 8 Characters
         * Password should have at least 1 Upper Case
         * Password should have at least 1 numeric number
         * Should have exactly 1 Special Character
         */
        ArrayList<String> password = new ArrayList<String>();
        password.add("abc@12");
        password.add("xyz678$rt");
        password.add("abcd#%ABC@");
        password.add("abcABC123");
        password.add("abc@R1234");
        Pattern validPassword = Pattern.compile("^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,12}$");
        List<String> isValidPassword = password.stream().filter(p -> validPassword.matcher(p).find()).collect(Collectors.<String>toList());
        System.out.println("Valid Password :-");
        isValidPassword.forEach(System.out::println);
    }
}