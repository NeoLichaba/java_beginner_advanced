/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccer;

/**
 *
 * @author User
 */
public class League {
    public static void main(String[] args) {
    
    Player player1 = new Player();
    Player player2 = new Player();
    Player player3 = new Player();
    
//Player array created with three Player objects    
    Player [] thePlayers = {player1, player2, player3};

//Set playerName attribute 
    player1.playerName = "George Eliot";
    player2.playerName = "Graham Greene";
    player3.playerName = "Geoffrey Chaucer";
    
    
//Team object declared

Team team1 = new Team ();

//Declare teamName attribute

team1.teamName = "The Greens";
team1.playerArray = thePlayers;

//player1.playerName = "Robert Service";

Team team2 = new Team();
team2.teamName = "The Reds";

team2.playerArray = new Player [3];

team2.playerArray[0] = new Player();
team2.playerArray[0].playerName = "Robert Service";

team2.playerArray[1] = new Player();
team2.playerArray[1].playerName = "Robbie Burns";

team2.playerArray[2] = new Player();
team2.playerArray[2].playerName = "Rafael Sabatini";

//Print out players in the team
for (Player thePlayer: team1.playerArray) {
System.out.println("The team members are:" + thePlayer.playerName);
}

for (Player thePlayer: team2.playerArray) {
System.out.println("The team members are:" + thePlayer.playerName);
}
    }
    
    
}
