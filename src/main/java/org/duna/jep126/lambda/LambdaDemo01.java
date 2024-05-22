package org.duna.jep126.lambda;

interface IWithoutParameter {
  void message();
}

public class LambdaDemo01 {

  static void functionDemo(IWithoutParameter i) {
    i.message();
  }

  public static void main(String[] args) {
    functionDemo(() -> System.out.println("Hello lambda - Interface without parameters"));
  }
}