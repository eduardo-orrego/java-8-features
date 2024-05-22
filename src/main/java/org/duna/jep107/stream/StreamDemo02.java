package org.duna.jep107.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo02 {
  public static void main(String[] args) {

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
