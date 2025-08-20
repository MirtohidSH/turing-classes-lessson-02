package org.example.task.AHappyFamily;

import java.util.Arrays;
import java.util.Objects;

public class Family {

    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    static {
        System.out.println("Class Family is being loaded.");
    }

    {
        System.out.println("A new Family object is created.");
    }

    public Family(Human mother, Human father, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];

        this.mother.setFamily(this);
        this.father.setFamily(this);
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
        if (mother != null) mother.setFamily(this);
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
        if (father != null) father.setFamily(this);
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
        if (children != null) {
            for (Human child : children) {
                if (child != null) child.setFamily(this);
            }
        }
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child) {
        Human[] newChildren = Arrays.copyOf(children, children.length + 1);
        newChildren[children.length] = child;
        children = newChildren;
        child.setFamily(this);
    }

    public boolean deleteChild(int index) {
        if (index < 0 || index >= children.length) return false;
        Human[] newChildren = new Human[children.length - 1];
        for (int i = 0, j = 0; i < children.length; i++) {
            if (i != index) {
                newChildren[j++] = children[i];
            } else {
                children[i].setFamily(null);
            }
        }
        children = newChildren;
        return true;
    }

    public boolean deleteChild(Human child) {
        if (child == null || children.length == 0) return false;
        int index = -1;
        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(child)) {
                index = i;
                break;
            }
        }
        if (index == -1) return false;
        return deleteChild(index);
    }

    public int countFamily() {
        return 2 + children.length + (pet != null ? 1 : 0);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Family object is being removed");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Objects.deepEquals(children, family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, Arrays.hashCode(children), pet);
    }

    @Override
    public String toString() {
        return "Family{mother=%s, father=%s, children=%s, pet=%s}"
                .formatted(mother, father, Arrays.toString(children), pet);
    }
}
