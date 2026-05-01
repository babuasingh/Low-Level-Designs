package Chess_Game.Entities.gamePieces;

import Chess_Game.enums.Color;

public class Bishop extends Piece {
    public Bishop(Color color){
        super(color, "bishop");
    }
    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY) {
        return false;
    }
}
