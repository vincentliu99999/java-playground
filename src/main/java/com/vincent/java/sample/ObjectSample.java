package com.vincent.java.sample;

public class ObjectSample {
  public static void main(String[] args) throws Exception {
    Member nullMember = new Member();
    Member nameOnly = new Member("vincent");
    Member nameAnSex = new Member("benson", "male");

    System.out.println("nullMember" + nullMember.toString());
    System.out.println("nameOnly" + nameOnly.toString());
    System.out.println("nameAnSex" + nameAnSex.toString());
    
    try {
      Member nameAnWrongSex = new Member("vincent", "tiger");
      System.out.println("nameAnWrongSex" + nameAnWrongSex.toString());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

class Member {

  public Member() {}

  public Member(String name) {
    this.name = name;
  }

  public Member(String name, String sex) throws Exception {
    this(name);

    if (!"male".equals(sex) && !"female".equals(sex)) {
      throw new Exception("unknown sex");
    }
    this.sex = sex;
  }

  @Override
  public String toString() {
    return "Member [name=" + name + ", sex=" + sex + "]";
  }

  private String name;
  private String sex;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }
}
