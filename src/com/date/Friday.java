package com.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Friday {
 public  static void getFridays() {
        LocalDate day = LocalDate.now();
        DateTimeFormatter formater=DateTimeFormatter.ofPattern("dd MMMM,YYYY");
        for (int i = 0; i < 7; ++i) {
            if (day.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
                System.out.println("Next friday " + formater.format(day));
                day = LocalDate.now();
                break;
            } else {
                day = day.plusDays(i);
            }
        }
        for (int i = 0; i < 7; ++i) {
            if (day.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
                System.out.println("Previous friday " +formater.format(day));
                break;
            } else {
                day = day.minusDays(i);
            }
        }

    }
}


