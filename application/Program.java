package chessSystem.application;

import java.util.Scanner;

import chessSystem.chess.ChessException;
import chessSystem.chess.ChessMatch;
import chessSystem.chess.ChessPiece;
import chessSystem.chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        ChessMatch chessMatch = new ChessMatch();
        while (true){
            try{
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            } catch (ChessException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            } catch (InputMismatchException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }
}
