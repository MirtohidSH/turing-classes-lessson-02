package org.example.task.FleetManagementSystem;

import java.util.Objects;

public class Vehicle {

    private String brand;
    private String model;
    private String year;

    public Vehicle(String brand, String model, String year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getType() {
        return "Vehicle";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(brand, vehicle.brand) && Objects.equals(model, vehicle.model) && Objects.equals(year, vehicle.year);
    }

    @Override
    public String toString() {
        return String.format("Vehicle [brand=%s, model=%s, year=%s]", brand, model, year);
    }
}
