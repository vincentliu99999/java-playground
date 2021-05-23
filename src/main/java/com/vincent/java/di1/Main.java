package com.vincent.java.di1;


public class Main {
  public static void main(String[] args) {
      // 實例 People 物件 -- 我
      // 執行 空引數建構元
      People me = new People();

      // 開吃囉
      me.eat();
  }
}

class People {

  private Hamburger burger;
  
  public People() {
      // 得到一個漢堡
      burger = new Hamburger();
  }
  
  public void eat() {
      // 填飽肚子
      burger.stuff();
  }
}

class Hamburger  {

  public void stuff() {
      System.out.println("咔拉雞腿滿福堡 好棒棒");
  }
}

// Result:
// 咔拉雞腿滿福堡 好棒棒