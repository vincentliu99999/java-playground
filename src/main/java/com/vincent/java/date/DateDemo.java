package com.vincent.java.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
  public static void main(String args[]) {
    // Instantiate a Date object
    Date date = new Date();

    // display time and date using toString()
    System.out.println(date.toString());

    dateFormat();
  }

  private static void dateFormat() {
    Date dNow = new Date();
    String FORMAT = "E yyyy.MM.dd 'at' hh:mm:ss a zzz";
    SimpleDateFormat ft = new SimpleDateFormat(FORMAT);

    System.out.println("format: " + FORMAT);
    System.out.println("Current Date" + ": " + ft.format(dNow));
  }
}
