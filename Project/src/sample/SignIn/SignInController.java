package sample.SignIn;

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
import sample.SignUp.SignUpController;

public class SignInController extends OpenScene {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Enter;

    @FXML
    private TextField mail;

    @FXML
    private PasswordField Password;

    @FXML
    void ClickEn(ActionEvent event) {
        //Enter.getScene().getWindow().hide();
        Enter.getScene().getWindow().hide();
        OpenNewScene("/sample/MainMenu/MainMenu.fxml");


    }


}
