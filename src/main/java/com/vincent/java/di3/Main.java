package com.vincent.java.di3;


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

  private Stuffer stuffer;

  public People() {
      // 得到一個填充者 的實例
      // 實際實作種類是 Hamburger
      stuffer = new Hamburger();
  }

  public void eat() {
      // 填飽肚子
      stuffer.stuff();
  }
}

interface Stuffer {
  // 填飽肚子
  void stuff();
}

class Hamburger implements Stuffer{
  @Override
  public void stuff() {
      System.out.println("咔拉雞腿滿福堡 好棒棒");
  }
}

class Tea implements Stuffer{
  @Override
  public void stuff() {
      System.out.println("烙賽 大冰奶");
  }
}


// Result:
// 咔拉雞腿滿福堡 好棒棒
