package org.example.task.AHappyFamily;

public class HappyFamilyApp {

    public static void main(String[] args) {
        String[] petHabits = {"eat", "sleep"};
        String[][] schedule = {
                {"Monday", "Go to gym"},
                {"Tuesday", "Read book"},
                {"Wednesday", "Write book"},
        };

        Pet pet = new Pet();
        Pet cat = new Pet("cat", "Murky");
        Pet dog = new Pet("dog", "Bobby", 5, 66, petHabits);

        Human human = new Human();
        Human uncle = new Human("John", "Doe", 1990);
        Human mother = new Human("Jane", "Doe", 1965);
        Human father = new Human("Mark", "Doe", 1960);
        Human alice = new Human("Alice", "Doe", 2000);
        Human micheal = new Human("Micheal", "Micheal", 1990, 90, schedule);

        Family family = new Family(mother, father);

        family.setPet(dog);
        family.addChild(micheal);
        family.addChild(alice);

        System.out.println("------Family------");
        System.out.println(family);

        System.out.println("------Delete Child------");
        boolean deleted = family.deleteChild(1);
        System.out.println("Deleted Alice? " + deleted);
        System.out.println(family);

        System.out.println("------Family members------");
        System.out.printf("Empty Human: %s\n", human);
        System.out.printf("Uncle: %s\n", uncle);
        System.out.printf("Mother: %s\n", mother);
        System.out.printf("Father: %s\n", father);
        System.out.printf("Alice: %s\n", alice);
        System.out.printf("Micheal: %s\n", micheal);

        System.out.println("------Child's dog------");
        micheal.greetPet();
        micheal.describePet();

        System.out.println("------Pet actions------");
        dog.eat();
        dog.respond();
        dog.foul();

        System.out.println("------Pets info------");
        System.out.println(pet);
        System.out.println(cat);
        System.out.println(dog);

        System.out.println("\nFeeding when it's time: ");
        boolean feed1 = micheal.feedPet(true);

        System.out.println("\nFeeding when it's NOT time: ");
        boolean feed2 = micheal.feedPet(false);

        System.out.printf("\nFeeding happened: %b\n", feed1);
        System.out.printf("Feeding happened: %b\n", feed2);
    }
}
