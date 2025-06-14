package com.java8;

import java.time.*;

public class DateAndTime {
    public static void main (String [] args){
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 =  LocalDate.of(2022,3,21);
        LocalDate ld3 =  LocalDate.of(2021, Month.DECEMBER,25);
        LocalDate ld4 =  LocalDate.of(2024, 6, 21);


        System.out.println(ld1);
        System.out.println(ld2);
        System.out.println(ld3);
        System.out.println(ld4);
        //invalid date

//        LocalDate invalidDate = LocalDate.of(2021,13,15);
//        System.out.println(invalidDate);

        //times

        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = LocalTime.of(18,30,23);


        System.out.println(lt1);
        System.out.println(lt2);


        // DateTime
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2024,05,10, 19,43);
        LocalDateTime ldt3 = LocalDateTime.of(ld1,lt1);
        LocalDateTime ldt4 = LocalDateTime.of(2025,05,10, 19,43);

        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(ldt3);
        System.out.println(ldt4);

        //MonthDay
        MonthDay monthDay = MonthDay.of(1,4);
        LocalDate localDate = monthDay.atYear(2024);
        System.out.println(monthDay);
        System.out.println(localDate);

        //YearMonth
        YearMonth yearMonth = YearMonth.now();
        LocalDate localDate1 = yearMonth.atDay(10);
        System.out.println(localDate1);

    }
}
