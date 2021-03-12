package rummy;

import java.util.Stack;

public class Board {
    Stack<Tile> pool;
    Stack<Set> sets;

    public Board(Stack<Set> sets, Stack<Tile> pool) {
        this.sets = sets;
        this.pool = pool;
    }

    public Board(Stack<Tile> pool){
        this.pool = pool;
    }

    public Stack<Tile> getPool() {
        return pool;
    }

    public void setPool(Stack<Tile> pool) {
        this.pool = pool;
    }

    public Stack<Set> getSets() {
        return sets;
    }

    public void setSets(Stack<Set> sets) {
        this.sets = sets;
    }
}
