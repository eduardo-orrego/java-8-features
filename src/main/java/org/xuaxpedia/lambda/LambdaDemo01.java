package org.xuaxpedia.lambda;

@FunctionalInterface
interface IWithoutParameter {
  void message();
}

public class LambdaDemo01 {

  static void functionDemo(IWithoutParameter i) {
    i.message();
  }

  public static void main(String[] args) {

    /*
    * In this example, we will see how to create a lambda expression for an interface without parameters.
    * The interface "IWithoutParameter" is a functional interface with a single abstract method "message()" that does not take any parameters.
    * We will create a lambda expression that implements this method to print a message to the console
    */

    functionDemo(() -> System.out.println("Hello lambda - Interface without parameters"));
  }
}