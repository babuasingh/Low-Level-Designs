package Chess_Game.Entities;

import Chess_Game.Entities.gamePieces.Piece;
import Chess_Game.Exception.InValidMoveException;

import java.util.List;

public class Board {
    private Cell[][] cells;

    public Board(Cell[][] cells) {
        this.cells = cells;
    }

    public boolean makeMove(Move move) {
        try {
            CheckisValidMove(move);
            Player player = move.getPlayer();

            int srcX = move.getSrcX();
            int srcY = move.getSrcY();
            int destX = move.getDestX();
            int destY = move.getDestY();

            Piece piece = cells[srcX][srcY].getPiece();

            cells[srcX][srcY].setPiece(null);
            cells[srcX][srcY].setVacant(true);

            cells[destX][destY].setPiece(piece);
            cells[destX][destY].setVacant(false);

            player.changeTurn();

            return true;
        } catch (RuntimeException e) {
            throw new InValidMoveException(e.getMessage());
        }
    }

    private void CheckisValidMove(Move move) {
        int srcX = move.getSrcX();
        int srcY = move.getSrcY();
        Player player = move.getPlayer();
        Piece piece = cells[srcX][srcY].getPiece();
        if(piece==null || player.getColor()!=piece.getColor()){
            throw new InValidMoveException("Invalid Move");
        }
        if(!player.getIsTurn()){
            throw new InValidMoveException("Wait for your turn");
        }
    }

}
