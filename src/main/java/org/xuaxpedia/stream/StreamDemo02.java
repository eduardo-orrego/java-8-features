package org.xuaxpedia.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo02 {
  public static void main(String[] args) {

    /*
    * An example of using Mapping operation in Java Streams, to add a constant value to each element in a list.
    * Also demonstrates the use of lambda expressions.
    * Also shows how to collect the results back into a list.
    */

    ArrayList<Integer> integerArrayList = new ArrayList<>();
    integerArrayList.add(20);
    integerArrayList.add(15);
    integerArrayList.add(86);
    integerArrayList.add(35);
    integerArrayList.add(27);

    String msg = integerArrayList.toString();
    System.out.println(msg);

    List<Integer> integerList = integerArrayList.stream()
      .map(n -> n + 6)
      .collect(Collectors.toList());

    String msg2 = integerList.toString();
    System.out.println(msg2);

  }
}
