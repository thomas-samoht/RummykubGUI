package rummy;

public class Player {
    String name;
    Plate plate;
    Turn turn;

    public Player(String name, Plate plate, Turn turn) {
        this.name = name;
        this.plate = plate;
        this.turn = turn;
    }

    public Player(String name){
        this.name = name;
    }

    public Turn getTurn() {
        return turn;
    }

    public void setTurn(Turn turn) {
        this.turn = turn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plate getPlate() {
        return plate;
    }

    public void setPlate(Plate plate) {
        this.plate = plate;
    }
}
