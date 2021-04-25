package com.vincent.java.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class FilterBeforeJava8 {
  private static final String NAME_TO_REMOVE = "vincent";

  public static void main(String[] args) {
    Logger logger = Logger.getLogger("BeforeJava8");

    List<String> lines = Arrays.asList("spring", "node", NAME_TO_REMOVE);
    List<String> result = getFilterOutput(lines, NAME_TO_REMOVE);
    for (String temp : result) {
      // System.out.println(temp); // output : spring, node
      logger.info(temp);
    }

  }

  private static List<String> getFilterOutput(List<String> lines, String filter) {
    List<String> result = new ArrayList<>();
    for (String line : lines) {
      if (!filter.equals(line)) {
        result.add(line);
      }
    }
    return result;
  }
}
