package Chess_Game.Entities.gamePieces;

import Chess_Game.enums.Color;

public class Pawn extends Piece {
    public Pawn(Color color){
        super(color, "pawn");
    }
    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY) {
        return false;
    }
}
