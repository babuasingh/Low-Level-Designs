package Chess_Game.Entities;

import Chess_Game.Entities.gamePieces.Piece;
import Chess_Game.enums.Color;

public class Cell {
    private Color color;
    private Piece piece;
    private Boolean isVacant;
    private int row;
    private int col;

    public Cell(int row, int col, Color color) {
        this.row = row;
        this.col = col;
        this.color = color;
        isVacant=true;
    }

    public Color getColor() {
        return color;
    }

    public Piece getPiece() {
        return piece;
    }

    public Boolean getVacant() {
        return isVacant;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public void setVacant(Boolean vacant) {
        isVacant = vacant;
    }
}
