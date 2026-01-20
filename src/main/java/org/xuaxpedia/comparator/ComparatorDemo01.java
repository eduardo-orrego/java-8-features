package org.xuaxpedia.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo01 {
  public static void main(String[] args) {

    /*
    * In this example, we will see how to use the "Comparator" interface to sort a list of "Person" objects by age.
    * Also we will use method reference to pass the getter method of age attribute to the comparing() method of Comparator interface.
    * Streams API will be used to print the list before and after sorting.
    */

    List<Person> list = new ArrayList<>();
    list.add(new Person("Eduardo Orrego", 38));
    list.add(new Person("Francisco Vera", 36));
    list.add(new Person("Roger Gutierrez", 27));
    list.add(new Person("Miguel Salas", 37));

    list.sort(Comparator.comparing(Person::getAge));

    System.out.println("Books after sorting : ");
    list.stream().map(book -> String.format("name= %s, age= %s", book.getName(), book.getAge()))
      .forEach(System.out::println);
  }
}

class Person {
  private Integer age;
  private String name;

  public Person(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public Integer getAge() {
    return age;
  }

  public String getName() {
    return name;
  }
}