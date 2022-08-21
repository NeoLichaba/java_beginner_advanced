/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccerleague;

/**
 *
 * @author User
 */
public class LeagueStandings extends SoccerLeague {
    
    private int wins;
    private int losses;
    private int draw;
    private int points;
    private int matchesPlayed;
    

    /**
     * @return the wins
     */
    public int getWins() {
        return wins;
    }

    /**
     * @param wins the wins to set
     */
    public void setWins(int wins) {
        this.wins = wins;
    }

    /**
     * @return the losses
     */
    public int getLosses() {
        return losses;
    }

    /**
     * @param losses the losses to set
     */
    public void setLosses(int losses) {
        this.losses = losses;
    }

    /**
     * @return the draw
     */
    public int getDraw() {
        return draw;
    }

    /**
     * @param draw the draw to set
     */
    public void setDraw(int draw) {
        this.draw = draw;
    }

    /**
     * @return the points
     */
    public int getPoints() {
        return points;
    }

    /**
     * @param points the points to set
     */
    public void setPoints(int points) {
        this.points = points;
    }

    /**
     * @return the matchesPlayed
     */
    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    /**
     * @param matchesPlayed the matchesPlayed to set
     */
    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }
    

    
}
