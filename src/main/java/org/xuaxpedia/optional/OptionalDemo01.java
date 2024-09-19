package org.xuaxpedia.optional;

import java.util.Optional;

public class OptionalDemo01 {

  public static void main(String[] args) {

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
    Optional<User> userOptional = Optional.of(new User("Luis",12));
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