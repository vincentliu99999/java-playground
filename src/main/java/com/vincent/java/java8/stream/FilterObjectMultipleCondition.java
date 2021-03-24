package com.vincent.java.java8.stream;

import java.util.Arrays;
import java.util.List;

public class FilterObjectMultipleCondition {
  public static void main(String[] args) {

    List<Person> persons = Arrays.asList(new Person("vincent", 30), new Person("jack", 20),
        new Person("lawrence", 40));

    Person result1 = persons.stream().filter(p -> "jack".equals(p.getName()) && 20 == p.getAge())
        .findAny().orElse(null);

    System.out.println("result 1 :" + result1);

    // or like this
    Person result2 = persons.stream().filter(p -> {
      return "jack".equals(p.getName()) && 20 == p.getAge();
    }).findAny().orElse(null);

    System.out.println("result 2 :" + result2);

  }
}
