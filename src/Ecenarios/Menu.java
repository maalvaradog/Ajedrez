/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecenarios;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author milto
 */
public class Menu extends Application {
    
//    private final Image Icon = new Image(getClass().getResourceAsStream("Imagenes|/icon_ajedrez.png"));
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Scene scene = new Scene(root);
        stage.getIcons().addAll(new  Image(Menu.class.getResourceAsStream("icon_ajedrez.png")));
        stage.getIcons().addAll(new  Image(CreditosController.class.getResourceAsStream("icon_ajedrez.png")));
        //stage.getIcons().addAll(new Image("icon_ajedrez.png"));
        stage.setTitle("!!Menu - Ajedrez!!");
        stage.setScene(scene);
        stage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
