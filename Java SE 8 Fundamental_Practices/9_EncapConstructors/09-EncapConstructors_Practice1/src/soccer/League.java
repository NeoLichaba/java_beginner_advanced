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
        
        League theLeague = new League();

        Team[] theTeams = theLeague.createTeams();
        Game[] theGames = theLeague.createGames(theTeams);

        Game currGame = theGames[0];
        
        currGame.playGame();
        
        System.out.println(currGame.getDescription());

    }

    public Team[] createTeams() {

        Player player1 = new Player();
        player1.setPlayerName("George Eliot");
        Player player2 = new Player();
        player2.setPlayerName("Graham Greene");
        Player player3 = new Player();
        player3.setPlayerName("Geoffrey Chaucer");
        Player[] thePlayers = {player1, player2, player3};

        Team team1 = new Team();
        team1.setTeamName("The Greens");
        team1.playerArray = thePlayers;

        // Create team2
        Team team2 = new Team();
        team2.setTeamName("The Reds");
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].setPlayerName("Robert Service");
        team2.playerArray[1] = new Player();
        team2.playerArray[1].setPlayerName("Robbie Burns");
        team2.playerArray[2] = new Player();
        team2.playerArray[2].setPlayerName("Rafael Sabatini");

        Team[] theTeams = {team1, team2};
        return theTeams;
    }

    public Game[] createGames(Team[] theTeams) {
        Game theGame = new Game();
        theGame.setHomeTeam(theTeams[0]);
        theGame.awayTeam = theTeams[1];
        Game[] theGames = {theGame};
        return theGames;
    }

}
