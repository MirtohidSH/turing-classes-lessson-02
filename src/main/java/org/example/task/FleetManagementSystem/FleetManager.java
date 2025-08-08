package org.example.task.FleetManagementSystem;

public class FleetManager {

    private Vehicle[] vehicles;
    private int count;

    public FleetManager(int capacity) {
        this.vehicles = new Vehicle[capacity];
        this.count = 0;
    }

    public boolean addVehicle(Vehicle vehicle) {
        if(count < vehicles.length) {
            vehicles[count++] = vehicle;
            return true;
        }else {
            return false;
        }
    }

    public void listAll() {
        for (int i = 0; i < count; i++) {
            Vehicle v = vehicles[i];
            System.out.println(v.toString() + " | Type: " + v.getType());

            if (v instanceof Car) {
                ((Car) v).drive();
            } else if (v instanceof Truck) {
                ((Truck) v).haul();
            }
        }
    }

//    public Vehicle[] findByType(String type) {
//
//    }
}
