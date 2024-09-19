package org.xuaxpedia.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class DatetimeDemo05 {
  public static void main(String[] args) {

    LocalDate localDate1 = LocalDate.now();
    System.out.println("LocalDate - the current date : " + localDate1);

    LocalDate localDate2 = localDate1.with(TemporalAdjusters.firstDayOfNextMonth());
    System.out.println("LocalDate - first day of next month : " + localDate2);

    LocalDate localDate3 = localDate1.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
    System.out.println("LocalDate - next monday from now : " + localDate3);

    LocalDate localDate4 = localDate1.with(TemporalAdjusters.firstDayOfMonth());
    System.out.println("LocalDate - first day of current month : " + localDate4);

    LocalDate localDate5 = localDate1.with(TemporalAdjusters.lastDayOfMonth());
    System.out.println("LocalDate - last day of current month : " + localDate5);

  }
}
