package org.example;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        System.out.println(month < 0 ? "Wrong Month" : month <=2  ? "Winter" : month <=5 ? "Spring" :
                month <=8 ? "Summer" : month <=11 ? "Autumn" : month ==12 ? "Winter" : "Wrong Month");

//        int ay = sc.nextInt();
//        String fəsil = (ay >= 3 && ay <= 5) ? "Yaz" :
//                       (ay >= 6 && ay <= 8) ? "Yay" :
//                       (ay >= 9 && ay <= 11) ? "Payız" :
//                       (ay == 12 || ay == 1 || ay == 2) ? "Qış" : "Yanlış ay";
//
//        System.out.println(fəsil);
    }
}
