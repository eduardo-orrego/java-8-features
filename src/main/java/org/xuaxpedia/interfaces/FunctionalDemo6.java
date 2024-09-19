package org.xuaxpedia.interfaces;

import java.util.function.Predicate;

public class FunctionalDemo6 {
  public static void main(String[] args) {

    //PREDICATE - and() test() METHODS
    Predicate<String> iPredicate = x -> x.length() > 3;
    Predicate<String> iPredicateAnd = y -> y.length() < 10;

    boolean result1 = iPredicate
      .and(iPredicateAnd) //operador and
      .test("Eduardo");
    String msg = String.valueOf(result1);
    System.out.println(msg);

    //PREDICATE - negate() or() METHODS
    Predicate<String> iPredicateOr = m -> m.contains("o");

    boolean result2 = iPredicate
      .or(iPredicateOr) //operador or
      .negate() //invierte el resultado
      .test("Sue");
    String msg2 = String.valueOf(result2);
    System.out.println(msg2);

    //PREDICATE - equals() METHODS
    Predicate<String> iPredicate2 = s -> s.length() > 10;
    Predicate<String> p1 = iPredicate2;
    Predicate<String> p2 = iPredicate2;

    boolean result3 = p2.equals(p1);
    String msg3 = String.valueOf(result3);
    System.out.println(msg3);

  }

}
