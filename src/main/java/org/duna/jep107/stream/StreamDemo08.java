package org.duna.jep107.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamDemo08 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    System.out.println("NUMBERS LIST " + numbers);

    System.out.println("<<SHORT CIRCUIT OR INTERRUPTION OPERATIONS>>");

    boolean anyMatch = numbers.stream()
      .filter(num -> num > 3) // Filters numbers greater than 2
      .anyMatch(num -> num % 2 == 0); // Check if any filtered number is even

    System.out.println("Is any of them even? " + anyMatch);

    boolean allMatch = numbers.stream()
      .filter(num -> num > 1) // Filters numbers greater than 3
      .allMatch(num -> num % 2 == 0); // Check if all filtered numbers are even

    System.out.println("Are they all even? " + allMatch);

    boolean noneMatch = numbers.stream()
      .filter(num -> num > 4) // Filters numbers greater than 4
      .noneMatch(num -> num % 2 == 0); // Checks if none of the filtered numbers are even

    System.out.println("None are even? " + noneMatch);

    System.out.println("<<OPERATION FINDFIRST>>");
    // Find the first element of the Stream
    Optional<Integer> first = numbers.stream()
      .findFirst();
    System.out.println("First element: " + first.orElse(null));

    System.out.println("<<OPERATION FINDANY>>");
    // Find any element of the Stream
    Optional<Integer> any = numbers.stream()
      .findAny();
    System.out.println("Any element: " + any.orElse(null));
  }
}
