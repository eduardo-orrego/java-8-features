package org.duna.jep107.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo05 {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("Walter", "Dante", "Erick", "Raul", "Adrian", "Cesar", "Raul");

    System.out.println("NAMES LIST " + words);

    System.out.println("<<Intermediate operations>>");

    System.out.println("Operation FILTER");
    List<String> result = words.stream()
      // Filters words with length greater than 4
      .filter(word -> word.length() > 4)
      .collect(Collectors.toList());

    System.out.println(result);

    System.out.println("Operation MAP");
    result = result.stream()
      // Transform all words to uppercase
      .map(String::toUpperCase)
      .collect(Collectors.toList());

    System.out.println(result);

    System.out.println("Operation DISTINCT");
    result = result.stream()
      // Remove duplicates
      .distinct()
      .collect(Collectors.toList());

    System.out.println(result);

    System.out.println("Operation FLATMAP");

    result = result.stream()
      // Split each word into characters and flatten the Stream
      .flatMap(word -> Arrays.stream(
        word.split("")))
      .collect(Collectors.toList());

    System.out.println(result);

    System.out.println("Operation LIMIT");
    result = result.stream()
      // Limit to 5 elements
      .limit(5)
      .collect(Collectors.toList());

    System.out.println(result);

    System.out.println("Operation SKIP");
    result = result.stream()
      // Skip the first 2 elements
      .skip(2)
      .collect(Collectors.toList());

    System.out.println(result);

    System.out.println("Operation SORTED");
    result = result.stream()
      // Put the words in order
      .sorted()
      .collect(Collectors.toList());

    System.out.println(result);

    System.out.println("Operation UNORDERED");
    result = result.stream()
      //Does not guarantee the order of the elements
      .unordered()
      .collect(Collectors.toList());

    System.out.println(result);

    System.out.println("Operation PEEK");
    result = result.stream()
      // Print each element of the Stream
      .peek(System.out::println)
      .collect(Collectors.toList());

    System.out.println(result);

  }
}