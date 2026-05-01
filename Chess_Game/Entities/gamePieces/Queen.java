package Chess_Game.Entities.gamePieces;

import Chess_Game.enums.Color;

public class Queen extends Piece {

    public Queen(Color color){
        super(color, "queen");
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY) {
        return false;
    }
}
