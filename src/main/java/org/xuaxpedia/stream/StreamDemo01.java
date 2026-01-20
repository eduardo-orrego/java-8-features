package org.xuaxpedia.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo01 {
  public static void main(String[] args) {
    /*
    * An example of using filtering operation in Java Streams, to filter out even numbers from a list.
    * Also demonstrates the use of lambda expressions.
    * Also shows how to collect the results back into a list.
    */
    ArrayList<Integer> integerArrayList = new ArrayList<>();
    integerArrayList.add(2);
    integerArrayList.add(7);
    integerArrayList.add(5);
    integerArrayList.add(15);
    integerArrayList.add(8);

    List<Integer> integerList = integerArrayList.stream()
      .filter(n -> n % 2 == 0)
      .collect(Collectors.toList());

    String msg = integerList.toString();
    System.out.println(msg);

  }
}
