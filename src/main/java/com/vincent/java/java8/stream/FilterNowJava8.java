package com.vincent.java.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class FilterNowJava8 {
  private static final String NAME_TO_REMOVE = "vincent";

  public static void main(String[] args) {
    Logger logger = Logger.getLogger("NowJava8");

    List<String> lines = Arrays.asList("spring", "node", NAME_TO_REMOVE);

    List<String> result = lines.stream() // convert list to stream
        .filter(line -> !NAME_TO_REMOVE.equals(line))
        .collect(Collectors.toList()); // collect the output and convert streams to a List

    result.forEach(logger::info); // output : spring, node

  }
}
