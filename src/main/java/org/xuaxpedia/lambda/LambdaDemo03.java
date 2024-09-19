package org.xuaxpedia.lambda;

interface FunctionalInterfaceDemo {
  void abstractFunction(String parameter);

  default void nonAbstractFunction() {
    System.out.println("Hello lambda - Non Abstract Function");
  }
}

public class LambdaDemo03 {
  public static void main(String[] args) {
    //FunctionalInterfaceDemo funInterDemo = (String s) -> System.out.println(s);
    FunctionalInterfaceDemo funInterDemo = System.out::println;
    funInterDemo.abstractFunction("Hello lambda - Abstract Function");
    funInterDemo.nonAbstractFunction();
  }
}
