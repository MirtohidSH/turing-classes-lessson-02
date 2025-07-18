package org.example.task.TaxiManagementSystem;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Taxi("Toyota", "Prius", "10-AA-123", true, 4, "Bolt");
        Vehicle v2 = new Bus("Mercedes", "Sprinter", "10-AA-456", true, 20, false);

        v1.drive();
        v2.drive();

        if (v1 instanceof Taxi) {
            Taxi taxi = (Taxi) v1;
            System.out.println("Fare: " + taxi.calculateFare(10));
        }

        Driver ali = new Driver("Ali", 20, "AA123456");
        ali.setAge(21);
        System.out.println(ali.getAge());

        System.out.println(v1.vehicleInfo());
        System.out.println(v2.vehicleInfo());
        System.out.println(ali.toString());
    }
}
