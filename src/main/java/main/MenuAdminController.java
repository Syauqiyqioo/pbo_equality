package main;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class MenuAdminController {

    @FXML
    void home(MouseEvent event) {
        App.setRoot("primary");
    }

}
