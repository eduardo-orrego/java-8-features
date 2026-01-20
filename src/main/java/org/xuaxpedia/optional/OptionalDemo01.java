package org.xuaxpedia.optional;

import java.util.Optional;

public class OptionalDemo01 {

  public static void main(String[] args) {

    /*
     * The Optional class in Java 8 is a container object that may or may not hold a
     * non-null value, making the presence or absence of a value explicit.
     * When a value is present, isPresent() returns true and get() returns the
     * contained value.
     * It is mainly used to avoid explicit null checks and reduce the risk of
     * NullPointerException.
     * Optional provides utility methods such as map, flatMap, and orElse to safely
     * work with values when they are present.
     * It encourages a functional programming style through the use of lambda
     * expressions.
     * By avoiding null as a special value, it improves code safety, readability,
     * and maintainability.
     * It is especially useful in method return types, APIs, collections, and
     * streams to represent optional values and handle missing data properly.
     * Overall, Optional integrates well with Java 8 features and helps reduce
     * boilerplate code while promoting better handling of absent values.
     * 
     * Examples of Optional class operations:
     * 1. empty
     * 2. of
     * 3. ofNullable
     * 4. orElse
     * 5. orElseGet
     * 6. orElseThrow
     * 7. map
     * 8. flatMap
     * 9. filter
     * 10. ifPresent
     */
    System.out.println("<<empty operation>>");
    Optional<String> emptyOptional = Optional.empty();
    System.out.println("Empty Optional: " + emptyOptional.isPresent());

    System.out.println("<<of operation>>");
    String name = "John";
    Optional<String> nameOptional = Optional.of(name);
    System.out.println("Optional with value: " + nameOptional.isPresent());
    System.out.println("Name: " + nameOptional.get());

    System.out.println("<<ofNullable operation>>");
    String nickname = null;
    Optional<String> nicknameOptional = Optional.ofNullable(nickname);
    System.out.println("Optional with null value: " + nicknameOptional.isPresent());

    System.out.println("<<orElse operation>>");
    String defaultNickname = nicknameOptional.orElse("Anonymous");
    System.out.println("Nickname (orElse): " + defaultNickname);

    System.out.println("<<orElseGet operation>>");
    String city = nicknameOptional.orElse("Unknown City");
    System.out.println("City (orElseGet): " + city);

    System.out.println("<<orElseThrow operation>>");
    Optional<Integer> ageOptional = Optional.empty();
    try {
      int age = ageOptional.orElseThrow(() -> new IllegalArgumentException("Age is missing"));
      System.out.println(age);
    } catch (IllegalArgumentException e) {
      System.out.println("Error: " + e.getMessage());
    }

    System.out.println("<<map operation>>");
    Optional<Integer> nameLengthOptional = nameOptional.map(String::length);
    System.out.println("Name length (map): " + nameLengthOptional.orElse(0));

    System.out.println("<<flatmap operation>>");
    Optional<User> userOptional = Optional.of(new User("Luis", 12));
    Optional<String> userNameOptional = userOptional.flatMap(user -> Optional.of(user.getName()));
    System.out.println("Username (flatMap): " + userNameOptional.orElse("No user"));

    System.out.println("filter operation");
    Optional<Integer> evenNumberOptional = Optional.of(10).filter(number -> number % 2 == 0);

    System.out.println("<<ifPresent operation>>");
    System.out.println("Even number (filter): " + evenNumberOptional.isPresent());

    System.out.println("<<ifPresent operation>>");
    nameOptional.ifPresent(System.out::println);

  }
}

class User {
  private String name;
  private int age;

  public User() {
  }

  public User(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}