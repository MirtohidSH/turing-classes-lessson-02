package org.example.task.AHappyFamily;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Human {

    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule;
    private Family family;

    static {
        System.out.println("Class Human is being loaded.");
    }

    {
        System.out.println("A new Human object is created.");
    }

    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public void greetPet() {
        if(family != null && family.getPet() != null) {
            System.out.println("Hello, " + family.getPet().getNickname());
        } else {
            System.out.println("No pet found");
        }
    }

    public void describePet() {
        if(family != null && family.getPet() != null) {
            Pet pet = family.getPet();
            System.out.printf("I have a %s, he is %d years old, he is %s\n",
                    pet.getSpecies(), pet.getAge(), pet.getTrickLevel() > 50 ? "very sly" : "almost not sly");
        } else {
            System.out.println("No pet found");
        }
    }

    public boolean feedPet(boolean isTimeForFeeding) {
        if (family != null && family.getPet() != null) {
            Pet pet = family.getPet();
            if (isTimeForFeeding) {
                System.out.printf("Hm... I will feed %s%n", pet.getNickname());
                return true;
            } else {
                Random random = new Random();
                int chance = random.nextInt(101);
                if (pet.getTrickLevel() > chance) {
                    System.out.printf("Hm... I will feed %s%n", pet.getNickname());
                    return true;
                } else {
                    System.out.printf("I think %s is not hungry%n", pet.getNickname());
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.deepEquals(schedule, human.schedule) && Objects.equals(family, human.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, iq, Arrays.deepHashCode(schedule), family);
    }

    @Override
    public String toString() {
        return "Human{name='%s', surname='%s', year=%d, iq=%d, schedule=%s}"
                .formatted(name, surname, year, iq, Arrays.deepToString(schedule));
    }
}
