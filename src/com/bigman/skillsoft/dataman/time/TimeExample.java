package com.bigman.skillsoft.dataman.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Anthony on 1/6/2016.
 */
public class TimeExample {

    public static void main(String args[]){


        LocalTime time = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE;

        System.out.println(time);

        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(date.format(dtf));

        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(date.format(DateTimeFormatter.ISO_WEEK_DATE));




    }
}
