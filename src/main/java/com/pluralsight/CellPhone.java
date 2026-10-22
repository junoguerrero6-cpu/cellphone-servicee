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

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


 }

