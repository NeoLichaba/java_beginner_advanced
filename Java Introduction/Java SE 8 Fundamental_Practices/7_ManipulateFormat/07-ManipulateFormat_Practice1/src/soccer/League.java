/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccer;

/**
 *
 * @author Administrator
 */
public class League {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create team1      
        Player player1 = new Player();
        player1.playerName = "George Eliot";
        Player player2 = new Player();
        player2.playerName = "Graham Greene";
        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";
        Player[] thePlayers = {player1, player2, player3};

        Team team1 = new Team();
        team1.teamName = "The Greens";
        team1.playerArray = thePlayers;

        // Create team2
        Team team2 = new Team();
        team2.teamName = "The Reds";
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";

        Game currGame = new Game();
        currGame.homeTeam = team1;
        currGame.awayTeam = team2;
        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.playerArray[2];
        goal1.theTeam = currGame.homeTeam;
        goal1.theTime = 55;
        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;

        System.out.println("Goal scored after "
                + currGame.goals[0].theTime + " mins by "
                + currGame.goals[0].thePlayer.playerName + " of "
                + currGame.goals[0].theTeam.teamName);

        /* Practice 7-1. Add code for finding a player within team2 here */
        for (Player thePlayer : team2.playerArray) {
            System.out.println(thePlayer.playerName);
        }

        /* Practice 7-2. Find match for player with name Sab*/
//        for (Player thePlayer : team2.playerArray) {
//            if (thePlayer.playerName.matches(".*Sab.*")) {
//                System.out.println("Found " + thePlayer.playerName);
//
//                /* Return second element within the playerArray*/
//                System.out.println("Last mame is: "
//                        + thePlayer.playerName.split(" ")[1]);

        /*Display all players of team1*/
        StringBuilder familyNameFirst = new StringBuilder();

        for (Player thePlayer : team1.playerArray) {
            String name[] = thePlayer.playerName.split(" ");
            familyNameFirst.append(name[1]);
            familyNameFirst.append(", ");
            familyNameFirst.append(name[0]);

            System.out.println(familyNameFirst);
            
            familyNameFirst.delete(0, familyNameFirst.length());

        }

    }
}
