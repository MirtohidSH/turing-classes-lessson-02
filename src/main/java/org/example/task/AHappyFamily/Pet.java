package org.example.task.AHappyFamily;

import org.example.task.AHappyFamily.PetsPackage.Species;

import java.util.Arrays;
import java.util.Objects;

public abstract class Pet {

    protected Species species;
    protected String nickname;
    protected int age;
    protected int trickLevel;
    protected String[] habits;

    static {
        System.out.println("Class Pet is being loaded.");
    }

    {
        System.out.println("A new Pet object is created.");
    }

    public Pet() {
    }

    public Pet(String nickname) {
        this.nickname = nickname;
    }

    public Pet( String nickname, int age, int trickLevel, String[] habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        if (trickLevel < 1) this.trickLevel = 1;
        else if (trickLevel > 100) this.trickLevel = 100;
        else this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public abstract void respond();

    @Override
    protected void finalize() throws Throwable {
        System.out.printf("Pet object %s is being removed\n", nickname);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && trickLevel == pet.trickLevel && Objects.equals(species, pet.species) && Objects.equals(nickname, pet.nickname) && Objects.deepEquals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickname, age, trickLevel, Arrays.hashCode(habits));
    }

    @Override
    public String toString() {
        return "%s{nickname='%s', age=%d, trickLevel=%d, habits=%s, canFly=%b, numberOfLegs=%d, hasFur=%b}"
                .formatted(
                        species,
                        nickname,
                        age,
                        trickLevel,
                        Arrays.toString(habits),
                        species.canFly(),
                        species.getNumberOfLegs(),
                        species.hasFur()
                );
    }

}
