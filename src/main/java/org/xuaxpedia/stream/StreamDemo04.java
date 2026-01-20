package org.xuaxpedia.stream;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamDemo04 {

  public static void main(String[] args) {

    /*
    * An example of using of method Stream.of() in Java Streams
    * Demonstrates creating a Stream from an array and using forEach to write each element to a file.
    * Also shows the use of try-with-resources to handle file writing.
    */

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