package org.example.task.AHappyFamily.PetsPackage;

import org.example.task.AHappyFamily.Foulable;
import org.example.task.AHappyFamily.Pet;

public class DomesticCat extends Pet implements Foulable {

    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        this.species = Species.DOMESTICCAT;
    }

    @Override
    public void respond() {
        System.out.printf("Hello, owner. I am %s.\n", nickname);
    }

    @Override
    public void foul() {
        System.out.println("I scratched something again");
    }
}
