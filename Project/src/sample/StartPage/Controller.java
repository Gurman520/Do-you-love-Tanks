package sample.StartPage;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.OpenScene;

public class Controller extends OpenScene {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button RegBtn;

    @FXML
    private Button EnterBtn;

    @FXML
    private TextField Email;

    @FXML
    private PasswordField Password;

    @FXML
    public void ClickEnter(ActionEvent actionEvent) {
        EnterBtn.getScene().getWindow().hide();
        OpenNewScene("/sample/MainMenu/MainMenu.fxml");
    }

    @FXML
    public void ClickReg(ActionEvent actionEvent) {
        RegBtn.getScene().getWindow().hide();
        OpenNewScene("/sample/SignUp/SignUp.fxml");
    }



}
