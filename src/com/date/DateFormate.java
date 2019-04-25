package com.date;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateFormate {
    private static  LocalDate countDiference(LocalDate first,LocalDate second)
    {
         LocalDate difference=LocalDate.of(first.getYear()-second.getYear(),first.getMonthValue()-second.getMonthValue(),first.getDayOfMonth()-second.getDayOfMonth());
         return difference;
    }
    static void  checkFormat() {
        System.out.println("Enter the date format");
        Scanner in = new Scanner(System.in);
        String arg=in.nextLine();
        if (arg.contains("YYYY") & arg.contains("MM") & arg.contains("DD")) {
            System.out.println("Format is correct");
            System.out.println("Enter date");
            DateTimeFormatter formater = DateTimeFormatter.ofPattern(arg);
            String date=in.nextLine();
            LocalDate localdate= LocalDate.parse(date,formater);
            LocalDate now= LocalDate.parse((LocalDateTime.now().toString()),formater);
            System.out.println(countDiference(now,localdate));
        }
    }



}
