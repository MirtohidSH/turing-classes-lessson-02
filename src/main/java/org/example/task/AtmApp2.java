package org.example.task;

import java.util.Scanner;

public class AtmApp2 {

    private static final int MAX_USERS = 3;
    private static final Scanner sc = new Scanner(System.in);
    private static final String[] userNames = new String[MAX_USERS];
    private static final double[] balances = new double[MAX_USERS];

    public static void main(String[] args) {
        initUsers();

        while (true) {
            printMenu();
            int choice = getInt("Emeliyyatin nomresini daxil edin: ");

            if (choice == 5) {
                System.out.println("Çıxış edildi.");
                break;
            }

            switch (choice) {
                case 1 -> checkBalance();
                case 2 -> depositMoney();
                case 3 -> withdrawMoney();
                case 4 -> changeName();
                default -> System.out.println("Yanlışdır. 1-5 arası rəqəm daxil edin.");
            }
        }
    }

    private static void initUsers() {
        for (int i = 0; i < MAX_USERS; i++) {
            System.out.print("Adınızı daxil edin: ");
            userNames[i] = sc.nextLine();

            balances[i] = getDouble("Balansı daxil edin: ");
        }
    }

    private static void printMenu() {
        System.out.println("\n--- Əsas Menü ---");
        System.out.println("1. Balansa bax");
        System.out.println("2. Pul yatır");
        System.out.println("3. Pul çıxar");
        System.out.println("4. Ad dəyiş");
        System.out.println("5. Çıxış");
    }

    private static void checkBalance() {
        int index = findUserIndex("Adınızı daxil edin: ");
        System.out.println("Sizin balansınız: " + balances[index]);
    }

    private static void depositMoney() {
        int index = findUserIndex("Adınızı daxil edin: ");
        double amount = getDouble("Məbləği daxil edin: ");

        if (amount >= 1000) System.out.println("Təbriklər!!!");

        balances[index] += amount;
        System.out.println("Yeni balans: " + balances[index]);
    }

    private static void withdrawMoney() {
        int index = findUserIndex("Adınızı daxil edin: ");
        double amount;

        while (true) {
            amount = getDouble("Çıxarmaq istədiyiniz məbləği daxil edin: ");
            if (amount <= balances[index]) break;
            System.out.println("Balans kifayət etmir. Yenidən cəhd edin.");
        }

        balances[index] -= amount;
        System.out.println("Yeni balans: " + balances[index]);
    }

    private static void changeName() {
        int index = findUserIndex("Köhnə adınızı daxil edin: ");
        System.out.print("Yeni adınızı daxil edin: ");
        String newName = sc.nextLine();
        userNames[index] = newName;
        System.out.println("Ad uğurla dəyişdirildi.");
    }

    private static int findUserIndex(String prompt) {
        while (true) {
            System.out.print(prompt);
            String inputName = sc.nextLine();

            for (int i = 0; i < MAX_USERS; i++) {
                if (userNames[i].equalsIgnoreCase(inputName)) return i;
            }

            System.out.println("Ad tapılmadı. Yenidən cəhd edin.");
        }
    }

    private static int getInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Zəhmət olmasa düzgün rəqəm daxil edin.");
            }
        }
    }

    private static double getDouble(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Zəhmət olmasa düzgün məbləğ daxil edin.");
            }
        }
    }
}
