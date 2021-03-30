package sample.MainMenu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControllerForMain {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button MultiPlayer;

    @FXML
    private Button OnePlayer;

    @FXML
    void ClickOne(ActionEvent event) {
        OpenNewScene("/sample/Game/Game.fxml");
    }

    @FXML
    void ClickMult(ActionEvent event) {

        OpenNewScene("/sample/Game/Game.fxml");
    }

    private void OpenNewScene(String window){


        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(window));
        try {
            loader.load();
        }catch (Exception e){
            e.printStackTrace();
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();

    }

}

