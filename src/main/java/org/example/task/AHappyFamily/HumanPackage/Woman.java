package org.example.task.AHappyFamily.HumanPackage;

import org.example.task.AHappyFamily.Human;

public final class Woman extends Human {

    public Woman(String name, String surname, int year, int iq) {
        super(name, surname, year, iq, null);
    }

    @Override
    public void greetPet() {
        System.out.println("Hello, my lovely pet!");
    }

    public void makeup() {
        System.out.println("Woman is applying makeup.");
    }
}
