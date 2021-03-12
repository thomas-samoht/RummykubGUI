package rummy;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import java.net.URL;
import java.util.*;


public class BoardController implements Initializable {

    @FXML
    HBox HboxUp = new HBox();
    @FXML
    HBox HboxDown = new HBox();
    static ArrayList<String> names;

    //This code runs automatically when the main scene is opened
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Stage stage = Main.getStage();
        stage.setMinHeight(900);
        stage.setMinWidth(1280);
        stage.centerOnScreen();
        generateGame();
    }

    @FXML
    public void generateFXMLPlate(Player player){
        for (Tile tile: player.plate.getTiles()) {
            ObservableList<Node> list =  HboxUp.getChildren();
            Text text = new Text();
            text.setText(String.valueOf(tile.number));
            text.setFill(tile.color);
            text.setTextAlignment(TextAlignment.CENTER);
            text.setStyle("-fx-font: 40 arial;");
            list.add(text);
        }
    }

    public ArrayList<Player> generatePlayers(){
        ArrayList<Player> players = new ArrayList<>();
        for (String name: names) {
            Player player = new Player(name);
            players.add(player);
        }
        return players;
    }

    public Stack<Tile> generatePool(){
        Stack<Tile> pool = new Stack<>();
        ArrayList<Color> colors = new ArrayList<>(Arrays.asList(Color.RED, Color.BLACK, Color.ORANGE, Color.BLUE));
        for(int i = 0; i<2; i++){
            for(int number=0; number<13; number++){
                for (Color color: colors) {
                    Tile tile = new Tile(color, number);
                    pool.add(tile);
                }
            }
        }

        // Add jokers
        Tile tile = new Tile(Color.BLACK, 0);
        pool.add(tile);
        tile = new Tile(Color.RED, 0);
        pool.add(tile);
        Collections.shuffle(pool);
        return pool;
    }

    public Plate generatePlate(Stack<Tile> pool){
        ArrayList<Tile> tiles = new ArrayList<>();
        for(int i = 0; i<14;i++){
            tiles.add(pool.pop());
        }
        Plate plate = new Plate(tiles);
        return plate;
    }

    public Board generateBoard(){
        Board board = new Board(generatePool());
        return board;
    }
    public void generateGame(){
        Game game = new Game(generatePlayers(), generateBoard());
        for (Player player: game.players) {
            player.setPlate(generatePlate(game.board.pool));
        }
        generateFXMLPlate(game.players.get(0));
    }
}
