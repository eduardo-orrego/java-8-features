package org.xuaxpedia.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo06 {
  public static void main(String[] args) {

    /*
    * An example demonstrating various intermediate operations in Java Streams.
    * Shows filtering operation to select words longer than 4 characters.
    * Shows mapping operation to convert words to uppercase.
    * Shows distinct operation to remove duplicate words.
    * Shows flatMap operation to split words into characters and flatten the stream.
    * Shows limit operation to restrict the number of elements.
    * Shows skip operation to skip a number of elements.
    * Shows sorted operation to sort elements.
    * Shows unordered operation to indicate that the order of elements is not important.
    * Shows peek operation to perform an action on each element.
    * Also shows how to collect the results back into a list.
    */
    List<String> words = Arrays.asList("Walter", "Dante", "Erick", "Raul", "Adrian", "Cesar",
      "Raul");

    System.out.println("NAMES LIST " + words);

    System.out.println("<<Intermediate operations>>");

    List<String> result = words.stream()
      .filter(word -> word.length() > 4)
      .map(String::toUpperCase)
      .distinct()
      .flatMap(word -> Arrays.stream(word.split("")))
      .limit(5)
      .skip(2)
      .sorted()
      .unordered()
      .peek(System.out::println)
      .collect(Collectors.toList());

    System.out.println("Final score: " + result);
  }
}
