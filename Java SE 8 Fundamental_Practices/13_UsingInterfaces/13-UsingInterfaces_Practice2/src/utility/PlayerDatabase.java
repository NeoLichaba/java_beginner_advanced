/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utility;

import java.util.*;
import soccer.Player;



/**
 *
 * @author Administrator
 */
public class PlayerDatabase {
    
    private ArrayList <Player> players;
    
    public PlayerDatabase(){
        StringTokenizer authorTokens = new StringTokenizer(authorList, ",");
        players = new ArrayList();
        while (authorTokens.hasMoreTokens()){
            players.add(new Player(authorTokens.nextToken()));
        }
    }
    
    public Player[] getTeam(int numberOfPlayers){
        Player[] teamPlayers = new Player[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++){
            int playerIndex = (int) (Math.random() * players.size());
            teamPlayers[i] = players.get(playerIndex);
            players.remove(playerIndex);
        }
        return teamPlayers;
        
    }
    
    
        
String authorList = 
"Agatha Christie," + 
"Alan Patton," +
"Alexander Solzhenitsyn," +
"Arthur Conan Doyle," +
"Anthony Trollope," +
"Baroness Orczy," +          
"Brendan Behan," +      
"Brian Moore," +
"Boris Pasternik," +
"Charles Dickens," +    
"Charlotte Bronte," +
"Dorothy Parker," +
"Emile Zola," +
"Frank O'Connor," +        
"Geoffrey Chaucer," +
"George Eliot," +
"G. K. Chesterton," +
"Graham Green," +
"Henry James," +
"James Joyce," +        
"J. M. Synge," + 
"J. R. Tolkien," +
"Jane Austin," +
"Leo Tolstoy," +
"Liam O'Flaherty," +
"Marcel Proust," +
"Mark Twain," +
"Oscar Wilde," +
"O. Henry," +
"Samuel Beckett," +
"Sean O'Casey," +
"William Shakespeare," +        
"William Makepeace Thackeray," +
"W. B. Yeats," +
"Wilkie Collins";
    
}
