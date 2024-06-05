package chessSystem.application;

import java.util.Scanner;

import chessSystem.boardgame.Position;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        Position pos = new Position(3, 5);
        System.out.println(pos);

        sc.close();
    }
}
