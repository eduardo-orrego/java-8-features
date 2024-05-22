package org.duna.jep107.stream;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamDemo04 {

  public static void main(String[] args) {
    String[] names = {"Eduardo", "Patricia", "Consuelo", "Luis", "Ulises", "Irene"};
    String fileName = "file.txt";
    Stream<String> nameStream = Stream.of(names);
    try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(Paths.get(fileName)))) {
      nameStream.forEach(pw::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}