package org.example.leetcode;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        String text = "AB";
        System.out.println(textRepeater(text, 4));
    }
    public static String textRepeater(String text, int reps) {
        String repText = "";
        for (int i = 0; i < reps; i++) {
            repText += text;
        }
        return repText;
    }
}
