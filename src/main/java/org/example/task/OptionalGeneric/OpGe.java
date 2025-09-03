package org.example.task.OptionalGeneric;

import java.util.NoSuchElementException;
import java.util.Objects;

public class OpGe <T> {

    private T value;

    public OpGe(T value) {
        this.value = value;
    }

    public static <T> OpGe of(T value) {
        return new OpGe<>(Objects.requireNonNull(value));
    }

    public T get() {
        if(value == null) {
            throw new NoSuchElementException("No value present");
        }
        return value;
    }

    public boolean isEmpty() {
        return value == null;
    }

    public boolean isPresent() {
        return value != null;
    }
}
