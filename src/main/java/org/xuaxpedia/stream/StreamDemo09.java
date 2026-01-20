package org.xuaxpedia.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamDemo09 {
  public static void main(String[] args) {

    /*
    * An example of using intermediate operations in Java Streams.
    * Shows filter operation to filter elements based on a condition.
    * Shows map operation to transform elements.
    * Shows flatMap operation to flatten nested structures.
    * Shows distinct operation to remove duplicates.
    * Shows sorted operation to sort elements.
    * Shows peek operation to perform an action on each element.
    * Shows limit operation to limit the number of elements.
    * Shows skip operation to skip a number of elements.
    * Shows unordered operation to allow unordered processing.
    * Shows various mapTo... and flatMapTo... operations to convert between different stream types.
    * Shows concat operation to join two streams.
    */

    // Words List
    List<String> words = Arrays.asList("java", "is", "a", "programming", "language");
    // We create a Stream from the list of words
    Stream<String> stream = words.stream();
    System.out.println("STREAM LIST: " + stream);

    System.out.println("<<INTERMEDIATE OPERATIONS>>");

    System.out.println("FILTER operation");
    words = stream.filter(s -> s.length() > 2)
      .collect(Collectors.toList());
    System.out.println("Result " + words);

    System.out.println("MAP operation");
    stream = words.stream();
    words = stream.map(String::toUpperCase)
      .collect(Collectors.toList());
    System.out.println("Result " + words);

    System.out.println("FLATMAP operation");
    stream = words.stream();
    words = stream.flatMap(s -> Stream.of(s, s.toLowerCase()))
      .collect(Collectors.toList());
    System.out.println("Result " + words);

    System.out.println("DISTINCT operation");
    stream = words.stream();
    words = stream.distinct()
      .collect(Collectors.toList());
    System.out.println("Result " + words);

    System.out.println("DISTINCT operation");
    stream = words.stream();
    words = stream.distinct()
      .collect(Collectors.toList());
    System.out.println("Result " + words);

    System.out.println("SORTED operation");
    stream = words.stream();
    words = stream.sorted()
      .collect(Collectors.toList());
    System.out.println("Result " + words);


    System.out.println("PEEK operation");
    stream = words.stream();
    words = stream.peek(System.out::println)
      .collect(Collectors.toList());
    System.out.println("Result " + words);

    System.out.println("LIMIT operation");
    stream = words.stream();
    words = stream.limit(4)
      .collect(Collectors.toList());
    System.out.println("Result " + words);

    System.out.println("SKIP operation");
    stream = words.stream();
    words = stream.skip(2)
      .collect(Collectors.toList());
    System.out.println("Result " + words);

    System.out.println("UNORDERED operation");
    stream = words.stream();
    words = stream.unordered()
      .collect(Collectors.toList());
    System.out.println("Result " + words);

    System.out.println("MapToInt operation");
    stream = words.stream();
    // MapToInt - Convert to an IntStream
    IntStream intStream = stream.mapToInt(String::length);
    int[] numbers = intStream.toArray();
    System.out.println("Result " + Arrays.toString(numbers));

    System.out.println("FlatMapToInt operation");
    stream = words.stream();
    // FlatMapToInt - Convert to an IntStream
    IntStream intStream2 = stream.flatMapToInt(
      string -> IntStream.of(string.length(), string.length() - 1));
    int[] numbers2 = intStream2.toArray();
    System.out.println("Result " + Arrays.toString(numbers2));

    System.out.println("MapToObj operation");
    intStream = Arrays.stream(numbers);
    // MapToObj - Convert to an Object
    Stream<Object> objectStream = intStream.mapToObj(Integer::new);
    Object[] objects = objectStream.toArray();
    System.out.println("Result " + Arrays.toString(objects));

    System.out.println("MapToLong operation");
    intStream = Arrays.stream(numbers);
    // MapToLong - Convert to a LongStream
    LongStream longStream = intStream.mapToLong(n -> (long) n);
    long[] longNumbers = longStream.toArray();
    System.out.println("Result " + Arrays.toString(longNumbers));

    System.out.println("FlatMapToLong operation");
    objectStream = Arrays.stream(objects);
    // FlatMapToLong - Convert to a LongStream
    LongStream longStream2 = objectStream.map(String::valueOf)
      .map(Long::parseLong)
      .flatMapToLong(longNumber -> LongStream.of(longNumber, longNumber + 1L));
    long[] longNumbers2 = longStream2.toArray();
    System.out.println("Result " + Arrays.toString(longNumbers2));

    System.out.println("AsLongStream operation");
    intStream = Arrays.stream(numbers);
    // AsLongStream - Convert to a LongStream
    longStream = intStream.asLongStream();
    longNumbers = longStream.toArray();
    System.out.println("Result " + Arrays.toString(longNumbers));

    System.out.println("MapToDouble operation");
    longStream = Arrays.stream(longNumbers);
    // MapToDouble - Convert to a DoubleStream
    DoubleStream doubleStream = longStream.mapToDouble(l -> (double) l);
    double[] doubleNumbers = doubleStream.toArray();
    System.out.println("Result " + Arrays.toString(doubleNumbers));

    System.out.println("FlatMapToDouble operation");
    objectStream = Arrays.stream(objects);
    // FlatMapToDouble - Convert to a DoubleStream
    DoubleStream doubleStream2 =
      objectStream.map(String::valueOf)
        .map(Double::parseDouble)
        .flatMapToDouble(doubleNumber -> DoubleStream.of(doubleNumber, doubleNumber + 1.0));
    double[] doubleNumbers2 = doubleStream2.toArray();
    System.out.println("Result " + Arrays.toString(doubleNumbers2));

    System.out.println("AsDoubleStream operation");
    longStream = Arrays.stream(longNumbers);
    // MapToDouble - Convert to a DoubleStream
    doubleStream = longStream.asDoubleStream();
    doubleNumbers = doubleStream.toArray();
    System.out.println("Result " + Arrays.toString(doubleNumbers));

    System.out.println("Boxed operation");
    doubleStream = Arrays.stream(doubleNumbers);
    // Boxed - Convert stream of primitive data to stream of objects of equivalent class
    Stream<Double> doubleStreamObject = doubleStream.boxed();
    List<Double> doubleList = doubleStreamObject.collect(Collectors.toList());
    System.out.println("Result " + doubleList);

    System.out.println("CONCAT operation");
    // Operation concat(): Join two streams into a single stream
    Stream<String> stream1 = Stream.of("a", "b", "c");
    Stream<String> stream2 = Stream.of("d", "e", "f");
    Stream<String> abcStream = Stream.concat(stream1, stream2);
    abcStream.forEach(System.out::println);

  }
}