package org.xuaxpedia.interfaces;

import java.util.Random;
import java.util.function.Supplier;

public class FunctionalDemo8 {

  public static void main(String[] args) {

    //SUPPLIER - get() METHOD
    Supplier<Integer> iSupplier = () -> {
      Random randomInt = new Random();
      return randomInt.nextInt();
    };
    Integer randomNumber = iSupplier.get();
    String msg = randomNumber.toString();
    System.out.println(msg);
  }

}
