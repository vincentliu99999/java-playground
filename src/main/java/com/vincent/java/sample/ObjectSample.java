package com.vincent.java.sample;

public class ObjectSample {
  public static void main(String[] args) throws Exception {
    Member nullMember = new Member();
    Member nameOnly = new Member("vincent");
    Member nameAnSex = new Member("benson", "male");

    System.out.println(
        "nullMember, name: " + nullMember.getName() + ", sex: " + nullMember.getSex());
    System.out.println(
        "nameOnly with name: " + nameOnly.getName() + ", sex: " + nullMember.getSex());
    System.out.println(
        "nameAnSex with name: " + nameAnSex.getName() + ", sex: " + nameAnSex.getSex());
    try {
      Member nameAnWrongSex = new Member("vincent", "tiger");
      System.out.println(
          "nameAnWrongSex with name: "
              + nameAnWrongSex.getName()
              + ", sex: "
              + nameAnWrongSex.getSex());
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
