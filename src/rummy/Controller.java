package rummy;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML
    Button exitBtn = new Button();

    @FXML
    Pane settingsPane1 = new Pane();

    @FXML
    VBox VBoxPlayerNames = new VBox();

    @FXML
    BorderPane borderPane = new BorderPane();

    @FXML
    ChoiceBox numberOfPlayersChoiceBox = new ChoiceBox();

    @FXML
    Pane settingsPane = new Pane();

    //This code runs automatically when the main scene is opened
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        borderPane.setVisible(true);
        settingsPane.setVisible(false);
        settingsPane1.setVisible(false);

    }


    @FXML
    void exitBtnPressed() throws IOException {
        Main.exit();
    }

    int numberOfPlayers;

    @FXML
    public void StartGameBtnPressed(ActionEvent actionEvent) throws IOException {
        borderPane.setVisible(false);
        settingsPane.setVisible(true);
        numberOfPlayersChoiceBox.getItems().add("2");
        numberOfPlayersChoiceBox.getItems().add("3");
        numberOfPlayersChoiceBox.getItems().add("4");
        numberOfPlayersChoiceBox.getItems().add("5");
        numberOfPlayersChoiceBox.setOnAction((event) -> {
            numberOfPlayers = Integer.parseInt((String) numberOfPlayersChoiceBox.getValue());
        });

    }

    @FXML
    public void continueBtnPressed(){
        settingsPane1.setVisible(true);
        settingsPane.setVisible(false);
        borderPane.setVisible(false);
        setPlayernames(numberOfPlayers);
    }

    @FXML
    public void setPlayernames(int numberOfPlayers){
        ObservableList<javafx.scene.Node> list =  VBoxPlayerNames.getChildren();
        for(int i=0;i<numberOfPlayers; i++)
        {
            TextField textfield = new TextField();
            textfield.setVisible(true);
            VBoxPlayerNames.setVisible(true);
            list.add(textfield);
            textfield.setPrefHeight(20);
            textfield.toFront();
        }
    }

    public void getPlayerNames(){
        ArrayList<String> names = new ArrayList<>();
        ObservableList<javafx.scene.Node> list =  VBoxPlayerNames.getChildren();
        for (Node node: list) {
            names.add(((TextField) node).getCharacters().toString());
        }
        BoardController.names = names;
    }

    @FXML
    public void continueBtnPressed2() throws IOException {
        getPlayerNames();
        settingsPane.setVisible(false);
        settingsPane1.setVisible(false);
        borderPane.setVisible(false);
        Main.setRoot("Board");
    }
}
