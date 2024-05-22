package org.duna.jep126.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo01 {
  public static void main(String[] args) {
    List<Person> list = new ArrayList<>();
    list.add(new Person("Eduardo Orrego", 38));
    list.add(new Person("Francisco Vera", 36));
    list.add(new Person("Roger Gutierrez", 27));
    list.add(new Person("Miguel Salas", 37));

    //The "comparing()" method of the "Comparator" interface will be used to order the Persons by age
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