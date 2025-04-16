package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter Your First Name: ");
        String firstName = scanner.nextLine().trim();

        System.out.println("Please Enter Your Middle Name: click \"ENTER\" to skip ");
        String middleName = scanner.nextLine().trim();

        System.out.println("Please Enter Your Last Name: ");
        String lastName = scanner.nextLine().trim();

        System.out.println("Please Select Your Suffix: click \"ENTER\" to skip ");
        String suffix = scanner.nextLine().trim();

        String fullName = firstName + " " + middleName + " " + lastName + " " + suffix;

        if (middleName.isEmpty()){
            fullName = firstName + lastName + suffix;
        }if (suffix.isEmpty()){
            fullName = firstName + middleName + lastName;
        }
        System.out.println("Your Full Name is : " + fullName);

    }
}
