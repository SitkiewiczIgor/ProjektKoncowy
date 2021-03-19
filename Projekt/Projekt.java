package com.Projekt;
import java.util.Scanner;

public class Projekt {
    public static void main(String[] args) {
        System.out.println("Witaj, podaj rozmiar planszy");
        int dim = new Scanner(System.in).nextInt();
        char[][] board = new char[dim][dim];
        int ruch1 = 0;
        char ruch2 = 'X';

        while(ruch1<dim*dim) {
            printBoard(board);
            boolean moveWasCorrect = performMove(board, ruch2);
            if (moveWasCorrect) {
                ruch1++;
                ruch2 = ruch2 == 'X' ? 'O' : 'X';
            } else {
                System.out.println("Zly ruch, spróbuj ponownie");
            }
            if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
                System.out.println("Wygrana X");
                printBoard(board);
                break;
            }
            if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
                System.out.println("Wygrana X");
                printBoard(board);
                break;
            }
            if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') {
                System.out.println("Wygrana X");
                printBoard(board);
                break;
            }
            if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
                System.out.println("Wygrana X");
                printBoard(board);
                break;
            }
            if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
                System.out.println("Wygrana X");
                printBoard(board);
                break;
            }
            if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') {
                System.out.println("Wygrana X");
                printBoard(board);
                break;
            }
            if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
                System.out.println("Wygrana X");
                printBoard(board);
                break;
            }
            if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
                System.out.println("Wygrana X");
                printBoard(board);
                break;
            }
            else if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
                System.out.println("Wygrana O");
                printBoard(board);
                break;
            }
            else if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') {
                System.out.println("Wygrana O");
                printBoard(board);
                break;
            }
            else if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') {
                System.out.println("Wygrana O");
                printBoard(board);
                break;
            }
            else if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') {
                System.out.println("Wygrana O");
                printBoard(board);
                break;
            }
            else if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') {
                System.out.println("Wygrana O");
                printBoard(board);
                break;
            }
            else if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') {
                System.out.println("Wygrana O");
                printBoard(board);
                break;
            }
            else if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') {
                System.out.println("Wygrana O");
                printBoard(board);
                break;
            }
            else if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
                System.out.println("Wygrana O");
                printBoard(board);
                break;
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


