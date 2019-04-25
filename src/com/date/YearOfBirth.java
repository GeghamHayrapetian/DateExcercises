package com.date;
import java.util.Scanner;
import java.time.LocalDate;

public class YearOfBirth {
    public static void getYear()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter you age");
        int age=in.nextInt();
        System.out.println( "Your year of birth  is " +( LocalDate.now().minusYears(age)).getYear());
    }

}
