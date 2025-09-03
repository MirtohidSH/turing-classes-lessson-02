package org.example.task.ComparableCompare;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Ali",   19, 90.0, "IT",        "Musa",  102, 5),
                new Student("Kenan", 20, 89.0, "Math",      "Ali",   101, 3),
                new Student("Musa",  21, 76.0, "English",   "Kenan", 104, 5),
                new Student("Ali", 19, 78.0, "Chemistry", "Sevinc",102, 6),
                new Student("Murad", 18, 96.0, "IT",        "Aysel", 105, 7)
        };

        Arrays.sort(students, new StudentAgeComparator());
        Arrays.sort(students, new StudentNameComparator());
        Arrays.sort(students, new StudentClassNumberComparator());

        Arrays.sort(students, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        Arrays.sort(students, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getClassNumber() - o2.getClassNumber();
                if (result == 0) {
                    result = o1.getLessonsNumber() - o2.getLessonsNumber();
                }
                return result;
            }
        });
        printStudents(students);


//        bubbleSortByAge(students, 5);
//        bubbleSortByGpa(students, 5);
//        bubbleSortByName(students, 5);
    }

    static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

//    static void bubbleSortByAge(Student arr[], int n) {
//        boolean swapped;
//        for (int i = 0; i < n - 1; i++) {
//            swapped = false;
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j].getAge() > arr[j + 1].getAge()) {
//                    Student temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    swapped = true;
//                }
//            }
//            if (!swapped) break;
//        }
//    }
//
//    static void bubbleSortByGpa(Student arr[], int n) {
//        boolean swapped;
//        for (int i = 0; i < n - 1; i++) {
//            swapped = false;
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j].getGpa() > arr[j + 1].getGpa()) {
//                    Student temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    swapped = true;
//                }
//            }
//            if (!swapped) break;
//        }
//    }
//
//    static void bubbleSortByName(Student arr[], int n) {
//        boolean swapped;
//        for (int i = 0; i < n - 1; i++) {
//            swapped = false;
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j].getName().compareToIgnoreCase(arr[j + 1].getName()) > 0) {
//                    Student temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    swapped = true;
//                }
//            }
//            if (!swapped) break;
//        }
//    }
}
