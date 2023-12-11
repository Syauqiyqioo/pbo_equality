package main;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class LoginCoachController {
    @FXML
    void home(MouseEvent event)throws IOException{
        App.setRoot("primary");
    }
    
    @FXML
    void pindahMenuCoach(MouseEvent event) throws IOException{
        App.setRoot("menuCoach");
    }

}
