package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("TEAM 14 Desktop App");
        primaryStage.setScene(new Scene(root));
        primaryStage.getIcons().add(new Image("https://image.flaticon.com/icons/png/512/4910/4910748.png"));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
