package main;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class LoginMenuController {
    @FXML
    void home(MouseEvent event) throws IOException {
        App.setRoot("primary");
        
    }

    @FXML
    void menuCoach(MouseEvent event) throws IOException {
        App.setRoot("loginCoach");
    }

    @FXML
    void menuUser(MouseEvent event) throws IOException {
        App.setRoot("login");
    }

}
