package org.example.task.AHappyFamily;

import org.example.task.AHappyFamily.PetsPackage.DayOfWeek;
import org.example.task.AHappyFamily.PetsPackage.Species;

import java.util.HashMap;
import java.util.Map;

public class HappyFamilyApp {

    public static void main(String[] args) {


        System.out.println("\nGarbage Collector");

        for (int i = 0; i < 100; i++) {
            Human temp = new Human("Temp" + i, "User", 1990);
            temp = null;
        }

        System.gc();
        System.out.println("Garbage Collector çağırıldı. finalize() mesajlarını görmək üçün bir neçə saniyə gözləyirik...");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Garbage Collector testi bitdi.");


    }
}
