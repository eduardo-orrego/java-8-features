package org.xuaxpedia.lambda;

interface IMultipleParameter {
  void message(String name1, String name2);
}

public class LambdaDemo4 {

  static void functionDemo(IMultipleParameter i, String name1, String name2) {
    i.message(name1, name2);
  }

  public static void main(String[] args) {
    /*
      * Using lambda expression to implement the method of
      * interface with multiple parameters.
     */
    functionDemo((s1, s2) -> System.out.printf("%s %s \n", s1, s2), "James", "Bond");
    functionDemo((s1, s2) -> System.out.printf("%s - %s \n", s1, s2), "Hello lambda",
      "Interface with multiple parameters");
  }
}
