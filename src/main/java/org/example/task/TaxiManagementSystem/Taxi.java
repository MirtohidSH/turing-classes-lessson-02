package org.example.task.TaxiManagementSystem;

public class Taxi extends Vehicle {

    private int passengerCount;
    private String taxiCompany;

    public Taxi(String brand, String model, String plateNumber, boolean isAvailable, int passengerCount, String taxiCompany) {
        super(brand, model, plateNumber, isAvailable);
        this.passengerCount = passengerCount;
        this.taxiCompany = taxiCompany;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public String getTaxiCompany() {
        return taxiCompany;
    }

    public void setTaxiCompany(String taxiCompany) {
        this.taxiCompany = taxiCompany;
    }

    @Override
    public void drive() {
        System.out.println("Taxi from " + this.taxiCompany + " is driving with " + this.passengerCount + " passengers.");
    }

    public int calculateFare(int km) {
        return km * passengerCount;
    }

    public int calculateFare(int km, boolean nightShift) {
        return km * passengerCount * 2;
    }
}
