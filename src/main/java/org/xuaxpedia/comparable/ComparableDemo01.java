package org.xuaxpedia.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo01 {
  public static void main(String[] args) {

    /*
    * In this example, we will see how to use the "Comparable" interface to sort a list of "Book" objects by year.
    * The "compareTo()" method of the "Comparable" interface will be implemented to order the Books by year.
    * Streams API will be used to print the list before and after sorting.
    * Also we will see how to create a class that implements the Comparable interface.
    */

    ArrayList<Book> list = new ArrayList<>();
    list.add(new Book("Code Book", 123456, 2015));
    list.add(new Book("Romantic Book", 789012, 1977));
    list.add(new Book("Happy Book", 345678, 1980));
    list.add(new Book("Dollar Book", 321789, 1983));

    Collections.sort(list);

    System.out.println("Books after sorting : ");
    list.stream().map(book -> book.getTitle() + " " + book.getIsbn() + " " + book.getYear())
      .forEach(System.out::println);
  }
}

class Book implements Comparable<Book> {
  private Integer isbn;
  private String title;
  private int year;

  @Override
  public int compareTo(Book book) {
    return this.year - book.year;
  }

  public Book(String title, Integer isbn, int year) {
    this.title = title;
    this.isbn = isbn;
    this.year = year;
  }

  public Integer getIsbn() {
    return isbn;
  }

  public String getTitle() {
    return title;
  }

  public int getYear() {
    return year;
  }


}