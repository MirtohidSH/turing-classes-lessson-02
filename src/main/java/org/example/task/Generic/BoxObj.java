package org.example.task.Generic;

public class BoxObj<T, E, D, F> extends Box<T, E> implements Material<D> {

    private D item3;
    private F item4;

    public BoxObj(T item1, E item2, D item3, F item4) {
        super(item1, item2);
        this.item3 = item3;
        this.item4 = item4;
    }

    @Override
    public void print() {
        System.out.printf("Item1: %s, item2: %s, item3: %s, item4: %s\n", getItem1(), getItem2(), item3, item4);
    }

    @Override
    public D getMaterial() {
        return item3;
    }

    public F getItem4() {
        return item4;
    }
}
