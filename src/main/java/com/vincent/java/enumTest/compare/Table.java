package com.vincent.java.enumTest.compare;

public enum Table {
  LOG_CATEGORY_POOL("log_category_pool"), LOG_TOPPER_POOL("log_topper_pool");

  private String name;
  private Table(String name) {
      this.name = name;
  }
  public String value() {
      return name;
  }

  public static void main(String[] args) {
    for(Table grade: Table.values()) {
      System.out.println(grade.name() + ": " + grade + ": " + grade.ordinal() + ", value: "+ grade.value());
    }

    System.out.println(Table.LOG_CATEGORY_POOL);
  }
}
