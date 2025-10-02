package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApp {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        CellPhone myPhone = new CellPhone();


        myPhone.getSerialNumber();
        System.out.print("What is the serial number? : ");
        int SerialNumber = scanner.nextInt();
        scanner.nextLine();

        myPhone.getModel();
        System.out.print("What model is the phone?");
        String model = scanner.nextLine();

        myPhone.getCarrier();
        System.out.print("Who is the carrier?");
        String carrier = scanner.nextLine();

        myPhone.getPhoneNumber();
        System.out.print("What is the phone number?");
        String phoneNumber = scanner.nextLine();


        System.out.print("Who is the owner of the phone?");
        String owner = scanner.nextLine();
        myPhone.setOwner(owner);

        myPhone.dail("704-237-2839");

    }
}
