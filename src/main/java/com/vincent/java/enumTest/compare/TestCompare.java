package com.vincent.java.enumTest.compare;

public class TestCompare {
  public static void main(String[] args) {
    for(Grade grade: Grade.values()) {
      System.out.println(grade.name() + ": " + grade + ": " + grade.ordinal());
    }

    System.out.println(Grade.A);
  }
}
