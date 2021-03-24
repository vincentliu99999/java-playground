package com.vincent.java.java8.function;

import java.util.function.Function;

public class Java8Function2 {
  public static void main(String[] args) {

    Function<String, Integer> getWordLength = x -> x.length();

    Function<Integer, Integer> doubleLength = x -> x * 2;

    Integer result = getWordLength.andThen(doubleLength).apply("vincent");

    System.out.println(result);

}
}
