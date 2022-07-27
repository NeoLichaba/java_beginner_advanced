package com.example.lambda;

import java.util.List;
import java.util.function.Predicate;

/**
 * 
 * Reuse lambda expressions
 */
public class RoboMailTest01 {
  
  public static void main(String[] args) {
    
    List<Employee> pl = Employee.createShortList();
    RoboMail01 robo = new RoboMail01();

    Predicate<Employee> salesExecutives = 
      p -> p.getRole().equals(Role.EXECUTIVE) 
        && p.getDept().equals("Sales");
    
    Predicate<Employee> salesEmployeesOver50 = 
      p -> p.getAge() >= 50 && p.getDept().equals("Sales");
    
    System.out.println("\n==== RoboMail 01");
   
//    robo.mail(pl, salesExecutives); Convert to stream and forEach
    pl.stream()
            .filter(salesExecutives)
            .forEach(p -> robo.roboMail(p));   
    
     System.out.println("\n=== Sales Execs ===");
//      robo.text(pl, salesExecutives); Convert to stream and forEach
      pl.stream()
            .filter(salesExecutives)
            .forEach(p -> robo.roboText(p));  
    
    System.out.println("\n=== All Sales ===");
//    robo.mail(pl, salesEmployeesOver50); Convert to stream and forEach
     pl.stream()
            .filter(salesEmployeesOver50)
            .forEach(p -> robo.roboMail(p));

//    robo.text(pl, salesEmployeesOver50); Convert to stream and forEach 
    
    pl.stream()
            .filter(salesEmployeesOver50)
            .forEach(p -> robo.roboText(p));
  }
}
