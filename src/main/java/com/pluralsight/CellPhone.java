package com.pluralsight;

public class CellPhone {

private int serialnumber;
private String model;
private String carrier;
private String phoneNumber;
private String owner;

// contructor
    public CellPhone() {
        serialnumber = 0;
        carrier = "";
        phoneNumber = "";
        owner = "";
    }

    public static void setSerialNumber(int serialNumber) {
    }

    // getter and setters
    public int getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(int serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getModel() {
        return model;
    }

    public static void setModel(String model)






    {
        
    }

    public String getCarrier() {
        return carrier;
    }

    public static void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public static void setOwner(String owner) {
        this.owner = owner;
    }


 }

