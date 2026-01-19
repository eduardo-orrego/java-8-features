package org.xuaxpedia.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DatetimeDemo02 {
  public static void main(String[] args) {

    /*
    * Java 8 Date and Time API
    * LocalDateTime - current date and time
    * LocalDateTime - specific format with current date and time
    * ZonedDateTime - current date and time with time zone
    * ZonedDateTime - current date and time with a specific time zone
    * ZonedDateTime - formatted time zone
    * ZoneId - Available Zone ID List
    */
    LocalDateTime localDateTime = LocalDateTime.now();
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formatted = localDateTime.format(dateTimeFormatter);
    System.out.println("LocalDateTime - specific format with current date and time : " + formatted);

    ZonedDateTime currentTimeZone = ZonedDateTime.now();
    System.out.println("ZonedDateTime - current date and time with time zone : " + currentTimeZone);
    System.out.println("ZonedDateTime - the current time zone is " + currentTimeZone.getZone());

    ZoneId zoneId = ZoneId.of("America/New_York");
    ZonedDateTime zonedDateTime = currentTimeZone.withZoneSameInstant(zoneId);
    System.out.println("ZonedDateTime - current date and time with a specific time zone "
      + zonedDateTime);

    DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formattedTimeZone = zonedDateTime.format(dateTimeFormatter2);
    System.out.println("ZonedDateTime - formatted time zone " + formattedTimeZone);

    System.out.println("ZoneId - Available Zone ID List : ");
    ZoneId.getAvailableZoneIds().forEach(System.out::println);
  }
}
