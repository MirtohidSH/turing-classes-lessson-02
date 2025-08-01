package org.example.task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateApp {

    public static void main(String[] args) {
        //Task 1
        LocalDate date = LocalDate.parse("2005-09-12");
        LocalDate date2 = LocalDate.now();

        long daysBetween = ChronoUnit.DAYS.between(date, date2);
        System.out.println(daysBetween);

        //Task 2
        LocalDate maxDay = LocalDate.MAX;
        LocalDate minDay = LocalDate.MIN;
        System.out.println("Max Day: " + maxDay + "\nMin Day: " + minDay);

        //Task 3
        ZonedDateTime turkey = ZonedDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(turkey.format(DateTimeFormatter.ofPattern("yyyy//MM//dd HH//mm//ss")));
    }
}
