package com.date;

import java.time.LocalDate;
import java.util.Scanner;

public class LeapYear {
    public static void checkLeap() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter year");
        int year = in.nextInt();
        LocalDate date = LocalDate.of(year, 2, 1);

        if (date.lengthOfMonth() == 29) {
            System.out.println(year + " is leap");
        } else {
            System.out.println(year + " isn`t leap");
        }

    }
}
