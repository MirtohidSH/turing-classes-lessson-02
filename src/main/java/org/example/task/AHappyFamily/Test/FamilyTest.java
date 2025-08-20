package org.example.task.AHappyFamily.Test;

import org.example.task.AHappyFamily.Family;
import org.example.task.AHappyFamily.Human;
import org.example.task.AHappyFamily.Pet;
import org.example.task.AHappyFamily.PetsPackage.DayOfWeek;
import org.example.task.AHappyFamily.PetsPackage.Dog;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class FamilyTest {
    Family family;
    Human mother;
    Human father;
    Pet pet;
    Human child1;
    Human child2;

    @BeforeEach
    void setUp() {
        mother = new Human("Jane", "Karena", 1975);
        father = new Human("Vito", "Karena", 1970);
        pet = new Dog("Rock", 5, 75, new String[]{"eat", "sleep"});

        family = new Family(mother, father, pet);

        Map<DayOfWeek, String> scedule1 = new HashMap<>();
        scedule1.put(DayOfWeek.MONDAY, "Go to work");
        scedule1.put(DayOfWeek.TUESDAY, "Relax");

        child1 = new Human("Michael", "Karena", 2000, 90, scedule1);
        child2 = new Human("Anna", "Karena", 2000);

        family.addChild(child1);
    }

    @Test
    void testAddChild() {
        int initialLength = family.getChildren().length;
        family.addChild(child1);
        Human[] children = family.getChildren();

        assertEquals(initialLength + 1, children.length,"Children array should increase by 1");
        assertEquals(child2, children[children.length-1],"Last child should be the added child");
        assertEquals(family, child2.getFamily(), "Added child's family reference should be set");
    }

    @Test
    void testDeleteChildPossitive() {
        boolean removed = family.deleteChild(child1);
        assertTrue(removed, "child should be removed");
        assertEquals(0, family.getChildren().length, "Children array should have 0 elements after removal");
    }

    @Test
    void testDeleteChildNegative() {
        boolean removed = family.deleteChild(child2);
        assertFalse(removed, "Non-existing child should not be removed");
        assertEquals(1, family.getChildren().length, "Children array should have 1 elements after removal");
    }

    @Test
    void testDeleteChildByIndexPositive() {
        boolean removed = family.deleteChild(0);
        assertTrue(removed, "child should be removed");
        assertEquals(0, family.getChildren().length, "Children array should have 0 elements");
    }

    @Test
    void testDeleteChildByIndexNegative() {
        boolean removed = family.deleteChild(-1);
        assertFalse(removed, "Non-existing child should not be removed");
        assertEquals(1, family.getChildren().length, "Children array should have 1 elements after removal");
    }

    @Test
    void testCountFamily() {
        assertEquals(4, family.countFamily(), "Family count should include mother, father, pet, and 1 child");
        family.addChild(child2);
        assertEquals(5, family.countFamily(), "Family count should increase");
    }

    @Test
    void testToString() {
        String expected = "Family{mother=" + mother +
                ", father=" + father +
                ", children=" + java.util.Arrays.toString(family.getChildren()) +
                ", pet=" + pet + "}";
        assertEquals(expected, family.toString(), "toSting should return correct string");
    }




}
