package org.duna.jep150.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class DatetimeDemo03 {
  public static void main(String[] args) {
    LocalDate localDate1 = LocalDate.now();
    LocalDate localDate2 = LocalDate.of(2014, Month.DECEMBER, 12);

    Period period = Period.between(localDate2, localDate1);
    System.out.println("Period - Amount of time that elapses between two dates " +
      "in terms of years, months, and days : " + period);

    LocalTime localTime1 = LocalTime.now();
    System.out.println("LocalTime - the current time : " + localTime1);

    Duration duration1 = Duration.ofHours(3);
    System.out.println("Duration - Amount of time " + duration1);

    LocalTime localTime2 = localTime1.plus(duration1);
    System.out.println("LocalTime - the current time after adding more time " + localTime2);

    Duration duration2 = Duration.between(localTime2, localTime1);
    System.out.println("Duration - Amount of time that elapses between two times : " + duration2);
  }
}
