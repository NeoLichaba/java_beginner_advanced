package Chap02_UsingArrays;

import java.util.Scanner;

/**
 *
 * @author
 */
public class P410_KnightMoves {

    static Scanner sc = new Scanner(System.in);
    // the following static array represents the 8
    // possible moves a knight can make
    // this is an 8 x 2 array
    static int[][] moves = {{-2, +1}, //→10                                     2D array moves declared and initialised with a combination of moves; possible values stores x and y
    {-1, +2},                                                                   //8 possible moves available - 8 rows, 2 columns
    {+1, +2},
    {+2, +1},
    {+2, -1},
    {+1, -2},
    {-1, -2},
    {-2, -1}};

    public static void main(String[] args) {
        System.out.println("Welcome to the "
                + "Knight Move calculator.\n");
        do {                                                                    //do - while loop, will keep looping until the user enters N
            showKnightMoves(); //→26                                            //Starter position - call on the showKnightMoves method
        } while (getYorN("Do it again?"));                                      //getYorN method is called
    }

    public static void showKnightMoves() //→31                                  //showKnightMoves() method begins
    {
        // The first dimension is the file (a, b, c, etc.)
        // The second dimension is the rank (1, 2, 3, etc.)
        // Thus, board[3][4] is square d5.                                      remember your array starts at 0
        // A value of 0 means the square is empty
        // 1 means the knight is in the square
        // 2 means the knight could move to the square
        int[][] board = new int[8][8]; //→39                                    //board array = 2D array - 8 rows for ranks, 8 columns for files
                                                                                //holds int values
        String kSquare; // the knight's position as a square
        Pos kPos; // the knight's position as a Pos
        // get the knight's initial position
        do //→45                                                                
        {
            System.out.print("Enter knight's position: ");                      //prompts user for a position
            kSquare = sc.nextLine();                                            //position is stored in variable kSquare
            kPos = convertSquareToPos(kSquare);                                 //kPos contains method that convert's user entry into a Pos object (i.e. x,y)
        } while (kPos == null);                                                 //returns null if incorrect value entered
        board[kPos.x][kPos.y] = 1; //→52                                        //position entered set to 1 - indicates position of the knight
        System.out.println("\nThe knight is at square "
                + convertPosToSquare(kPos));
        System.out.println(
                "From here the knight can move to:");
        for (int move = 0; move < moves.length; move++) //→59                   //for loop used to determine all possible moves
        {
            int x, y;                                                           //x and y are declared to be type ints
            x = moves[move][0]; // the x for this move
            y = moves[move][1]; // the y for this move
            Pos p = calculateNewPos(kPos, x, y);                                //calculateNewPos method accepts 3 parameters - board position, x and y values which indicate where the knight might be moved
            if (p != null) {                                                    //if p is valid, returns position move leads to
                System.out.println(convertPosToSquare(p));                      //prints out new position - convertPosToSquare convert Pos object into string
                board[p.x][p.y] = 2;                                            //position knight moves to given value 2
            }
        }
        printBoard(board); //→72                                                //board array printed
    }
    // this method converts squares such as a1 or d5 to
    // x, y coordinates such as [0][0] or [3][4]

    public static Pos convertSquareToPos(String square) //→78
    {
        int x = -1;
        int y = -1;
        char rank, file;
        file = square.charAt(0);                                                //chatAt method used to specific value at specified position
        if (file == 'a') {
            x = 0;
        }
        if (file == 'b') {
            x = 1;
        }
        if (file == 'c') {
            x = 2;
        }
        if (file == 'd') {
            x = 3;
        }
        if (file == 'e') {
            x = 4;
        }
        if (file == 'f') {
            x = 5;
        }
        if (file == 'g') {
            x = 6;
        }
        if (file == 'h') {
            x = 7;
        }
        rank = square.charAt(1);
        if (rank == '1') {
            y = 0;
        }
        if (rank == '2') {
            y = 1;
        }
        if (rank == '3') {
            y = 2;
        }
        if (rank == '4') {
            y = 3;
        }
        if (rank == '5') {
            y = 4;
        }
        if (rank == '6') {
            y = 5;
        }
        if (rank == '7') {
            y = 6;
        }
        if (rank == '8') {
            y = 7;
        }
        if (x == -1 || y == -1) {                                               //if user enters an incorrect value, null returned
            return null;
        } else {
            return new Pos(x, y);                                               //otherwise new position returned
        }
    }
    // this method converts x, y coordinates such as
    // [0][0] or [3][4] to squares such as a1 or d5.

    public static String convertPosToSquare(Pos p) //→114                       accepts Pos argument and returns a string that corresponds to the position
    {
        String file = "";
        if (p.x == 0) {
            file = "a";
        }
        if (p.x == 1) {
            file = "b";
        }
        if (p.x == 2) {
            file = "c";
        }
        if (p.x == 3) {
            file = "d";
        }
        if (p.x == 4) {
            file = "e";
        }
        if (p.x == 5) {
            file = "f";
        }
        if (p.x == 6) {
            file = "g";
        }
        if (p.x == 7) {
            file = "h";
        }
        return file + (p.y + 1);                                                //return x, y
                                                                                //chess rank numbers start with 1
    }
// this method calculates a new Pos given a
// starting Pos, an x move, and a y move
    // it returns null if the resulting move would
    // be off the board.

    public static Pos calculateNewPos(Pos p, int x, int y) //→134               
    {
        // rule out legal moves
        if (p.x + x < 0) {                                                      //takes the starting position, checks if x < 0 and y>0 and adds, if legal
                                                                                
            return null;
        }
        if (p.x + x > 7) {
            return null;
        }
        if (p.y + y < 0) {
            return null;
        }
        if (p.y + y > 7) {
            return null;
        }
// return new position
        return new Pos(p.x + x, p.y + y);                                       //returns new position
    }

    public static void printBoard(int[][] b) //→150                             //accepts b as a 2D array, type int
                                                                                //use nested loop to print the board
    {                                                                           
        for (int y = 7; y >= 0; y--) {                                          //outer loop prints each rank; indexed backwards
            for (int x = 0; x < 8; x++) {                                       //inner loop prints the squares
                if (b[x][y] == 1) {                                             //starting point                                      
                                                                                //if statement used to check value of the board array element
                    System.out.print(" X ");                                    //print X for starting point
                } else if (b[x][y] == 2) {                                      //if next possible move,
                    System.out.print(" ? ");                                    //print ?
                } else {
                    System.out.print(" - ");                                    //print -
                }
            }
            System.out.println();
        }
    }

    public static boolean getYorN(String prompt) //→167                         Takes in user input 
    {
        while (true) {
            String answer;
            System.out.print("\n" + prompt + " (Y or N) ");
            answer = sc.nextLine();
            if (answer.equalsIgnoreCase("Y")) {
                return true;
            } else if (answer.equalsIgnoreCase("N")) {
                return false;
            }
        }
    }
}
// this class represents x, y coordinates on the board

class Pos //→183                                                                Pos class - keeps track of board positions
{

    public int x;
    public int y;

    public Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
