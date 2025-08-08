package org.example.task.FleetManagementSystem;

import java.util.Objects;

public class Car extends Vehicle {

    private int seatCount;

    public Car(String brand, String model, int year, int seatCount) {
        super(brand, model, String.valueOf(year));
        this.seatCount = seatCount;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public String getType() {
        return "Car";
    }

    public void drive() {
        System.out.println("Driving a " + getBrand() + " passenger car");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return seatCount == car.seatCount;
    }

    @Override
    public String toString() {
        return String.format("Brand = %s, Model = %s, Year = %s, Seat Count = %d", getBrand(), getModel(), getYear(), getSeatCount());
    }
}
