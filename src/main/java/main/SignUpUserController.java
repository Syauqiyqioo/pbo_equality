package main;

import java.io.IOException;
import javafx.fxml.FXML;
//import javafx.scene.input.MouseEvent;
import main.DAO.UserDAO;
import main.java.User;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class SignUpUserController {

    @FXML
    private TextField gender;

    @FXML
    private TextField nama;

    @FXML
    private TextField password;

    @FXML
    private TextField usia;

    @FXML
    void home(MouseEvent event) {
        App.setRoot("primary");
    }
    @FXML
    void pindahHome(MouseEvent event)  {
        int tUser = 0;
        User[] seluruhUser = new User[100];
        seluruhUser[tUser] = new User();
        seluruhUser[tUser].setNama(nama.getText());
        seluruhUser[tUser].setPassword(password.getText());
        seluruhUser[tUser].setGender(gender.getText());
        seluruhUser[tUser].setUsia(usia.getText());
        UserDAO dao=new UserDAO();
        dao.save(seluruhUser[tUser]);
        App.setRoot("primary");
    }

}
