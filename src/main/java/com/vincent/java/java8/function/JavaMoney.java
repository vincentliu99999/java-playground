package com.vincent.java.java8.function;

import java.util.function.Function;

// https://docs.oracle.com/javase/8/docs/api/java/lang/FunctionalInterface.html
public class JavaMoney {
  public static void main(String[] args) {
    Function<String, Integer> func = x -> x.length();

    Integer apply = func.apply("vincent");

    System.out.println(apply);

  }
}
