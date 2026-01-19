package org.xuaxpedia.interfaces;

import java.util.Random;
import java.util.function.Supplier;

public class FunctionalDemo8 {

  public static void main(String[] args) {

    /*
    * Supplier<T> : does not accept any input arguments and returns a result of type T.
    * It represents a supplier of results.
    * Also includes the default method andThen() to chain multiple Suppliers.
    * Also includes static methods like ofNullable() to create a Supplier that may return null.
    * Also includes the static method get() to obtain a result from the Supplier.
    */

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
