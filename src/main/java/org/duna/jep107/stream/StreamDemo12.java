package org.duna.jep107.stream;

import java.util.Arrays;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class StreamDemo12 {
  public static void main(String[] args) {
    Logger logger = Logger.getLogger(StreamDemo12.class.getName());

    // Array of numbers
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    // Create a data stream from the array
    Stream<Integer> stream = Arrays.stream(numbers);

    logger.info("<<Parallel operation");
    Stream<Integer> parallelStream = stream.parallel(); // Convert to parallel stream
    parallelStream = parallelStream.filter(num -> num % 2 == 0); // Intermediate operation
    logger.info("Parallel stream:");
    parallelStream.map(Object::toString).forEach(logger::info);

    logger.info("<<Sequential operation");
    stream = Arrays.stream(numbers);
    Stream<Integer> sequentialStream = stream.sequential(); // Convert to sequential stream
    sequentialStream = sequentialStream.filter(num -> num % 2 != 0); // Intermediate operation
    logger.info("Sequential flow:");
    sequentialStream.map(Object::toString).forEach(logger::info);
  }
}