package com.autotrans.autotransApp.Entity;

public class Repair {
    private int id;
    private String customerName;
    private String date;
    private String registration;
    private String make;
    private String model;
    private String repairProcedure;
    private String partsOrdered;

    public Repair(int id, String customerName, String date, String registration, String make,
                  String model, String repairProcedure, String partsOrdered) {
        this.id = id;
        this.customerName = customerName;
        this.date = date;
        this.registration = registration;
        this.make = make;
        this.model = model;
        this.repairProcedure = repairProcedure;
        this.partsOrdered = partsOrdered;
    }

    public Repair(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRepairProcedure() {
        return repairProcedure;
    }

    public void setRepairProcedure(String repairProcedure) {
        this.repairProcedure = repairProcedure;
    }

    public String getPartsOrdered() {
        return partsOrdered;
    }

    public void setPartsOrdered(String partsOrdered) {
        this.partsOrdered = partsOrdered;
    }
}
