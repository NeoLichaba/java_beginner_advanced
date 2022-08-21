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

    public Team homeTeam;
    public Team awayTeam;
    public Goal[] goals;

    /* Practice 8-2. Add playGame() method here */
    public void playGame() {
        /* Practice 8-2. Add code to initialize the array currGame.goals to a random size */
        int numberOfGoals = (int) (Math.random() * 7);
        Goal[] theGoals = new Goal[numberOfGoals];
        this.goals = theGoals;
        GameUtils.addGameGoals(this);
    }

    /* Practice 8-2. Add getDescription() method here */
    public String getDescription() {
        StringBuilder returnString = new StringBuilder();
        for (Goal currGoal : this.goals) {
            returnString.append("Goal scored after "
                    + currGoal.theTime + " mins by "
                    + currGoal.thePlayer.playerName
                    + " of " + currGoal.theTeam.teamName);
            return returnString.toString();

        }
        return null;
    }
}

