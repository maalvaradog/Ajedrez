/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecenarios;

import Clases_Java.Conexion;
import Clases_Java.Jugador;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javax.swing.Action;

/**
 * FXML Controller class
 *
 * @author milto
 */
public class MenuController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private javafx.scene.control.TextField tfMostrar;
    
    @FXML
    public void btMostrar(ActionEvent event){
        
        Conexion c = new Conexion();
        LinkedList<Jugador> list = new LinkedList<Jugador>(); 
        c.llenarInformacionJugador(list);
        System.out.println(list.get(1).Nombre);
       // System.out.println(" "+"hola "+" "+c.llenarInformacionJugador());
        tfMostrar.setText("Los datos del jugador capturados son: \n"+list.get(0).Nombre+" "+list.get(0).Apellido+" Tiene "+list.get(0).Edad+" Años y Estudia "+list.get(0).Carrera);
        tfMostrar.setText(" Tiene "+list.get(0).Edad+" Años y Estudia "+list.get(0).Carrera);
    }
}
