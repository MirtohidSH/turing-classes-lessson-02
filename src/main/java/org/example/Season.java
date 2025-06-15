package org.example;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        System.out.println(month < 0 ? "Wrong Month" : month <=2  ? "Winter" : month <=5 ? "Spring" :
                month <=8 ? "Summer" : month <=11 ? "Autumn" : month ==12 ? "Winter" : "Wrong Month");
    }
}
