package org.example.transport;

public class MotoCarApp {
    public static void main(String[] args) {
        Car car = new Car("White", "BMW", "M4", 2025, 3.0, "Benzin", 0, 5, "SFGH23", 130000.0);
        Car car2 = new Car("Red", "Toyota", "Camry", 2022, 2.5, "Hibrid", 15000, 5, "TYT98", 45000.0);
        Moto moto = new Moto(2023, 600, 1, 12000, 2, "Yamaha", "R6", "Black", "SDGF12", 15000.0);
        Moto moto2 = new Moto(2021, 1000, 1, 30000, 2, "Honda", "CBR1000RR", "Red", "ASSS456", 17000.0);
        System.out.println(car);
        System.out.println(car2);
        System.out.println(moto);
        System.out.println(moto2);
    }
}
