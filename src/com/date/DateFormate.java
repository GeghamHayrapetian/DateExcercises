package com.date;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateFormate {
    private static boolean checkFormat(String arg) {
        if (arg.contains("MM")) {
            if (arg.contains("yyyy") | arg.contains("YYYY") & (arg.contains("dd") | (arg.contains("dd")))) {
                return true;
            }

        }

        return false;
    }

    static void calculateDifference() {
        System.out.println("Enter the date format");
        Scanner in = new Scanner(System.in);
        String arg = in.nextLine();
        if (checkFormat(arg)) {
            System.out.println("Format is correct");
            System.out.println("Enter date");
            DateTimeFormatter formater = DateTimeFormatter.ofPattern(arg);
            String date = in.nextLine();
            LocalDate localdate = LocalDate.parse(date, formater);
            LocalDate now = LocalDate.now();
            now = LocalDate.parse(formater.format(now), formater);
            long days=ChronoUnit.DAYS.between(localdate, now);
            long month=ChronoUnit.MONTHS.between(localdate, now);
            long year=ChronoUnit.YEARS.between(localdate, now);
            System.out.println("Difference between = " + days + "  days or "+ month +" months or " + year+" years" );
        }
        else{
            System.out.println("Format isn`t correct");

            calculateDifference();}
    }
}
