package org.duna.jep126.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo01 {
  public static void main(String[] args) {
    ArrayList<Book> list = new ArrayList<>();
    list.add(new Book("Code Book", 123456, 2015));
    list.add(new Book("Romantic Book", 789012, 1977));
    list.add(new Book("Happy Book", 345678, 1980));
    list.add(new Book("Dollar Book", 321789, 1983));

    //The "compareTo" method of the "Book" class will be used to order the books by year
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