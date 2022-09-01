
package soccerleague;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



/*
 *
 * 
 */
public class SoccerApp {
    
    public static void main(String[] args) {
        
    try {
      File soccerLeague = new File("SoccerLeague.txt");
      Scanner league = new Scanner(soccerLeague);                               //Scanner class used in order to read the contents of the text file
      while (league.hasNextLine()) {
        String data = league.nextLine();
        System.out.println(data);
      }
      league.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
    class Leaderboard {
        Map<String, Integer> map;
        TreeMap <String, Integer> sorted;
        
        public Leaderboard() {
            map = new HashMap<>();
            sorted = new TreeMap<>(Collections.reverseOrder());
        }
    }

   
}

