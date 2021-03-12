package rummy;

import java.util.ArrayList;

public class Plate {
    ArrayList<Tile> tiles;

    public Plate(ArrayList<Tile> tiles) {
        this.tiles = tiles;
    }

    public ArrayList<Tile> getTiles() {
        return tiles;
    }

    public void setTiles(ArrayList<Tile> tiles) {
        this.tiles = tiles;
    }
}
