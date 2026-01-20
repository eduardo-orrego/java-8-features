package org.xuaxpedia.lambda;

@FunctionalInterface
interface IWithOneParameter {
  void message(String msg);
}

public class LambdaDemo02 {
  static void functionDemo(IWithOneParameter i, String msg) {
    i.message(msg);
  }

  public static void main(String[] args) {
    /*
      * In this example, we will see how to create a lambda expression for an interface with one parameter.
      * The interface "IWithOneParameter" is a functional interface with a single abstract method
      * "message(String msg)" that takes one parameter of type String.
      * We will create a lambda expression that implements this method to print the message passed as parameter
      * to the console.
      * Also, we will see how to use method reference to achieve the same functionality.
      * The method reference will refer to the println method of the System.out object.
     */
    functionDemo(msg -> System.out.println(msg), "Hello");
    functionDemo(System.out::println, "Hello lambda.");

  }

}