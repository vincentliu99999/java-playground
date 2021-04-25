package com.vincent.java.java8;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * getEncoder getDecoder getUrlEncoder getUrlDecoder getMimeEncoder getMimeDecoder
 */
public class Base64s {
  public static void main(String[] args) {
    final String text = "Base64 finally in Java 8!";
    final String url = "https://www.jianshu.com/p/5b800057f2d8";

    final String encoded =
        Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
    System.out.println(encoded);

    final String decoded = new String(Base64.getDecoder().decode(encoded), StandardCharsets.UTF_8);
    System.out.println(decoded);

    final String encodedURL =
        Base64.getUrlEncoder().encodeToString(url.getBytes(StandardCharsets.UTF_8));
    System.out.println(encodedURL);

    final String decodedURL =
        new String(Base64.getUrlDecoder().decode(encodedURL), StandardCharsets.UTF_8);
    System.out.println(decodedURL);
  }
}
