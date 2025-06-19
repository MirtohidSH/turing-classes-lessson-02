package org.example;

import java.util.Scanner;

public class Taskstudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Task: Student Grade Evaluation System
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        double average = (s1 + s2 + s3) / 3.0;

        if (s1 < 40 || s2 < 40 || s3 < 40)
            System.out.println("Failed - One or more exam scores are too low.");
        else if (average >= 85 && s1 >= 85 && s2 >= 85 && s3 >= 85)
            System.out.println("Congratulations! You have earned a Certificate of Excellence.");
        else if (average >= 70 && average < 85 && s1 >= 60 && s2 >= 60 && s3 >= 60)
            System.out.println("Well done! You have earned a Certificate of Achievement.");
        else if (average >= 50 && average < 70)
            System.out.println("You passed.");
        else
            System.out.println("Failed.");

        // Task: Vending Machine Product Selector
        int price = sc.nextInt();
        switch (price){
            case 1: System.out.println("Chocolate Bar - $2.00");break;
            case 2: System.out.println("Soda - $1.50");break;
            case 3: System.out.println("Chips - $1.20");break;
            case 4: System.out.println("Sandwich - $3.00");break;
            case 5: System.out.println("Water - $1.00");break;
            default: System.out.println("Invalid selection. Please enter a number between 1 and 5.");
        }
        // Task: Multiplication Table Generator
        int N = sc.nextInt();
        for(int i = 1; i <= 10; i++)
            System.out.println(N + " x " + i + " = " + (N * i));
    }
}

