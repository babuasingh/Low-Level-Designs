package Chess_Game.Entities;

import Chess_Game.Entities.gamePieces.Piece;
import Chess_Game.Exception.InValidMoveException;

public class Move {
    private Player player;
    private int srcX;
    private int srcY;
    private int destX;
    private int destY;

    public Move(Player player,int srcX, int srcY, int destX, int destY) {
        this.srcX = srcX;
        this.srcY = srcY;
        this.destX = destX;
        this.destY = destY;
    }

    public int getSrcX() {
        return srcX;
    }

    public int getSrcY() {
        return srcY;
    }

    public int getDestX() {
        return destX;
    }

    public int getDestY() {
        return destY;
    }

    public Player getPlayer() {
        return player;
    }

}
