package rummy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Player> players;
    Board board;

    public Game(List<Player> players, Board board) {
        this.players = players;
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void setBoard(Board board){
        this.board = board;
    }

    public Board getBoard(){
        return board;
    }
}