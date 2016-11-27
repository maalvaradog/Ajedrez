/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecenarios;

import Clases_Java.Conexion;
import Clases_Java.Jugador;
import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author milto
 */
public class DatosJugadoresController implements Initializable {

    @FXML
    private TextField tfNombreJ1;
    @FXML
    private TextField tfApellidoJ1;
    @FXML
    private TextField tfEdadJ1;
    @FXML
    private TextField tfCarreraJ1;
    @FXML
    private TextField tfNombreJ2;
    @FXML
    private TextField tfApellidoJ2;
    @FXML
    private TextField tfEdadJ2;
    @FXML
    private TextField tfCarreraJ2;
    @FXML
    private Button btJugar;
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
    private void btJugar(ActionEvent event) throws IOException {
        
        
        String tfNombre1 = tfNombreJ1.getText();
        String tfApellido1 = tfApellidoJ1.getText();
        String tfEdad1_cap = tfEdadJ1.getText();
        int tfEdad1 = 0;
        tfEdad1 = Integer.parseInt(tfEdad1_cap);
        String tfCarrera1 = tfCarreraJ1.getText();
        System.out.println(tfNombre1+" "+tfApellido1+" "+tfEdad1+" "+tfCarrera1);
        Jugador jugador1 = new Jugador(0,tfNombre1, tfApellido1, tfEdad1, tfCarrera1);
        LinkedList<Jugador> list = new LinkedList<Jugador>();
        list.add(jugador1);
        System.out.println("Inserto Lista Numero 1");
        //jugador.Nombre = "nuevo Nombre";
        //  list.set(0, jugador);
       /* 
        String tfNombre2 = tfNombreJ2.getText();
        String tfApellido2 = tfApellidoJ2.getText();
        String tfEdad2_cap = tfEdadJ2.getText();
        int tfEdad2 = 0;
        tfEdad2 = Integer.parseInt(tfEdad2_cap);
        String tfCarrera2 = tfCarreraJ2.getText();
        System.out.println(tfNombre2+" "+tfApellido2+" "+tfEdad2+" "+tfCarrera2);
        Jugador jugador2 = new Jugador(0,tfNombre2, tfApellido2, tfEdad2, tfCarrera2);
        //LinkedList<Jugador> list2 = new LinkedList<Jugador>();
        list.add(jugador2);*/
        
        System.out.println("Inserto Lista Numero 2");
         Conexion c = new Conexion();
        c.InsertInformacionJugador(list);
                
        ///----------------------------------------------------------------------
        
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("Jugando.fxml"));
        Stage stage = new Stage();
        stage.getIcons().addAll(new  Image(Menu.class.getResourceAsStream("icon_ajedrez.png")));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("!!Jugando - Ajedrez!!");
        stage.show();
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
