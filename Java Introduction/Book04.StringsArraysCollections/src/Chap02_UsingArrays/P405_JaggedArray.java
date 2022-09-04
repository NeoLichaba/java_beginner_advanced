/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chap02_UsingArrays;

/**
 *
 * @author User
 */
public class P405_JaggedArray {

    public static void main(String[] args) {
        String[][] teams
                = {{"Henry Blake", "Johnny Mulcahy"},
                {"Benjamin Pierce", "John McIntyre",
                    "Jonathan Tuttle"},
                {"Margaret Houlihan", "Frank Burns"},
                {"Max Klinger", "Radar O'Reilly",
                    "Igor Straminsky"}};

        /*for (int i = 0; i < teams.length; i++) {
            for (int j = 0; j < teams[i].length; j++) {
                System.out.println(teams[i][j]);
            }
            System.out.println();

        }*/

        for (String[] team : teams) {                                           //type of team variable is String[]
            for (String player : team) {                                        //accesses individual strings in each subarray
                System.out.println(player);
            }
            System.out.println();
        }
    }

}
