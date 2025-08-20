package org.example.task.Generic;

public abstract class Box<T, Y> {

    private T item1;
    private Y item2;

    public Box(T item1, Y item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public T getItem1() {
        return item1;
    }

    public Y getItem2() {
        return item2;
    }

    public abstract void print();

    @Override
    public String toString() {
        return String.format("BoxObj{t = %s, y = %s}", item1, item2);
    }
}
