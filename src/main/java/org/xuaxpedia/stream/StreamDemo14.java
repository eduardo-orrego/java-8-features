package org.xuaxpedia.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo14 {
  public static void main(String[] args) {

    System.out.println("<<parallel operation");
    // Parallel() operation: Converts the stream into a parallel stream
    // for more efficient processing.
    IntStream parallelStream = IntStream.rangeClosed(1, 10).parallel();

    System.out.println("<<sequential operation");
    // Sequential() operation: Converts the stream into a sequential stream,
    // undoing any previous parallelization.
    IntStream sequentialStream = parallelStream.sequential();
    sequentialStream.mapToObj(String::valueOf).forEach(System.out::println);

    System.out.println("<<unordered operation");
    // Unordered() operation: Indicates that the resulting stream
    // will not maintain the order of the elements.
    Stream<Integer> unorderedStream = Stream.of(1, 2, 3, 4, 5).unordered();
    unorderedStream.map(String::valueOf).forEach(System.out::println);
  }
}

