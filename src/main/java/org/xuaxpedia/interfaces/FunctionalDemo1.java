package org.xuaxpedia.interfaces;

public class FunctionalDemo1 {
  public static void main(String[] args) {

    //before java 8
    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("Hello Thread before java 8");
      }
    }).start();

    //with java 8
    new Thread(() -> System.out.println("Hello Thread with java 8"))
      .start();

  }
}
