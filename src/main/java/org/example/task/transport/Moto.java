package org.example.task.transport;

public class Moto {
    private int year;
    private int engine;
    private int typeOfEngine;
    private int km;
    private int place;
    private String brand;
    private String model;
    private String color;
    private String vin;
    private double price;

    public Moto(int year, int engine, int typeOfEngine, int km, int place, String brand, String model, String color, String vin, double price) {
        this.year = year;
        this.engine = engine;
        this.typeOfEngine = typeOfEngine;
        this.km = km;
        this.place = place;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.vin = vin;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "year=" + year +
                ", engine=" + engine +
                ", typeOfEngine=" + typeOfEngine +
                ", km=" + km +
                ", place=" + place +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", vin='" + vin + '\'' +
                ", price=" + price +
                '}';
    }
}
