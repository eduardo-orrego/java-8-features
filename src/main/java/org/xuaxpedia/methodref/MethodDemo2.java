package org.xuaxpedia.methodref;

import java.util.ArrayList;
import java.util.List;

public class MethodDemo2 {

  public static void main(String[] args) {

    List<Customer> customerList = new ArrayList<>();
    customerList.add(new Customer("Luis", 22));
    customerList.add(new Customer("Carlos", 21));
    customerList.add(new Customer("Sue", 15));

    System.out.println("Reference to a static method ");
    System.out.println("Sort by name: ");

    //customerList.sort((o1, o2) -> CompareDemo.compareByAge(o1, o2));
    customerList.sort(CompareDemo::compareByName);

    customerList.stream()
      .map(Customer::getName)
      .forEach(System.out::println);

    System.out.println("Reference to an instance method of particular object");
    System.out.println("Sort by age: ");
    CompareDemo compareDemo = new CompareDemo();

    //customerList.sort((o1, o2) -> CompareDemo.compareByAge(o1, o2));
    customerList.sort(compareDemo::compareByAge);

    customerList.stream()
      .map(Customer::getName)
      .map(Object::toString)
      .forEach(System.out::println);

    System.out.println("Reference to an instance method of an arbitrary object of a particular type");
    List<String> nameList = new ArrayList<>();
    nameList.add("Eduardo");
    nameList.add("Miguel");
    nameList.add("Patricia");

    //nameList.sort((String, o1) -> String.compareToIgnoreCase(o1));
    nameList.sort(String::compareToIgnoreCase);
    nameList.forEach(System.out::println);

    System.out.println("Constructor method reference");
    nameList.stream()
      .map(Person::new)
      .map(Person::getName)
      .forEach(System.out::println);

  }
}

class Customer {
  private String name;
  private int age;

  public Customer(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

}

class Person {
  private String name;
  private int age;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

}

class CompareDemo {

  public static int compareByName(Customer a, Customer b) {
    return a.getName().compareTo(b.getName());
  }

  public int compareByAge(Customer a, Customer b) {
    return a.getAge().compareTo(b.getAge());
  }
}