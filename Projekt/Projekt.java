package com.Projekt;
import java.util.Scanner;

public class Projekt {
    public static void main(String[] args) {
        System.out.println("Witaj, podaj rozmiar planszy");
        int dim = new Scanner(System.in).nextInt();
        char[][] board = new char[dim][dim];
        int movesCounter = 0;
        char activePlayer = 'X';

        while(movesCounter<dim*dim){
            printBoard(board);
            boolean moveWasCorrect = performMove(board,activePlayer);
            if(moveWasCorrect){
                movesCounter++;
                activePlayer = activePlayer == 'X' ? 'O' : 'X';
            } else {
                System.out.println("Zly ruch, spróbuj ponownie");
            }
        }
    }

    private static boolean performMove(char[][] board, char activePlayer) {
        System.out.println(activePlayer + ", podaj nr wiersza");
        int row = new Scanner(System.in).nextInt();
        System.out.println(activePlayer + ", podaj nr kolumny");
        int col = new Scanner(System.in).nextInt();

        if (board[row][col] == 0) {
            board[row][col] = activePlayer;
            return true;
        }
        else {
            return false;
        }
    }
    private static void printBoard(char[][] board) {
        int dim = board.length;
        System.out.print("\t");
        for (int i = 0; i < dim; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int row = 0; row < dim; row++) {
            System.out.print(row + ":\t");
            for (int column = 0; column < dim; column++) {
                System.out.print(board[row][column] + "\t");
            }
            System.out.println();
        }
    }
}


