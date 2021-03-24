package com.vincent.java.java8.method;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Static method
 */
public class Java8MethodReference1a {

  public static void main(String[] args) {

      List<String> list = Arrays.asList("A", "B", "C");

      // anonymous class
      list.forEach(new Consumer<String>() {
          @Override
          public void accept(String x) {
              SimplePrinter.print(x);
          }
      });

      // lambda expression
      list.forEach(x -> SimplePrinter.print(x));

      // method reference
      list.forEach(SimplePrinter::print);

  }

}

class SimplePrinter {
  public static void print(String str) {
      System.out.println(str);
  }
}