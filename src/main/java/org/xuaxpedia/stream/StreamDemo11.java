package org.xuaxpedia.stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class StreamDemo11 {
  public static void main(String[] args) {

    System.out.println("Empty operation");
    Stream<String> streamEmpty = Stream.empty();
    Object[] objects = streamEmpty.toArray();
    System.out.println("result: " + Arrays.toString(objects));

    System.out.println("Of operation");
    Stream<String> streamOf = Stream.of("apple", "banana", "orange");
    objects = streamOf.toArray();
    System.out.println("result: " + Arrays.toString(objects));

    System.out.println("Generate operation");
    Stream<Integer> streamGenerated = Stream.generate(() -> new Random().nextInt(100))
      .limit(5);
    objects = streamGenerated.toArray();
    System.out.println("result: " + Arrays.toString(objects));

    System.out.println("Iterate operation");
    Stream<Integer> streamIterated = Stream.iterate(0, n -> n + 2)
      .limit(5);
    objects = streamIterated.toArray();
    System.out.println("result: " + Arrays.toString(objects));

    System.out.println("Builder operation");
    Stream.Builder<String> builder = Stream.builder();
    builder.add("one");
    builder.add("two");
    builder.add("three");
    Stream<String> streamBuilt = builder.build();
    streamBuilt.forEach(System.out::println);

  }
}
