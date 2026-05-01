package Chess_Game.Entities.gamePieces;

import Chess_Game.enums.Color;

public class Knight extends Piece {

    public Knight(Color color){
        super(color, "knight");
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY) {
        return false;
    }
}
