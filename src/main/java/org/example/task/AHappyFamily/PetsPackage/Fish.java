package org.example.task.AHappyFamily.PetsPackage;

import org.example.task.AHappyFamily.Pet;

public class Fish extends Pet {

    public Fish(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        this.species = Species.FISH;
    }

    @Override
    public void respond() {
        System.out.printf("Hello, owner. I am %s, a fish.\n", nickname);
    }
}
