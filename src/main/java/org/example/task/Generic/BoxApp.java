package org.example.task.Generic;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class BoxApp {

    public static void main(String[] args) {
        BoxObj<Integer, String, Double, Character> box1 = new BoxObj<>(1, "BOX1", 1.1, 'A');
        BoxObj<Integer, String, Boolean, Float> box2 = new BoxObj<>(2, "BOX2", true, 1.2F);
        BoxObj<Integer, String, LocalDateTime, String> box3 = new BoxObj<>(3, "BOX3", LocalDateTime.now(), "Current Date Time");
        BoxObj<Integer, String, ZonedDateTime, String> box4 = new BoxObj<>(4, "BOX4", ZonedDateTime.now(ZoneId.of("Europe/Istanbul")), "Current Date Time in Istanbul");
        BoxObj<Integer, String, BoxObj[], String> box5 = new BoxObj<>(5, "BOX5", new BoxObj[]{box1, box2, box3, box4}, "All Boxes");

        box1.print();
        box2.print();
        box3.print();
        box4.print();
        box5.print();
    }
}
