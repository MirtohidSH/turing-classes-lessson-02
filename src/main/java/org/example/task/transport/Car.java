package org.example.task.transport;

public class Car {
    private String color;
    private String brand;
    private String model;
    private int year;
    private double engine;
    private String typeOfEngine;
    private int km;
    private int place;
    private String vin;
    private double price;

    public Car(String color, String brand, String model, int year, double engine, String typeOfEngine, int km, int place, String vin, double price) {
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.typeOfEngine = typeOfEngine;
        this.km = km;
        this.place = place;
        this.price = price;
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                ", typeOfEngine='" + typeOfEngine + '\'' +
                ", km=" + km +
                ", place=" + place +
                ", vin='" + vin + '\'' +
                ", price=" + price +
                '}';
    }
}
