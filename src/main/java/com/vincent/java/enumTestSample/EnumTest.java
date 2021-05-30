package com.vincent.java.enumTestSample;

import com.vincent.java.enumTest.Day;

public class EnumTest {
  Day day;
  
  public EnumTest(Day day) {
      this.day = day;
  }
  
  public void tellItLikeItIs() {
      switch (day) {
          case MONDAY:
              System.out.println("Mondays are bad.");
              break;
                  
          case FRIDAY:
              System.out.println("Fridays are better.");
              break;
                       
          case SATURDAY: case SUNDAY:
              System.out.println("Weekends are best.");
              break;
                      
          default:
              System.out.println("Midweek days are so-so.");
              break;
      }
  }
  
  public static void main(String[] args) {
      // EnumTest firstDay = new EnumTest(Day.MONDAY);
      // firstDay.tellItLikeItIs();
      // EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
      // thirdDay.tellItLikeItIs();
      // EnumTest fifthDay = new EnumTest(Day.FRIDAY);
      // fifthDay.tellItLikeItIs();
      // EnumTest sixthDay = new EnumTest(Day.SATURDAY);
      // sixthDay.tellItLikeItIs();
      // EnumTest seventhDay = new EnumTest(Day.SUNDAY);
      // seventhDay.tellItLikeItIs();

    //-----------start-----------
    System.out.println("===name===");
    
    for(Day day: Day.values()) {
      System.out.println(day.name());
    }
    //------------end------------
    
    //-----------start-----------
    System.out.println("===toString===");
    for(Day day: Day.values()) {
      System.out.println(day.toString());
    }
    //------------end------------
    
    //-----------start-----------
    System.out.println("===ordinal===");
    for(Day day: Day.values()) {
      System.out.println(day.toString() + "=" + day.ordinal());
    }
    //------------end------------
  }
}
