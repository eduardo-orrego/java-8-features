package org.xuaxpedia.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalDemo4 {

  public static void main(String[] args) {

    /*
      * Consumer<T> : accepts a single input argument and returns no result.
      * It represents an operation that takes a single input and produces no output.
      * Also includes the default method andThen() to combine multiple Consumers. 
    */

    //CONSUMER - ACCEPT() METHOD
    Consumer<String> message = n -> System.out.println(n);
    //Consumer<String> message = System.out::println;
    message.accept("Hello Consumer - accept() method");

    Consumer<List<String>> iConsumer1 = listUpdate -> listUpdate.replaceAll(s -> "Hello " + s);
    Consumer<List<String>> iConsumer2 = listPrint -> listPrint.forEach(System.out::println);

    List<String> list = new ArrayList<>();
    list.add("Carlos");
    list.add("Eduardo");
    list.add("Sue");
    list.add("Patricia");

    iConsumer1.accept(list);
    iConsumer2.accept(list);

    //CONSUMER - andThen() METHOD
    List<String> list2 = new ArrayList<>();
    list2.add("Hello Consumer - andThen() method");
    list2.add("Ulises");
    list2.add("Simona");
    list2.add("Irene");

    iConsumer1.andThen(iConsumer2).accept(list2);
  }

}
