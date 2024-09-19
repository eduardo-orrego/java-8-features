package org.xuaxpedia.methodref;

import java.util.function.Function;
import java.util.logging.Logger;

public class MethodDemo1 {

  public static void main(String[] args) {
    //An interface functional as a variable and used as a parameter.
    Function<Integer, Integer> getFunction = n -> n * n;
    DemoClass.functionDemo(2, getFunction);

    //A lambda expression used as a parameter
    DemoClass.functionDemo(3, n -> n * n);

  }

}

class DemoClass {
  DemoClass(){}

  private final static Logger logger = Logger.getLogger(MethodDemo1.class.getName());

  public static void functionDemo(int a, Function<Integer, Integer> iFunction) {
    Integer result = iFunction.apply(a);
    String msg = result.toString();
    logger.info(msg);
  }

}

