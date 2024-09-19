package org.xuaxpedia.interfaces;

import java.util.function.Function;

public class FunctionalDemo7 {
  public static void main(String[] args) {

    //FUNCTIONAL - compose() apply() METHODS
    Function<Integer, Double> iFunctional = n -> n / 2.0;
    iFunctional = iFunctional.compose(m -> m * 3);
    //la expresion lambda en compose se ejecutara primero
    Double result = iFunctional.apply(5);
    String msg = result.toString();
    System.out.println(msg);

    //FUNCTIONAL - identity() METHOD
    Function<String, String> iFunctionalIdentity = Function.identity();
    //El metodo identity obtiene una funcion que toma un valor de entrada
    //y lo devuelve como salida sin modificarlo
    String result2 = iFunctionalIdentity.apply("Eduardo");
    String msg2 = result2.toString();
    System.out.println(msg2);

  }
}
