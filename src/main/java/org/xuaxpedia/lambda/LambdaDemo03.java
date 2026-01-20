package org.xuaxpedia.lambda;

@FunctionalInterface
interface FunctionalInterfaceDemo {
  void abstractFunction(String parameter);

  default void nonAbstractFunction() {
    System.out.println("Hello lambda - Non Abstract Function");
  }
}

public class LambdaDemo03 {
  public static void main(String[] args) {
    /*
    * In this example, we will see how to create a lambda expression for a functional interface with
    * an abstract method that takes one parameter.
    * The interface "FunctionalInterfaceDemo" is a functional interface with a single abstract method
    * "abstractFunction(String parameter)" that takes one parameter of type String.
    * We will create a lambda expression that implements this method to print the message passed as parameter
    * to the console.
    * Also, we will see how to use method reference to achieve the same functionality.
    * The method reference will refer to the println method of the System.out object.
    * Also, we will see how to use default method in functional interface.
    * The default method "nonAbstractFunction()" will be called to print a message to the console.
     */
    FunctionalInterfaceDemo funInterDemo = (String s) -> System.out.println(s);
    funInterDemo.abstractFunction("Hello lambda - Abstract Function");
    funInterDemo.nonAbstractFunction();

    FunctionalInterfaceDemo funInterDemo2 = System.out::println;
    funInterDemo2.abstractFunction("Hello lambda 2 - Abstract Function");
    funInterDemo2.nonAbstractFunction();
  }
}
