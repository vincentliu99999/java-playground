package com.vincent.java.java8.method;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Static method
 */
public class Java8MethodReference1b {

  public static void main(String[] args) {

    List<String> list = Arrays.asList("1", "2", "3");

    // anonymous class
    List<Integer> collect1 = list.stream().map(new Function<String, Integer>() {
      @Override
      public Integer apply(String s) {
        return Integer.parseInt(s);
      }
    }).collect(Collectors.toList());

    System.out.println(collect1);

    // lambda expression
    List<Integer> collect2 =
        list.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());

    System.out.println(collect2);

    // method reference
    List<Integer> collect3 = list.stream().map(Integer::parseInt).collect(Collectors.toList());
    System.out.println(collect3);
  }

}
