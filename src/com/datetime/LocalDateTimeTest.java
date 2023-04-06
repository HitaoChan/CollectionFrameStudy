package com.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        System.out.println(testDate());
    }

    public static String testDate(){

//        String st_str = LocalDateTime.of(LocalDate.now(), LocalTime.MIN).minusDays(30).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String st_str = LocalDateTime.of(LocalDate.now(), LocalTime.MAX).minusDays(30).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        return st_str;
    }
}
