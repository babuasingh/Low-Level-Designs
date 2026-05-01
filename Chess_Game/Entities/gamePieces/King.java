package Chess_Game.Entities.gamePieces;

import Chess_Game.enums.Color;

public class King extends Piece {

    public King(Color color){
        super(color, "king");
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY) {
        return false;
    }
}
