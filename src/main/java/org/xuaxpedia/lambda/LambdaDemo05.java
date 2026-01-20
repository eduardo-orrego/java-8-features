package org.xuaxpedia.lambda;

@FunctionalInterface
interface INumericTest {
  boolean test(int n, int m);
}

public class LambdaDemo05 {
  public static void main(String[] args) {
    
    /*
    * In this example, we will see how to create a lambda expression for an interface with multiple parameters
    * and a return value.
    * The interface "INumericTest" is a functional interface with a single abstract method
    * "test(int n, int m)" that takes two parameters of type int and returns a boolean value.
    * We will create a lambda expression that implements this method to check if the product of the
    * two parameters is less than or equal to 10.
    * If the product is less than or equal to 10, the method will return true, otherwise it will return false.
    * We will then use this lambda expression to test the values 5 and 1.
    * If the result is true, we will print "Hello lambda" to the console.
    */

    INumericTest test = (n, m) -> (n * m) <= 10;

    if (test.test(5, 1))
      System.out.println("Hello lambda");

  }
}
