package com.vincent.java.java8.stream;

import java.util.Arrays;
import java.util.List;

public class FilterObjectBeforeJava8 {

  public static void main(String[] args) {

    List<Person> persons = Arrays.asList(new Person("vincent", 30), new Person("jack", 20),
        new Person("lawrence", 40));

    Person result = getStudentByName(persons, "jack");
    System.out.println(result);

  }

  private static Person getStudentByName(List<Person> persons, String name) {

    Person result = null;
    for (Person temp : persons) {
      if (name.equals(temp.getName())) {
        result = temp;
      }
    }
    return result;
  }
}
