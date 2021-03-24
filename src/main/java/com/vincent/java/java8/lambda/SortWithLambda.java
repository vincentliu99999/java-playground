package com.vincent.java.java8.lambda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortWithLambda {
  public static void main(String[] args) {

    List<Developer> listDevs = getDevelopers();
    
    System.out.println("Before Sort");
    for (Developer developer : listDevs) {
        System.out.println(developer);
    }
    
    System.out.println("After Sort");
    
    //lambda here!
     // sort by age
    listDevs.sort((o1, o2)->o1.getAge()-o2.getAge());
    // listDevs.sort((Developer o1, Developer o2)->o1.getAge()-o2.getAge());

    // sort by name
    listDevs.sort((Developer o1, Developer o2)->o1.getName().compareTo(o2.getName()));
    listDevs.sort((o1, o2)->o1.getName().compareTo(o2.getName()));

    // sort by salary
    listDevs.sort((Developer o1, Developer o2)->o1.getSalary().compareTo(o2.getSalary()));
    listDevs.sort((o1, o2)->o1.getSalary().compareTo(o2.getSalary()));

    // Comparator<Developer> salaryComparator = (o1, o2)->o1.getSalary().compareTo(o2.getSalary());
    // listDevs.sort(salaryComparator);

    Comparator<Developer> salaryComparator = (o1, o2)->o1.getSalary().compareTo(o2.getSalary());
    listDevs.sort(salaryComparator.reversed());

    //java 8 only, lambda also, to print the List
    listDevs.forEach(System.out::println);
    // listDevs.forEach(developer->System.out.println(developer));
}

private static List<Developer> getDevelopers() {

    List<Developer> result = new ArrayList<Developer>();

    result.add(new Developer("vincent", new BigDecimal("70000"), 33));
    result.add(new Developer("alvin", new BigDecimal("80000"), 20));
    result.add(new Developer("jason", new BigDecimal("100000"), 10));
    result.add(new Developer("iris", new BigDecimal("170000"), 55));
    
    return result;

}
}
