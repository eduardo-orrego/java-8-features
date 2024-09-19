package org.xuaxpedia.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo07 {
  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    System.out.println("NUMBERS LIST: " + numbers);

    System.out.println("<<Terminal Operations>>");

    // Operaciones terminales

    System.out.println("<<OPERATION COUNT>>");
    //Counts the number of elements in the Stream
    long count = numbers.stream()
      .count();
    System.out.println("Number of elements: " + count);

    System.out.println("<<OPERATION MIN>>");
    // Find the minimum value in the Stream
    Optional<Integer> min = numbers.stream()
      //.min((o1, o2) -> o1.compareTo(o2));
      .min(Integer::compareTo);
    System.out.println("Minimum value: " + min.orElse(null));

    System.out.println("<<OPERATION MAX>>");
    // Find the maximum value in the Stream
    Optional<Integer> max = numbers.stream()
      //.max((o1, o2) -> o1.compareTo(o2));
      .max(Integer::compareTo);
    System.out.println("Maximum value: " + max.orElse(null));

    System.out.println("<<OPERATION REDUCE>>");
    // Reduce elements through addition
    int sum = numbers.stream()
      //.reduce(0, (integer, integer2) -> Integer.sum(integer, integer2));
      //.reduce((integer, integer2) -> Integer.sum(integer, integer2)).get();
      .reduce(0, Integer::sum);
    System.out.println("Sum of elements: " + sum);

    System.out.println("<<OPERATION ANYMATCH>>");
    // Check if any element is greater than 3
    boolean anyMatch = numbers.stream()
      .anyMatch(num -> num > 3);
    System.out.println("Is any one greater than 3? " + anyMatch);

    System.out.println("<<OPERATION ALLMATCH>>");
    // Check if all elements are less than 10
    boolean allMatch = numbers.stream()
      .allMatch(num -> num < 10);
    System.out.println("Are they all less than 10? " + allMatch);

    System.out.println("<<OPERATION NOMEMATCH>>");
    // Check if no element is negative
    boolean noneMatch = numbers.stream()
      .noneMatch(num -> num < 0);
    System.out.println("Are none of them negative? " + noneMatch);

    System.out.println("<<OPERATION FINDFIRST>>");
    // Find any element of the Stream
    Optional<Integer> first = numbers.stream()
      .findFirst();
    System.out.println("First item: " + first.orElse(null));

    System.out.println("<<OPERATION FINDANY>>");
    // Find any element of the Stream
    Optional<Integer> any = numbers.stream()
      .findAny();
    System.out.println("Any element: " + any.orElse(null));

    System.out.println("<<OPERATION COLLECT>>");
    // Collect the elements into a list
    List<Integer> collected = numbers.stream()
      .filter(number -> number % 2 == 0)
      .collect(Collectors.toList());
    System.out.println("Collected items:" + collected);

  }
}
