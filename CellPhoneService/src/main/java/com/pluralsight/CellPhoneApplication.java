package com.pluralsight;

import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone cellPhone = new CellPhone(1234568, "Iphone 7", "Verizon", "704-555-5555", "John");
        int serialNumber = cellPhone.getSerialNumber();
        display("This is your serialNumber" + serialNumber);

        String model = cellPhone.getModel();
        display(model);

        String carrier = cellPhone.getCarrier();
        display(carrier);

        String phoneNumber = cellPhone.getPhoneNumber();
        display(phoneNumber);

        String owner = cellPhone.getOwner();
        display(owner);

        getUserImput();
        

//        String doorKnocking = "Enter your name";
//        display(doorKnocking);

        //cellPhone.setSerialNumber(in);

//

    }
    public static void display(String message){
        System.out.println(message);
    }
//    public static void open(String doorKnocking){
//        System.out.println(doorKnocking);
//    }
    public static void getUserImput(){
        display("What is the the serial number?");
        display("What model is the phone?");
        display("Who is the carrier");
        display("What is the phone number?");
        display("Who is the owner of the phone?");

    }
}
