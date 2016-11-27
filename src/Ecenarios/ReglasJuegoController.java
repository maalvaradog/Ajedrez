/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecenarios;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author milto
 */
public class ReglasJuegoController implements Initializable {

    @FXML
    private Button btVolver;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btVolver(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Stage stage = new Stage();
        stage.getIcons().addAll(new  Image(Menu.class.getResourceAsStream("icon_ajedrez.png")));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("!!Menu - Ajedrez!!");
        stage.show();

        
    }
    
}
