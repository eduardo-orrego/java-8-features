package org.xuaxpedia.interfaces;

import java.util.function.Function;

public class FunctionalDemo7 {
  public static void main(String[] args) {

    /*
    * Function<T, R> : accepts a single input argument of type T and produces a result of type R.
    * It represents a function that takes an input and produces an output.
    * Also includes default methods like compose() andThen() to combine multiple Functions.
    * Also includes the static method identity() to obtain a function that returns its input argument.
    */

    //FUNCTIONAL - compose() apply() METHODS
    Function<Integer, Double> iFunctional = n -> n / 2.0;
    iFunctional = iFunctional.compose(m -> m * 3);
    //The lambda expression in the compose method will be executed first
    Double result = iFunctional.apply(5);
    String msg = result.toString();
    System.out.println(msg);

    //FUNCTIONAL - identity() METHOD
    Function<String, String> iFunctionalIdentity = Function.identity();
    //The identity method obtains a function that takes an input value 
    //and returns it as output without modifying it.
    String result2 = iFunctionalIdentity.apply("Eduardo");
    System.out.println(result2);

  }
}
