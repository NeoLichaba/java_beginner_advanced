/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccer;

import utility.GameUtils;

/**
 *
 * @author Administrator
 */
public class Game {

    private Team homeTeam;
    private Team awayTeam;
    private Goal[] goals;

    public Game(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public void playGame(int maxGoals) {
        int numberOfGoals = (int) (Math.random() * maxGoals + 1);
        Goal[] theGoals = new Goal[numberOfGoals];
        this.setGoals(theGoals);
        GameUtils.addGameGoals(this);
    }

    public void playGame() {
        playGame(6);
    }

    public String getDescription() {

        /* Practice 10-1. Declare two int variables here */
        int homeTeamGoals = 0;
        int awayTeamGoals = 0;

        StringBuilder returnString = new StringBuilder();

        returnString.append(homeTeam.getTeamName() + " vs." + awayTeam.getTeamName() + "\n");

        /* Practice 10-1. Add code to show teams that are playing */
        for (Goal currGoal : this.getGoals()) {

            /* Practice 10-1. Add if block here */
            if (currGoal.getTheTeam() == homeTeam) {
                homeTeamGoals++;
            } else {
                awayTeamGoals++;
            }
            returnString.append("Goal scored after "
                    + currGoal.getTheTime() + " mins by "
                    + currGoal.getThePlayer().getPlayerName() + " of "
                    + currGoal.getTheTeam().getTeamName()
                    + "\n");
        }

        /* Practice 10-1. Add if block here */
        if (homeTeamGoals == awayTeamGoals) {
            returnString.append("It's a draw!");
            homeTeam.incPointsTotal(1);
            awayTeam.incPointsTotal(1);
        } else if (homeTeamGoals > awayTeamGoals) {
            returnString.append(returnString.append(homeTeam.getTeamName() + " win"));
            homeTeam.incPointsTotal(2);
        } else {
            returnString.append(returnString.append(awayTeam.getTeamName() + " win"));
            awayTeam.incPointsTotal(2);
        }
        returnString.append(" (" + homeTeamGoals + " - "
                + awayTeamGoals + ") \n");
        
        return returnString.toString();
    }

    /**
     * @return the homeTeam
     */
    public Team getHomeTeam() {
        return homeTeam;
    }

    /**
     * @param homeTeam the homeTeam to set
     */
    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    /**
     * @return the awayTeam
     */
    public Team getAwayTeam() {
        return awayTeam;
    }

    /**
     * @param awayTeam the awayTeam to set
     */
    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    /**
     * @return the goals
     */
    public Goal[] getGoals() {
        return goals;
    }

    /**
     * @param goals the goals to set
     */
    public void setGoals(Goal[] goals) {
        this.goals = goals;
    }

}
