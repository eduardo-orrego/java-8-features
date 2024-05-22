package org.duna.jep150.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DatetimeDemo04 {
  public static void main(String[] args) {
    LocalDate localDate = LocalDate.now();
    System.out.println("LocalDate - the current date : " + localDate);

    LocalDate localDatePlusYear = localDate.plusYears(2);
    System.out.println("LocalDate - after adding years to the current date : " + localDatePlusYear);

    LocalDate localDatePlusMonth = localDate.plusMonths(1);
    System.out.println("LocalDate - after adding months to the current date : " + localDatePlusMonth);

    LocalDate localDatePlusWeek = localDate.plusWeeks(1);
    System.out.println("LocalDate - after adding weeks to the current date : " + localDatePlusWeek);

    LocalDate localDatePlus = localDate.plus(2, ChronoUnit.DECADES);
    System.out.println("LocalDate - after adding decades to the current date : " + localDatePlus);
  }
}
