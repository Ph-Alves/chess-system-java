package chessSystem.application;

import java.util.Scanner;

import chessSystem.boardgame.Board;
import chessSystem.boardgame.Position;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        Board board = new Board(8, 8);
        

        sc.close();
    }
}
