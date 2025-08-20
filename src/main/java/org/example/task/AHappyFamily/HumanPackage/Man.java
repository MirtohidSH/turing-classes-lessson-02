package org.example.task.AHappyFamily.HumanPackage;

import org.example.task.AHappyFamily.Human;
public final class Man extends Human {

    public Man(String name, String surname, int year, int iq) {
        super(name, surname, year, iq, null);
    }

    @Override
    public void greetPet() {
        System.out.println("Hey pet! Let's play!");
    }

    public void repairCar() {
        System.out.println("Man is repairing the car.");
    }
}
