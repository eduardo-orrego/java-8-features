package org.duna.jep107.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo01 {
  public static void main(String[] args) {
    ArrayList<Integer> integerArrayList = new ArrayList<>();
    integerArrayList.add(2);
    integerArrayList.add(7);
    integerArrayList.add(5);
    integerArrayList.add(15);
    integerArrayList.add(8);

    //Streams can be used to filter, collect, print, and convert
    //from one data structure to another, etc.
    List<Integer> integerList = integerArrayList.stream()
      .filter(n -> n % 2 == 0)
      .collect(Collectors.toList());

    String msg = integerList.toString();
    System.out.println(msg);

  }
}
