package org.xuaxpedia.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo02 {

  public static void main(String[] args) {

    /*
    * In this example, we will see how to use the "Comparator" interface to sort a list of "Book" objects by different attributes
    * like title, isbn, and year.
    * We will create different comparator classes implementing the Comparator interface to achieve this.
    * Streams API will be used to print the list before and after sorting.
    * Also we will see how to sort by multiple attributes using Comparator.
    * Also TitleCompareOrder and IsbnCompareOrder comparator classes will be created to sort by title and isbn respectively.
    * Finally, YearAndTitleCompareOrder comparator class will be created to sort by year and title.
    */

    List<Book> list = Arrays.asList(
      new Book("Romantic Book", 123456, 2020),
      new Book("Mysql Book", 789012, 2015),
      new Book("Linux Book", 345678, 2021),
      new Book("Code Book", 321789, 2015),
      new Book("Java Book", 654789, 2020)
    );

    System.out.println("Using Comparator to sort by title:");
    TitleCompareOrder titleCompare = new TitleCompareOrder();
    list.sort(titleCompare);
    list.stream().map(book -> String.format("name=%s, year=%d, isbn=%d",
        book.getTitle(), book.getYear(), book.getIsbn()))
      .forEach(System.out::println);

    System.out.println("Using Comparator to sort by isbn:");
    IsbnCompareOrder isbnCompare = new IsbnCompareOrder();
    list.sort(isbnCompare);
    list.stream().map(book -> String.format("isbn=%d, name=%s, year=%d",
        book.getIsbn(), book.getTitle(), book.getYear()))
      .forEach(System.out::println);

    System.out.println("Using Comparator to sort by year and title:");
    YearAndTitleCompareOrder yearAndTitleCompareOrder = new YearAndTitleCompareOrder();
    list.sort(yearAndTitleCompareOrder);
    list.stream().map(book -> String.format("year=%d, name=%s, isbn=%d",
        book.getYear(), book.getTitle(), book.getIsbn()))
      .forEach(System.out::println);
  }
}

class Book {
  private Integer isbn;
  private String title;
  private int year;

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

class IsbnCompareOrder implements Comparator<Book> {
  @Override
  public int compare(Book m1, Book m2) {
    return Integer.compare(m1.getIsbn(), m2.getIsbn());
  }
}

class TitleCompareOrder implements Comparator<Book> {
  @Override
  public int compare(Book book1, Book book2) {
    return book1.getTitle().compareTo(book2.getTitle());
  }
}

class YearAndTitleCompareOrder implements Comparator<Book> {
  @Override
  public int compare(Book book1, Book book2) {

    int yearCompare = Integer.compare(book1.getYear(), book2.getYear());
    int titleCompare = book1.getTitle().compareTo(book2.getTitle());

    return yearCompare == 0
      ? titleCompare
      : yearCompare;
  }
}
