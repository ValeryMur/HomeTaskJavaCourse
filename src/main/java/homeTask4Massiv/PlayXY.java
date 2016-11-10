package homeTask4Massiv;

import java.util.Scanner;

/**
 * Created by ASUS PC on 09.10.2016.
 */
public class PlayXY {
    public static void main(String[] args) {
        int [][] board = new int[3][3];

        Scanner scn = new Scanner(System.in);
        int x, y;

        while (true) {

            x = getXcoordinate(scn);

            y = getYcoordinate(scn);

            setChest(x,y,board);

            setZero(generateRandom(), generateRandom(), board);

            printBoard(board);

            if (hasWinner(board)){
                System.exit(0);
            }

        }
    }

    private static int getXcoordinate(Scanner scn) {
        System.out.println("Введите координату х");
        return scn.nextInt() - 1;
    }

    private static int getYcoordinate(Scanner scn) {
        System.out.println("Введите координату y");
        return scn.nextInt() - 1;
    }

    private static int generateRandom() {
        return (int) Math.floor(Math.random() * 3);
    }

    private static void setZero(int x, int y, int[][] board) {
        if (board[x][y] == 1) {
            setZero(generateRandom(), generateRandom(), board);
            return;
        }
        board[x][y] = 7;
    }

    private static void setChest(int x, int y, int[][] board) {
        board[x][y] = 1;
    }

    private static void printBoard(int[][] board) {
        for (int x = 0; x <= 2; x++) {
            for (int y = 0; y <= 2; y++) {
                System.out.print("[" + board[x][y] + "]");
            }
            System.out.println();
        }
    }

    private static boolean hasWinner(int[][] board){
        if (board[0][0]+board[0][1]+board[0][2]==21){
            System.out.println("YOU LOSE!");
            return true;
        }
        if (board[0][0]+board[0][1]+board[0][2]==3){
            System.out.println("YOU WIN!");
            return true;
        }

        if (board[0][0]+board[1][0]+board[2][0]==21){
            System.out.println("YOU LOSE!");
            return true;
        }
        if (board[0][0]+board[1][0]+board[2][0]==3){
            System.out.println("YOU WIN!");
            return true;
        }

        if (board[0][0]+board[1][1]+board[2][2]==21){
            System.out.println("YOU LOSE!");
            return true;
        }
        if (board[0][0]+board[1][1]+board[2][2]==21){
            System.out.println("YOU WIN!");
            return true;
        }

        if (board[1][0]+board[1][1]+board[1][2]==21){
            System.out.println("YOU LOSE!");
            return true;
        }
        if (board[1][0]+board[1][1]+board[1][2]==3){
            System.out.println("YOU WIN!");
            return true;
        }

        if (board[2][0]+board[2][1]+board[2][2]==21){
            System.out.println("YOU LOSE!");
            return true;
        }
        if (board[2][0]+board[2][1]+board[2][2]==3){
            System.out.println("YOU WIN!");
            return true;
        }

        if (board[0][1]+board[1][1]+board[2][1]==21){
            System.out.println("YOU LOSE!");
            return true;
        }
        if (board[0][1]+board[1][1]+board[2][1]==3){
            System.out.println("YOU WIN!");
            return true;
        }

        if (board[0][2]+board[1][2]+board[2][2]==21){
            System.out.println("YOU LOSE!");
            return true;
        }
        if (board[0][2]+board[1][2]+board[2][2]==3){
            System.out.println("YOU WIN!");
            return true;
        }

        if (board[0][2]+board[1][1]+board[2][0]==21){
            System.out.println("YOU LOSE!");
            return true;
        }
        if (board[0][2]+board[1][1]+board[2][0]==3){
            System.out.println("YOU WIN!");
            return true;
        }

        return false;
    }

}
