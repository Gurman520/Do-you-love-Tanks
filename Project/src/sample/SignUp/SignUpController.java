package sample.SignUp;

import java.io.IOException;
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

public class SignUpController extends OpenScene {

    protected String Em;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Register;

    @FXML
    private TextField RegEmail;

    @FXML
    private PasswordField RegPassword;

    @FXML
    private TextField NikName;

    @FXML
    void ClickReg(ActionEvent event) {
        Register.getScene().getWindow().hide();

        Em = RegEmail.getText();
        OpenNewScene("/sample/SignIn/SignIn.fxml");

    }


}
