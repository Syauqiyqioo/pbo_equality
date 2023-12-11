package main;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class MenuUserController {

    @FXML
    void LogOut(MouseEvent event) {
        App.setRoot("primary");
    }

}
