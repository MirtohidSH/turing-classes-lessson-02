package org.example.task.FunctionalInterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {
    public static void main(String[] args) {

        // Anonymous Class
        //Predicate
        Predicate<String> p = new Predicate<String>() {
            @Override
            public boolean test(String p1) {
                return p1.matches("G");
            }
        };
        System.out.println("Predicate: " + p.test("a"));

        //Function
        Function<Integer, Double> f = new Function<Integer, Double>() {
            @Override
            public Double apply(Integer i) {
                return i / 5.0;
            }
        };
        System.out.println("Function: " + f.apply(10));

        //Consumer
        Consumer<String> c = new Consumer<String>() {
            @Override
            public void accept(String c1) {
                System.out.println("Consumer: " + c1);
            }
        };
        c.accept("Hello");

        //Supplier
        Supplier<Double> s = new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        };
        System.out.println("Supplier: " + s.get());

        // Lambda
        //Predicate
        Predicate<String> pL = pL1 -> pL1.matches("G");
        System.out.println("Predicate L: " + pL.test("G"));

        //Function
        Function<Integer, Double> fL = fL1 -> fL1 / 5.0;
        System.out.println("Function L: " + fL.apply(10));

        //Consumer
        Consumer<String> cL = cL1 -> System.out.println("Consumer: " + cL1);


        //Supplier
        Supplier<Double> sL = () -> Math.random();
        System.out.println("Supplier L: " + sL.get());

        // Method Reference
        //Predicate
        Predicate<String> pM = FunctionalInterfaces::matches;
        System.out.println("Predicate MR: " + pM.test("G"));

        //Function
        Function<Integer, Double> fM = FunctionalInterfaces::dvd;
        System.out.println("Function MR: " + fM.apply(10));

        //Consumer
        Consumer<String> cM = FunctionalInterfaces::print;

        //Supplier
        Supplier<Double> sM = FunctionalInterfaces::random;
        System.out.println("Supplier MR: " + sM.get());
    }
    public static boolean matches(String s) {
        return s.matches("G");
    }

    public static double dvd(Integer i) {
        return i / 5.0;
    }

    public static void print(String s) {
        System.out.println("Consumer MR: " + s);
    }

    public static double random() {
        return Math.random();
    }
}
