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
import sample.OpenScene;

public class ControllerForMain extends OpenScene {

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




}

