package rummy;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Scene scene;
    private static Stage stage;

    public static Stage getStage()
    {
        return stage;
    }


    @Override
    public void start(Stage stage) throws IOException{
        scene = new Scene(loadFXML("Rummikub"));
        stage.setTitle("Rummykub by Thomas Bosch");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        Main.stage = stage;
    }

    public static void exit(){
        Platform.exit();
        System.exit(0);
    }


    public static void main(String[] args) {
        launch(args);

    }

    //This sets the root to a new fxml file.
    public static void setRoot(String fxml) throws IOException
    {
        scene.setRoot(loadFXML(fxml));
    }

    //This class loads the fxml file to set the scene.
    public static Parent loadFXML(String fxml) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
}
