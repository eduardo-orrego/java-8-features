package org.xuaxpedia.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo05 {
  public static void main(String[] args) {
    /*
    * An example of using various intermediate operations in Java Streams.
    * Demonstrates filter operation to select elements based on a condition.
    * Demonstrates map operation to transform elements.
    * Demonstrates distinct operation to remove duplicates.
    * Demonstrates flatMap operation to flatten nested structures.
    * Demonstrates limit operation to restrict the number of elements.
    * Demonstrates skip operation to skip a number of elements.
    * Demonstrates sorted operation to sort elements.
    * Demonstrates unordered operation to indicate that the order of elements is not important.
    * Demonstrates peek operation to perform an action on each element.
    * Also shows how to collect the results back into a list.
    */
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