package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.println("Please enter your billing street: ");
        String billingStreet = scanner.nextLine();

        System.out.println("Please enter your billing city: ");
        String billingCity = scanner.nextLine();

        System.out.println("Please enter your billing state: ");
        String billingState = scanner.nextLine();

        System.out.println("Please enter your billing zip code: ");
        int billingZipCode = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter your shipping street: ");
        String shippingStreet = scanner.nextLine();

        System.out.println("Please enter your shipping city: ");
        String shippingCity = scanner.nextLine();

        System.out.println("Please enter your shipping state: ");
        String shippingState = scanner.nextLine();

        System.out.println("Please enter your shipping zip code: ");
        int shippingZipCode = scanner.nextInt();

        StringBuilder billingAddress = new StringBuilder();
        billingAddress.append(fullName.trim()).append("\n");
        billingAddress.append(billingStreet).append("\n");
        billingAddress.append(billingCity).append(", ").append(billingState).append(" ").append(billingZipCode);
        scanner.nextLine();

        StringBuilder shippingAddress = new StringBuilder();
        shippingAddress.append(shippingStreet).append("\n");
        shippingAddress.append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZipCode);

        System.out.println("The Billing Address is: \n" + billingAddress);
        System.out.println("The Shipping Address is: \n" + shippingAddress);
        //System.out.println(billingAddress);
    }
}
