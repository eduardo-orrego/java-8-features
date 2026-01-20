package org.xuaxpedia.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamDemo03 {
  public static void main(String[] args) {

    /*
    * An example of using sorting and mapping operations in Java Streams.
    * Demonstrates filtering, sorting in reverse order, and mapping to extract specific fields.
    * Also demonstrates the use of lambda expressions and method references.
    * Also shows how to collect the results back into a list.
    */

    List<TransactionDemo> transactions = new ArrayList<>();
    transactions.add(new TransactionDemo("id1", 150, "TYPE2"));
    transactions.add(new TransactionDemo("id2", 100, "TYPE1"));
    transactions.add(new TransactionDemo("id3", 200, "TYPE2"));

    List<String> transactionIdList = transactions.stream()
      .filter(t -> Objects.equals(t.getType(), "TYPE2"))
      .sorted(Comparator.comparing(TransactionDemo::getValue).reversed())
      .map(TransactionDemo::getId)
      .collect(Collectors.toList());

    String msg = transactionIdList.toString();
    System.out.println(msg);
  }

}

class TransactionDemo {
  String id;
  Integer value;
  String type;

  TransactionDemo(String id, Integer value, String type) {
    this.id = id;
    this.value = value;
    this.type = type;
  }

  public String getId() {
    return id;
  }

  public Integer getValue() {
    return value;
  }

  public String getType() {
    return type;
  }
}
