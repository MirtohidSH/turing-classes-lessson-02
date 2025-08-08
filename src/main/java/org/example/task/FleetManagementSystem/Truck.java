package org.example.task.FleetManagementSystem;

import java.util.Objects;

public class Truck extends Vehicle {

    private double loadCapacity;

    public Truck(String brand, String model, int year, double loadCapacity) {
        super(brand, model, String.valueOf(year));
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String getType() {
        return "Truck";
    }

    public void haul() {
        System.out.println("Hauling with a " + getBrand() + " truck. Capacity: " + loadCapacity + " tons.");
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return Double.compare(loadCapacity, truck.loadCapacity) == 0;
    }

    @Override
    public String toString() {
        return String.format("Brand = %s, Model = %s, Year = %s, Load Capacity = %d", getBrand(), getModel(), getYear(), getLoadCapacity());
    }
}
