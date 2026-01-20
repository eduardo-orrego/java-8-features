package org.xuaxpedia.lambda;

@FunctionalInterface
interface IMultipleParameter {
  void message(String name1, String name2);
}

public class LambdaDemo04 {

  static void functionDemo(IMultipleParameter i, String name1, String name2) {
    i.message(name1, name2);
  }

  public static void main(String[] args) {
    /*
    * In this example, we will see how to create a lambda expression for an interface with multiple parameters.
    * The interface "IMultipleParameter" is a functional interface with a single abstract method
    * "message(String name1, String name2)" that takes two parameters of type String.
    * We will create a lambda expression that implements this method to print the two names passed as
    * parameters to the console in different formats.
    * Also, we will see how to use the printf method to format the output.
    * The printf method will be used to print the two names in different formats.
    */
    functionDemo((s1, s2) -> System.out.printf("%s %s \n", s1, s2), "James", "Bond");
    functionDemo((s1, s2) -> System.out.printf("%s - %s \n", s1, s2), "Hello lambda",
      "Interface with multiple parameters");
  }
}
