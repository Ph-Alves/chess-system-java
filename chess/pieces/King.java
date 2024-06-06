package chessSystem.chess.pieces;

import chessSystem.boardgame.Board;
import chessSystem.chess.ChessPiece;
import chessSystem.chess.Color;

public class King extends ChessPiece{

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }
}
