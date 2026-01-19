package org.xuaxpedia.interfaces;

/*
* A functional interface is an interface that contains only one abstract method.
*/
@FunctionalInterface
interface ITriangle{
  int area(int base, int height);
}

public class FunctionalDemo2 {
  public static void main(String[] args){

    int base = 5;
    int height = 6;
    //Implementation using lambda expression
    ITriangle triangle = (int b, int h) -> b*h/2;
    int area = triangle.area(base, height);
    System.out.println(area);
  }
}
