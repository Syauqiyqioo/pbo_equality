package main;

import java.io.IOException;
import javafx.fxml.FXML;
//import javafx.scene.input.MouseEvent;
import main.DAO.UserDAO;
import main.java.User;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginController {

    @FXML
    private TextField nama;

    @FXML
    private TextField password;
     @FXML
    void home(MouseEvent event) throws IOException {
        App.setRoot("primary");
    }
    @FXML
    void pindahMenu(MouseEvent event)throws IOException {
        if(nama.getText().equals("admin")&&password.getText().equals("admin")){
            App.setRoot("menuAdmin");
        }
        else{
           int tUser = 0;
        User[] seluruhUser = new User[100];
        seluruhUser[tUser] = new User();
        seluruhUser[tUser].setNama(nama.getText());
        seluruhUser[tUser].setPassword(password.getText());
        //seluruhUser[tUser].setLogin(false);
        UserDAO dao=new UserDAO();
        User u = dao.get("seluruhUser[tUser].getNama()","seluruhUser[tUser].getPassword()");
        if(u == null){
            App.setRoot("menuUser");
        }
        else{
            System.out.print("data tidak ditemukan");
        } 
        }
        
    }

}
