package com.vincent.java.java8.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalGetName {
  public static void main(String[] args) {
    Optional<String> nickNameOptional = getNickName("Duke");
    System.out.println(nickNameOptional);
    System.out.println(nickNameOptional.orElse("Openhome Reader"));
  }

  private static Optional<String> getNickName(String name) {
    Map<String, String> nickNames = new HashMap<>(); // 假裝的鍵值資料庫
    nickNames.put("Justin", "caterpillar");
    nickNames.put("Monica", "momor");
    nickNames.put("Irene", "hamimi");

    String nickName = nickNames.get(name);

    return Optional.ofNullable(nickName);
  }
}
