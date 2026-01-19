package org.xuaxpedia.interfaces;

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

    /*
    * Commonly used functional interfaces in java.util.function package
    1. Consumer<T> : accepts a single input argument and returns no result. 
       It represents an operation that takes a single input and produces no output.
    2. BiConsumer<T, U> : accepts two input arguments and returns no result.
    3. Predicate<T> : accepts a single input argument and returns a boolean value.
    4. BiPredicate<T, U> : accepts two input arguments and returns a boolean value.
    5. Function<T, R> : accepts a single input argument and produces a result
    6. BiFunction<T, U, R> : accepts two input arguments and produces a result
    7. Supplier<T> : represents a supplier of results. It takes no input and
        returns a result of type T.
    8. UnaryOperator<T> : a special case of Function that takes a single argument
        of type T and returns a result of the same type T.
    9. BinaryOperator<T> : a special case of BiFunction that takes two arguments
        of type T and returns a result of the same type T.
    */
    
    Consumer<Integer> c1 = n -> System.out.println(n);
    //Consumer<Integer> c1 = System.out::println;
    
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
