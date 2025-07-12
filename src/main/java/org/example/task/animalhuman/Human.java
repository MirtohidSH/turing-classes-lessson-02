package org.example.task.animalhuman;

public class Human extends Animal {
    private Dog dog;
    private Cat cat;

    public Human(String name, int age) {
        super(name, age);
    }

    public Dog getDog() {
        return dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
