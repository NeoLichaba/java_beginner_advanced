/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccer;

import java.util.StringTokenizer;
import utility.PlayerDatabase;
import java.util.ArrayList;


/**
 *
 * @author Administrator
 */
public class League {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        League theLeague = new League();

        Team[] theTeams = theLeague.createTeams("The Robins,The Crows,The Swallows", 5);
        Game[] theGames = theLeague.createGames(theTeams);

        for (Game currGame: theGames){
            currGame.playGame();
            System.out.println(currGame.getDescription());
        }
        
        theLeague.showBestTeam(theTeams);

    }

    public Team[] createTeams(String teamNames, int teamSize) {
        
        PlayerDatabase playerDB = new PlayerDatabase();
       
        StringTokenizer teamNameTokens = new StringTokenizer(teamNames, ",");
        
        Team[] theTeams = new Team[teamNameTokens.countTokens()];
        
        for (int i=0; i< theTeams.length; i++){
            theTeams[i] = new Team(teamNameTokens.nextToken(), playerDB.getTeam(teamSize));
        }
        return theTeams;
    }

    public Game[] createGames(Team[] theTeams) {
        ArrayList <Game> theGames = new ArrayList();
        for (Team homeTeam: theTeams) {
            for (Team awayTeam: theTeams){
                if (homeTeam != awayTeam){
                    theGames.add(new Game(homeTeam,awayTeam));
                }
            }
        }
        return (Game[]) theGames.toArray(new Game[1]);
        /* Game theGame = new Game(theTeams[0], theTeams[1]);
        Game theGame2 = new Game(theTeams[1], theTeams[0]);
        Game theGame3 = new Game(theTeams[0], theTeams[1]);
        Game theGame4 = new Game(theTeams[1], theTeams[0]);
        Game[] theGames = {theGame, theGame2, theGame3, theGame4};*/
        
    }
    
    public void showBestTeam(Team[] theTeams) {
        Team currBestTeam = theTeams[0];  
        System.out.println("\nTeam Points");       
           
        for (Team currTeam: theTeams){
            System.out.println(currTeam.getTeamName() + " : " + currTeam.getPointsTotal() + " : "
                     + currTeam.getGoalsTotal());
            currBestTeam = currTeam.getPointsTotal() > currBestTeam.getPointsTotal()?currTeam:currBestTeam;
            if (currTeam.getPointsTotal() > currBestTeam.getPointsTotal()){
                currBestTeam = currTeam;
            } else if (currTeam.getPointsTotal() == currBestTeam.getPointsTotal()){
                if (currTeam.getGoalsTotal() > currBestTeam.getGoalsTotal()){
                currBestTeam = currTeam;
                }
            }
        }
        
        System.out.println("Winner of the League is " + currBestTeam.getTeamName());
        
    }

}
