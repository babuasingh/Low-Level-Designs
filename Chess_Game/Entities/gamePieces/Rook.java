package Chess_Game.Entities.gamePieces;

import Chess_Game.enums.Color;

public class Rook extends Piece {
    public Rook(Color color){
        super(color, "rook");
    }
    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY) {
        return false;
    }
}
