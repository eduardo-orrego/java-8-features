package org.xuaxpedia.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamDemo10 {
  public static void main(String[] args) {

    /*
    * An example of using terminal operations in Java Streams.
    * Shows forEach operation to perform an action for each element.
    * Shows forEachOrdered operation to perform an action for each element in encounter order.
    * Shows toArray operation to convert the Stream to an array.
    * Shows reduce operation to combine elements of the Stream.
    * Shows map operation to transform elements and collect them.
    * Shows min operation to find the minimum element.
    * Shows max operation to find the maximum element.
    * Shows count operation to count the number of elements.
    * Shows anyMatch operation to check if any element matches a condition.
    * Shows allMatch operation to check if all elements match a condition.
    * Shows findFirst operation to find the first element.
    * Shows findAny operation to find any element.
    * Shows spliterator operation to split the Stream for parallel processing.
    * Shows summarizingInt operation to get summary statistics of integer elements.
    */

    // List of numbers
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // We create a Stream from the list of numbers
    Stream<Integer> stream = numbers.stream();

    System.out.println("<<OPERACIONES TERMINALES>>");

    System.out.println("<<ForEach operation");
    stream.forEach(integer -> System.out.println(integer.toString()));

    System.out.println("<<ForEachOrdered operation");
    stream = numbers.stream();
    stream.forEachOrdered(integer -> System.out.println(integer.toString()));

    System.out.println("<<ToArray operation");
    stream = numbers.stream();
    Object[] objects = stream.toArray();
    System.out.println("result :" + Arrays.toString(objects));

    System.out.println("<<Reduce operation");
    stream = numbers.stream();
    Optional<Integer> sumOptional = stream.reduce(Integer::sum);
    System.out.println("result:" + sumOptional.orElse(0));

    System.out.println("<<Map operation");
    stream = numbers.stream();
    List<Integer> integerList = stream.map(n -> n * n)
      .collect(Collectors.toList());
    System.out.println("result: " + integerList);

    System.out.println("<<Min operation");
    stream = numbers.stream();
    Optional<Integer> minOptional = stream.min(Integer::compareTo);
    System.out.println("result: " + minOptional.orElse(0));

    System.out.println("<<Max operation");
    stream = numbers.stream();
    Optional<Integer> maxOptional = stream.max(Integer::compareTo);
    System.out.println("result: " + maxOptional.orElse(0));

    System.out.println("<<Count operation");
    stream = numbers.stream();
    long counter = stream.count();
    System.out.println("result: " + counter);

    System.out.println("<<AnyMatch operation");
    stream = numbers.stream();
    boolean booleanMatch = stream.anyMatch(n -> n % 2 == 0);
    System.out.println("result: " + booleanMatch);

    System.out.println("<<allMatch operation");
    stream = numbers.stream();
    boolean allMatchBoolean = stream.allMatch(n -> n < 11);
    System.out.println("result: " + allMatchBoolean);

    System.out.println("<<findFirst operation");
    stream = numbers.stream();
    Optional<Integer> findFirstOptional = stream.findFirst();
    System.out.println("result: " + findFirstOptional.orElse(0));

    System.out.println("<<findAny operation");
    stream = numbers.stream();
    Optional<Integer> findAnyOptional = stream.findAny();
    System.out.println("result: " + findAnyOptional.orElse(0));

    System.out.println("<<forEach operation");
    stream = numbers.stream();
    stream.map(Object::toString).forEach(System.out::println);

    System.out.println("<<spliterator operation");
    stream = numbers.stream();
    // We get the Stream Spliterator
    Spliterator<Integer> spliterator = stream.spliterator();
    // We divide the Stream into two parts, we take half of the elements to a second spliterator
    Spliterator<Integer> spliterator2 = spliterator.trySplit();

    // We process each part of the Stream
    Stream<Integer> stream1 = StreamSupport.stream(spliterator, false);
    Stream<Integer> stream2 = StreamSupport.stream(spliterator2, false);

    // We print each part of the Stream
    System.out.println("result stream part1:");
    stream1.map(Object::toString).forEach(System.out::println);
    System.out.println("result stream part2:");
    stream2.map(Object::toString).forEach(System.out::println);

    System.out.println("<<summarizingInt operation");
    stream = numbers.stream();
    IntSummaryStatistics stats = stream.mapToInt(Integer::intValue).summaryStatistics();
    System.out.println("result: " + stats);

  }
}