package org.example.task.OptionalGeneric;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> opt = Optional.of("hello");

        OpGe<String> opGe = OpGe.of("hello");
        System.out.println(opGe.get());
        System.out.println(opGe.isPresent());
        System.out.println(opGe.isEmpty());
    }
}
