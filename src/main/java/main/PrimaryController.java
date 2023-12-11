package main;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class PrimaryController {

    @FXML
    void pindah(MouseEvent event) {

    }

    @FXML
    void pindahLogIn(MouseEvent event)throws IOException {
        App.setRoot("loginMenu");
    }

    @FXML
    void pindahSignUp(MouseEvent event) throws IOException{
        App.setRoot("signUpUser");
    }

}
