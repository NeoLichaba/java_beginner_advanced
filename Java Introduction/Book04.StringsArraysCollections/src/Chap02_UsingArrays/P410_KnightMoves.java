package Chap02_UsingArrays;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class P410_KnightMoves {

    static Scanner sc = new Scanner(System.in);
    // the following static array represents the 8
    // possible moves a knight can make
    // this is an 8 x 2 array
    static int[][] moves = {{-2, +1}, //→10
    {-1, +2},
    {+1, +2},
    {+2, +1},
    {+2, -1},
    {+1, -2},
    {-1, -2},
    {-2, -1}};

    public static void main(String[] args) {
        System.out.println("Welcome to the "
                + "Knight Move calculator.\n");
        do {
            showKnightMoves(); //→26
        } while (getYorN("Do it again?"));
    }

    public static void showKnightMoves() //→31
    {
        // The first dimension is the file (a, b, c, etc.)
        // The second dimension is the rank (1, 2, 3, etc.)
        // Thus, board[3][4] is square d5.
        // A value of 0 means the square is empty
        // 1 means the knight is in the square
        // 2 means the knight could move to the square
        int[][] board = new int[8][8]; //→39
        String kSquare; // the knight's position as a square
        Pos kPos; // the knight's position as a Pos
        // get the knight's initial position
        do //→45
        {
            System.out.print("Enter knight's position: ");
            kSquare = sc.nextLine();
            kPos = convertSquareToPos(kSquare);
        } while (kPos == null);
        board[kPos.x][kPos.y] = 1; //→52
        System.out.println("\nThe knight is at square "
                + convertPosToSquare(kPos));
        System.out.println(
                "From here the knight can move to:");
        for (int move = 0; move < moves.length; move++) //→59
        {
            int x, y;
            x = moves[move][0]; // the x for this move
            y = moves[move][1]; // the y for this move
            Pos p = calculateNewPos(kPos, x, y);
            if (p != null) {
                System.out.println(convertPosToSquare(p));
                board[p.x][p.y] = 2;
            }
        }
        printBoard(board); //→72
    }
    // this method converts squares such as a1 or d5 to
    // x, y coordinates such as [0][0] or [3][4]

    public static Pos convertSquareToPos(String square) //→78
    {
        int x = -1;
        int y = -1;
        char rank, file;
        file = square.charAt(0);
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
        if (x == -1 || y == -1) {
            return null;
        } else {
            return new Pos(x, y);
        }
    }
    // this method converts x, y coordinates such as
    // [0][0] or [3][4] to squares such as a1 or d5.

    public static String convertPosToSquare(Pos p) //→114
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
        return file + (p.y + 1);
    }
// this method calculates a new Pos given a
// starting Pos, an x move, and a y move
    // it returns null if the resulting move would
    // be off the board.

    public static Pos calculateNewPos(Pos p, int x, int y) //→134
    {
        // rule out legal moves
        if (p.x + x < 0) {
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
        return new Pos(p.x + x, p.y + y);
    }

    public static void printBoard(int[][] b) //→150
    {
        for (int y = 7; y >= 0; y--) {
            for (int x = 0; x < 8; x++) {
                if (b[x][y] == 1) {
                    System.out.print(" X ");
                } else if (b[x][y] == 2) {
                    System.out.print(" ? ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }

    public static boolean getYorN(String prompt) //→167
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

class Pos //→183
{

    public int x;
    public int y;

    public Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
