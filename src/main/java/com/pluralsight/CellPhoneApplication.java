package com.pluralsight;
import java.util.Scanner;
public class CellPhoneApplication {

    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        CellPhone cellPhone = new CellPhone();

        // SERIAL NUMBER
        System.out.print("Enter serial number: ");
        int serialNumber = myscanner.nextInt();
        myscanner.nextLine();
        CellPhone.setSerialNumber(serialNumber);

        // MODEL
        System.out.print("Enter model: ");
        String model = myscanner.nextLine();
        CellPhone.setModel(model);

        // CARRIER
        System.out.print("Enter carrier: ");
        String carrier = myscanner.nextLine();
        CellPhone.setCarrier(carrier);

        // PHONE NUMBER
        System.out.print("Enter phone number: ");
        String phoneNumber = myscanner.nextLine();
        CellPhone.setPhoneNumber(phoneNumber);

        // OWNER
        System.out.print("Enter owner: ");
        String owner = myscanner.nextLine();
        CellPhone.setOwner(owner);































    }
}
