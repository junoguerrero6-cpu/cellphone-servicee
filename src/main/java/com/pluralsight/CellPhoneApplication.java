package com.pluralsight;
import java.util.Scanner;
public class CellPhoneApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone cellPhone = new CellPhone();

        // SERIAL NUMBER
        System.out.print("Enter serial number: ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();
        CellPhone.setSerialNumber(serialNumber);






























        }
}
