package org.xuaxpedia.lambda;

interface IWithOneParameter {
  void message(String msg);
}

public class LambdaDemo02 {
  static void functionDemo(IWithOneParameter i, String msg) {
    i.message(msg);
  }

  public static void main(String[] args) {
    /*
      * Using lambda expression to implement the method of
      * interface with one parameter
     */
    functionDemo(msg -> System.out.println(msg), "Hello");
    functionDemo(System.out::println, "Hello lambda.");

  }

}