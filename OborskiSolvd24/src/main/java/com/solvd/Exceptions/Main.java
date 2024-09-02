package com.solvd.Exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

               //1
               try {
                   validateAge(-5);
               } catch (InvalidAgeException e) {
                   System.out.println(e.getMessage());
               }

               //2
               validateEmail("Barlo@gmail.com");

               //3
               validatePassword("asd1");

               //4
               try {
                   System.out.println("Result: " + divide(20, 0));
               } catch (DivisionByZeroException e) {
                   System.out.println(e.getMessage());
               }

               //5
               try {
                   readFile("randomNonexistent_file.txt");
               } catch (ResourceHandlingException e) {
                   System.out.println(e.getMessage());
               }

    }


    //Methods for testing the custom exceptions
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 110) {
            throw new InvalidAgeException("The age: " + age + " is invalid.");
        } else {
            System.out.println("The age: " + age + "is valid.");
        }
    }

    public static void validateEmail(String email) {
        try {
            if (email.length() > 25 || !(email.contains("@gmail"))) {
                throw new InvalidEmailException("The email: " + email + " is invalid.");
            }
            System.out.println("The email: " + email + " is valid.");
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validatePassword(String password) {
        try {
            if (password.length() < 5) {
                throw new InvalidPasswordException("The password: " + password + " is too short.");
            }
            System.out.println("The password: " + password + " is valid.");
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Cannot divide by zero!");
        }
        return a/b;
    }

    public static void readFile(String filePath) throws ResourceHandlingException {
        try (FileInputStream fis = new FileInputStream(filePath)) {
            System.out.println("File opened successfully.");
        } catch (IOException e) {
            throw new ResourceHandlingException("Error reading file: " + e.getMessage());
        }
    }
}