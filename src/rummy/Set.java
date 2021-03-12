package rummy;

import java.util.ArrayList;

public class Set {
    ArrayList<Tile> tiles;

    public Set(ArrayList<Tile> tiles) {
        this.tiles = tiles;
    }

    public ArrayList<Tile> getTiles() {
        return tiles;
    }

    public void setTiles(ArrayList<Tile> tiles) {
        this.tiles = tiles;
    }
}
