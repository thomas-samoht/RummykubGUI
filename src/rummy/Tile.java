package rummy;

// Tile class keeps track of the tiles, color and number on tile

import javafx.scene.paint.Color;

public class Tile {
    Color color;
    int number;

    public Tile(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}