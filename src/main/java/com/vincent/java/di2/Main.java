package com.vincent.java.di2;


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

  private Spaghetti spaghetti;

  public People() {
      // 得到一碗義大利麵
      spaghetti = new Spaghetti();
  }

  public void eat() {
      // 填飽肚子
      spaghetti.fill();
  }
}

class Spaghetti  {
  public void fill() {
      System.out.println("大蒜辣椒麵 :D");
  }

}

class Hamburger  {

  public void stuff() {
      System.out.println("咔拉雞腿滿福堡 好棒棒");
  }
}

// Result:
// 大蒜辣椒麵 :D
