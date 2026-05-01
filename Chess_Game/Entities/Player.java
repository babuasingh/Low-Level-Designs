package Chess_Game.Entities;

import Chess_Game.enums.Color;

public class Player {
    private String name;
    private Color color;
    private Boolean isTurn;

    public Player(String name, Color color) {
        this.name = name;
        this.color = color;
        isTurn=false;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public void changeTurn(){
        isTurn = !isTurn;
    }

    public Boolean getIsTurn(){
        return isTurn;
    }
}
