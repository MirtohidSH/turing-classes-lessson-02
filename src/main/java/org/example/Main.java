package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int c = 3;
        long b = 7;
        double a = 5;
        double d = (a++) + (--b) - (a++) + (a+=3) + (++c);

        System.out.printf("%,2f\n" , d);
        System.out.printf("Result: %d %s %.2f\n", 19, "Java", 10.1978);
        System.out.printf("%,2f" , ((a++) + (--b) - (a++) + (a+=3) + (++c)));

        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();

        System.out.printf(a1 < b1 ? "Tural" : a1 > b1 ? "Fexri" : "Murad");

//        System.out.println("Java");
//        System.out.print("Java\n");
//        System.out.printf("%s\n","Java");
//
//        byte b = 127;
//        short s = 20000;
//        int i = 2000000000;
//        long l = 2000000000000L;
//        float f = 20.033333f;
//        double d = 20.01234556d;
//        char c = 'c';
//        boolean bool = true;
//        int a = 19;
//        int w = 38;
//
//        System.out.println("a+w: " + (a + w));
//        System.out.println("a-w: " + (a - w));
//        System.out.println("a*w: " + (a * w));
//        System.out.println("w/a: " + (w / a));
//        System.out.println("a%w" + a%w);
//        System.out.printf("byte: %d\n", b);
//        System.out.printf("short: %d\n", s);
//        System.out.printf("int: %d\n", i);
//        System.out.printf("long: %d\n", l);
//        System.out.printf("float: %.5f\n", f);
//        System.out.printf("double: %.5f\n", d);
//        System.out.printf("char: %c\n", c);
//        System.out.printf("bool: %b\n", bool);
//        System.out.printf("++a: %d\n", ++a);
//        System.out.printf("a++: %d\n", a++);
//        System.out.printf("a--: %d\n", a--);
//        System.out.printf("--a: %d\n", --a);
//        System.out.printf("a=a+1: %d\n", a=a+1);
//        System.out.printf("a+=2: %d\n", a+=2);
//        System.out.printf("a*=3: %d\n", a*=3);
//        System.out.printf("a/=3: %d\n", a/=3);
//        System.out.printf("a%%=3: %d\n", a%=3);
//
//
//        boolean ab = (a==b);
//        boolean ac = (a!=b);
//        int min = (a > w) ? a : w;
//
//        System.out.printf("a == b: %b\n", ab);
//        System.out.printf("a != b: %b\n", ac);
//        System.out.println(min);
    }
}
