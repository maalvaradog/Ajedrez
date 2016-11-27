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
public class MenuController implements Initializable {

    @FXML
    private Button btMostrar;
    @FXML
    private TextField tfMostrar;
    @FXML
    private Button btIniciarPartida;
    @FXML
    private Button btReglasJuego;
    @FXML
    private Button btCreditos;
    @FXML
    private Button btSalirJuego;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }

    @FXML
    private void btMostrar(ActionEvent event) {
        Conexion c = new Conexion();
        LinkedList<Jugador> list = new LinkedList<Jugador>();
        c.SelectInformacionJugador(list);
        System.out.println(list.get(1).Nombre);
        // System.out.println(" "+"hola "+" "+c.llenarInformacionJugador());
        tfMostrar.setText("Los datos del jugador capturados son: \n" + list.get(0).Nombre + " " + list.get(0).Apellido + " Tiene " + list.get(0).Edad + " Años y Estudia " + list.get(0).Carrera);
        tfMostrar.setText(" Tiene " + list.get(0).Edad + " Años y Estudia " + list.get(0).Carrera);
    }

    @FXML
    private void btIniciarPartida(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("DatosJugadores.fxml"));
        Stage stage = new Stage();
        stage.getIcons().addAll(new  Image(DatosJugadoresController.class.getResourceAsStream("icon_ajedrez.png")));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("!!Datos Jugadores!!");
        stage.show();
    }

    @FXML
    private void btReglasJuego(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("ReglasJuego.fxml"));
        Stage stage = new Stage();
        stage.getIcons().addAll(new  Image(ReglasJuegoController.class.getResourceAsStream("icon_ajedrez.png")));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("!!Reglas Juegos!!");
        stage.show();

    }

    @FXML
    private void btCreditos(ActionEvent event) throws IOException {
        
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("Creditos.fxml"));
        Stage stage = new Stage();
        stage.getIcons().addAll(new  Image(CreditosController.class.getResourceAsStream("icon_ajedrez.png")));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("!!Creditos!!");
        stage.show();
        
        
    }

    @FXML
    private void btSalirJuego(ActionEvent event) {
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }

}
