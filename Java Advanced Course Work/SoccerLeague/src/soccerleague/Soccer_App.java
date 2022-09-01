package soccerleague;

/* Program demonstrates a Java application that calculates the scoreboard for a soccer league
 * Input is to be from a text file
 * Data structures are used to reflect the final scoreboard
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Soccer_App {

    public static void main(String[] args) {

        File soccerLeague = new File("SoccerLeague.txt");                           //Pass the path to the file as a parameter; 
        Scanner sc = null;                                                          //Made use of the Scanner class to read the file into the program
        String match, team1, team2;
        int score1, score2;
        String[] sides, l1, l2;                                                     //variables declared as Strings within an array
        int leagueTotal = 0;                                                        //leagueTotal declared and initialised

        //Map<String, Integer> scoreboard = new TreeMap<String, Integer>();
        try {                                                                       
            sc = new Scanner(soccerLeague);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        HashMap<String, Integer> scoreboard = new HashMap<>();

        while (sc.hasNextLine()) {
            match = sc.nextLine();                                                      //reads match details
            sides = match.split(",");                                                   //splits the details of the match delimited by a comma

            l1 = sides[0].split(" ");                                                   //sides variable further split at index 0           
            team1 = l1[0];                                                       
            score1 = Integer.parseInt(l1[1]);                                           //Integer wrapper class and parseInt used, converting String to Integer
            l2 = sides[1].split(" ");
            team2 = l2[0];
            score2 = Integer.parseInt(l2[1]);

            if (score1 > score2) {                                                          //if statement used, allocating scores depending on game outcome
                                                                                            //object keys and values are put into a HashMap
                scoreboard.put(team1, scoreboard.getOrDefault(team1, leagueTotal) + 3);     //getOrDefault() method used to get mapped value 
                scoreboard.put(team2, scoreboard.getOrDefault(team2, leagueTotal) + 0);
            } else if (score1 < score2) {
                scoreboard.put(team2, scoreboard.getOrDefault(team2, leagueTotal) + 3);     //assign 3 to team2 if the score is 
            } else {
                scoreboard.put(team1, scoreboard.getOrDefault(team1, leagueTotal) + 1);     //if the outcome of a match is a draw, assign a point to each team
                scoreboard.put(team2, scoreboard.getOrDefault(team2, leagueTotal) + 1);
            }

        }

        LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();            //Sort HashMap into descending order          

        scoreboard.entrySet()                                                               //entrySet() method used to print all mappings of LinkedHashMap                                          
                .stream()
                //.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))              //sorted() method used taking on Comparator as a parameter, combined with comparing method
                .sorted(Map.Entry.comparingByKey())
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));       //reverseSortedMap() method used, sorting by object key and value of the key
        System.out.println("Scoreboard: " + scoreboard);                                    //mapped scoreboard printed
        System.out.println("Ranking: " + reverseSortedMap);                                 
        
    }
}   
        
        

        /* if (!scoreboard.containsKey(team1)) {                               // if the team already exists
                scoreboard.put(team1, 0);                                       // Team's first match - so  league score
            }

            if (!scoreboard.containsKey(team2)) ;
            { 
                scoreboard.put(team2, 0);                                       // Team's first match - so  league score
            }

            // update the scoreboard
            if (score1 > score2) {
                scoreboard.put(team1, scoreboard.get(team1) + 3);
            } else if ((score2 > score1)) {
                scoreboard.put(team2, scoreboard.get(team2) + 3);
            } else { // a draw
                scoreboard.put(team1, scoreboard.get(team1) + 1);
                scoreboard.put(team2, scoreboard.get(team2) + 1);
            }
        }
        
    }
}*/
