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
      * Using lambda expression to implement the method of
      * interface without parameters
     */
    functionDemo(() -> System.out.println("Hello lambda - Interface without parameters"));
  }
}