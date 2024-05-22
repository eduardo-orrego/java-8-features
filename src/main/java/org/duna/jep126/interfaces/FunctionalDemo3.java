package org.duna.jep126.interfaces;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalDemo3 {
  public static void main(String[] args) {

    Consumer<Integer> c1 = System.out::println;
    //Consumer<Integer> c1 = n -> System.out.println(n);
    c1.accept(1);

    BiConsumer<String, String> c2 = (s1, s2) -> System.out.println(s1 + " " + s2);
    c2.accept("Carlos", "Eduardo");

    Predicate<Integer> p1 = n -> n.equals(0);
    System.out.println(p1.test(1));

    BiPredicate<Integer, Integer> p2 = (n, m) -> n.equals(m);
    System.out.println(p2.test(1, 2));

    Function<Integer, Integer> f1 = n -> n * 10;
    System.out.println(f1.apply(1));

    BiFunction<Integer, Integer, Double> f2 = (n, m) -> (n + m) / 2.0;
    System.out.println(f2.apply(1,2));

    Supplier<Integer> s1 = () -> 1;
    System.out.println(s1.get());

    UnaryOperator<Integer> o1 = (n) -> n * 2;
    System.out.println(o1.apply(1));

    BinaryOperator<Integer> o2 = (n, m) -> n * m;
    System.out.println(o2.apply(1,2));

  }
}
