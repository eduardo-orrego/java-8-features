package org.duna.jep107.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo06 {
  public static void main(String[] args) {
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
