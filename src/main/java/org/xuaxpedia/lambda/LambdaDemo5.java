package org.xuaxpedia.lambda;

interface INumericTest {
  boolean test(int n, int m);
}

public class LambdaDemo5 {
  public static void main(String[] args) {

    INumericTest test = (n, m) -> (n * m) <= 10;

    if (test.test(5, 1))
      System.out.println("Hello lambda");

  }
}
