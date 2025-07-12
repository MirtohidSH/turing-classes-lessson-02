package org.example.task.animalhuman;

public class Main {

    public static void main(String[] args) {
        Man man = new Man("Ali", 20);
        Dog manDog = new Dog("Dog", 2);
        Cat manCat = new Cat("Cat", 3);
        Woman woman = new Woman("Veli", 22);
        Dog womanDog = new Dog("Dog2", 4);
        Cat womanCat = new Cat("Cat2", 5);

        man.setDog(manDog);
        man.setCat(manCat);
        woman.setDog(womanDog);
        woman.setCat(womanCat);

        System.out.println("Man: ");
        System.out.println("Name: " + man.getName() + ", Age: " + man.getAge());
        System.out.println("Man's Dog Name and Age: " + man.getDog().getName() + ", " + man.getDog().getAge());
        System.out.println("Man's Cat Name and Age: " + man.getCat().getName() + ", " + man.getCat().getAge());

        System.out.println("Woman: ");
        System.out.println("Name: " + woman.getName() + ", Age: " + woman.getAge());
        System.out.println("Woman's Dog Name and Age: " + woman.getDog().getName() + ", " + woman.getDog().getAge());
        System.out.println("Woman's Cat Name and Age: " + woman.getCat().getName() + ", " + woman.getCat().getAge());
    }
}
