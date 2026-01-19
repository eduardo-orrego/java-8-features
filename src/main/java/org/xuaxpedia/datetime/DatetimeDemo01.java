package org.xuaxpedia.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatetimeDemo01 {
  public static void main(String[] args) {
    /*
      * Java 8 Date and Time API
      * LocalDate - represents a date (year, month, day)
      * LocalTime - represents a time (hour, minute, second, nanosecond)
      * LocalDateTime - represents both date and time
      * DateTimeFormatter - used for formatting and parsing date-time objects
      * Examples of creating, formatting, and extracting data from date-time objects
    */

    System.out.println("LocalDate - the current date : " + LocalDate.now());
    System.out.println("LocalTime - the current time : " + LocalTime.now());
    System.out.println("LocalDateTime - current date and time : " + LocalDateTime.now());

    LocalDate localDate = LocalDate.of(1985, 6, 25);
    System.out.println("LocalDate - specific date :" + localDate);

    LocalDateTime localDateTime = LocalDateTime.now();
    LocalDateTime specificDate = localDateTime.withDayOfMonth(25).withMonth(6).withYear(2024);
    System.out.println("LocalDateTime - specific date with current time : " + specificDate);

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formated = localDateTime.format(dateTimeFormatter);
    System.out.println("LocalDateTime - specific format with current date and time : " + formated);

    System.out.println("LocalDateTime - current date an time with extraction of date data " +
      "- Year :" + localDateTime.getHour() + ", Month : " + localDateTime.getMonthValue()
      + ", Day : " + localDateTime.getDayOfMonth() + ", Hour : " + localDateTime.getHour()
      + ", Minute : " + localDateTime.getMinute() + ", Second : " + localDateTime.getSecond());

  }
}
