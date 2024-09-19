package org.xuaxpedia.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class FunctionalDemo5 {

  public static void main(String[] args) {
    //BICONSUMER - accept() METHOD
    BiConsumer<Integer, List<Integer>> iConsumer1 = (a, b) -> {
      System.out.println("Original value");
      b.replaceAll(x -> {
        System.out.println(x.toString());
        return a * x;
      });
    };

    BiConsumer<Integer, List<Integer>> iConsumer2 = (a, b) -> {
      System.out.println("Multiple x " + a.toString());
      b.forEach(n -> System.out.println(n.toString()));
    };

    List<Integer> list1 = new ArrayList<>();
    list1.add(3);
    list1.add(5);
    list1.add(8);
    list1.add(7);

    iConsumer1.accept(2, list1);
    iConsumer2.accept(2, list1);

    //BICONSUMER - andThen() METHOD
    List<Integer> list2 = new ArrayList<>();
    list2.add(9);
    list2.add(11);
    list2.add(19);
    list2.add(15);
    iConsumer1.andThen(iConsumer2).accept(3, list2);
  }
}
