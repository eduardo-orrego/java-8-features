package org.xuaxpedia.stream;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StreamDemo13 {
  public static void main(String[] args) {

    Logger logger = Logger.getLogger(StreamDemo13.class.getName());

    logger.info("<<splitAsStream operation");
    // splitAsStream() operation (method of Pattern class)
    String text = "Hello,World!Java;Programming";
    Pattern pattern = Pattern.compile("[,;!]");
    Stream<String> splitAsStream1 = pattern.splitAsStream(text);
    splitAsStream1.forEach(logger::info);

    logger.info("<<lines operation");
    // lines() operation (BufferedReader method)
    String multilineText = "First line\nSecond line\nThird line";
    BufferedReader bufferedReader = new BufferedReader(new StringReader(multilineText));
    Stream<String> linesStream = bufferedReader.lines();
    linesStream.forEach(logger::info);

    logger.info("<<Pattern.splitAsStream() operation");
    // Pattern.splitAsStream() operation: Similar to splitAsStream() of the Pattern class,
    // but can be used directly from the Pattern class
    String[] words = {"apple,banana", "cherry;grape", "orange"};
    Pattern pattern2 = Pattern.compile("[,;]");
    Stream<String> splitAsStream2 = Arrays.stream(words)
      .flatMap(pattern2::splitAsStream);
    splitAsStream2.forEach(logger::info);

  }
}