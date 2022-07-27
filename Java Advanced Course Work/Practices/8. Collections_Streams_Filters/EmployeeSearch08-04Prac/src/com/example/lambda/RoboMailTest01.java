package com.example.lambda;

import java.util.List;

/**
 * 
 * Streams and filters
 */
public class RoboMailTest01 {
  
  public static void main(String[] args) {
    
    List<Employee> pl = Employee.createShortList();
    RoboMail01 robo = new RoboMail01();

   
    System.out.println("\n==== RoboMail 01");
    System.out.println("\n=== Male Eng Under 65");
    
    // Mail mail, Eng employees < 65
    pl.stream()
            .filter(p -> p.getAge()<65)
            .filter(p -> p.getDept().equals("Eng"))
            .filter(p -> p.getGender().equals(Gender.MALE))
            .forEach(p -> robo.roboMail(p));

  }
}
