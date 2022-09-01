package soccerleague;

/**
 *
 * @author User
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Soccer_App {

    public static void main(String[] args) {

        File soccerLeague = new File("SoccerLeague.txt");                       //Pass the path to the file as a parameter; 
        Scanner sc = null;                                                      //Made use of the Scanner class to read the file into the program
        String match, team1, team2;
        int score1, score2;
        String[] sides, l1, l2;                                                //variables declared as Strings within an array
        int leagueTotal = 0;

        //Map<String, Integer> scoreboard = new TreeMap<String, Integer>();
        try {
            sc = new Scanner(soccerLeague);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        HashMap<String, Integer> scoreboard = new HashMap<>();

        while (sc.hasNextLine()) {
            match = sc.nextLine();
            sides = match.split(",");

            l1 = sides[0].split(" ");
            team1 = l1[0];
            score1 = Integer.parseInt(l1[1]);
            l2 = sides[1].split(" ");
            team2 = l2[0];
            score2 = Integer.parseInt(l2[1]);

            if (score1 > score2) {
                scoreboard.put(team1, scoreboard.getOrDefault(team1, leagueTotal) + 3);
                scoreboard.put(team2, scoreboard.getOrDefault(team2, leagueTotal) + 0);
            } else if (score1 < score2) {
                scoreboard.put(team2, scoreboard.getOrDefault(team2, leagueTotal) + 3);
            } else {
                scoreboard.put(team1, scoreboard.getOrDefault(team1, leagueTotal) + 1);
                scoreboard.put(team2, scoreboard.getOrDefault(team2, leagueTotal) + 1);
            }

        }

        LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();

        scoreboard.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                //                .sorted(Map.Entry.comparingByKey())
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
        System.out.println("Scoreboard: " + scoreboard);
        System.out.println("Rankings: " + reverseSortedMap);
        
        
        
        

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
        }*/
        
    }
}
