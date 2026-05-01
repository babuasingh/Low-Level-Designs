package Chess_Game.Entities.gamePieces;

import Chess_Game.enums.Color;

public abstract class Piece {
    protected Color color;
    protected String name;

    public Piece(Color color, String name) {
        this.color = color;
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    // individual logic for Valid Move Check .
    public abstract boolean isValidMove(int startX, int startY, int endX, int endY);
}
