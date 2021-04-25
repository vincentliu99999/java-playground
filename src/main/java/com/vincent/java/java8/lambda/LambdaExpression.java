package com.vincent.java.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpression {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("node", "java", "python", "ruby");

    for (String language : list) {
      System.out.println(language);
    }

    // anonymous class
    System.out.println("anonymous class>>>");
    list.forEach(new Consumer<String>() {
      @Override
      public void accept(String str) {
        System.out.println(str);
      }
    });

    // shorten lambda expressions
    System.out.println("shorten>>>");
    list.forEach(str -> System.out.println(str));

    // readability
    System.out.println("readability>>>");
    list.forEach(System.out::println);
  }

}
