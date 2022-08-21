/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import utility.GameUtils;

/**
 *
 * @author Administrator
 */
public class Game {

    private Team homeTeam;
    private Team awayTeam;
    private Goal[] goals;
    private LocalDateTime theDateTime;

    public Game(Team homeTeam, Team awayTeam, LocalDateTime theDateTime) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.theDateTime = theDateTime;
    }

    /*public void playGame(int maxGoals) {
        int numberOfGoals = (int) (Math.random() * maxGoals + 1);
        Goal[] theGoals = new Goal[numberOfGoals];
        this.setGoals(theGoals);
        GameUtils.addGameGoals(this);
    }*/

    public void playGame() {
        ArrayList<Goal> eventList = new ArrayList();
        Goal currEvent;
        for (int i = 1; i <= 90; i++) {

            if (Math.random() > 0.95) {
//                System.out.println(i);
                //New goal created

                currEvent = new Goal();
                currEvent.setTheTeam(Math.random() > 0.5 ? homeTeam : awayTeam);

                //Player for goal created
                currEvent.setThePlayer(currEvent.getTheTeam().
                        getPlayerArray()[(int) (Math.random() * currEvent.getTheTeam().getPlayerArray().length)]);
                currEvent.setTheTime(i);
                eventList.add(currEvent);
            }
            this.goals = new Goal[eventList.size()];
            eventList.toArray(goals);
        }

    }

    public String getDescription() {

        int homeTeamGoals = 0;
        int awayTeamGoals = 0;
        StringBuilder returnString = new StringBuilder();

        returnString.append(this.getHomeTeam().getTeamName() + " vs. "
                + this.getAwayTeam().getTeamName() + "\n"
                + "Date: " + this.getTheDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE) + "\n");

        for (Goal currGoal : this.getGoals()) {

            if (currGoal.getTheTeam() == homeTeam) {
                homeTeamGoals++;
                homeTeam.incGoalsTotal(1);
            } else {
                awayTeamGoals++;
                awayTeam.incGoalsTotal(1);
            }

            returnString.append("Goal scored after "
                    + currGoal.getTheTime() + " mins by "
                    + currGoal.getThePlayer().getPlayerName() + " of "
                    + currGoal.getTheTeam().getTeamName()
                    + "\n");
        }

        if (homeTeamGoals == awayTeamGoals) {
            returnString.append("It's a draw!");
            this.homeTeam.incPointsTotal(1);
            this.awayTeam.incPointsTotal(1);
        } else if (homeTeamGoals > awayTeamGoals) {
            returnString.append(homeTeam.getTeamName() + " win");
            this.homeTeam.incPointsTotal(1);
        } else {
            returnString.append(awayTeam.getTeamName() + " win");
            this.awayTeam.incPointsTotal(1);
        }
        returnString.append(" (" + homeTeamGoals + " - " + awayTeamGoals + ") \n");

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

    /**
     * @return the localDateTime
     */
    public LocalDateTime getLocalDateTime() {
        return getTheDateTime();
    }

    /**
     * @param theDateTime the localDateTime to set
     */
    public void setLocalDateTime(LocalDateTime theDateTime) {
        this.setTheDateTime(theDateTime);
    }

    /**
     * @return the theDateTime
     */
    public LocalDateTime getTheDateTime() {
        return theDateTime;
    }

    /**
     * @param theDateTime the theDateTime to set
     */
    public void setTheDateTime(LocalDateTime theDateTime) {
        this.theDateTime = theDateTime;
    }

}
