package rummy;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class TileFXML {
    Tile tile;

    public TileFXML(Tile tile) {
        this.tile = tile;
    }

    public StackPane tileToPane(){
        StackPane pane = new StackPane();
        Text text = new Text();
        Rectangle rec = new Rectangle();
//        rec.setStroke(Color.rgb(224, 90, 184));
        rec.setHeight(90);
//        rec.setStyle("-fx-background-radius: 60;");
        rec.setArcHeight(10);
        rec.setArcWidth(10);
        rec.setWidth(70);
        rec.setFill(Color.rgb(224, 208, 184));
        text.setText(String.valueOf(tile.number));
        text.setFill(tile.color);
        text.setTextAlignment(TextAlignment.CENTER);
        text.setStyle("-fx-font: 50 arial;");
        pane.getChildren().add(rec);
        pane.getChildren().add(text);

        return pane;
    }
}
