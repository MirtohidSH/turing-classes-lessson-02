package org.example.task;

import java.util.*;

public class Task {
    public static void main(String[] args) {
        // TASK 1
//              *
//              *
//              *
//        * * * * * * *
//              *
//              *
//              *
          Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int n = sc.nextInt();
//        for (int i = 1; i < 2 * n; i++) {
//            for (int j = 1; j < 2 * n; j++) {
//                if (i == n || j == n) System.out.print("* ");
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }

        // TASK 2
//           *
//          ***
//         *****
//        *******
//       *********
//        *******
//         *****
//          ***
//           *
//        System.out.println("Enter the number: ");
//        int rows = sc.nextInt();
//
//        for (int i = 1; i <= rows; i++) {
//            for (int j = i; j < rows; j++) System.out.print(" ");
//
//            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
//            System.out.println();
//        }
//
//        for (int i = rows - 1; i >= 1; i--) {
//            for (int j = rows; j > i; j--) System.out.print(" ");
//
//            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
//            System.out.println();
//        }


        // TASK 3
//        int[] arr = {2, 4, 6, 8, 9};
//        int count = 0;

        // 1 ci yol
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 1) {
//                count++;
//            }
//        }
//        int[] newArr = new int[count];
//        int intd = 0;
//        for (int i = 0; i < arr.length; i++)
//            if (arr[i] % 2 == 1) {
//                newArr[intd] = arr[i];
//                intd++;
//            }
        // 2 ci yol
//        int[] arr1 = {1, 2, 3, 4};
//        int[] odd = Arrays.stream(arr1).filter(i -> i % 2 == 1).toArray();

        // 3 cu yol
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int num : arr)
//            if (num % 2 == 1)
//                list.add(num);

        // 4 cu yol
//        int[] newArr2 = list.stream().mapToInt(i -> i).toArray();

        // TASK 4
        // 1 ci yol
//        String[] str = {"Huseyn", "Aqil", "Emin", "Sedulla", "Ramzi", "Ebulfez", "Saleh", "Tural", "Yusif", "Ayla", "Sevinc", "Orxan", "Ulvi", "Ays", "Assassin"};
//        int [] number =  new int [15];
//        for (int i = 0; i < number.length; i++) {
//            number[i] = (int)(Math.random() * 16)+1;
//            System.out.println(str[i] + ": " + number[i]);
//        }

        // 2 ci yol
//        List<Integer> numberList = new ArrayList<>();
//        for (int i = 1; i <= 15; i++) numberList.add(i);
//        // Qarışdır (shuffle)
//        Collections.shuffle(numberList);
//
//        for (int i = 0; i < str.length; i++)
//            System.out.println(str[i] + ": " + numberList.get(i));
        int size = 5;
        for(int i = 0; i <= size; i++) {
            for(int j = 0; j < size-i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }






    }
}
