package com.vincent.java.sample;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class URLEncoderExample {
  public static void main(String[] args) throws UnsupportedEncodingException {
    String parameter = "facet=true,你好 '  /  \\ $";

    System.out.println(URLEncoder.encode(parameter, "UTF-8"));
    System.out.println(parameter.replaceAll("['|/|\\\\|\\$]", ""));
  }
}
